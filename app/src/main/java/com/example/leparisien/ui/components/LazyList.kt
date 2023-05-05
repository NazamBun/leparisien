package com.example.leparisien.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.leparisien.ui.data.TopArticle
import com.example.leparisien.ui.data.all
import com.example.leparisien.ui.data.firstArticle

@Composable
fun LazyList() {
    LazyColumn(modifier = Modifier.padding(top = 8.dp)) {
        items(firstArticle) { firstarticle ->
            //design du premier article avant le lazyColumn
            FeaturedArticleCard(topArticle = firstarticle)
        }
        items(all) { article ->
            ListTile(article = article)
        }
    }
}

@Composable
fun FeaturedArticleCard(topArticle: TopArticle) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(430.dp)
            .padding(
                top = 8.dp,
                start = 16.dp,
                end = 16.dp
            )
    ) {
        Text(
            text = stringResource(id = topArticle.title),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 8.dp
                )
        )
        Image(
            painter = painterResource(id = topArticle.image),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(
                    top = 16.dp,
                )
                .clip(RoundedCornerShape(10.dp)),
            contentScale = ContentScale.Crop

        )

        Text(
            text = stringResource(id = topArticle.description),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            fontSize = 16.sp,
            style = androidx.compose.ui.text.TextStyle(
                fontWeight = FontWeight.Light
            ),
            fontFamily = FontFamily.Serif
        )

    }
}


@Preview(showBackground = true, device = "id:pixel_6_pro", showSystemUi = true)
@Composable
fun LazyArticleListPreview() {
    LazyList()
}