
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.anilcaliskan.animationcodelab.ui.theme.AnimationCodelabTheme

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimationCodelabTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier=Modifier.fillMaxSize(),color=MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text="Hello $name!")
}

@Preview(showBackground=true)
@Composable
fun DefaultPreview() {
    AnimationCodelabTheme {
        Greeting("Android")
    }
}