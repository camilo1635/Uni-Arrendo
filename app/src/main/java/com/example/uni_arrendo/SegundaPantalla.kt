package com.example.uni_arrendo

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SegundaPantalla(
    navController: NavController
) {
    Scaffold(
        topBar = { Topbar(navController = navController) },
        content = { Content() },
        bottomBar = { ParteInferior() }

    )
}


@Composable
fun Topbar(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Cyan),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = modifier
                .size(60.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { navController.navigate(Pantallas.Inicio.name) }) {
                Image(
                    painter = painterResource(id = R.drawable.atras),
                    contentDescription = null
                )
            }

        }
        Column(
            modifier = Modifier
                .width(200.dp)
                .height(120.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(onClick = { navController.navigate(Pantallas.Tercera.name) }) {
                Text(
                    text = "Registrarse",
                )
            }

        }

        Column(
            modifier = Modifier
                .width(400.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.person),
                contentDescription = null,
                modifier = Modifier.size(80.dp)

            )
        }

    }
}

@Composable
fun Content(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Cyan),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(550.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.filtro),
                contentDescription = null,
                modifier = Modifier
                    .height(100.dp)
                    .size(50.dp)

            )
            BarraBuscar(viewModel = viewModel())

        }



        Column(
            modifier = Modifier
                .height(550.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally


        ) {

            Spacer(modifier = Modifier.height(50.dp))

            Image(
                modifier = Modifier
                    .height(150.dp),

                painter = painterResource(id = R.drawable.tercera_imagen),
                contentDescription = null,
            )

            Spacer(modifier = Modifier.height(30.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            )
            {
                Image(
                    modifier = Modifier
                        .height(90.dp)
                        .padding(8.dp),
                    painter = painterResource(id = R.drawable.segunda_imagen),
                    contentDescription = null
                )
                Image(
                    modifier = Modifier
                        .height(90.dp)
                        .padding(8.dp),
                    painter = painterResource(id = R.drawable.primera_imagen),
                    contentDescription = null
                )

            }

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Este acogedor apartamento de 2 habitaciones\n" +
                        "y 2 baños está ubicado en un sector tranquilo y\n" +
                        "seguro, cerca de la Universidad del Cauca y \n" +
                        "Parque Caldas. A pocos pasos hay \n" +
                        "restaurantes, cafés, supermercados y tiendas.",
                fontSize = 15.sp
            )

        }

        Column(
            modifier = Modifier
                .height(600.dp)
                .width(300.dp),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Bottom
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(
                    text = "Contactar"
                )
            }

        }

    }
}
