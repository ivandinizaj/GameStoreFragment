package com.ivand.gamestore.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.ivand.gamestore.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.nav_host_fragment)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            supportActionBar!!.title = destination.label
//            when (destination.id) {
//                R.id.fragment_account,
//                R.id.fragment_settings,
//                R.id.fragment_notifications -> {
//                    supportActionBar!!.setDisplayHomeAsUpEnabled(true)
//                }
//                else -> supportActionBar!!.setDisplayHomeAsUpEnabled(false)
//            }
        }

    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//            android.R.id.home -> {
//                navHostFragment.navController.popBackStack()
//                return true
//            }
//        }
//        return super.onOptionsItemSelected(item)
//    }
}
