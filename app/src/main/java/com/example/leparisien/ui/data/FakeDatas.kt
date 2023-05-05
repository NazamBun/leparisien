package com.example.leparisien.ui.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.leparisien.R
import com.example.leparisien.model.Article

val all: List<Article> = mutableListOf(
    Article(title = R.string.mavachou, image = R.drawable.mavachou),
    Article(title = R.string.darmanin, image = R.drawable.gendarme),
    Article(title = R.string.assault, image = R.drawable.capitole),
    Article(title = R.string.grigny, image = R.drawable.ascenseur),
    Article(title = R.string.leslie, image = R.drawable.guy),
    Article(title = R.string.londre, image = R.drawable.london),
    Article(title = R.string.psg, image = R.drawable.psg),
    Article(title = R.string.jordan, image = R.drawable.jordan),
    Article(title = R.string.puteaux, image = R.drawable.gendarme),
    Article(title = R.string.epicerie, image = R.drawable.keethan),
    Article(title = R.string.macron, image = R.drawable.macron),
    Article(title = R.string.stains, image = R.drawable.police),
    Article(title = R.string.violence, image = R.drawable._fngq7kcijdf5d6jaiggeb4sae),
    Article(title = R.string.tony, image = R.drawable.vairelles),
    Article(title = R.string.tony, image = R.drawable.vairelles),
    Article(title = R.string.tony, image = R.drawable.vairelles),
    Article(title = R.string.tony, image = R.drawable.vairelles),
    Article(title = R.string.tony, image = R.drawable.vairelles),
)

data class TopArticle(
    @StringRes val title: Int,
    @DrawableRes val image: Int,
    @StringRes val description: Int
)

val firstArticle: List<TopArticle> = mutableListOf(
    TopArticle(title = R.string.velo, image = R.drawable.velo, description = R.string.veloarticle),
)