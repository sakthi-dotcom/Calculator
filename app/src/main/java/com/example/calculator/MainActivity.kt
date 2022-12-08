package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onEqualCLick(view: View) {}
    fun onAllClearClick(view: View) {}
    fun onDigitClick(view: View) {}
    fun onSubClick(view: View) {}
    fun onAddClick(view: View) {}
    fun onProdClick(view: View) {}
    fun onDivClick(view: View) {}
    fun onModuloClick(view: View) {}
    fun onBackClick(view: View) {}
    fun onClearClick(view: View) {}
}