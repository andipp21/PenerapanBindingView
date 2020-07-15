package com.andi.penerapanbindingview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.andi.penerapanbindingview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Kotlin Synthetic
        btnKotlinSynthetic.setOnClickListener {
            Log.d("Kotlin Synthetic","Tombol Kotlin Synthetic di click")
        }

        //Find View By Id
        val button: Button = findViewById(R.id.btnFindById)
        button.setOnClickListener {
            Log.d("Find View By Id","Tombol Find View By Id di click")
        }

        //Data Binding
//        var bind = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        bind.welcomeText = "Selamat Datang"

        //Data dan View Binding
        val binding = ActivityMainBinding.inflate(layoutInflater)

        binding.welcomeText.text = "Selamat Datanag"

        binding.btnViewBind.setOnClickListener {
            Log.d("View Binding","Tombol View Binding di click")
        }

        setContentView(binding.root)
    }
}

//data class Welcome(val welcomeText : String)