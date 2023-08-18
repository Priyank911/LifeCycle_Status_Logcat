package com.example.demo.learning.lifecycle_demo

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {

    companion object {
        const val Tag = "ActivityLifecycle"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(Tag, "SecondActivity - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(Tag, "SecondActivity - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Tag, "SecondActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(Tag, "SecondActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Tag, "SecondActivity - onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Tag, "SecondActivity - onDestroy")
    }
}



