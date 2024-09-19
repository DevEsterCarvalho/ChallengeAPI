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
import br.com.fiap.locawebee.ui.theme.PoppinsRegular
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold

@Composable
fun Intro9(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            painter = painterResource(id = R.drawable.fundo_localwebee),
            contentDescription = "fundo LocaWeBee",
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter)
        )
        Column (
            modifier = Modifier.fillMaxSize()
                .padding(bottom = 180.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                painter = painterResource(id = R.drawable.bee_logo),
                contentDescription = "ícone do projeto LocaWeBee",
                modifier = Modifier.size(width = 154.dp, height = 131.dp)
            )
        }
        Column (
            modifier = Modifier.fillMaxSize()
                .padding(top = 50.dp, start = 120.dp)
                .size(width = 238.dp, height = 36.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Row {
                Text(
                    text = "Divirta-se!",
                    fontSize = 30.sp,
                    fontFamily = PoppinsSemiBold,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(top = 10.dp)
                )
            }
            Box(
                modifier = Modifier
                    .width(120.dp)
                    .height(2.dp)
                    .background(Color.Black)
                    .padding(end = 30.dp)
            )
        }
        Column (
            modifier = Modifier.fillMaxSize()
                .padding(bottom = 180.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Mais do que um provedor de\n" +
                        "e-mails, aqui você se diverte e\n" +
                        "conquista recompensas enquanto\n" +
                        "exercita sua organização",
                fontSize = 16.sp,
                fontFamily = PoppinsRegular,
                textAlign = TextAlign.Center,
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 50.dp)
            )
        }
        Button(
            onClick = {navController.navigate("Tutorial")},
            colors = ButtonDefaults.buttonColors(Color(0xff1F41BB)),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .width(220.dp)
                .height(31.dp)
                .offset(y = (-170).dp),
            shape = RoundedCornerShape(10.dp),
            contentPadding = PaddingValues(5.dp),
            elevation = ButtonDefaults.buttonElevation(25.dp)
        ) {
            Text(
                text = "Vamos lá!",
                color = Color.White,
                fontSize = 16.sp,
                fontFamily = PoppinsSemiBold,
                textAlign = TextAlign.Center
            )
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
fun Intro9Preview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        Intro9()
    }
}*/
