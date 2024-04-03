package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ShowQuandrant()
                }
            }
        }
    }
}

@Composable
fun ShowQuandrant() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)){
            Composecard(heading = stringResource(R.string.text_composable),
                descriptiom = stringResource(R.string.descrption),
                modifier=Modifier.weight(1f),
                backgroundColor = Color(0xFFEADDFF)
            )
            Composecard(heading = stringResource(R.string.image_composable),
                descriptiom = stringResource(R.string.image_descrption),
                modifier=Modifier.weight(1f),
                backgroundColor = Color(0xFFD0BCFF)
            )
        }

        Row(Modifier.weight(1f)){
            Composecard(heading = stringResource(R.string.row_composable),
                descriptiom = stringResource(R.string.row_descrption),
                modifier=Modifier.weight(1f),
                backgroundColor = Color(0xFFB69DF8)
            )
            Composecard(heading = stringResource(R.string.layout_composable),
                descriptiom = stringResource(R.string.layout_descrption),
                modifier=Modifier.weight(1f),
                backgroundColor = Color(0xFFF6EDFF)
            )
        }
    }
}

@Composable
fun Composecard(heading:String,descriptiom: String, modifier: Modifier=Modifier,backgroundColor:Color){
    Column(modifier.fillMaxSize().background(backgroundColor).padding(16.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = heading,
            fontWeight = FontWeight.Bold,
            modifier =Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = descriptiom,
            textAlign = TextAlign.Center
        )
    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantTheme {
        ShowQuandrant()
    }
}