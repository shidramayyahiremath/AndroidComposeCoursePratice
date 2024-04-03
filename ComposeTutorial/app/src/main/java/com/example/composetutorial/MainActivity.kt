package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticleApp()
                }
            }
        }
    }
}

@Composable
fun ComposeArticleApp() {
    TutorialInfo(
        title = stringResource(R.string.jetpack_compose_tutorial),
        shortDescription = stringResource(R.string.jetpack_compose_tutorial_info),
        longDescription = stringResource(R.string.jetpack_compose_tutorial_info1),
        imagePainter = painterResource(R.drawable.bg_compose_background)
    )
}


@Composable
fun TutorialInfo(title: String,shortDescription :String, longDescription :String,imagePainter:Painter, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center,modifier=modifier) {
        Image(
            painter = imagePainter,
            contentDescription = null,
            modifier.padding(bottom = 8.dp)
            )
        Text(
            text = title,
            fontSize = 20.sp,
            lineHeight = 30.sp,
            modifier = modifier.padding(start= 8.dp,end = 8.dp, bottom = 8.dp)
        )
        Text(
            text =shortDescription,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(start= 8.dp,end = 8.dp, bottom = 8.dp)
        )
        Text(
            text = longDescription,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(start= 8.dp,end = 8.dp)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTutorialTheme {
        ComposeArticleApp()
    }
}