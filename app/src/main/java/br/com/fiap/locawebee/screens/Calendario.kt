package br.com.fiap.locawebee.screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
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
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.locawebee.R
import br.com.fiap.locawebee.ui.theme.LatoBold
import br.com.fiap.locawebee.ui.theme.LatoRegular
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold

@Composable
fun Calendario(navController: NavController) {
    Box(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
    ){
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
            Row (verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(top = 30.dp)
                    .fillMaxWidth()
            ){
                Button(onClick = {navController.navigate("CaixaEntradaPrincipal")},
                    colors = ButtonDefaults.buttonColors(Color.White)
                ){
                    Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "icone seta para voltar a uma página",
                        tint = Color.Black)
                }
                Text(
                    text = "Calendário",
                    fontFamily = PoppinsSemiBold,
                    fontSize = 30.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .width(250.dp)
                        .padding(horizontal = 40.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .width(20.dp)
                    .height(1.dp)
                    .background(Color(0xff1D1F33))
                    .align(Alignment.CenterHorizontally)
            )
        }
        BoxWithConstraints(
            modifier = Modifier
                .height(383.dp)
                .width(348.dp)
                .align(Alignment.Center)
                .fillMaxWidth()
                .background(Color.White, shape = RoundedCornerShape(2.dp))
                .padding(start = 5.dp, end = 5.dp)
                .offset(y = (-70).dp)
                .border(BorderStroke(width = 2.dp, color = Color(0xffF9F9F9)))
        ) {
            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .width(340.dp)
                    .height(56.dp)
                    .padding(top = 15.dp)
            ){
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.White)
                ){
                    Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "icone seta para voltar um mes",
                        tint = Color.Black)
                }
                Text(text = "Maio 2024",
                    fontSize = 20.sp,
                    fontFamily = LatoBold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 10.dp))
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.White)
                ){
                    Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "icone seta para avancar o mes",
                        tint = Color.Black)
                }
            }
            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .width(340.dp)
                    .padding(top = 60.dp)
            ) {
                Box(
                    modifier = Modifier
                        .width(355.dp)
                        .height(1.dp)
                        .background(Color(0xff1D1F33))
                        .padding(bottom = 100.dp)
                )
                Row (horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .width(340.dp)
                        .height(50.dp)
                ){
                    Text(text = "DOM",
                        fontFamily = LatoRegular,
                        fontSize = 12.sp,
                        color = Color.Black)
                    Text(text = "SEG",
                        fontFamily = LatoRegular,
                        fontSize = 12.sp,
                        color = Color.Black)
                    Text(text = "TER",
                        fontFamily = LatoRegular,
                        fontSize = 12.sp,
                        color = Color.Black)
                    Text(text = "QUA",
                        fontFamily = LatoRegular,
                        fontSize = 12.sp,
                        color = Color.Black)
                    Text(text = "QUI",
                        fontFamily = LatoRegular,
                        fontSize = 12.sp,
                        color = Color.Black)
                    Text(text = "SEX",
                        fontFamily = LatoRegular,
                        fontSize = 12.sp,
                        color = Color.Black)
                    Text(text = "SAB",
                        fontFamily = LatoRegular,
                        fontSize = 12.sp,
                        color = Color.Black)
                }
                Row (horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .width(340.dp)
                    .height(50.dp)
                ){
                    Text(text = "1",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "2",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "3",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "4",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "5",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "6",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "7",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                }
                Row (horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .width(340.dp)
                        .height(50.dp)
                ){
                    Text(text = "8",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "9",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "10",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "11",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "12",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "13",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "14",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                }
                Row (horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .width(340.dp)
                        .height(50.dp)
                ){
                    Text(text = "15",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "16",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "17",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "18",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "19",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "20",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "21",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                }
                Row (horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .width(340.dp)
                        .height(50.dp)
                ){
                    Text(text = "22",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "23",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "24",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "25",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "26",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "27",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "28",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                }
                Row (horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .width(340.dp)
                        .height(50.dp)
                ){
                    Text(text = "29",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "30",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "31",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "1",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "2",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "3",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                    Text(text = "4",
                        fontFamily = LatoRegular,
                        fontSize = 18.sp,
                        color = Color.Black)
                }
            }
            Button(
                onClick = {navController.navigate("Calendario2")},
                colors = ButtonDefaults.buttonColors(Color(0xff1F41BB)),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .width(220.dp)
                    .height(31.dp)
                    .offset(y =30.dp),
                shape = RoundedCornerShape(10.dp),
                contentPadding = PaddingValues(5.dp),
                elevation = ButtonDefaults.buttonElevation(25.dp)
            ) {
                Text(
                    text = "Definir Compromisso",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontFamily = PoppinsSemiBold,
                    textAlign = TextAlign.Center
                )
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
                    onClick = {navController.navigate("NovoEmail2")},
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
fun CalendarioPreview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        Calendario()
    }
}*/
