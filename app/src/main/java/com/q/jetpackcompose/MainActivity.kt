package com.q.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.q.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                ClickableButton()
            }
        }
    }
}

@Composable
fun ClickableButton() {
    var clikedTimes = remember { mutableStateOf(0) }
    Button(onClick = {
        clikedTimes.value++
    },  modifier = Modifier.fillMaxWidth()
        .padding(16.dp)
        .padding(16.dp)) {
        Text(text = "Clicked me ${clikedTimes.value} times")

    }
}


