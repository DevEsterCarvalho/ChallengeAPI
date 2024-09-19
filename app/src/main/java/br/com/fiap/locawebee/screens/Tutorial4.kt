package br.com.fiap.locawebee.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.locawebee.R
import br.com.fiap.locawebee.ui.theme.PoppinsRegular
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold

@Composable
fun Tutorial4(navController: NavController) {
    Box(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
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
                        text = "Você está quase lá!",
                        fontSize = 14.sp,
                        fontFamily = PoppinsRegular,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                        modifier = Modifier.width(144.dp)
                    )
                    Button(onClick = {navController.navigate("Progresso")},
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        modifier = Modifier
                    ) {
                        LinearProgressIndicator(
                            progress = 0.4f,
                            modifier = Modifier
                                .height(20.dp)
                                .width(230.dp),
                               // .align(Alignment.CenterHorizontally),
                            trackColor = Color(0xffF1F4FF),
                            color = Color(0xff45BF6B),
                            strokeCap = StrokeCap.Round
                        )
                    }
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
                .align(Alignment.Center)
                .padding(bottom = 620.dp)
                .fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 15.dp, top = 10.dp)
            ) {
                Button(
                    onClick = {navController.navigate("CaixaEntradaPrincipal")},
                    colors = ButtonDefaults.buttonColors(Color(0xffFFFFFF)),
                    modifier = Modifier
                        .width(100.dp)
                        .height(44.dp),
                    contentPadding = PaddingValues(3.dp),
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Text(
                            text = "Principal",
                            color = Color.Black,
                            fontSize = 16.sp,
                            fontFamily = PoppinsSemiBold,
                            textAlign = TextAlign.Center
                        )
                        Box(
                            modifier = Modifier
                                .width(100.dp)
                                .height(1.dp)
                                .background(Color.Black)
                        )
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(
                    onClick = {navController.navigate("CaixaEntradaOutros")},
                    colors = ButtonDefaults.buttonColors(Color.White),
                    modifier = Modifier
                        .width(100.dp)
                        .height(44.dp),
                    contentPadding = PaddingValues(3.dp),
                ) {
                    Text(
                        text = "Outros",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontFamily = PoppinsRegular,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Box(
                modifier = Modifier
                    .width(20.dp)
                    .height(1.dp)
                    .background(Color(0xff1D1F33))
                    .align(Alignment.BottomCenter)
            )
        }
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .height(328.dp)
                .width(329.dp)
                .background(Color(0xffF9F9F9), shape = RoundedCornerShape(13.dp))
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp)
            ) {
                Text(
                    text = "Tutorial (4/5)",
                    fontSize = 16.sp,
                    fontFamily = PoppinsSemiBold,
                    textAlign = TextAlign.Center,
                    color = Color(0xff1D1F33),
                    modifier = Modifier
                        .width(300.dp)
                        .fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(15.dp))
                val text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color(0xff1D1F33), fontWeight = FontWeight.Normal)) {
                        append("Na barra de navegação acesse as ")
                    }
                    withStyle(style = SpanStyle(color = Color(0xffED0000), fontWeight = FontWeight.SemiBold)) {
                        append("configurações, busca ")
                    }
                    withStyle(style = SpanStyle(color = Color(0xff1D1F33), fontWeight = FontWeight.Normal)) {
                        append("e a sua ")
                    }
                    withStyle(style = SpanStyle(color = Color(0xffED0000), fontWeight = FontWeight.SemiBold)) {
                        append("loja ")
                    }
                    withStyle(style = SpanStyle(color = Color(0xff1D1F33), fontWeight = FontWeight.Normal)) {
                        append("para comprar melhorias com\n" +
                                "seus pontos de organização")
                    }
                }
                Text(
                    text = text,
                    fontSize = 16.sp,
                    fontFamily = PoppinsRegular,
                    textAlign = TextAlign.Center,
                    color = Color(0xff1D1F33),
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(25.dp))
                Button(
                    onClick = {navController.navigate("Tutorial5")},
                    colors = ButtonDefaults.buttonColors(Color(0xff1F41BB)),
                    modifier = Modifier
                        .width(220.dp)
                        .height(31.dp)
                        .offset(y = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(5.dp),
                    elevation = ButtonDefaults.buttonElevation(25.dp)
                ) {
                    Text(
                        text = "Próximo",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontFamily = PoppinsSemiBold,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
        Image(
            painter = painterResource(id = R.drawable.bee_logo),
            contentDescription = "imagem bee logo",
            modifier = Modifier
                .size(width = 149.71.dp, height = 128.1.dp)
                .align(Alignment.CenterStart)
                .offset(y = (170).dp)
                .graphicsLayer(scaleX = -1f)
        )
        Box(modifier = Modifier
            .align(Alignment.Center)
            .padding(top = 400.dp)
        ){
            Row (
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.End),
                modifier = Modifier
                    .fillMaxWidth()
                    .width(375.dp)
                    .height(58.dp)
                    .padding(end = 8.dp)
            ) {
                Button(
                    onClick = {navController.navigate("NovoEmail")},
                    colors = ButtonDefaults.buttonColors(Color(0xff1F41BB)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(50.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Add, contentDescription = "ícone add",
                        tint = Color.White, modifier = Modifier.size(50.dp)
                    )
                }
            }
        }
        Box (
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 650.dp)
                .background(Color(0xff1D1F33))
                .border(2.dp, Color(0xffFFFFFF))
        ){
            Row (
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                modifier = Modifier
                    .fillMaxWidth()
                    .width(375.dp)
                    .height(58.dp)
            ){
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
fun Tutorial4Preview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        Tutorial4()
    }
}*/
