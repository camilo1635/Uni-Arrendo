package com.example.uni_arrendo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.uni_arrendo.ui.theme.UniArrendoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UniArrendoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Navegacion()
                }
            }
        }
    }
}

@Composable
fun Navegacion() {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Pantallas.Inicio.name) {
        composable(route = Pantallas.Inicio.name) {
            PrimeraPantalla(navController = navHostController,
                onNextClick = { navHostController.navigate(Pantallas.Segunda.name) },
                onClick1 = { navHostController.navigate(Pantallas.Tercera.name) },
                onClick2 = { navHostController.navigate(Pantallas.Cuarta.name) },
                onClick3 = { navHostController.navigate(Pantallas.Quinta.name) },
                onClick4 = { navHostController.navigate(Pantallas.Sexta.name) }
            )
        }
        composable(route = Pantallas.Segunda.name) {
            SegundaPantalla(navController = navHostController,
                onClick1 = { navHostController.navigate(Pantallas.Tercera.name) },
                onClick2 = { navHostController.navigate(Pantallas.Inicio.name) }
            )
        }
        composable(route = Pantallas.Sexta.name){
            PantallaCreditos()
        }
    }
}


enum class Pantallas() {
    Inicio,
    Segunda,
    Tercera,
    Cuarta,
    Quinta,
    Sexta
}

class PrimeraPantallaViewModel : ViewModel() {
    var queryBusqueda: String by mutableStateOf("")

    fun actualizarQueryBusqueda(nuevaQuery: String) {
        queryBusqueda = nuevaQuery
    }
}