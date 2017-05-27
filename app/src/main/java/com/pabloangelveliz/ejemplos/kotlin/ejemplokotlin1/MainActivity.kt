package com.pabloangelveliz.ejemplos.kotlin.ejemplokotlin1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clicBotonCambiar ( v : View) {

        val edtField = findViewById(R.id.editText) as EditText
        val txtField = findViewById(R.id.textView) as TextView

        txtField.text = edtField.text
    }

}
