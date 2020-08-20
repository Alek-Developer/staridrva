package com.gsixacademy.android.StariDrva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_navigation_layout.*

lateinit var navController: NavController

lateinit var navListener: NavController.OnDestinationChangedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this, R.id.navigation_host_fragment)
        initListeners()
    }

    fun initListeners() {
        navListener = NavController.OnDestinationChangedListener{ controller, destination, arguments ->

            when(destination.id) {
                R.id.homeFragment -> {
                    navigation_bottom_view.visibility = View.VISIBLE
                }
                R.id.mapFragment -> {
                    navigation_bottom_view.visibility = View.VISIBLE
                }
                R.id.listFragment -> {
                    navigation_bottom_view.visibility = View.VISIBLE
                }
                R.id.infoFragment -> {
                    navigation_bottom_view.visibility = View.VISIBLE
                }
                R.id.splashFragment -> {
                    navigation_bottom_view.visibility = View.GONE
                }





            }
        }
        navController.addOnDestinationChangedListener(navListener)
        text_view_home.setOnClickListener {
            navController.navigate(R.id.action_global_homeFragment)
            navigation_bottom_view.setSelectedTab(1)
        }

        text_view_map.setOnClickListener {
            navController.navigate(R.id.action_global_mapFragment)
        }

        text_view_list.setOnClickListener {
           navController.navigate(R.id.action_global_listFragment)
        }

        text_view_info.setOnClickListener {
           navController.navigate(R.id.action_global_infoFragment)
        }
    }
}