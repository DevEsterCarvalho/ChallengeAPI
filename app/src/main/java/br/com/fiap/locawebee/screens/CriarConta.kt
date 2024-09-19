package br.com.fiap.locawebee.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.locawebee.R
import br.com.fiap.locawebee.ui.theme.PoppinsBold
import br.com.fiap.locawebee.ui.theme.PoppinsMedium
import br.com.fiap.locawebee.ui.theme.PoppinsRegular
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold

@Composable
fun CriarConta (navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffFFFFFF)),
    ) {
        Image(
            painter = painterResource(id = R.drawable.fundo_localwebee),
            contentDescription = "fundo LocaWeBee",
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter)
        )

        Column (
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .padding(start = 0.dp, top = 60.dp)
        ){
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Crie sua conta",
                    color = (Color.White),
                    fontSize = 30.sp,
                    fontFamily = PoppinsBold,
                    textAlign = TextAlign.Center)
                Text(
                    text = "Está preparado para a\n" +
                            "melhor experiência?",
                    color = (Color.White),
                    fontSize = 20.sp,
                    fontFamily = PoppinsSemiBold,
                    textAlign = TextAlign.Center)
            }
            Spacer(modifier = Modifier.height(90.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
            ) {
                OutlinedTextField(value = email, onValueChange = {email = it},
                    shape = RoundedCornerShape(10.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color(0xffF1F4FF),
                        unfocusedContainerColor = Color(0xffF1F4FF),
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent),
                    modifier = Modifier
                        .width(309.dp)
                        .height(50.dp)
                        .shadow(4.dp, RoundedCornerShape(10.dp)),
                    placeholder = {
                        Text(
                            text = "Email",
                            color = Color(color = 0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Start
                        )
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 16.sp,
                        fontFamily = PoppinsMedium,
                        textAlign = TextAlign.Start,
                        color = Color(0xff626262)
                    ),
                    singleLine = true
                )
                Spacer(modifier = Modifier.height(15.dp))
                OutlinedTextField(value = password, onValueChange = { password = it },
                    shape = RoundedCornerShape(10.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color(0xffF1F4FF),
                        unfocusedContainerColor = Color(0xffF1F4FF),
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent),
                    modifier = Modifier
                        .width(309.dp)
                        .height(50.dp)
                        .shadow(4.dp, RoundedCornerShape(10.dp)),
                    placeholder = {
                        Text(
                            text = "Senha",
                            color = Color(color = 0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Start
                        )
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 16.sp,
                        fontFamily = PoppinsMedium,
                        textAlign = TextAlign.Start,
                        color = Color(0xff626262)
                    ),
                    singleLine = true
                )
                Spacer(modifier = Modifier.height(15.dp))
                OutlinedTextField(value = password, onValueChange = { password = it },
                    shape = RoundedCornerShape(10.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color(0xffF1F4FF),
                        unfocusedContainerColor = Color(0xffF1F4FF),
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent),
                    modifier = Modifier
                        .width(309.dp)
                        .height(50.dp)
                        .shadow(4.dp, RoundedCornerShape(10.dp)),
                    placeholder = {
                        Text(
                            text = "Confirme a Senha",
                            color = Color(color = 0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Start
                        )
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 16.sp,
                        fontFamily = PoppinsMedium,
                        textAlign = TextAlign.Start,
                        color = Color(0xff626262)
                    ),
                    singleLine = true
                )
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = {navController.navigate("Login")},
                    colors = ButtonDefaults.buttonColors(Color(color = 0xffFBBC24)),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(5.dp),
                    elevation = ButtonDefaults.buttonElevation(5.dp),
                    modifier = Modifier
                        .width(307.dp)
                        .height(48.dp)
                ) {
                    Text(
                        text = "Entrar",
                        color = (Color(color = 0xff494949)),
                        fontSize = 16.sp,
                        fontFamily = PoppinsSemiBold,
                        textAlign = TextAlign.Center,
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = {navController.navigate("Descricao")},
                    colors = ButtonDefaults.buttonColors(Color(color = 0xff1F41BB)),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(5.dp),
                    elevation = ButtonDefaults.buttonElevation(5.dp),
                    modifier = Modifier
                        .width(307.dp)
                        .height(48.dp)
                ) {
                    Text(
                        text = "Criar nova conta",
                        color = (Color.White),
                        fontSize = 16.sp,
                        fontFamily = PoppinsSemiBold,
                        textAlign = TextAlign.Center,
                    )
                }
                Text(text = "Já tenho minha conta",
                    color = (Color.Black),
                    fontSize = 14.sp,
                    fontFamily = PoppinsRegular,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp, bottom = 50.dp)
                )
            }
        }
    }

}

/*
@Preview(showSystemUi = true)
@Composable
fun CriarContaPreview() {
    Surface (
        modifier = Modifier.fillMaxWidth()
    ) {
        CriarConta()
    }
}*/
