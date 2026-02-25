package com.example.apppantallas

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController




val nombres = listOf("David","Orange","Alex","Josue","Rivaldo","Eduardo","Pedro","Jonathan")
@Composable
   fun PantallaA(navController: NavController){
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(nombres){
            nombre ->
            Text(
                text = nombre,
                fontSize = 20.sp,
                modifier = Modifier.fillMaxWidth().clickable{
                    navController.navigate("detalles/$nombre")
                }.padding(16.dp)
            )
            HorizontalDivider()
        }
    }
   }
