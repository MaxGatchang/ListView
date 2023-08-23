package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruitslist = ArrayList<String>()
        fruitslist.add("Apples")
        fruitslist.add("Apricots")
        fruitslist.add("Bananas")
        fruitslist.add("Blackberry")
        fruitslist.add("Cherries")
        fruitslist.add("Cranberry")
        fruitslist.add("Sugar-apple")
        fruitslist.add("Pitaya")
        fruitslist.add("Common fig")
        fruitslist.add("Cranberry")
        fruitslist.add("Jackfruit")
        fruitslist.add("Mangos")
        fruitslist.add("Papayas")
        fruitslist.add("Guava")
        fruitslist.add("Jackfruit")
        fruitslist.add("Orange")
        fruitslist.add("Papayas")
        fruitslist.add("Pear")
        fruitslist.add("Pineapple")

        val list_view = findViewById<ListView>(R.id.list_view)
        list_view.adapter = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, fruitslist)

        list_view.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "You selected ${fruitslist[i]}", Toast.LENGTH_SHORT).show()
        }
    }
}
