package com.example.myfirstapplication

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstapplication.ui.theme.MyFirstApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize().clickable { true },
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage("ไออ้วนไอสัส", "อ้วนตะวัน")
//                    GreetingText("Happy Birthday Tawan",
//                        "Del",
//                        modifier = Modifier.padding(1.dp)
//                    )
                }

            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String,  modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    )
         {
        Text(
            text = message,
            fontSize = 80.sp,
            lineHeight = 106.sp,
            textAlign = TextAlign.Center

        )
        Text(
            text = "From $from ",
            fontSize = 36.sp,
            modifier = Modifier.padding(24.dp)
        )

    }
}
@Composable
fun GreetingImage(message: String, from: String,  modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5f
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier.fillMaxSize().padding(8.dp)
        )
    }

}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun BirthdayCardPreview() {
    MyFirstApplicationTheme {
//        GreetingText("Happy Birthday Del!", "Tawan")
        GreetingImage("ไออ้วนไอสัส", "อ้วนตะวัน")
    }
}