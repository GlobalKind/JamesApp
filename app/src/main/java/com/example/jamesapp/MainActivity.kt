package com.example.jamesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jamesapp.ui.theme.JamesAppTheme
import androidx.compose.foundation.layout.Column as Column

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scrollState = rememberScrollState()
            Greeting(name = "James")
            Column(
                modifier = Modifier.verticalScroll(scrollState)

            ){
                for(i in 1..10) {
                    Text(

                        text = "Item$i"
                        //fontSize = 24.sp,
                      //  fontWeight = FontWeight.Bold,
                      //  textAliign = TextAlign.Center,
                       // modifier = Modifier
                         //   .fillMaxWidth()
                       //     .padding(vertical = 24.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "A program by $name!")

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JamesAppTheme {
        Greeting("Android")
    }
}