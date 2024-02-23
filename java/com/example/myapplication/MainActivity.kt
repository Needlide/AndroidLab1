package com.example.myapplication

import android.graphics.ColorSpace
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.ColorSpaces
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Settings()
                }
            }
        }
    }
}

@Composable
fun Settings(modifier: Modifier = Modifier) {
    Column (modifier = Modifier.padding(16.dp)) {
        Row (modifier = Modifier
            .align(alignment = Alignment.End)
            .padding(
                top = 32.dp
            )) {
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )
        }
        Row (modifier = Modifier.padding(32.dp)) {
            Text(
                fontSize = 32.sp,
                text = "Settings"
            )
        }
        Row (modifier = Modifier.clip(RoundedCornerShape(16.dp))
            .background(color = Color(219, 234, 141))) {
            Column (modifier = Modifier.padding(16.dp)) {
                Image (painter = painterResource(id = R.drawable.phonelink_setup),
                    contentDescription = "")
            }
            Column (modifier = Modifier.alpha(0.6f).padding(16.dp)) {
                Row {
                    Text(text = "Get to know your Pixel",
                        fontSize = 21.sp,
                        color = Color(0, 0, 0)
                    )
                }
                Row {
                    Text(text = "Explore what you can do with your phone",
                        fontSize = 14.sp,
                        color = Color(0,0,0))
                }
            }
        }
    }
}
