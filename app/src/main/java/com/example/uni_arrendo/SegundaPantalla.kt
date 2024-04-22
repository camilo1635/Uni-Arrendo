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


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun Contenido() {
    Scaffold(
        topBar = { Topbar() },
        content = { Content() },
        bottomBar = { ParteInferior() }

    )
}


@Composable
fun Topbar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White),
    ) {
        Column(
            modifier = Modifier
                .width(200.dp)
                .height(120.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Registrarse", modifier = modifier
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = CircleShape,

                        )
            )
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
            .background(Color.White),
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
            BarraBuscar()

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

                painter = painterResource(id = R.drawable.ab5_hiit),
                contentDescription = null,
            )

            Spacer(modifier = Modifier.height(30.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                Image(
                    modifier = Modifier
                        .height(90.dp),
                    painter = painterResource(id = R.drawable.ab4_tabata),
                    contentDescription = null
                )
                Image(
                    modifier = Modifier
                        .height(90.dp),
                    painter = painterResource(id = R.drawable.ab1_inversions),
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
                .height(650.dp)
                .width(300.dp),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                text = "Contactar",
                modifier = Modifier
                    .height(60.dp)
            )
        }

    }
}
