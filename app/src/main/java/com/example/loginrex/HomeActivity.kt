package com.example.loginrex

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import com.example.loginrex.databinding.ActivityHomeBinding
import com.example.loginrex.databinding.ActivityMainBinding

class HomeActivity: AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setSupportActionBar(binding.toolbar)

        /*  val navController = findNavController(R.id.nav_host_fragment_content_main)
          appBarConfiguration = AppBarConfiguration(navController.graph)
          setupActionBarWithNavController(navController, appBarConfiguration)*/

        /* binding.fab.setOnClickListener { view ->
             Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                 .setAnchorView(R.id.fab)
                 .setAction("Action", null).show()
         }*/
    }

}