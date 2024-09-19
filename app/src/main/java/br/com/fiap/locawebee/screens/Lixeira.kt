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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.KeyboardArrowLeft
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
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
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
import br.com.fiap.locawebee.ui.theme.PoppinsRegular
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold
import br.com.fiap.locawebee.ui.theme.RobotoBold
import br.com.fiap.locawebee.ui.theme.RobotoRegular

@Composable
fun Lixeira(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            verticalArrangement = Arrangement.Top
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(start = 20.dp, bottom = 10.dp,top = 10.dp)
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
                        progress = 0f,
                        modifier = Modifier
                            .height(20.dp)
                            .width(230.dp)
                            .align(Alignment.CenterHorizontally),
                        //color = Color(0xff45BF6B), //Cor da barra
                        trackColor = Color(0xffF1F4FF),
                        strokeCap = StrokeCap.Round
                    )
                }
            }
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
            )  {
                Row (verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                        modifier = Modifier
                        .padding(top = 10.dp)
                ){
                    Button(onClick = {navController.navigate("CaixaEntradaPrincipal")},
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ){
                        Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "icone seta para voltar a uma página",
                            tint = Color.Black)
                    }

                    Text(
                        text = "Lixeira",
                        fontFamily = PoppinsSemiBold,
                        fontSize = 30.sp,
                        //textAlign = TextAlign.Center,
                        color = Color.Black,
                        modifier = Modifier
                            .width(245.dp)
                            .padding(horizontal = 40.dp)
                    )
                }
            }
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
                            fontFamily = OpenSansBold,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start,
                            color = Color.Black,
                            modifier = Modifier.width(230.dp)
                        )
                        val text = buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color(0xff292929), fontWeight = FontWeight.Bold)) {
                                append("Preparado para a próxima semana?\n")
                            }
                            withStyle(style = SpanStyle(color = Color(0xff5D5C5D), fontWeight = FontWeight.Bold)) {
                                append("Estamos ansiosos para te receber no nos... ")
                            }
                        }

                        Text(
                            text = text,
                            fontSize = 13.sp,
                            fontFamily = RobotoBold,
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
                            fontFamily = RobotoBold,
                            fontWeight = FontWeight.Bold,
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
                            fontFamily = OpenSansBold,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start,
                            color = Color.Black,
                            modifier = Modifier.width(230.dp)
                        )
                        val text = buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color(0xff292929), fontWeight = FontWeight.Bold)) {
                                append("Saiba Mais\n")
                            }
                            withStyle(style = SpanStyle(color = Color(0xff5D5C5D), fontWeight = FontWeight.Bold)) {
                                append("Parabéns, por criar sua conta! ")
                            }
                        }

                        Text(
                            text = text,
                            fontSize = 13.sp,
                            fontFamily = RobotoBold,
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
                            fontFamily = RobotoBold,
                            fontWeight = FontWeight.Bold,
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
            Spacer(modifier = Modifier.width(8.dp))
        }
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 250.dp)
        ){
            Row(
                modifier = Modifier
                    .padding(10.dp)

            ){
                Button(
                    onClick = {navController.navigate("Lixeira2")},
                    colors = ButtonDefaults.buttonColors(Color(0xff1F41BB)),
                    modifier = Modifier
                        .width(220.dp)
                        .height(31.dp),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(5.dp),
                    elevation = ButtonDefaults.buttonElevation(10.dp)
                ){
                    Text(
                        text = "Esvaziar lixeira",
                        color = (Color.White),
                        fontSize = 16.sp,
                        fontFamily = PoppinsSemiBold,
                        textAlign = TextAlign.Center
                    )
                }
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
                    onClick = {navController.navigate("Busca") },
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
fun LixeiraPreview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        Lixeira()
    }
}*/
