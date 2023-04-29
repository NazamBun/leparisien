package com.example.leparisien.ui.componentsimport androidx.annotation.DrawableResimport androidx.compose.foundation.Imageimport androidx.compose.foundation.layout.*import androidx.compose.foundation.shape.RoundedCornerShapeimport androidx.compose.material.Buttonimport androidx.compose.material.ButtonDefaultsimport androidx.compose.material.Textimport androidx.compose.material.TopAppBarimport androidx.compose.runtime.Composableimport androidx.compose.ui.Alignmentimport androidx.compose.ui.Modifierimport androidx.compose.ui.draw.clipimport androidx.compose.ui.graphics.Colorimport androidx.compose.ui.layout.ContentScaleimport androidx.compose.ui.res.painterResourceimport androidx.compose.ui.unit.dp// 3. Création de MyTopAppBar@Composablefun MyTopAppBar(    @DrawableRes image: Int,    onButtonClick: () -> Unit) {    TopAppBar(        backgroundColor = Color.White,        elevation = 4.dp,        content = {            Row(                modifier = Modifier.fillMaxWidth(),                horizontalArrangement = Arrangement.SpaceBetween,                verticalAlignment = Alignment.CenterVertically            ) {                Box(modifier = Modifier.weight(1f))                Image(                    painter = painterResource(id = image),                    contentDescription = "",                    modifier = Modifier                        .weight(1f)                        .then(Modifier.size(30.dp))                )                Box(Modifier.weight(1f)) {                    RoundedButton(                        text = "S'abonner",                        modifier = Modifier.padding(16.dp)                    ) {                                            }                }            }        }    )}