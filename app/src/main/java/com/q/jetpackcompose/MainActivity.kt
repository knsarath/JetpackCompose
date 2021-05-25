package com.q.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.q.jetpackcompose.ui.MainActivityUI
import com.q.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                MainActivityUI.NewsStory()
            }
        }
    }
}



@Preview
@Composable
fun DefaultPreview() {
    MainActivityUI.NewsStory()
}