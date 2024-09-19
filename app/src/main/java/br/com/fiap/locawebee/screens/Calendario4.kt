package br.com.fiap.locawebee.screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.KeyboardArrowLeft
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
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold

@Composable
fun Calendario4(navController: NavController) {
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
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(top = 30.dp)
                    .fillMaxWidth()
            ) {
                Button(
                    onClick = {navController.navigate("Calendario3")},
                    colors = ButtonDefaults.buttonColors(Color.White)
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "icone seta para voltar a uma página",
                        tint = Color.Black
                    )
                }
                Text(
                    text = "Ícones",
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
        Box(modifier = Modifier
            .align(Alignment.Center)
            .padding(bottom = 160.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            ) {
                Row (horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .width(310.dp)
                ){
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        modifier = Modifier
                                .size(70.dp)
                            .border(BorderStroke(width = 2.dp, color = Color.Black))
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.sacola_de_compras),
                            contentDescription = "ícone sacola de compra",
                            modifier = Modifier.size(width = 42.dp, height = 42.dp)
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        modifier = Modifier
                            .size(70.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.tesoura),
                            contentDescription = "ícone tesoura",
                            modifier = Modifier.size(width = 42.dp, height = 42.dp)
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        modifier = Modifier
                            .size(70.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.aviao),
                            contentDescription = "ícone aviao",
                            modifier = Modifier.size(width = 42.dp, height = 42.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                Row(horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .width(310.dp)
                ){
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        modifier = Modifier
                            .size(70.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.estrela),
                            contentDescription = "ícone estrela",
                            modifier = Modifier.size(width = 42.dp, height = 42.dp)
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        modifier = Modifier
                            .size(70.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lupa),
                            contentDescription = "ícone lupa",
                            modifier = Modifier.size(width = 42.dp, height = 42.dp)
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        modifier = Modifier
                            .size(70.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.tenis_corrida),
                            contentDescription = "ícone tenis corrida",
                            modifier = Modifier.size(width = 42.dp, height = 42.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                Row(horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .width(310.dp)
                ){
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        modifier = Modifier
                            .size(70.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.mapa),
                            contentDescription = "ícone mapa",
                            modifier = Modifier.size(width = 42.dp, height = 42.dp)
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        modifier = Modifier
                            .size(70.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.carro_corrida),
                            contentDescription = "ícone carro de corrida",
                            modifier = Modifier.size(width = 42.dp, height = 42.dp)
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        modifier = Modifier
                            .size(70.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.carrinho_compra),
                            contentDescription = "ícone carrinho de compra",
                            modifier = Modifier.size(width = 42.dp, height = 42.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                Row(horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .width(310.dp)
                ){
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        modifier = Modifier
                            .size(70.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.garrafa_agua),
                            contentDescription = "ícone garrafa de agua",
                            modifier = Modifier.size(width = 42.dp, height = 42.dp)
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        modifier = Modifier
                            .size(70.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.feijoada),
                            contentDescription = "ícone feijoada",
                            modifier = Modifier.size(width = 42.dp, height = 42.dp)
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(5.dp),
                        modifier = Modifier
                            .size(70.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.academia),
                            contentDescription = "ícone academia",
                            modifier = Modifier.size(width = 42.dp, height = 42.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(50.dp))
                Box(
                    modifier = Modifier
                        .width(20.dp)
                        .height(1.dp)
                        .background(Color(0xff1D1F33))
                        .align(Alignment.CenterHorizontally)
                )
            }
            Button(
                onClick = {navController.navigate("Calendario5")},
                colors = ButtonDefaults.buttonColors(Color(0xff1F41BB)),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .width(220.dp)
                    .height(31.dp)
                    .offset(y = 70.dp),
                shape = RoundedCornerShape(10.dp),
                contentPadding = PaddingValues(5.dp),
                elevation = ButtonDefaults.buttonElevation(25.dp)
            ) {
                Text(
                    text = "Salvar ícone!",
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
fun Calendario4Preview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        Calendario4()
    }
}
*/
