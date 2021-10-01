package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import com.example.myapplication.databinding.ActivityExperimentsBinding
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class Experiments : AppCompatActivity() {
    private lateinit  var binding:ActivityExperimentsBinding
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExperimentsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonSecond.setOnClickListener(){
            Snackbar.make(binding.root,"this is a test",Toast.LENGTH_LONG).show()
        }
        binding.buttonSecond.setOnClickListener {

        }


    }
}