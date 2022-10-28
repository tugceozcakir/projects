package com.anilcaliskan.basicandroidcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anilcaliskan.basicandroidcompose.ui.theme.BasicAndroidComposeTheme

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicAndroidComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier=Modifier.fillMaxSize(),color=MaterialTheme.colors.background) {
                    MainScreen()
                }
            }
        }
    }
}
@Composable
fun MainScreen () {
    Surface(color = Color.LightGray) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            var myString = remember { mutableStateOf("Android Compose Test") }

            TextField(value = (myString.value), onValueChange = {
                myString.value = it
                println(myString.value)

            })

            Spacer(modifier = Modifier.padding(8.dp))

            var textString = remember { mutableStateOf("Hello") }

            Text(text= textString.value, fontSize = 26.sp)

            Spacer(modifier = Modifier.padding(8.dp))

            Button(onClick={
                textString.value = "Android"
                //println("clicked")
            }) {
                Text(text= "Test ")
                Text(text= "Button")
            }
            Spacer(modifier = Modifier.padding(8.dp))

            Image(bitmap= ImageBitmap.imageResource(id = ),contentDescription = "flower")

            Spacer(modifier = Modifier.padding(8.dp))

            Image(imageVector= ImageVector.vectorResource(id=R.drawable.ic_launcher_foreground),
                contentDescription=null)

        }
    }
}




@Preview(showBackground=true)
@Composable
fun DefaultPreview() {
    MainScreen()
}