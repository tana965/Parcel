package com.example.parcel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Click1(view: View) {
        val text1: EditText = findViewById(R.id.editTextText)
        val text2: EditText = findViewById(R.id.editTextText2)

        val name1 = text1.text.toString()
        val name2 = text2.text.toString()
        val user: User = User(name1, name2)

        val intent: Intent = Intent(this@MainActivity, MainActivity2::class.java)
        intent.putExtra(user.javaClass.simpleName, user)
        startActivity(intent)
    }

}