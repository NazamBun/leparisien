package com.example.leparisien.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.leparisien.ui.data.all

@Composable
fun LazyList() {
    LazyColumn {
        items(all) { article ->
            ListTile(article = article)
        }
    }
}

@Preview(showBackground = true, device = "id:pixel_6_pro", showSystemUi = true)
@Composable
fun LazyArticleListPreview() {
    LazyList()
}