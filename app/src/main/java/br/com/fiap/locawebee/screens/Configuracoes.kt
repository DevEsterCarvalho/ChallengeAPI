package br.com.fiap.locawebee.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.locawebee.R
import br.com.fiap.locawebee.ui.theme.PoppinsMedium
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold

@Composable
fun Configuracoes(navController: NavController) {
    Box(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
    ){
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ){
            Row(
                horizontalArrangement = Arrangement.Absolute.Center,
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 70.dp, bottom = 10.dp)
            ) {
                Text(
                    text = "Configurações",
                    color = Color.Black,
                    fontFamily = PoppinsSemiBold,
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                )
            }
            Box(
                modifier = Modifier
                    .width(20.dp)
                    .height(1.dp)
                    .background(Color(0xff1D1F33))
                    .align(Alignment.CenterHorizontally)
            )
            Row (
                horizontalArrangement = Arrangement.Absolute.Center,
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 70.dp, bottom = 10.dp)
            ){
                Text(
                    text = "Tema:",
                    color = Color(0xff626262),
                    fontFamily = PoppinsMedium,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 5.dp)
                )
                Spacer(modifier = Modifier.width(45.dp))
                Button(
                    onClick = {navController.navigate("Configuracoes")},
                    colors = ButtonDefaults.buttonColors(Color(0xffF1F4FF)),
                    shape = RoundedCornerShape(4.dp),
                    contentPadding = PaddingValues(5.dp),
                    elevation = ButtonDefaults.buttonElevation(3.dp),
                    modifier = Modifier
                        .width(90.dp)
                        .height(36.dp)
                ) {
                    Text(
                        text = "Claro",
                        color = (Color(0xff626262)),
                        fontSize = 16.sp,
                        fontFamily = PoppinsMedium,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(
                    onClick = {navController.navigate("ModoDark")},
                    colors = ButtonDefaults.buttonColors(Color(0xff3F3F3F)),
                    shape = RoundedCornerShape(4.dp),
                    contentPadding = PaddingValues(5.dp),
                    elevation = ButtonDefaults.buttonElevation(3.dp),
                    modifier = Modifier
                        .width(90.dp)
                        .height(36.dp)
                ) {
                    Text(
                        text = "Escuro",
                        color = (Color.White),
                        fontSize = 16.sp,
                        fontFamily = PoppinsMedium,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = {navController.navigate("Tutorial")},
                colors = ButtonDefaults.buttonColors(Color(0xffF1F4FF)),
                shape = RoundedCornerShape(4.dp),
                contentPadding = PaddingValues(5.dp),
                elevation = ButtonDefaults.buttonElevation(3.dp),
                modifier = Modifier
                    .width(309.dp)
                    .height(36.dp)
            ) {
                Text(
                    text = "Ainda tem dúvidas? Acesse o Tutorial",
                    color = (Color(0xff626262)),
                    fontSize = 16.sp,
                    fontFamily = PoppinsMedium,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 7.dp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color(0xffF1F4FF)),
                shape = RoundedCornerShape(4.dp),
                contentPadding = PaddingValues(5.dp),
                elevation = ButtonDefaults.buttonElevation(3.dp),
                modifier = Modifier
                    .width(309.dp)
                    .height(36.dp)
            ) {
                Text(
                    text = "Configurações da Conta",
                    color = (Color(0xff626262)),
                    fontSize = 16.sp,
                    fontFamily = PoppinsMedium,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 7.dp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color(0xffF1F4FF)),
                shape = RoundedCornerShape(4.dp),
                contentPadding = PaddingValues(5.dp),
                elevation = ButtonDefaults.buttonElevation(3.dp),
                modifier = Modifier
                    .width(309.dp)
                    .height(36.dp)
            ) {
                Text(
                    text = "Configurações do E-mail",
                    color = (Color(0xff626262)),
                    fontSize = 16.sp,
                    fontFamily = PoppinsMedium,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 7.dp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color(0xffF1F4FF)),
                shape = RoundedCornerShape(4.dp),
                contentPadding = PaddingValues(5.dp),
                elevation = ButtonDefaults.buttonElevation(3.dp),
                modifier = Modifier
                    .width(309.dp)
                    .height(36.dp)
            ) {
                Text(
                    text = "Acessibilidade",
                    color = (Color(0xff626262)),
                    fontSize = 16.sp,
                    fontFamily = PoppinsMedium,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 7.dp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color(0xffF1F4FF)),
                shape = RoundedCornerShape(4.dp),
                contentPadding = PaddingValues(5.dp),
                elevation = ButtonDefaults.buttonElevation(3.dp),
                modifier = Modifier
                    .width(309.dp)
                    .height(36.dp)
            ) {
                Text(
                    text = "Fonte",
                    color = (Color(0xff626262)),
                    fontSize = 16.sp,
                    fontFamily = PoppinsMedium,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 7.dp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color(0xffF1F4FF)),
                shape = RoundedCornerShape(4.dp),
                contentPadding = PaddingValues(5.dp),
                elevation = ButtonDefaults.buttonElevation(3.dp),
                modifier = Modifier
                    .width(309.dp)
                    .height(36.dp)
            ) {
                Text(
                    text = "Contatos",
                    color = (Color(0xff626262)),
                    fontSize = 16.sp,
                    fontFamily = PoppinsMedium,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 7.dp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color(0xffF1F4FF)),
                shape = RoundedCornerShape(4.dp),
                contentPadding = PaddingValues(5.dp),
                elevation = ButtonDefaults.buttonElevation(3.dp),
                modifier = Modifier
                    .width(309.dp)
                    .height(36.dp)
            ) {
                Text(
                    text = "Serviços",
                    color = (Color(0xff626262)),
                    fontSize = 16.sp,
                    fontFamily = PoppinsMedium,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 7.dp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color(0xffF1F4FF)),
                shape = RoundedCornerShape(4.dp),
                contentPadding = PaddingValues(5.dp),
                elevation = ButtonDefaults.buttonElevation(3.dp),
                modifier = Modifier
                    .width(309.dp)
                    .height(36.dp)
            ) {
                Text(
                    text = "Integrações",
                    color = (Color(0xff626262)),
                    fontSize = 16.sp,
                    fontFamily = PoppinsMedium,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 7.dp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color(0xffF1F4FF)),
                shape = RoundedCornerShape(4.dp),
                contentPadding = PaddingValues(5.dp),
                elevation = ButtonDefaults.buttonElevation(3.dp),
                modifier = Modifier
                    .width(309.dp)
                    .height(36.dp)
            ) {
                Text(
                    text = "Termos e Condições",
                    color = (Color(0xff626262)),
                    fontSize = 16.sp,
                    fontFamily = PoppinsMedium,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 7.dp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
        }
        Box (
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 650.dp)
                .background(Color(0xff1D1F33))
                .border(1.dp, Color(0xffFFFFFF))
        ){
            Row (
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                modifier = Modifier
                    .fillMaxWidth()
                    .width(375.dp)
                    .height(58.dp)
            ){
                Button(
                    onClick = {navController.navigate("CaixaEntradaPrincipal")},
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pasta_icon),
                        contentDescription = "ícone pastas categorias email",
                        modifier = Modifier
                            .size(width = 29.dp, height = 29.dp)
                            .padding(1.dp)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pasta_icon),
                        contentDescription = "ícone pastas categorias email",
                        modifier = Modifier
                            .size(width = 29.dp, height = 29.dp)
                            .padding(1.dp)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pasta_icon),
                        contentDescription = "ícone pastas categorias email",
                        modifier = Modifier
                            .size(width = 29.dp, height = 29.dp)
                            .padding(1.dp)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pasta_icon),
                        contentDescription = "ícone pastas categorias email",
                        modifier = Modifier
                            .size(width = 29.dp, height = 29.dp)
                            .padding(1.dp)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pasta_icon),
                        contentDescription = "ícone pastas categorias email",
                        modifier = Modifier
                            .size(width = 29.dp, height = 29.dp)
                            .padding(1.dp)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pasta_icon),
                        contentDescription = "ícone pastas categorias email",
                        modifier = Modifier
                            .size(width = 29.dp, height = 29.dp)
                            .padding(1.dp)
                    )
                }
            }
        }
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(Color(0xff1D1F33))
                .border(1.dp, Color(0xffFFFFFF)),
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(40.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .width(375.dp)
                    .height(76.dp)
            ) {
                Button(
                    onClick = {navController.navigate("Configuracoes")},
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Icon(imageVector = Icons.Default.Settings , contentDescription = "ícone settings",
                        tint = Color.White, modifier = Modifier.size(45.dp))
                }
                Button(
                    onClick = {navController.navigate("Busca")},
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "ícone pesquisa",
                        tint = Color.White, modifier = Modifier.size(45.dp))
                }
                Button(
                    onClick = {navController.navigate("Calendario")},
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Icon(imageVector = Icons.Default.DateRange, contentDescription = "ícone calendário",
                        tint = Color.White, modifier = Modifier.size(45.dp))
                }
                Button(
                    onClick = {navController.navigate("LojaPontos")},
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Icon(imageVector = Icons.Default.Star, contentDescription = "ícone favoritos",
                        tint = Color(color = 0xffFBBC24), modifier = Modifier.size(45.dp))
                }
            }
        }

    }
}

/*
@Preview(showBackground = true)
@Composable
fun ConfiguracoesPreview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        Configuracoes()
    }
}*/
