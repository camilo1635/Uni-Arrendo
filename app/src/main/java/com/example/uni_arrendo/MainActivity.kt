package com.example.uni_arrendo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    ViewContainer()
                }
            }
        }
    }
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


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun ViewContainer() {
    Scaffold(topBar = { ParteSuperior() },
        content = { ParteCentral() },
        bottomBar = { ParteInferior() }

    )
}

@Composable
fun ParteSuperior(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Blue),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Image(
            painter = painterResource(id = R.drawable.iconoapp),
            contentDescription = null,
            modifier = Modifier.width(150.dp)
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Text(
                text = "Registrarse", modifier = modifier
                    .background(Color.White)
                    .padding(10.dp)
            )
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.person),
                contentDescription = null,
                modifier = Modifier.size(80.dp)
            )
            Text(text = "Iniciar Sesion",
                modifier = modifier
                    .background(Color.White)
                    .size(55.dp)
                    .clickable { })
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
fun ParteCentral(modifier: Modifier = Modifier) {
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
                Text(
                    text = "Arrendar", modifier = modifier
                        .background(Color.White)
                        .padding(10.dp)

                )

                Text(
                    text = "Publicar", modifier = modifier
                        .background(Color.White)
                        .padding(10.dp)

                )
                
                Image(
                    painter = painterResource(id = R.drawable.home),
                    contentDescription = null,
                    modifier = modifier
                        .width(90.dp)
                        .height(40.dp),

                    )

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