package com.example.budgettracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.budgettracker.Adepetr.BudgetAdepter
import com.example.budgettracker.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var database: Database = Database(applicationContext)
        binding.down.setOnClickListener {
            var intent = Intent(this, Incomedata::class.java).apply {
            }
            startActivity(intent)
        }
        binding.up.setOnClickListener {
            var intent = Intent(this, Incomedata::class.java).apply {
            }
            startActivity(intent)
        }
        var ff = binding.txtincome
        var myArray = intent.getIntArrayExtra("myArray")
        var total = myArray?.sum()
        var dd = binding.txtexpene
        val myArray1 = intent.getIntArrayExtra("myArray")
        val min = myArray?.min()
        binding.tranceShow.setOnClickListener {
            database.adddata(
                binding.edtName.text.toString(),
                binding.edtexpense.text.toString().toInt(),
                binding.edtincome.text.toString().toInt()
            )
        }
        binding.viewall.setOnClickListener {
            var list = database.showdata(ArrayList<Budgetmodel>())
            binding.trancetion.layoutManager = LinearLayoutManager(applicationContext)
            binding.trancetion.adapter = BudgetAdepter(list)
        }
    }
}




