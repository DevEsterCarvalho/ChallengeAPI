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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
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
fun Progresso(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ){
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.fundo_premio),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Column(
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.background(Color.White)
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
                                progress = 0.6f,
                                modifier = Modifier
                                    .height(20.dp)
                                    .width(230.dp),
                                    //.align(Alignment.CenterHorizontally),
                                trackColor = Color(0xffF1F4FF),
                                color = Color(0xffE2AA44),
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
            BoxWithConstraints(
                modifier = Modifier
                    .align(Alignment.Center)
                    .height(418.dp)
                    .width(338.dp)
                    .background(Color(0xffF9F9F9), shape = RoundedCornerShape(13.dp))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.premio),
                    contentDescription = "icone premio",
                    modifier = Modifier
                        .size(width = 109.dp, height = 109.dp)
                        .align(Alignment.TopCenter)
                        .offset(y = (-60).dp)
                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 60.dp)
                ) {
                    Text(
                        text = "Organize sua\n" +
                                "caixa de entrada\n" +
                                "e ganhe prêmios!",
                        fontSize = 24.sp,
                        fontFamily = PoppinsSemiBold,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(bottom = 30.dp)
                ) {
                    Row {
                        Text(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(fontFamily = PoppinsSemiBold)) {
                                    append("Falta pouco\n")
                                }
                                withStyle(style = SpanStyle(fontFamily = PoppinsRegular)){
                                    append("Vamos lá")
                                }
                            },
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            color = Color.Black,
                            modifier = Modifier
                                .padding(horizontal = 16.dp, vertical = 20.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.bee_logo),
                            contentDescription = "ícone do projeto LocaWeBee",
                            modifier = Modifier.size(width = 99.dp, height = 84.dp)
                        )
                    }
                    LinearProgressIndicator(
                        progress = 0.6f,
                        modifier = Modifier
                            .height(20.dp)
                            .width(230.dp)
                            .align(Alignment.CenterHorizontally),
                        trackColor = Color(0xffF1F4FF),
                        color = Color(0xffE2AA44),
                        strokeCap = StrokeCap.Round
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                }
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Color(0xff1F41BB)),
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .width(220.dp)
                        .height(31.dp)
                        .offset(y = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(5.dp),
                    elevation = ButtonDefaults.buttonElevation(25.dp)
                ) {
                    Text(
                        text = "Ok, vamos lá!",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontFamily = PoppinsSemiBold,
                        textAlign = TextAlign.Center
                    )
                }
            }
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
                    .width(380.dp)
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


/*@Preview(showBackground = true)
@Composable
fun ProgressoPreview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        Progresso()
    }
}*/
