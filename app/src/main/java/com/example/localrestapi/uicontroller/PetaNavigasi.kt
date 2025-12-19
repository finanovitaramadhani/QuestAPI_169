package com.example.localrestapi.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.localrestapi.uicontroller.route.DestinasiEntry
import com.example.localrestapi.uicontroller.route.DestinasiHome
import com.example.localrestapi.view.EntrySiswaScreen
import com.example.localrestapi.view.HomeScreen

@Composable
fun DataSiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    HostNavigasi(navController = navController)
}
