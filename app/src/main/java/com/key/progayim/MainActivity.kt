package com.key.progayim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recycler = findViewById<RecyclerView>(R.id.recycler)
        val layoutManager = LinearLayoutManager(this)
        val adapter = Adapter {
            Toast.makeText(this, "ITEM - $it", Toast.LENGTH_SHORT).show()
        }

        recycler.layoutManager = layoutManager
        recycler.adapter = adapter
        recycler.addItemDecoration(DividerItemDecoration(this, RecyclerView.VERTICAL))

        val list = mutableListOf<String>()
        for (i in 0..20) {
            list.add("ITEM - $i")
        }
        adapter.setData(list)
    }

}