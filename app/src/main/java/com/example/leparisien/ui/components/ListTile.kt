package com.example.leparisien.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
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
import com.example.leparisien.R
import com.example.leparisien.model.Article

@Composable
fun ListTile(article: Article) {

    val customFont = FontFamily(androidx.compose.ui.text.font.Font(R.font.robotobold))

    Column(modifier = Modifier.fillMaxWidth()) {
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, start = 16.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 8.dp,
                    start = 16.dp,
                    end = 16.dp
                )
            //.weight(1f)

        ) {
            Text(
                text = stringResource(id = article.title),
                modifier = Modifier
                    .padding(end = 16.dp)
                    .weight(1f),

                fontFamily = customFont,
                maxLines = 3,
                softWrap = true,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
            )

            Image(
                painter = painterResource(id = article.image),
                modifier = Modifier
                    .height(80.dp)
                    .width(150.dp)
                    .weight(0.5f)
                    .clip(RoundedCornerShape(10.dp)),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
        }
    }
}


@Composable
fun SimpleList(article: List<Article>) {
    Column {
        for (article in article) {
            ListTile(article = article)
            Divider()
        }
    }
}

@Preview(showBackground = true, device = "id:pixel_6_pro", showSystemUi = true)
@Composable
fun ListTileColumnPreview() {
    val article =
        Article(title = R.string.mavachou, image = R.drawable.mavachou)

    MaterialTheme {
        ListTile(
            article = article,
        )
    }
}

