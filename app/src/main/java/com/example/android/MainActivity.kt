package com.example.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.android.ui.theme.AndroidTheme
import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Build
import android.view.View

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val glassView = findViewById<View>(R.id.glass)
            glassView.setRenderEffect(
                RenderEffect.createBlurEffect(25f, 25f, Shader.TileMode.CLAMP)
            )
        }

    }
}