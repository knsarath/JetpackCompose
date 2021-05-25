package com.q.jetpackcompose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.q.jetpackcompose.R


/**
 * Created by Sarath Kn on 25/05/21.
 */
object MainActivityUI {
    @Composable
    fun NewsStory() {
        MaterialTheme {
            val typography = MaterialTheme.typography
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.header),
                    contentDescription = null,
                    modifier = Modifier
                        .height(180.dp)
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(4.dp)),
                    contentScale = ContentScale.Crop
                )
                Spacer(Modifier.height(16.dp))

                Text("A day in Shark Fin Cove",
                    style = typography.h6)
                Text("Davenport, California",
                    style = typography.body2)
                Text("December 2018",
                    style = typography.body2)
            }
        }
    }
}