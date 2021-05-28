package com.q.jetpackcompose.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


/**
 * Created by Sarath Kn on 25/05/21.
 */
class MainActivityUI {

    @Composable
    fun MyApp() {
            Surface(color = Color.Yellow) {
                Greeting(name = "Android")
        }
    }

    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!", modifier = Modifier.padding(24.dp))
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        MyApp()
    }

}