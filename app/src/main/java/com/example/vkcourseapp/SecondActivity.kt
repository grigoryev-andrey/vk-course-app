package com.example.vkcourseapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.vkcourseapp.ui.theme.VKCourseAppTheme

class SecondActivity : ComponentActivity() {
    companion object {
        const val EXTRA_TEXT = "extra_text"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val receivedText = intent.getStringExtra(EXTRA_TEXT)
            ?.takeIf { it.isNotBlank() }
            ?: "Текст не передан"

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Вторая Activity",
                            style = MaterialTheme.typography.headlineMedium
                        )

                        Text(
                            text = "Полученный текст:",
                            modifier = Modifier.padding(top = 20.dp),
                            style = MaterialTheme.typography.titleMedium
                        )

                        Text(
                            text = receivedText,
                            modifier = Modifier.padding(top = 12.dp),
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                }
            }
        }
    }
}