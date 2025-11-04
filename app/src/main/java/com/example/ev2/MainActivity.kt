package com.example.ultrasonicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UltrasonicMockupApp()
        }
    }
}

@Composable
fun UltrasonicMockupApp() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF101010)
        ) {
            MockupScreen()
        }
    }
}

@Composable
fun MockupScreen() {
    var buzzerActivo by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Título
        Text(
            text = "Monitor Ultrasónico",
            color = Color.White,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        //Botón de configuración
        Button(
            onClick = { /* Aquí se podría abrir un menú o pantalla de configuración */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF424242))
        ) {
            Text(text = "Configuración", color = Color.White)
        }

        Spacer(modifier = Modifier.height(24.dp))

        //Distancia medida
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(Color(0xFF1E88E5), shape = MaterialTheme.shapes.medium),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Distancia: 12.4 cm",
                color = Color.White,
                fontSize = 20.sp
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        //LED
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .background(Color.Red, shape = MaterialTheme.shapes.small)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "LED Encendido", color = Color.White)
        }

        Spacer(modifier = Modifier.height(24.dp))

        //Switch del buzzer
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Buzzer:",
                color = Color.White,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.width(8.dp))
            Switch(
                checked = buzzerActivo,
                onCheckedChange = { buzzerActivo = it },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color.Yellow,
                    uncheckedThumbColor = Color.Gray
                )
            )
        }

        Spacer(modifier = Modifier.height(8.dp))
        /*
        //Estado del buzzer
        Text(
            text = if (buzzerActivo) "ACTIVO" else "INACTIVO",
            color = if (buzzerActivo) Color.Yellow else Color.Gray,
            fontWeight = FontWeight.Bold
        )
        */

    }
}
