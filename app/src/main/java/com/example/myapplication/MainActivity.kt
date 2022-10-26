package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.widget.Toolbar
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.ShareActionProvider
import androidx.core.view.MenuItemCompat
import android.widget.ShareActionProvider as ShareActionProvider1


class MainActivity : AppCompatActivity() {
    var toolbar : Toolbar?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar= findViewById(R.id.toolbar)
        toolbar?.setTitle(R.string.title)
        setSupportActionBar(toolbar)

        val btnIr = findViewById<Button>(R.id.btnIr)

        btnIr.setOnClickListener {
            val intent = Intent(this, pantalla2::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        val itemBusqueda = menu?.findItem(R.id.busqueda);
        var vistaBusqueda = itemBusqueda?.actionView as SearchView;


        vistaBusqueda.queryHint="Escribe tu nombre";
        vistaBusqueda.setOnQueryTextFocusChangeListener { view, b ->
            Log.d("LISTENERFOCUS",b.toString())
        }
        vistaBusqueda.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
            override fun onQueryTextChange(newText: String?): Boolean {
                Log.d("OnQueryTextChange", newText.toString())
                return true
            }

            override fun onQueryTextSubmit(query: String?): Boolean {
                Log.d("OnQueryTextSubmit", query.toString())
                return true
            }
        })
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.bfav -> {
                Toast.makeText(this, "Elemento añadido como favorito", Toast.LENGTH_SHORT).show()
                return true
            }
            else ->{
                return super.onOptionsItemSelected(item)
            }
        }
        return super.onOptionsItemSelected(item)
    }


}