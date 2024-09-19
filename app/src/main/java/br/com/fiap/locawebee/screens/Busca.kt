package br.com.fiap.locawebee.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.locawebee.ui.theme.PoppinsMedium
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold

@Composable
fun Busca(navController: NavController) {
    var data by remember { mutableStateOf(false)}
    var categoria by remember { mutableStateOf(false)}
    var cor by remember { mutableStateOf(false)}
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
        )  {
            Row (verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .padding(top = 20.dp)
            ){
                Button(onClick = {navController.navigate("CaixaEntradaPrincipal")},
                    colors = ButtonDefaults.buttonColors(Color.White)
                ){
                    Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "icone seta para voltar a uma página",
                        tint = Color.Black)
                }

                Text(
                    text = "Busca",
                    fontFamily = PoppinsSemiBold,
                    fontSize = 30.sp,
                    //textAlign = TextAlign.Center,
                    color = Color.Black,
                    modifier = Modifier
                        .width(245.dp)
                        .padding(horizontal = 40.dp)
                )
            }
            Box(
                modifier = Modifier
                    .width(20.dp)
                    .height(1.dp)
                    .background(Color(0xff1D1F33))
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(25.dp))
            Button(
                onClick = {navController.navigate("Busca2")},
                colors = ButtonDefaults.buttonColors(Color(0xffF1F4FF)),
                shape = RoundedCornerShape(4.dp),
                modifier = Modifier
                    .width(309.dp)
                    .height(40.dp),
            ){
                Text(
                    text = "Palavra chave ",
                    color = Color(0xff626262),
                    fontSize = 16.sp,
                    fontFamily = PoppinsMedium,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, start = 30.dp, end = 30.dp)
            ) {
                Checkbox(
                    checked = data,
                    onCheckedChange = {data = it},
                    colors = CheckboxDefaults.colors(
                        checkedColor = Color.Black,
                        uncheckedColor = Color.Black
                    )
                )
                Text(
                    text = "Filtro por data",
                    color = Color.Black
                )
                Spacer(modifier = Modifier.width(108.dp))
                Text(
                    text = "Crescente",
                    color = Color.Black
                )
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "icone filtro ordem crescente",
                    tint = Color.Black)
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, start = 30.dp, end = 30.dp)
            ) {
                Checkbox(
                    checked = categoria,
                    onCheckedChange = {categoria = it},
                    colors = CheckboxDefaults.colors(
                        checkedColor = Color.Black,
                        uncheckedColor = Color.Black
                    )
                )
                Text(
                    text = "Filtro por categoria",
                    color = Color.Black
                )
                Spacer(modifier = Modifier.width(87.dp))
                Text(
                    text = "Principal",
                    color = Color.Black
                )
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "icone filtro por categoria",
                    tint = Color.Black)
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, start = 30.dp, end = 30.dp)
            ) {
                Checkbox(
                    checked = cor,
                    onCheckedChange = {cor = it},
                    colors = CheckboxDefaults.colors(
                        checkedColor = Color.Black,
                        uncheckedColor = Color.Black
                    )
                )
                Text(
                    text = "Filtro por cor",
                    color = Color.Black
                )
                Spacer(modifier = Modifier.width(120.dp))
                Text(
                    text = "Vermelho",
                    color = Color.Black
                )
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "icone filtro por cor",
                    tint = Color.Black)
            }
        }
    }
}


/*@Preview(showBackground = true)
@Composable
fun BuscaPreview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        Busca()
    }
}*/
