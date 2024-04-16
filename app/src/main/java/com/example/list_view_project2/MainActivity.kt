package com.example.list_view_project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var arrayList: ArrayList<user>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val name = arrayOf("Abubakar", "Saad", "Raheel", "Farhan")
        val lastMes = arrayOf("How are you", "Fine", "How much?", "Done")
        val lastTime = arrayOf("4:00 AM", "1:00 AM", "3:00 AM", "6:00 AM")
        val phone = arrayOf("037732365372", "7432847264", "7547367238473", "23455632576532")
        val img = intArrayOf(R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4)

        arrayList = ArrayList()
        for (eachIndex in name.indices) {
            val User = user(name[eachIndex], lastMes[eachIndex], lastTime[eachIndex], phone[eachIndex], img[eachIndex])
            arrayList.add(User)
        }

        val adapter = MyAdapter(this, arrayList)
        listView.adapter = adapter
    }
}
