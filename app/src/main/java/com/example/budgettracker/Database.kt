package com.example.budgettracker

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Database(context: Context?,) : SQLiteOpenHelper(context, "wallet.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        var sql =
            "CREATE TABLE BUDGET(id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,income INTEGER,expense INTEGER)"
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    fun adddata(name: String, income: Int, expene: Int) {
        var db = writableDatabase
        var value = ContentValues()
        value.put("name", name)
        value.put("income", income)
     value.put("expense", expene)
        db.insert("BUDGET", null, value)

    }

    fun showdata(param: Any?): ArrayList<Budgetmodel> {
        var budlist = ArrayList<Budgetmodel>()
        var db = readableDatabase
        var sq = "SELECT * FROM BUDGET"
        var cursor: Cursor = db.rawQuery(sq, null)
        cursor.moveToFirst()

        for (i in 0..cursor.count - 1) {
            var id = cursor.getInt(0)
            var name = cursor.getString(1)
            var income = cursor.getInt(2)
            var expense = cursor.getInt(3)

            var bud = Budgetmodel(id, name, income, expense)
            budlist.add(bud)
            cursor.moveToNext()
        }
        return budlist
    }




}




