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
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
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
import br.com.fiap.locawebee.ui.theme.OpenSansBold
import br.com.fiap.locawebee.ui.theme.OpenSansRegular
import br.com.fiap.locawebee.ui.theme.PoppinsRegular
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold
import br.com.fiap.locawebee.ui.theme.RobotoBold
import br.com.fiap.locawebee.ui.theme.RobotoRegular

@Composable
fun Intro2(navController: NavController) {
    Box(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
    ){
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
                                //.align(Alignment.CenterHorizontally),
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
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 80.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Box(
                modifier = Modifier
                    .width(16.dp)
                    .height(1.dp)
                    .background(Color(0xff1D1F33))
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()

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
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Start,
                            color = Color.Black,
                            modifier = Modifier.width(230.dp)
                        )
                        val text = buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color(0xff292929), fontWeight = FontWeight.Normal)) {
                                append("Preparado para a próxima semana?\n")
                            }
                            withStyle(style = SpanStyle(color = Color(0xff5D5C5D), fontWeight = FontWeight.Normal)) {
                                append("Estamos ansiosos para te receber no nos... ")
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
                            fontWeight = FontWeight.Normal,
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
                        Text(
                            text = "Bem Vestido - Bem-Vindo(a)!",
                            fontSize = 15.sp,
                            fontFamily = OpenSansRegular,
                            fontWeight = FontWeight.Normal,
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
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            color = Color(0xff292929),
                            modifier = Modifier.padding(bottom = 5.dp)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Image(
                            painter = painterResource(id = R.drawable.estrela_vazia),
                            contentDescription = "ícone estrela vazia",
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
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Start,
                            color = Color.Black,
                            modifier = Modifier.width(230.dp)
                        )
                        val text = buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color(0xff292929), fontWeight = FontWeight.Normal)) {
                                append("Nota Fiscal\n")
                            }
                            withStyle(style = SpanStyle(color = Color(0xff5D5C5D), fontWeight = FontWeight.Normal)) {
                                append("A Love Decorações agradece sua pref...")
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
                            Text(
                                text = "+3",
                                fontFamily = RobotoRegular,
                                fontWeight = FontWeight.Normal,
                                fontSize = 12.sp,
                                color = Color(0xff292929),
                                textAlign = TextAlign.Center,
                                modifier = Modifier.padding(top = 3.dp)
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
                            fontWeight = FontWeight.Normal,
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
            Spacer(modifier = Modifier.height(30.dp))
            BoxWithConstraints(
                modifier = Modifier
                    .height(137.dp)
                    .width(338.dp)
                    .background(Color(0xffF9F9F9), shape = RoundedCornerShape(13.dp))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bee_logo),
                    contentDescription = "imagem bee logo",
                    modifier = Modifier
                        .size(width = 88.dp, height = 75.dp)
                        .align(Alignment.TopCenter)
                        .offset(y = (-30).dp)
                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 20.dp)
                        .width(300.dp)
                ) {
                    Text(
                        text = "Com o tempo sua caixa de entrada\n" +
                                "ficará assim.",
                        fontSize = 16.sp,
                        fontFamily = PoppinsRegular,
                        textAlign = TextAlign.Center,
                        color = Color(0xff1D1F33),
                        modifier = Modifier
                            .width(286.dp)
                            .fillMaxWidth()
                            .padding(top = 20.dp)
                    )
                }
                Button(
                    onClick = {navController.navigate("Intro3")},
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
                        text = "Próximo",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontFamily = PoppinsSemiBold,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(bottom = 620.dp)
                .fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End,
                modifier = Modifier.fillMaxWidth()
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
                                .background(Color(0xff1D1F33))
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
                        color = Color(0xff0A0A0A),
                        fontSize = 16.sp,
                        fontFamily = PoppinsSemiBold,
                        textAlign = TextAlign.Center
                    )
                }
                Spacer(modifier = Modifier.width(40.dp))
                Button(
                    onClick = {navController.navigate("Lixeira")},
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(42.dp)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lixeira),
                        contentDescription = "ícone lixeira",
                        modifier = Modifier.size(24.dp)

                    )
                }
                Spacer(modifier = Modifier.width(5.dp))
            }
        }
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
fun Intro2Preview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        Intro2()
    }
}*/
