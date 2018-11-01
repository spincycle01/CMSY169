package com.example.adamhome.helloandroidworld
//this file houses the Kotlin program for the app.  It controls the behavior of the app.


import android.app.Activity
import android.os.Bundle

//no changes have been made to the Kotlin file
class MainActivity : Activity() {

//    no additional code needed. The app is running
// comment 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
