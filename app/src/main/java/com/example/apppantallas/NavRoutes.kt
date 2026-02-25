package com.example.apppantallas

    sealed class Screen(val route: String){
        object Lista        : Screen("lista")
        object Detalles     : Screen("detalles/{itemId}")
        object Confirmacion : Screen("confirmacion")
    }

