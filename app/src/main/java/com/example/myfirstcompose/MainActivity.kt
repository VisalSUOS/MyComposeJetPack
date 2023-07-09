package com.example.myfirstcompose

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            MessageCard("SmartDevXOp")
        }
    }

    @Preview
    @Composable
    fun PreviewMessageCard(){
        MessageCard("SmartDevXOp")
    }

    @Composable
    fun MessageCard(name: String){
        Column {
            Text(text = "Hello $name", style = TextStyle(
                textAlign = TextAlign.Center,
                color = Color.Black
            ))
            Text("Second Text dummy one")
        }
    }
}