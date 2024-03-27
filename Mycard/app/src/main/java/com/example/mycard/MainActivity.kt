package com.example.mycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycard.ui.theme.MycardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MycardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage()
                }
            }
        }
    }
}

@Composable
fun Happyfunction(reason: String,from:String,modifier: Modifier =Modifier){

    Column(verticalArrangement = Arrangement.Center, modifier=modifier.padding(8.dp)) {
        Text(
            text = reason,
            color = Color.Magenta,
            fontSize = 90.sp,
            lineHeight = 100.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            color = Color.Magenta,
            fontSize = 40.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally
                )
        )
    }
}

@Composable
fun GreetingImage(message:String= stringResource(id = R.string.happy_birthday_kevin),from:String=stringResource(R.string.from_sid),modifier: Modifier =Modifier){
    val image = painterResource(id = R.drawable.androidparty)
    Box(modifier) {
        Image(
            painter =image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
    }
    Happyfunction(message,from,modifier= Modifier
        .fillMaxSize()
        .padding(8.dp))
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MycardTheme {
        GreetingImage()
    }
}