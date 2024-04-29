package com.example.uni_arrendo

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PrimeraPantalla(
    onNextClick: () -> Unit,
    onClick1: () -> Unit,
    onClick2: () -> Unit,
    onClick3: () -> Unit,
    navController: NavController
) {
    Scaffold(topBar = { ParteSuperior(navController = navController) },
        content = { ParteCentral(navController = navController) },
        bottomBar = { ParteInferior() }

    )
}

@Composable
fun BarraBuscar(modifier: Modifier = Modifier) {
    TextField(
        value = "",
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = stringResource(id = R.string.text_search)
            )
        },
        placeholder = {
            Text(text = stringResource(id = R.string.text_search))
        },
        onValueChange = {},
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            focusedContainerColor = MaterialTheme.colorScheme.surface
        ),
        modifier = modifier
            .paddingFromBaseline(top = 30.dp, bottom = 8.dp)
            .offset(40.dp, 30.dp)
            .heightIn(40.dp)
    )
}


@Composable
fun barrabusqueda() {
    BarraBuscar()
}


@Composable
fun ParteSuperior(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Blue),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(id = R.drawable.icono_app),
            contentDescription = null,
            modifier = Modifier
                .padding(10.dp)
                .width(150.dp),


            )
        Column() {

            Button(onClick = { navController.navigate(Pantallas.Tercera.name) }) {
                Text(
                    text = "Registrarse"

                )
            }

        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .padding(5.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.person),
                contentDescription = null,
                modifier = Modifier.size(80.dp)
            )
            Button(onClick = { navController.navigate(Pantallas.Cuarta.name) }) {
                Text(
                    text = "Iniciar Sesion",
                )
            }

        }

    }
}

@Composable
fun ParteInferior(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Green),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.estrella),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )

            Text(text = "Favoritos")
        }
        Column {
            Image(
                painter = painterResource(id = R.drawable.bell),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )

            Text(text = "Notificaciones")
        }
        Column {
            Image(
                painter = painterResource(id = R.drawable.buscar),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )

            Text(text = "Buscar")
        }

    }
}


@Composable
fun ParteCentral(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .height(100.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = { navController.navigate(Pantallas.Segunda.name) },
                    modifier = modifier
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Arrendar",
                    )
                }

                Button(
                    onClick = { navController.navigate(Pantallas.Quinta.name) },
                    modifier = modifier
                        .padding(10.dp)
                ) {

                    Text(
                        text = "Publicar",
                    )
                }

                Button(
                    onClick = { /*TODO*/ },
                    modifier = modifier
                        .padding(10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.home),
                        contentDescription = null,
                        modifier = modifier
                            .width(40.dp)
                            .height(40.dp),


                        )
                }


            }
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .height(50.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                BarraBuscar()
            }
        }

    }
}