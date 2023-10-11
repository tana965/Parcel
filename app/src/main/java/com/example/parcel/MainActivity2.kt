package com.example.parcel

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity2 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val arguments:Bundle? = intent.extras
        val text3:TextView = findViewById(R.id.textView)



        if(arguments != null){
            var user:User= User()
            user= arguments.getParcelable<User>(user.javaClass.simpleName) as User
            text3.text= "Name1 ${user.getName1()}\nName2 ${user.getName2()}"
        }
    }
}