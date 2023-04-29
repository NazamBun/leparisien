package com.example.leparisien.ui.componentsimport androidx.compose.foundation.layout.heightimport androidx.compose.foundation.layout.sizeimport androidx.compose.material.*import androidx.compose.runtime.Composableimport androidx.compose.runtime.getValueimport androidx.compose.ui.Modifierimport androidx.compose.ui.res.painterResourceimport androidx.compose.ui.text.capitalizeimport androidx.compose.ui.unit.dpimport androidx.navigation.NavControllerimport androidx.navigation.compose.currentBackStackEntryAsStateimport com.example.leparisien.ui.navigation.BottomNavItemimport com.example.leparisien.ui.navigation.Screen// 6. Ce composant affichera les éléments de la barre de navigation// et permettra de changer l'écran en fonction de l'élément sélectionné.@Composablefun BottomNavBar(navController: NavController) {    val items = listOf(        BottomNavItem.Screen1,        BottomNavItem.Screen2,        BottomNavItem.Screen3,        BottomNavItem.Screen4,        BottomNavItem.Screen5    )    val bottomNavigationColor = MaterialTheme.colors.surface    BottomNavigation(        backgroundColor = bottomNavigationColor,        elevation = 1.dp,        modifier = Modifier.height(68.dp)    ) {        val navBackStackEntry by navController.currentBackStackEntryAsState()        val currentRoute = navBackStackEntry?.destination?.route        items.forEach { item ->            BottomNavigationItem(                icon = {                    Icon(                        painterResource(item.icon),                        contentDescription = item.title,                        modifier = Modifier.size(28.dp)                    )                },                label = { Text(item.title) },                selected = currentRoute == item.route,                onClick = {                    navController.navigate(item.route) {                        popUpTo(navController.graph.startDestinationId)                        launchSingleTop = true                    }                },                alwaysShowLabel = true            )        }    }}