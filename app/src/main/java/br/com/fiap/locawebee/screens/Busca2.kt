package br.com.fiap.locawebee.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.locawebee.R
import br.com.fiap.locawebee.ui.theme.OpenSansRegular
import br.com.fiap.locawebee.ui.theme.PoppinsMedium
import br.com.fiap.locawebee.ui.theme.PoppinsRegular
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold
import br.com.fiap.locawebee.ui.theme.RobotoRegular

@Composable
fun Busca2(navController: NavController) {
    var busca by remember { mutableStateOf("") }
    Box(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .drawBehind {
                    val strokeWidth = 2.dp.toPx()
                    val y = strokeWidth / 2
                    drawLine(
                        color = Color.LightGray,
                        start = Offset(0f, y),
                        end = Offset(size.width, y),
                        strokeWidth = strokeWidth
                    )
                }
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .padding(top = 20.dp)
            ) {
                Button(
                    onClick = {navController.navigate("Busca")},
                    colors = ButtonDefaults.buttonColors(Color.White)
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "icone seta para voltar a uma página",
                        tint = Color.Black
                    )
                }

                Text(
                    text = "Busca",
                    fontFamily = PoppinsSemiBold,
                    fontSize = 30.sp,
                    //textAlign = TextAlign.Center,
                    color = Color.Black,
                    modifier = Modifier
                        .width(245.dp)
                        .padding(horizontal = 40.dp)
                )
            }
            Box(
                modifier = Modifier
                    .width(20.dp)
                    .height(1.dp)
                    .background(Color(0xff1D1F33))
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(25.dp))
            OutlinedTextField(
                value = busca,
                onValueChange = { busca = it },
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
                        text = "Bem ",
                        color = Color.Black,
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
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "Filtros Ativos",
                color = (Color(0xff1D1F33)),
                fontFamily = PoppinsSemiBold,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
            )
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(
                    text = "Crescente",
                    color = Color.Black,
                    fontFamily = PoppinsRegular,
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.width(1.dp))
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "icone filtro ordem crescente",
                    tint = Color.Black)
                Spacer(modifier = Modifier.width(15.dp))
                Text(
                    text = "Principal",
                    color = Color.Black,
                    fontFamily = PoppinsRegular,
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.width(1.dp))
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "icone filtro principal",
                    tint = Color.Black)
                Spacer(modifier = Modifier.width(15.dp))
                Text(
                    text = "Vermelho",
                    color = Color.Black,
                    fontFamily = PoppinsRegular,
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.width(1.dp))
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "icone filtro vermelho",
                    tint = Color.Black)
            }
            Spacer(modifier = Modifier.height(15.dp))
            Box(
                modifier = Modifier
                    .width(20.dp)
                    .height(1.dp)
                    .background(Color(0xff1D1F33))
                    .align(Alignment.CenterHorizontally)
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 80.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Spacer(modifier = Modifier.height(15.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(start = 20.dp, bottom = 10.dp, top = 10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ricardo_remetente),
                        contentDescription = "ícone remetente Ricardo",
                        modifier = Modifier
                            .size(35.7.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = "Ricardo Mendes",
                            fontSize = 15.sp,
                            fontFamily = OpenSansRegular,
                            textAlign = TextAlign.Start,
                            color = Color.Black,
                            modifier = Modifier.width(230.dp)
                                .padding(top= 5.dp)
                        )
                        val text = buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color(0xff292929), fontWeight = FontWeight.Normal)) {
                                append("Assunto importante\n")
                            }
                            withStyle(style = SpanStyle(color = Color(0xff5D5C5D), fontWeight = FontWeight.Normal)) {
                                append("Boa tarde, você está ")
                            }
                            withStyle(style = SpanStyle(color = Color.White, background = Color.Black, fontWeight = FontWeight.Normal)) {
                                append("bem")
                            }
                            withStyle(style = SpanStyle(color = Color(0xff5D5C5D), fontWeight = FontWeight.Normal)) {
                                append("? Preciso confir ...")
                            }
                        }

                        Text(
                            text = text,
                            fontSize = 13.sp,
                            fontFamily = RobotoRegular,
                            textAlign = TextAlign.Start,
                            modifier = Modifier.width(251.8.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(
                        horizontalAlignment = Alignment.End,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(end = 20.dp)
                            .weight(0.3f)
                    ) {
                        Text(
                            text = "6 Mai",
                            fontFamily = RobotoRegular,
                            fontSize = 12.sp,
                            color = Color(0xff292929),
                            modifier = Modifier.padding(bottom = 5.dp)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "ícone favoritos",
                            tint = Color(color = 0xffFBBC05),
                            modifier = Modifier.size(width = 16.08.dp, height = 15.29.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(start = 20.dp, bottom = 10.dp, top = 10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bemvestido_remetente),
                        contentDescription = "ícone remetente bem vestido",
                        modifier = Modifier
                            .size(35.7.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier.weight(1f)
                    ) {
                        val titulo = buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color.White, background = Color.Black, fontWeight = FontWeight.Normal)) {
                                append("Bem")
                            }
                            withStyle(style = SpanStyle(color = Color(0xff292929), fontWeight = FontWeight.Normal)) {
                                append(" Vestido - Bem-Vindo(a)!")
                            }
                        }
                        Text(
                            text = titulo,
                            fontSize = 15.sp,
                            fontFamily = OpenSansRegular ,
                            textAlign = TextAlign.Start,
                            color = Color.Black,
                            modifier = Modifier.width(230.dp)
                        )
                        val text = buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color(0xff292929), fontWeight = FontWeight.Normal)) {
                                append("Saiba Mais\n")
                            }
                            withStyle(style = SpanStyle(color = Color(0xff5D5C5D), fontWeight = FontWeight.Normal)) {
                                append("Parabéns, por criar sua conta! ")
                            }
                        }
                        Text(
                            text = text,
                            fontSize = 13.sp,
                            fontFamily = RobotoRegular,
                            textAlign = TextAlign.Start,
                            modifier = Modifier.width(251.8.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(
                        horizontalAlignment = Alignment.End,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(end = 20.dp)
                            .weight(0.3f)
                    ) {
                        Text(
                            text = "6 Mai",
                            fontFamily = RobotoRegular,
                            fontSize = 12.sp,
                            color = Color(0xff292929),
                            modifier = Modifier.padding(bottom = 5.dp)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Image(
                            painter = painterResource(id = R.drawable.estrela_vazia),
                            contentDescription = "icone estrela vazia",
                            modifier = Modifier
                                .size(width = 16.08.dp, height = 15.29.dp)
                                .clip(CircleShape)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(start = 20.dp, bottom = 10.dp, top = 10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lovedecoracao_remetente),
                        contentDescription = "ícone remetente love decorações",
                        modifier = Modifier
                            .size(35.7.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = "Love Decorações",
                            fontSize = 15.sp,
                            fontFamily = OpenSansRegular,
                            textAlign = TextAlign.Start,
                            color = Color.Black,
                            modifier = Modifier.width(230.dp)
                        )
                        val text = buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color(0xff292929), fontWeight = FontWeight.Normal)) {
                                append("Nota Fiscal\n")
                            }
                            withStyle(style = SpanStyle(color = Color.White, background = Color.Black, fontWeight = FontWeight.Normal)) {
                                append("Bem")
                            }
                            withStyle(style = SpanStyle(color = Color(0xff5D5C5D), fontWeight = FontWeight.Normal)) {
                                append(" vindo a A Love Decorações ...")
                            }
                        }

                        Text(
                            text = text,
                            fontSize = 13.sp,
                            fontFamily = RobotoRegular,
                            textAlign = TextAlign.Start,
                            modifier = Modifier.width(251.8.dp)
                        )
                        Spacer(modifier = Modifier.height(3.dp))
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.notafiscal_pdf),
                                contentDescription = "pdf nota fiscal",
                                modifier = Modifier
                                    .size(width = 109.dp, height = 24.dp)
                                    .clip(CircleShape)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.imagem_pdf),
                                contentDescription = "pdf imagem",
                                modifier = Modifier
                                    .size(width = 109.dp, height = 24.dp)
                                    .clip(CircleShape)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(
                        horizontalAlignment = Alignment.End,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(end = 20.dp)
                            .weight(0.3f)
                    ) {
                        Text(
                            text = "5 Mai",
                            fontFamily = RobotoRegular,
                            fontSize = 12.sp,
                            color = Color(0xff292929),
                            modifier = Modifier.padding(bottom = 5.dp)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "ícone favoritos",
                            tint = Color(color = 0xffFBBC05),
                            modifier = Modifier.size(width = 16.08.dp, height = 15.29.dp)
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
fun Busca2Preview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        Busca2()
    }
}*/
