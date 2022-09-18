package com.sushant.learningcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sushant.learningcompose.ui.theme.LearningComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningComposeTheme {
                Home()
            }
        }
    }
}

@Composable
fun Home(){
  val backgroundImage = painterResource(R.drawable.androidparty)
    Box() {
        Image(painter = backgroundImage, contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.Crop)
        TextCompose(name = "Happy Birthday Sam!", from = "~ from Sushant")
    }
}


@Composable
fun TextCompose(name: String, from: String){
    Column() {
        Text(text = "Happy Birthday Sam!", fontWeight = FontWeight.Bold, fontSize = 36.sp, modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(
                Alignment.CenterHorizontally
            )
            .padding(top = 40.dp))
        Text(text = from, modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .padding(top = 10.dp))
    }
}
