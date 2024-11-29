package com.example.androiddemo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddemo.ui.theme.AndroidDemoTheme
import org.example.ModuleAHelper
import org.example.ModuleBHelper

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        var moduleAHelper = ModuleAHelper()
        var moduleBHelper = ModuleBHelper()
        Log.d("song_test", "moduleAHelper: $moduleAHelper, moduleBHelper: $moduleBHelper")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidDemoTheme {
        Greeting("Android")
    }
}