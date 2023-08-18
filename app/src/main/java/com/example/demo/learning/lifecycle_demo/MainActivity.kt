package com.example.demo.learning.lifecycle_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var StartSecondActivity: Button

    companion object {
        const val Tag = "ActivityLifecycle"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StartSecondActivity = findViewById(R.id.StartSecondActivity)
        Log.d(Tag, "MainActivity - oncreate")

        StartSecondActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(Tag, "MainActivity - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Tag, "MainActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(Tag, "MainActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Tag, "MainActivity - onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Tag, "MainActivity - onDestory")
    }
}
