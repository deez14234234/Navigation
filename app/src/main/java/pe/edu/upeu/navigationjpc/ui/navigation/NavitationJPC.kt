package pe.edu.upeu.navigationjpc.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigationjpc.ui.presentation.screens.SettingsScreen
import pe.edu.upeu.navigationjpc.ui.presentation.screens.HomeScreen
import pe.edu.upeu.navigationjpc.ui.presentation.screens.ProfileScreen

@Composable
fun NavigationHost(navController: NavHostController) {
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen() }
        composable("profile") { ProfileScreen() }
        composable("settings") { SettingsScreen() }
    }
}