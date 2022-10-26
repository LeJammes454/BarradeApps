package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class pantalla2 : AppCompatActivity() {

    private var toolbar : Toolbar?=null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)

        toolbar = findViewById(R.id.toolbar2);
        toolbar?.setTitle(R.string.title);
        setSupportActionBar(toolbar);

        val actionBar = supportActionBar;
        actionBar?.setDisplayHomeAsUpEnabled(true);
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_pantalla2,menu);
        return super.onCreateOptionsMenu(menu)
    }
}