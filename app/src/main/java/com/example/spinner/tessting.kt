package com.example.spinner

import android.R.id.button1
import android.app.Dialog
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_popup2.*
import kotlinx.android.synthetic.main.activity_popup2.view.*
import kotlinx.android.synthetic.main.activity_tessting.*
import kotlinx.android.synthetic.main.popup.*


class tessting : AppCompatActivity() {

    lateinit var mDialog: Dialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tessting)

        val popupMain = findViewById<LinearLayout>(R.id.popup1)



        imageView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?){
                imageView.setImageResource(R.drawable.delete)
                popupMain.visibility = View.VISIBLE
            }
        })



        button4.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?){
                imageView.setImageResource(R.drawable.egg)
                popupMain.visibility = View.GONE
            }
        })









    }

}