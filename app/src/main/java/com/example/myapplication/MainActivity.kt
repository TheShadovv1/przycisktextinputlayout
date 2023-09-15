package com.example.kotlinexample



import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

import android.text.TextUtils.isEmpty

import android.widget.Button

import android.widget.EditText

import android.widget.Toast
import com.example.myapplication.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)



        var username = findViewById<EditText>(R.id.username)

        var password = findViewById<EditText>(R.id.password)

        var loginbutton = findViewById<Button>(R.id.loginbutton)



        // set on-click listener

        loginbutton.setOnClickListener {

            val username = username.text;

            val password = password.text;



            if(isEmpty(username) || isEmpty(password)){

                Toast.makeText(this@MainActivity, "Please fill all fields", Toast.LENGTH_LONG).show()

            }else{

                // your code to validate the user_name and password combination

                // and verify the same

            }

        }

    }

}