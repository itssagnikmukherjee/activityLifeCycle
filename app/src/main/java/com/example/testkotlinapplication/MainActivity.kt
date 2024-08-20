package com.example.testkotlinapplication

import android.annotation.SuppressLint
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.testkotlinapplication.ui.theme.TestKotlinApplicationTheme
import kotlin.math.log

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Lifecycle","onCreate")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestKotlinApplicationTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){

                    Text(text = "Activity LifeCycle", fontSize = 24.sp)
                        Text(text = "Simplified", fontSize = 24.sp)
                    }
                }
            }
        }
    }
    override fun onResume() {
        super.onResume()
        Log.d("lifecycle","onResume")
    }
    override fun onStart() {
        super.onStart()
        Log.d("lifecycle","onStart")
    }
    override fun onPause() {
        super.onPause()
        Log.d("lifecycle","onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d("lifecycle","onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle","onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle","onRestart")
    }
}
