package com.example.sensorultrasonicomock.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val ColorScheme = lightColorScheme(
    primary = Color(0xFF1976D2),
    secondary = Color(0xFF388E3C),
    background = Color(0xFFF5F5F5)
)

@Composable
fun SensorUltrasonicoMockTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = ColorScheme,
        typography = androidx.compose.material3.Typography(),
        content = content
    )
}
