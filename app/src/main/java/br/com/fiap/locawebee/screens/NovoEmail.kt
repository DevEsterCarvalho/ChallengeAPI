package br.com.fiap.locawebee.screens

import android.content.Context
import android.provider.ContactsContract
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.locawebee.R
import br.com.fiap.locawebee.ui.theme.PoppinsRegular
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.Response
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

data class EnvioEmail(
	val remetenteEmail: String,
	val destinatarioEmail: String,
	val assunto: String,
	val corpo: String,
)

interface EmailService {
	@POST("Email/EnviarEmail")
	suspend fun enviarEmail(@Body envioEmail: EnvioEmail): Response<String>

	@GET("Email/ObterEmails/{email}")
	suspend fun obterEmails(@Path("email") email: String): Response<List<EnvioEmail>>
}

@Composable
fun NovoEmail(navController: NavController) {
	var remetenteEmail by remember { mutableStateOf("") }
	var destinatarioEmail by remember { mutableStateOf("") }
	var assunto by remember { mutableStateOf("") }
	var conteudoEmail by remember { mutableStateOf("") }
	var isSending by remember { mutableStateOf(false) }
	var sendSuccess by remember { mutableStateOf(false) }

	val context = LocalContext.current

	val retrofit = Retrofit.Builder()
		.baseUrl("http://10.0.2.2:5219/")
		.addConverterFactory(ScalarsConverterFactory.create())
		.addConverterFactory(GsonConverterFactory.create())
		.build()

	val emailService = retrofit.create(EmailService::class.java)
	val coroutineScope = rememberCoroutineScope()

	Box(
		modifier = Modifier
			.fillMaxSize()
			.background(Color.White)
	) {
		Column(
			verticalArrangement = Arrangement.Top,
		) {
			Row(
				verticalAlignment = Alignment.CenterVertically,
				modifier = Modifier
					.padding(start = 20.dp, bottom = 10.dp, top = 10.dp)
			) {
				Image(
					painter = painterResource(id = R.drawable.bee_logo),
					contentDescription = "ícone do projeto LocaWeBee",
					modifier = Modifier.size(width = 62.dp, height = 53.dp)
				)
				Spacer(modifier = Modifier.width(8.dp))
				Column(
					horizontalAlignment = Alignment.CenterHorizontally,
					modifier = Modifier.fillMaxWidth()
				) {
					Text(
						text = "Tudo organizado!",
						fontSize = 14.sp,
						fontFamily = PoppinsRegular,
						textAlign = TextAlign.Center,
						color = Color.Black,
						modifier = Modifier.width(144.dp)
					)
					LinearProgressIndicator(
						progress = { 0f },
						modifier = Modifier
							.height(20.dp)
							.width(230.dp)
							.align(Alignment.CenterHorizontally),
						trackColor = Color(0xffF1F4FF),
						strokeCap = StrokeCap.Round,
					)
				}
			}
			Box(
				modifier = Modifier
					.width(393.dp)
					.height(2.dp)
					.background(Color.LightGray)
			)
		}
		Box(
			modifier = Modifier
				.fillMaxSize()
				.padding(16.dp),
			contentAlignment = Alignment.Center
		) {
			Column(
				verticalArrangement = Arrangement.Center,
				horizontalAlignment = Alignment.CenterHorizontally,
				modifier = Modifier.fillMaxWidth()
			) {
				Button(
					onClick = { navController.navigate("CaixaEntradaPrincipal") },
					colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
					contentPadding = PaddingValues(5.dp),
					modifier = Modifier
						.size(39.dp)
						.shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)
						.align(Alignment.Start)
				) {
					Icon(
						imageVector = Icons.AutoMirrored.Default.KeyboardArrowLeft,
						contentDescription = "ícone Voltar para os principais",
						tint = Color.White,
						modifier = Modifier.size(45.dp)
					)
				}
				Row(
					verticalAlignment = Alignment.CenterVertically,
					modifier = Modifier.padding(bottom = 10.dp)
				) {
					Spacer(modifier = Modifier.width(8.dp))
					Text(
						text = "Novo E-mail",
						fontSize = 18.sp,
						fontFamily = PoppinsSemiBold,
						textAlign = TextAlign.Center,
						color = Color.Black
					)
				}

				Spacer(modifier = Modifier.height(10.dp))
				OutlinedTextField(
					value = remetenteEmail,
					onValueChange = { remetenteEmail = it },
					modifier = Modifier.fillMaxWidth(),
					label = { Text(text = "De:") },
					keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
					colors = OutlinedTextFieldDefaults.colors(
						focusedContainerColor = Color(0xffF1F4FF),
						unfocusedContainerColor = Color(0xffF1F4FF),
						focusedBorderColor = Color.Transparent,
						unfocusedBorderColor = Color.Transparent
					)
				)
				Spacer(modifier = Modifier.height(10.dp))
				OutlinedTextField(
					value = destinatarioEmail,
					onValueChange = { destinatarioEmail = it },
					modifier = Modifier.fillMaxWidth(),
					label = { Text(text = "Para:") },
					keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
					colors = OutlinedTextFieldDefaults.colors(
						focusedContainerColor = Color(0xffF1F4FF),
						unfocusedContainerColor = Color(0xffF1F4FF),
						focusedBorderColor = Color.Transparent,
						unfocusedBorderColor = Color.Transparent
					)
				)
				Spacer(modifier = Modifier.height(10.dp))
				OutlinedTextField(
					value = assunto,
					onValueChange = { assunto = it },
					modifier = Modifier
						.fillMaxWidth(),
					label = { Text(text = "Assunto:") },
					colors = OutlinedTextFieldDefaults.colors(
						focusedContainerColor = Color(0xffF1F4FF),
						unfocusedContainerColor = Color(0xffF1F4FF),
						focusedBorderColor = Color.Transparent,
						unfocusedBorderColor = Color.Transparent
					)
				)
				Spacer(modifier = Modifier.height(10.dp))
				OutlinedTextField(
					value = conteudoEmail,
					onValueChange = { conteudoEmail = it },
					modifier = Modifier
						.fillMaxWidth()
						.height(200.dp),
					label = { Text(text = "Conteúdo:") },
					colors = OutlinedTextFieldDefaults.colors(
						focusedContainerColor = Color(0xffF1F4FF),
						unfocusedContainerColor = Color(0xffF1F4FF),
						focusedBorderColor = Color.Transparent,
						unfocusedBorderColor = Color.Transparent
					)
				)
				Spacer(modifier = Modifier.height(20.dp))
				Button(
					onClick = {
						coroutineScope.launch {
							try {
								isSending = true
								val envioEmail = EnvioEmail(
									remetenteEmail = remetenteEmail,
									destinatarioEmail = destinatarioEmail,
									assunto = assunto,
									corpo = conteudoEmail
								)
								val response = emailService.enviarEmail(envioEmail)
								isSending = false

								Toast.makeText(
									context,
									response.body().toString(),
									Toast.LENGTH_LONG
								).show()

								navController.navigate("CaixaEntradaPrincipal")

							} catch (ex: Exception) {
								Toast.makeText(
									context,
									ex.message,
									Toast.LENGTH_LONG
								).show()
							}
						}

					},
					enabled = !isSending,
					modifier = Modifier
						.width(220.dp)
						.padding(16.dp),
					shape = RoundedCornerShape(10.dp),
					colors = ButtonDefaults.buttonColors(Color(0xff1F41BB))
				) {
					Text(
						text = if (isSending) "Enviando..." else "Enviar",
						color = Color.White,
						fontSize = 16.sp,
						fontFamily = PoppinsSemiBold,
						textAlign = TextAlign.Center
					)
				}
			}
		}
	}
}


/*
@Preview(showBackground = true)
@Composable
fun NovoEmailPreview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        NovoEmail()
    }
}*/
