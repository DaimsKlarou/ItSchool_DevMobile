package com.example.itschool

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun EducationApp() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    icon = { Icon(imageVector = Icons.Filled.MailOutline, contentDescription = "Discussion") },
                    label = { Text("Discussion") },
                    selected = navController.currentDestination?.route == "discussion",
                    onClick = { navController.navigate("discussion") }
                )
                NavigationBarItem(
                    icon = { Icon(imageVector = Icons.Filled.Info, contentDescription = "Evaluation") },
                    label = { Text("Evaluation") },
                    selected = navController.currentDestination?.route == "evaluation",
                    onClick = { navController.navigate("evaluation") }
                )
                NavigationBarItem(
                    icon = { Icon(imageVector = Icons.Filled.Face, contentDescription = "Documents") },
                    label = { Text("Documents") },
                    selected = false,
                    onClick = { /* TODO */ }
                )
                NavigationBarItem(
                    icon = { Icon(imageVector = Icons.Filled.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = false,
                    onClick = { /* TODO */ }
                )
            }
        }
    ) { innerPadding ->
        NavHost(navController, startDestination = "login", modifier = Modifier.padding(innerPadding)) {
            composable("login") { LoginScreen(navController) }
            composable("studentRegister") { StudentRegisterScreen(navController) }
            composable("teacherRegister") { TeacherRegisterScreen(navController) }
            composable("discussion") { DiscussionScreen() }
            composable("evaluation") { EvaluationScreen() }
        }
    }
}
