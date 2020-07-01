package com.vishwa.openingofgooglemapsandsearchingoflocations

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var searchButton:Button
    lateinit var edittextButton:Button
    lateinit var OpengoogleMaps:Button
    val uri="geo:O,O?q=india"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    OpengoogleMaps=findViewById(R.id.googleMapsButton)
       searchButton=findViewById(R.id.searchButton)
        edittextButton=findViewById(R.id.editText)
        OpengoogleMaps.setOnClickListener{
            val uriMap= Uri.parse(uri)
            val intent=Intent(Intent.ACTION_VIEW,uriMap)
            intent.setPackage("com.google.android.apps.maps")
            if(intent!=null){
                startActivity(intent)
            }
        }
        searchButton.setOnClickListener {
            val uriMapSearch= Uri.parse("geo:O,O?q=${edittextButton.text.toString()}")
            val intentSearch=Intent(Intent.ACTION_VIEW,uriMapSearch)
            intentSearch.setPackage("com.google.apps.maps")
            startActivity(intentSearch)
        }

    }
}