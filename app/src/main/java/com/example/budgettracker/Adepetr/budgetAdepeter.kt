package com.example.budgettracker.Adepetr

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.budgettracker.Budgetmodel
import com.example.budgettracker.Database
import com.example.budgettracker.R


class BudgetAdepter(list: ArrayList<Budgetmodel>) : Adapter<BudgetAdepter.budgetholder>() {
    var list = list
    lateinit var context: Context
    class budgetholder(itemView: View) : ViewHolder(itemView) {
        var txtid = itemView.findViewById<TextView>(R.id.txtId)
        var txtname = itemView.findViewById<TextView>(R.id.txtName)
        var txincome = itemView.findViewById<TextView>(R.id.txincome)
        var txtexpense = itemView.findViewById<TextView>(R.id.txexpense)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): budgetholder {
        context=parent.context
        return budgetholder(
            LayoutInflater.from(parent.context).inflate(R.layout.wallet_data, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: budgetholder, position: Int) {
        holder.txtid.text = list.get(position).id.toString()
        holder.txtname.text= list.get(position).name
        holder.txincome.text=list.get(position).income.toInt().toString()
        holder.txtexpense.text=list.get(position).expense.toInt().toString()

    }
}