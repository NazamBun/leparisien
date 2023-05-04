package com.example.leparisien.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.leparisien.R
import com.example.leparisien.ui.components.BottomNavBar
import com.example.leparisien.ui.components.MyTopAppBar
import com.example.leparisien.ui.screens.NavGraph

//test commit
@Composable
fun MyApp() {
    // 2. Scaffold pour y mettre MyTopAppBar et BottomMenu
    val navController = rememberNavController()
    Scaffold(
        topBar = {
            MyTopAppBar(
                image = R.drawable.leparisien,
                onButtonClick = {}
            )
        },
        bottomBar = { BottomNavBar(navController)}
        ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            NavGraph(navController = navController)


        }
    }
}

@Preview(showBackground = true, device = "id:pixel_6_pro", showSystemUi = true)
@Composable
fun DefaultPreview() {
    MyApp()
}

