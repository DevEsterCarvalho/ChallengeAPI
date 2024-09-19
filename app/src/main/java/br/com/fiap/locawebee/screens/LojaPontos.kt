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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
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
fun LojaPontos(navController: NavController) {
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()

    ){
        Column {
            Row(
                horizontalArrangement = Arrangement.Absolute.Center,
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 70.dp, bottom = 10.dp)
            ){
                Text(
                    text = "Loja de Pontos",
                    color = (Color(0xff1D1F33)),
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
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .width(194.dp)
                    .padding(top = 20.dp)
                    .align(Alignment.CenterHorizontally)
            ){
                Text(
                    text = "Seus pontos",
                    color = (Color(0xff1D1F33)),
                    fontFamily = PoppinsSemiBold,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                )
                Image(
                    painter = painterResource(id = R.drawable.medalha),
                    contentDescription = "ícone medalha",
                    modifier = Modifier.size(width = 17.dp, height = 17.dp)

                )
                Text(
                    text = "4",
                    color = (Color(0xff1D1F33)),
                    fontFamily = PoppinsSemiBold,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                )
                Image(
                    painter = painterResource(id = R.drawable.premio),
                    contentDescription = "ícone premio",
                    modifier = Modifier.size(width = 17.dp, height = 17.dp)

                )
                Text(
                    text = "7",
                    color = (Color(0xff1D1F33)),
                    fontFamily = PoppinsSemiBold,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp)
                    .width(338.dp)
                    .height(74.dp)
                    .shadow(2.dp, RoundedCornerShape(13.dp))
                    .background(color = Color(0xffF9F9F9))
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                ) {
                    Text(
                        text = "3",
                        color = (Color(0xff1D1F33)),
                        fontFamily = PoppinsMedium,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                    )
                    Image(
                        painter = painterResource(id = R.drawable.medalha),
                        contentDescription = "ícone medalha",
                        modifier = Modifier.size(width = 45.dp, height = 45.dp)
                            .clip(RoundedCornerShape(15.dp))

                    )
                    Button(
                        onClick = {navController.navigate("ComprarItem")},
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        shape = RoundedCornerShape(4.dp),
                    ) {
                        Text(
                            text = "Emoji de abelha ",
                            color = (Color(0xff1D1F33)),
                            fontFamily = PoppinsMedium,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.height(40.dp))
                    Image(
                        painter = painterResource(id = R.drawable.bee_logo),
                        contentDescription = "ícone do projeto LocaWeBee",
                        modifier = Modifier.size(width = 37.dp, height = 40.dp)

                    )
                }
            }
            Spacer(modifier = Modifier.height(12.5.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp)
                    .width(338.dp)
                    .height(74.dp)
                    .shadow(2.dp, RoundedCornerShape(13.dp))
                    .background(color = Color(0xffF9F9F9))
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                ) {
                    Text(
                        text = "5",
                        color = (Color(0xff1D1F33)),
                        fontFamily = PoppinsMedium,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                    )
                    Image(
                        painter = painterResource(id = R.drawable.medalha),
                        contentDescription = "ícone medalha",
                        modifier = Modifier.size(width = 45.dp, height = 45.dp)
                            .clip(RoundedCornerShape(15.dp))

                    )
                    Button(
                        onClick = {navController.navigate("Recompensa2")},
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        shape = RoundedCornerShape(4.dp),
                    ){
                        Text(
                            text = "Emoji favo de Mel",
                            color = (Color(0xff1D1F33)),
                            fontFamily = PoppinsMedium,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.height(40.dp))
                    Image(
                        painter = painterResource(id = R.drawable.colmeia),
                        contentDescription = "ícone colmeia",
                        modifier = Modifier.size(width = 37.dp, height = 40.dp)

                    )
                }
            }
            Spacer(modifier = Modifier.height(12.5.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp)
                    .width(338.dp)
                    .height(74.dp)
                    .shadow(2.dp, RoundedCornerShape(13.dp))
                    .background(color = Color(0xffF9F9F9))
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                ) {
                    Text(
                        text = "2",
                        color = (Color(0xff1D1F33)),
                        fontFamily = PoppinsMedium,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                    )
                    Image(
                        painter = painterResource(id = R.drawable.premio),
                        contentDescription = "ícone premio",
                        modifier = Modifier.size(width = 45.dp, height = 45.dp)
                            .clip(RoundedCornerShape(15.dp))

                    )
                    Button(
                        onClick = {navController.navigate("Recompensa3")},
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        shape = RoundedCornerShape(4.dp),
                    ){
                        Text(
                            text = "Plano de fundo\n" +
                                    "Favos de Mel",
                            color = (Color(0xff1D1F33)),
                            fontFamily = PoppinsMedium,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.height(40.dp))
                    Image(
                        painter = painterResource(id = R.drawable.favo_de_mel),
                        contentDescription = "ícone favo de mel",
                        modifier = Modifier.size(width = 37.dp, height = 40.dp)
                            .clip(RoundedCornerShape(15.dp))
                            .scale(scaleX = 1f, scaleY = 1.7f)
                    )
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp)
                    .width(338.dp)
                    .height(74.dp)
                    .shadow(2.dp, RoundedCornerShape(13.dp))
                    .background(color = Color(0xffF9F9F9))
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                ) {
                    Text(
                        text = "3",
                        color = (Color(0xff1D1F33)),
                        fontFamily = PoppinsMedium,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                    )
                    Image(
                        painter = painterResource(id = R.drawable.premio),
                        contentDescription = "ícone premio",
                        modifier = Modifier.size(width = 45.dp, height = 45.dp)
                            .clip(RoundedCornerShape(15.dp))

                    )
                    Button(
                        onClick = {navController.navigate("Recompensa4")},
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        shape = RoundedCornerShape(4.dp),
                    ){
                        Text(
                            text = "Plano de fundo\n" +
                                    "Mel Melado",
                            color = (Color(0xff1D1F33)),
                            fontFamily = PoppinsMedium,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.height(40.dp))
                    Image(
                        painter = painterResource(id = R.drawable.mel_melado),
                        contentDescription = "ícone mel melado",
                        modifier = Modifier.size(width = 37.dp, height = 40.dp)
                            .clip(RoundedCornerShape(15.dp))
                            .scale(scaleX = 1f, scaleY = 1.6f)
                    )
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp)
                    .width(338.dp)
                    .height(74.dp)
                    .shadow(2.dp, RoundedCornerShape(13.dp))
                    .background(color = Color(0xffF9F9F9))
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                ) {
                    Text(
                        text = "4",
                        color = (Color(0xff1D1F33)),
                        fontFamily = PoppinsMedium,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                    )
                    Image(
                        painter = painterResource(id = R.drawable.premio),
                        contentDescription = "ícone premio",
                        modifier = Modifier.size(width = 45.dp, height = 45.dp)
                            .clip(RoundedCornerShape(15.dp))

                    )
                    Button(
                        onClick = {navController.navigate("Recompensa5")},
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        shape = RoundedCornerShape(4.dp),
                    ){
                        Text(
                            text = "Tema de E-mail\n" +
                                    "Romântico",
                            color = (Color(0xff1D1F33)),
                            fontFamily = PoppinsMedium,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.height(40.dp))
                    Image(
                        painter = painterResource(id = R.drawable.paixao),
                        contentDescription = "ícone paixão",
                        modifier = Modifier.size(width = 37.dp, height = 40.dp)
                            .clip(RoundedCornerShape(15.dp))
                            .scale(scaleX = 1f, scaleY = 1.4f)
                    )
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp)
                    .width(338.dp)
                    .height(74.dp)
                    .shadow(2.dp, RoundedCornerShape(13.dp))
                    .background(color = Color(0xffF9F9F9))
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                ) {
                    Text(
                        text = "5",
                        color = (Color(0xff1D1F33)),
                        fontFamily = PoppinsMedium,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                    )
                    Image(
                        painter = painterResource(id = R.drawable.premio),
                        contentDescription = "ícone premio",
                        modifier = Modifier.size(width = 45.dp, height = 45.dp)
                            .clip(RoundedCornerShape(15.dp))

                    )
                    Button(
                        onClick = {navController.navigate("Recompensa6")},
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        shape = RoundedCornerShape(4.dp),
                    ){
                        Text(
                            text = "Tema de E-mail\n Ouro",
                            color = (Color(0xff1D1F33)),
                            fontFamily = PoppinsMedium,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.height(40.dp))
                    Image(
                        painter = painterResource(id = R.drawable.tema_ouro),
                        contentDescription = "ícone tema ouro",
                        modifier = Modifier.size(width = 37.dp, height = 40.dp)
                            .clip(RoundedCornerShape(15.dp))
                            .scale(scaleX = 1f, scaleY = 1.7f)
                    )
                }
            }
        }
        Box(modifier = Modifier.align(Alignment.CenterEnd)
            .padding(top = 500.dp)
        ) {
            Button(
                onClick = {navController.navigate("Inventario")},
                colors = ButtonDefaults.buttonColors(Color(color = 0xff1F41BB)),
                contentPadding = PaddingValues(5.dp),
                shape = RoundedCornerShape(4.dp),
                modifier = Modifier
                    .width(210.dp)
                    .height(39.dp)
            ) {
                Text(
                    text = "Acessar Inventário",
                    color = (Color(color = 0xffF9F9F9)),
                    fontSize = 16.sp,
                    fontFamily = PoppinsSemiBold,
                    textAlign = TextAlign.Center,
                )
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


/*@Preview(showBackground = true)
@Composable
fun LojaPontosPreview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        LojaPontos()
    }
}*/
