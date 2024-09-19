package br.com.fiap.locawebee.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.locawebee.R
import br.com.fiap.locawebee.ui.theme.PoppinsBold
import br.com.fiap.locawebee.ui.theme.PoppinsRegular
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold

@Composable
fun Descricao(navController: NavController) {
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
                .padding(bottom = 70.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                painter = painterResource(id = R.drawable.bee_logo),
                contentDescription = "ícone do projeto LocaWeBee",
                modifier = Modifier.size(width = 191.dp, height = 165.dp)
            )
        }
        Box (
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom =70.dp)
        ){
            Column (horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
            ){
                Text(
                    text = buildAnnotatedString {
                        append("A ")
                        withStyle(style = SpanStyle(fontFamily = PoppinsBold)) {
                            append("LocaweBEE")
                        }
                        append(" foi desenvolvida para\n mudar a forma de interagir com seu\n" +
                                "e-mail, proporcionando uma experiência\n única e divertida para você!")
                    },
                    fontSize = 14.sp,
                    fontFamily = PoppinsRegular,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 10.dp)
                )
                Button(
                    onClick = {navController.navigate("Intro")},
                    colors = ButtonDefaults.buttonColors(Color(color = 0xff1F41BB)),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(5.dp),
                    elevation = ButtonDefaults.buttonElevation(5.dp),
                    modifier = Modifier
                        .width(307.dp)
                        .height(48.dp)
                ) {
                    Text(
                        text = "Vamos lá!",
                        color = (Color.White),
                        fontSize = 16.sp,
                        fontFamily = PoppinsSemiBold,
                        textAlign = TextAlign.Center,
                    )
                }
                Spacer(modifier = Modifier.width(70.dp))
            }
        }

    }

}

/*
@Preview(showSystemUi = true)
@Composable
fun DescricaoPreview() {
    Surface (
        modifier = Modifier.fillMaxWidth()
    ) {
        Descricao()
    }
}*/
