package com.example.budgettracker

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.budgettracker.databinding.ActivityIncomeDataBinding


class Incomedata : AppCompatActivity() {
    lateinit var database: Database

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityIncomeDataBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.amount

        binding.incress.setOnClickListener {

   binding
        }









        binding.mince.setOnClickListener {


        }

    }
}










