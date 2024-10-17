package com.example.itschool

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment


data class Assignment(val title: String, val date: String, val description: String)

@Composable
fun EvaluationScreen() {
    val assignments = listOf(
        Assignment("Devoirs 1: Application mobile", "Du 10 Octobre au 20 Octobre 2024", "Développer entièrement le front"),
        Assignment("Devoirs 2: Application web", "Du 10 Novembre au 20 Novembre 2024", "Développer entièrement le front"),
        Assignment("Devoirs 3: Application web", "Du 10 Novembre au 23 Novembre 2024", "Développer entièrement le front")
    )

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("EVALUATION", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(assignments) { assignment ->
                Card(modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(assignment.title, style = MaterialTheme.typography.bodyMedium)
                        Text(assignment.date, style = MaterialTheme.typography.bodyLarge)
                        Text(assignment.description, style = MaterialTheme.typography.bodyLarge)

                    }
                }
            }
        }
    }
}