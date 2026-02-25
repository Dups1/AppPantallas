package com.example.apppantallas

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController


@Composable
fun PantallaC (navController: NavController){
    Button(onClick = { }) {
        Text("Regresar a pantalla A")
        navController.navigate("lista")
    }

}
