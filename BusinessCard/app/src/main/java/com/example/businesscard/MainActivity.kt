package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyBusinessaCard()
                }
            }
        }
    }
}

@Composable
fun MyBusinessaCard(modifier: Modifier =Modifier) {
    val myimage = painterResource(id = R.drawable.pngegg)
    Image(
        painter = myimage, contentDescription = null,modifier.fillMaxSize(), contentScale = ContentScale.Crop
    )
    Column(
        modifier
            .fillMaxSize()
            .padding(16.dp)) {

        Row(modifier =modifier.weight(2f), verticalAlignment = Alignment.CenterVertically) {
            TitleOfTheCard(imaogepainter = painterResource(id = R.drawable.businesscard), name = "Siddharth H", title = "SMEAR",modifier =modifier )
        }
        Row( verticalAlignment = Alignment.Bottom) {
            ContactInFomation(phoneno = "+9110885944844", instahandle = "@siddharthiremath", mail = "shidramah6@gmail.com",modifier =modifier)
        }
    }
}

@Composable
fun TitleOfTheCard(imaogepainter : Painter,name : String, title : String,modifier :Modifier){

    Column(
        Modifier
            .fillMaxWidth()
            .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = imaogepainter,
            contentDescription = null
        )
        Text(
            text = name,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            fontSize = 24.sp
        )
        Text(
            text = title,
            fontSize = 16.sp
        )
    }

}

@Composable
fun ContactInFomation(phoneno : String, instahandle : String, mail : String,modifier :Modifier){
    Column(
        Modifier
            .fillMaxWidth()
            .padding(16.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Row {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                Modifier.padding(4.dp)
            )
            Text(
                text = phoneno,
                Modifier.padding(4.dp)
            )
        }
        Row {
            Icon(
                Icons.Rounded.AccountBox,
                contentDescription = null,
                Modifier.padding(4.dp))
            Text(
                text = instahandle,
                Modifier.padding(4.dp)
            )
        }
        Row {
            Icon(Icons.Rounded.Email , contentDescription = null, Modifier.padding(4.dp))
            Text(
                text = mail,
                Modifier.padding(4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        MyBusinessaCard()
    }
}