package br.com.fiap.locawebee.screens

import androidx.compose.foundation.Image
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun BemVindo(navController: NavController) {
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
                .padding(bottom = 130.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                painter = painterResource(id = R.drawable.bee_logo),
                contentDescription = "ícone do projeto LocaWeBee",
                modifier = Modifier.size(width = 191.dp, height = 165.dp)
            )
        }
        Column (
            modifier = Modifier.fillMaxSize()
            .padding(bottom = 100.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Row {
                Text(
                    text = "LocaWe",
                    fontSize = 35.sp,
                    fontFamily = PoppinsSemiBold,
                    textAlign = TextAlign.Center,
                    color = Color (0xFF1F41BB),
                    modifier = Modifier
                        .padding(top = 10.dp)
                )
                Text(
                    text = "BEE",
                    fontSize = 35.sp,
                    fontFamily = PoppinsSemiBold,
                    textAlign = TextAlign.Center,
                    color = Color(0xFFED0000),
                    modifier = Modifier
                        .padding(top = 10.dp)
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Conheça uma forma divertida de\n gerenciar seu e-mail",
                fontSize = 14.sp,
                fontFamily = PoppinsRegular,
                textAlign = TextAlign.Center,
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 50.dp)
            )
        }
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 50.dp)
        ){
            Row(
                modifier = Modifier
                    .padding(10.dp)

            ){
                Button(
                    onClick = {navController.navigate("Login")},
                    colors = ButtonDefaults.buttonColors(Color(0xff1F41BB)),
                    modifier = Modifier
                        .width(144.dp)
                        .height(44.dp),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(5.dp),
                    elevation = ButtonDefaults.buttonElevation(3.dp)
                ){
                    Text(
                        text = "Entrar",
                        color = (Color.White),
                        fontSize = 16.sp,
                        fontFamily = PoppinsSemiBold,
                        textAlign = TextAlign.Center
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(
                    onClick = {navController.navigate("CriarConta")},
                    colors = ButtonDefaults.buttonColors(Color.White),
                    modifier = Modifier
                        .width(144.dp)
                        .height(44.dp),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(5.dp),
                    elevation = ButtonDefaults.buttonElevation(3.dp)
                ){
                    Text(
                        text = "Cadastrar",
                        color = (Color(0xff0A0A0A)),
                        fontSize = 16.sp,
                        fontFamily = PoppinsSemiBold,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }

}

/*@Preview(showBackground = true)
@Composable
fun BemVindoPreview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        BemVindo()
    }
}*/
