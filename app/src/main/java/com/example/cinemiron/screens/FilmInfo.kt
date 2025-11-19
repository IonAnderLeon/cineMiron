package com.example.cinemiron.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinemiron.R

@Composable
fun FilmInfoScreen(){
    Scaffold() { innerPadding ->
        Column(Modifier
            .fillMaxSize()
            .padding(innerPadding)
        ) {
            TopFilmColumn()
        }
    }
}

@Composable
fun TopFilmColumn(){
    LazyColumn(Modifier.fillMaxWidth()) {
        item{
            TopFilmInfo()
        }
    }
}

@Composable
fun TopFilmInfo(){
    Row(Modifier
        .fillMaxWidth()
        .height(350.dp)
        .padding(30.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            Modifier.weight(1f)
        ) {
            Text(
                text = "Titulo",
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                text = "2000 · DIRECTED BY",
            )
            Text("Director Generico")
        }
        Image(
            painter = painterResource(R.drawable.waroftheworlds_poster),
            contentDescription = null,
            modifier = Modifier
                .width(120.dp)
                .height(180.dp)
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop
        )
    }
}