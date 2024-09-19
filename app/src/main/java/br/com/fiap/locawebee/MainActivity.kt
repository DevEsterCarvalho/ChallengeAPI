package br.com.fiap.locawebee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.locawebee.screens.BemVindo
import br.com.fiap.locawebee.screens.Busca
import br.com.fiap.locawebee.screens.Busca2
import br.com.fiap.locawebee.screens.CaixaEntradaOutros
import br.com.fiap.locawebee.screens.CaixaEntradaOutrosModoOffline
import br.com.fiap.locawebee.screens.CaixaEntradaPrincipal
import br.com.fiap.locawebee.screens.CaixaEntradaPrincipalModoOffline
import br.com.fiap.locawebee.screens.Calendario
import br.com.fiap.locawebee.screens.Calendario2
import br.com.fiap.locawebee.screens.Calendario3
import br.com.fiap.locawebee.screens.Calendario4
import br.com.fiap.locawebee.screens.Calendario5
import br.com.fiap.locawebee.screens.Calendario6
import br.com.fiap.locawebee.screens.Calendario7
import br.com.fiap.locawebee.screens.Calendario8
import br.com.fiap.locawebee.screens.ComprarItem
import br.com.fiap.locawebee.screens.Configuracoes
import br.com.fiap.locawebee.screens.CriarConta
import br.com.fiap.locawebee.screens.Descricao
import br.com.fiap.locawebee.screens.FavosDeMel
import br.com.fiap.locawebee.screens.FiltroBusca
import br.com.fiap.locawebee.screens.Intro
import br.com.fiap.locawebee.screens.Intro2
import br.com.fiap.locawebee.screens.Intro3
import br.com.fiap.locawebee.screens.Intro4
import br.com.fiap.locawebee.screens.Intro5
import br.com.fiap.locawebee.screens.Intro6
import br.com.fiap.locawebee.screens.Intro7
import br.com.fiap.locawebee.screens.Intro8
import br.com.fiap.locawebee.screens.Intro9
import br.com.fiap.locawebee.screens.Inventario
import br.com.fiap.locawebee.screens.Lixeira
import br.com.fiap.locawebee.screens.Lixeira2
import br.com.fiap.locawebee.screens.Login
import br.com.fiap.locawebee.screens.LojaPontos
import br.com.fiap.locawebee.screens.MelMelado
import br.com.fiap.locawebee.screens.ModoDark
import br.com.fiap.locawebee.screens.NovoEmail
import br.com.fiap.locawebee.screens.NovoEmail2
import br.com.fiap.locawebee.screens.OfflineMensagem
import br.com.fiap.locawebee.screens.OfflineMensagem2
import br.com.fiap.locawebee.screens.Paixao
import br.com.fiap.locawebee.screens.PrimeiroAcesso
import br.com.fiap.locawebee.screens.Progresso
import br.com.fiap.locawebee.screens.Progresso2
import br.com.fiap.locawebee.screens.Recompensa
import br.com.fiap.locawebee.screens.Recompensa2
import br.com.fiap.locawebee.screens.Recompensa3
import br.com.fiap.locawebee.screens.Recompensa4
import br.com.fiap.locawebee.screens.Recompensa5
import br.com.fiap.locawebee.screens.Recompensa6
import br.com.fiap.locawebee.screens.Reconectando
import br.com.fiap.locawebee.screens.Reconectando2
import br.com.fiap.locawebee.screens.TemaOuro
import br.com.fiap.locawebee.screens.Tutorial
import br.com.fiap.locawebee.screens.Tutorial1
import br.com.fiap.locawebee.screens.Tutorial2
import br.com.fiap.locawebee.screens.Tutorial3
import br.com.fiap.locawebee.screens.Tutorial4
import br.com.fiap.locawebee.screens.Tutorial5
import br.com.fiap.locawebee.screens.Tutorial6
import br.com.fiap.locawebee.ui.theme.LocaWeBeeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LocaWeBeeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "Bemvindo" ){
                        composable(route = "BemVindo") { BemVindo(navController) }
                        composable(route = "Busca") { Busca(navController) }
                        composable(route = "Busca2") { Busca2(navController) }
                        composable(route = "CaixaEntradaOutros") { CaixaEntradaOutros(navController) }
                        composable(route = "CaixaEntradaOutrosModoOffline") { CaixaEntradaOutrosModoOffline(navController) }
                        composable(route = "CaixaEntradaPrincipal") { CaixaEntradaPrincipal(navController) }
                        composable(route = "CaixaEntradaPrincipalModoOffline") { CaixaEntradaPrincipalModoOffline(navController) }
                        composable(route = "Calendario") { Calendario(navController) }
                        composable(route = "Calendario2") { Calendario2(navController) }
                        composable(route = "Calendario3") { Calendario3(navController) }
                        composable(route = "Calendario4") { Calendario4(navController) }
                        composable(route = "Calendario5") { Calendario5(navController) }
                        composable(route = "Calendario6") { Calendario6(navController) }
                        composable(route = "Calendario7") { Calendario7(navController) }
                        composable(route = "Calendario8") { Calendario8(navController) }
                        composable(route = "ComprarItem") { ComprarItem(navController) }
                        composable(route = "Configuracoes") { Configuracoes(navController) }
                        composable(route = "CriarConta") { CriarConta(navController) }
                        composable(route = "Descricao") { Descricao(navController) }
                        composable(route = "FavosDeMel") { FavosDeMel(navController) }
                        composable(route = "FiltroBusca") { FiltroBusca(navController) }
                        composable(route = "Intro") { Intro(navController) }
                        composable(route = "Intro2") { Intro2(navController) }
                        composable(route = "Intro3") { Intro3(navController) }
                        composable(route = "Intro4") { Intro4(navController) }
                        composable(route = "Intro5") { Intro5(navController) }
                        composable(route = "Intro6") { Intro6(navController) }
                        composable(route = "Intro7") { Intro7(navController) }
                        composable(route = "Intro8") { Intro8(navController) }
                        composable(route = "Intro9") { Intro9(navController) }
                        composable(route = "Inventario") { Inventario(navController) }
                        composable(route = "Lixeira") { Lixeira(navController) }
                        composable(route = "Lixeira2") { Lixeira2(navController) }
                        composable(route = "Login") { Login(navController) }
                        composable(route = "LojaPontos") { LojaPontos(navController) }
                        composable(route = "MelMelado") { MelMelado(navController) }
                        composable(route = "ModoDark") { ModoDark(navController) }
                        composable(route = "NovoEmail") { NovoEmail(navController) }
                        composable(route = "NovoEmail2") { NovoEmail2(navController) }
                        composable(route = "OfflineMensagem2") { OfflineMensagem2(navController) }
                        composable(route = "OfflineMensagem") { OfflineMensagem(navController) }
                        composable(route = "Paixao") { Paixao(navController) }
                        composable(route = "PrimeiroAcesso") { PrimeiroAcesso(navController) }
                        composable(route = "Progresso") { Progresso(navController) }
                        composable(route = "Progresso2") { Progresso2(navController) }
                        composable(route = "Recompensa") { Recompensa(navController) }
                        composable(route = "Recompensa2") { Recompensa2(navController) }
                        composable(route = "Recompensa3") { Recompensa3(navController) }
                        composable(route = "Recompensa4") { Recompensa4(navController) }
                        composable(route = "Recompensa5") { Recompensa5(navController) }
                        composable(route = "Recompensa6") { Recompensa6(navController) }
                        composable(route = "Reconectando") { Reconectando(navController) }
                        composable(route = "Reconectando2") { Reconectando2(navController) }
                        composable(route = "TemaOuro") { TemaOuro(navController) }
                        composable(route = "Tutorial") { Tutorial(navController) }
                        composable(route = "Tutorial1") { Tutorial1(navController) }
                        composable(route = "Tutorial2") { Tutorial2(navController) }
                        composable(route = "Tutorial3") { Tutorial3(navController) }
                        composable(route = "Tutorial4") { Tutorial4(navController) }
                        composable(route = "Tutorial5") { Tutorial5(navController) }
                        composable(route = "Tutorial6") { Tutorial6(navController) }
                    }
                }
            }
        }
    }
}