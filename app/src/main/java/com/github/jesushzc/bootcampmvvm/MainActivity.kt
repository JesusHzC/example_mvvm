package com.github.jesushzc.bootcampmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.github.jesushzc.bootcampmvvm.ui.basic.BasicView
import com.github.jesushzc.bootcampmvvm.ui.events.EventView
import com.github.jesushzc.bootcampmvvm.ui.lifecycle.LifecycleView
import com.github.jesushzc.bootcampmvvm.ui.theme.BootcampMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BootcampMVVMTheme {
                //BasicView()
                //LifecycleView()
                EventView()
            }
        }
    }
}