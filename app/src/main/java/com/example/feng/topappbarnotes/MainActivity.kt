package com.example.feng.topappbarnotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.favorite_menu_item -> {
                Toast.makeText(this, "You clicked FAVORITES", Toast.LENGTH_SHORT).show()
            }
            R.id.search_menu_item -> {
                Toast.makeText(this, "You clicked SEARCH", Toast.LENGTH_SHORT).show()
            }
            R.id.settings_menu_item -> {
                Toast.makeText(this, "You clicked SETTINGS", Toast.LENGTH_SHORT).show()
            }
            R.id.rocket_menu_item -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}