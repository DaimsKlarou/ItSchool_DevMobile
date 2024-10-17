package com.example.itschool

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DiscussionScreen() {
    val groups = listOf("Groupe CSS", "Apprendre Java", "Apprendre Kotlin", "Machine Learning", "Deep Learning Group", "Apprendre l'anglais", "Angular et ses bases", "Gestion de projet")

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("DISCUSSION", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(groups) { group ->
                ListItem(
                    headlineContent = { Text(group) },
                    leadingContent = { Icon(Icons.Filled.Person, contentDescription = null) }
                )
                Divider()
            }
        }
    }
}
