package com.example.vkcourseapp

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.vkcourseapp.ui.theme.VKCourseAppTheme
import kotlin.jvm.java

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                MainScreen(
                    onOpenSecond = { text ->
                        val intent = Intent(
                            this,
                            SecondActivity::class.java
                        ).apply {
                            putExtra(SecondActivity.EXTRA_TEXT, text)
                        }
                        startActivity(intent)
                    },
                    onDial = { phone ->
                        val intent = Intent(
                            Intent.ACTION_DIAL,
                            Uri.fromParts("tel", phone, null)
                        )
                        try {
                            startActivity(intent)
                        } catch (e: ActivityNotFoundException) {
                            Toast.makeText(
                                this,
                                "Не найдено приложение для звонков",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    },
                    onShare = { text ->
                        val intent = Intent(Intent.ACTION_SEND).apply {
                            type = "text/plain"
                            putExtra(Intent.EXTRA_TEXT, text)
                        }

                        try {
                            startActivity(
                                Intent.createChooser(
                                    intent,
                                    "Поделиться через…"
                                )
                            )
                        } catch (e: ActivityNotFoundException) {
                            Toast.makeText(
                                this,
                                "Нет приложений для отправки текста",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                )
            }
        }
    }
}

@Composable
private fun MainScreen(
    onOpenSecond: (String) -> Unit,
    onDial: (String) -> Unit,
    onShare: (String) -> Unit
) {
    var input by remember { mutableStateOf("") }
    var error by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Основы и структура Android-приложения",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = input,
            onValueChange = {
                input = it
                error = null
            },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Текст или номер телефона") },
            placeholder = { Text("Введите текст или номер") },
            isError = error != null,
            supportingText = {
                error?.let { Text(it) }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            ),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                val text = input.trim()
                if (text.isBlank()) {
                    error = "Введите текст перед переходом"
                } else {
                    onOpenSecond(text)
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Открыть вторую Activity")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {
                val phone = input.trim()
                val normalized = phone.replace(
                    Regex("[\\s()-]"), ""
                )

                if (!Regex("^\\+?[0-9]{5,15}$").matches(normalized)) {
                    error = "Введите корректный номер телефона"
                } else {
                    onDial(normalized)
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Позвонить другу")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {
                val text = input.trim()
                if (text.isBlank()) {
                    error = "Введите текст для отправки"
                } else {
                    onShare(text)
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Поделиться текстом")
        }
    }
}