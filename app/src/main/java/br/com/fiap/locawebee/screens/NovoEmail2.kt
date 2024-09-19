package br.com.fiap.locawebee.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
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
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import br.com.fiap.locawebee.R
import br.com.fiap.locawebee.ui.theme.PoppinsMedium
import br.com.fiap.locawebee.ui.theme.PoppinsRegular
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold

@Composable
fun NovoEmail2(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var copiaEmail by remember { mutableStateOf("") }
    var assunto by remember { mutableStateOf("") }
    var conteudoEmail by remember { mutableStateOf("") }
    var text by remember { mutableStateOf("") }
    var showEmojiKeyboard by remember { mutableStateOf(false) }

    Box(modifier = Modifier
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
        Box(modifier = Modifier
            .align(Alignment.Center)
            .padding(bottom = 100.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            ) {
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = {navController.navigate("CaixaEntradaPrincipal")},
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(39.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)
                        .align(Alignment.Start)
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "ícone Voltar para os principais",
                        tint = Color.White, modifier = Modifier.size(45.dp)
                    )
                }
                Row {
                    Text(
                        text = "Novo E-mail ",
                        color = Color(0xff000000),
                        fontSize = 18.sp,
                        fontFamily = PoppinsSemiBold,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(start = 2.dp)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color(0xffF1F4FF),
                        unfocusedContainerColor = Color(0xffF1F4FF),
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .width(309.dp)
                        .height(50.dp),
                    placeholder = {
                        Text(
                            text = "Para: ",
                            color = Color(0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Start,
                        )
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 16.sp,
                        fontFamily = PoppinsMedium,
                        textAlign = TextAlign.Start,
                        color = Color(0xff626262)
                    ),
                    singleLine = true,
                )
                Spacer(modifier = Modifier.height(10.dp))
                OutlinedTextField(
                    value = copiaEmail,
                    onValueChange = { copiaEmail = it },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color(0xffF1F4FF),
                        unfocusedContainerColor = Color(0xffF1F4FF),
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .width(309.dp)
                        .height(50.dp),
                    placeholder = {
                        Text(
                            text = "Cópia: ",
                            color = Color(0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Start,
                        )
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 16.sp,
                        fontFamily = PoppinsMedium,
                        textAlign = TextAlign.Start,
                        color = Color(0xff626262)
                    ),
                    singleLine = true,
                )
                Spacer(modifier = Modifier.height(10.dp))
                OutlinedTextField(
                    value = assunto,
                    onValueChange = { assunto = it },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color(0xffF1F4FF),
                        unfocusedContainerColor = Color(0xffF1F4FF),
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .width(309.dp)
                        .height(50.dp),
                    placeholder = {
                        Text(
                            text = "Assunto: ",
                            color = Color(0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Start
                        )
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 16.sp,
                        fontFamily = PoppinsMedium,
                        textAlign = TextAlign.Start,
                        color = Color(0xff626262)
                    ),
                )
                Spacer(modifier = Modifier.height(10.dp))
                OutlinedTextField(
                    value = conteudoEmail,
                    onValueChange = { conteudoEmail = it },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color(0xffF1F4FF),
                        unfocusedContainerColor = Color(0xffF1F4FF),
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .width(309.dp)
                        .height(347.dp),
                    placeholder = {
                        Text(
                            text = "Bom dia! Como você está? ",
                            color = Color(color = 0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Center,
                        )
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 16.sp,
                        fontFamily = PoppinsMedium,
                        textAlign = TextAlign.Start,
                        color = Color(0xff626262)
                    ),
                )
                Row{
                    Image(
                        painter = painterResource(id = R.drawable.bee_logo),
                        contentDescription = "logo icone locawebee",
                        modifier = Modifier
                            .width(41.dp)
                            .height(35.dp),
                        contentScale = ContentScale.Fit
                    )
                }
            }
        }
        Box(modifier = Modifier
            .align(Alignment.CenterEnd)
            .padding(top = 100.dp)
        ) {
            Button(
                onClick = { showEmojiKeyboard = true },
                colors = ButtonDefaults.buttonColors(Color(color = 0xff1F41BB)),
                contentPadding = PaddingValues(5.dp),
                shape = RoundedCornerShape(4.dp),
                modifier = Modifier
                    .width(138.dp)
                    .height(39.dp)
            ) {
                Text(
                    text = "Usar Emoj",
                    color = (Color(color = 0xffF9F9F9)),
                    fontSize = 16.sp,
                    fontFamily = PoppinsMedium,
                    textAlign = TextAlign.Center,
                )
            }
        }

        if (showEmojiKeyboard) {
            EmojiKeyboard(onEmojiSelected = { emoji ->
                text += emoji
                showEmojiKeyboard = false
            })
        }
    }
}

@Composable
fun EmojiKeyboard(onEmojiSelected: (String) -> Unit) {
    Dialog(onDismissRequest = { onEmojiSelected("") }) {
        Surface(
            shape = RoundedCornerShape(4.dp),
            color = Color(0xff1D1F33),
            modifier = Modifier.padding(5.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .wrapContentSize()
                    .width(400.dp)
            ) {
                val emojiImages = listOf(
                    R.drawable.bee_logo,
                    R.drawable.colmeia,
                    R.drawable.ame,
                    R.drawable.aviao,
                )

                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    emojiImages.forEach { emojiRes ->
                        val painter: Painter = painterResource(id = emojiRes)
                        Image(
                            painter = painter,
                            contentDescription = null,
                            modifier = Modifier
                                .size(43.dp)
                                .clickable { onEmojiSelected(emojiRes.toString()) }
                        )
                    }
                }
            }
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun NovoEmail2Preview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        NovoEmail2()
    }
}*/
