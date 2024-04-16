package com.example.list_view_project2

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<user>) :
    ArrayAdapter<user>(context, R.layout.items, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView

        // Inflate the list item layout if necessary
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.items, parent, false)
        }

        // Get references to views in list item layout
        val imageView = listItemView!!.findViewById<CircleImageView>(R.id.profile_image)
        val nameTextView = listItemView.findViewById<TextView>(R.id.name)
        val lastMessageTextView = listItemView.findViewById<TextView>(R.id.lastmessage)
        val timeTextView = listItemView.findViewById<TextView>(R.id.time)

        // Get the User object at the current position
        val currentUser = arrayList[position]

        // Set data to views
        imageView.setImageResource(currentUser.imgid)
        nameTextView.text = currentUser.name
        lastMessageTextView.text = currentUser.lastMessage
        timeTextView.text = currentUser.mestime

        return listItemView
    }
}
