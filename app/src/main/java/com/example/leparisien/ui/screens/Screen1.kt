package com.example.leparisien.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.leparisien.ui.components.LazyList


@Composable
fun Screen1() {
    LazyList()
}

@Preview(showBackground = true, device = "id:pixel_6_pro", showSystemUi = true)
@Composable
fun Screen1Preview() {
    Screen1()
}