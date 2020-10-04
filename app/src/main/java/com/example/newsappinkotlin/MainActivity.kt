package com.example.newsappinkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsappinkotlin.ui.destinations.NewsRecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.home_page.*

class MainActivity : AppCompatActivity() {

    private val newsImages = arrayOf<Int>(

    )
    private val newsTitles = arrayOf<String>(
        "Asmaa Gamal",
        "Aya Ali",
        "Mai Ahmed",
        "Mohamed Ahmed",
        "Adham Youssef",
        "Ahmed Hussien",
        "Amna Hassan",
        "Aya Mamdouh",
        "Srag Gamal",
        "Bassant Sayed",
        "Eman Raafat"
    )
    private val newsWebsites = arrayOf<String>(
        "0123456789",
        "9876543210",
        "0123456789",
        "9876543210",
        "0123456789",
        "9876543210",
        "0123456789",
        "9876543210",
        "0123456789",
        "9876543210",
        "0123456789"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_nav_view.setupWithNavController(findNavController(R.id.nav_host_fragment_container))
        val list = prepareData()
        rv.adapter = NewsRecyclerViewAdapter(list)

        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }

    private fun prepareData(): ArrayList<NewsModel> {
        val contactList = ArrayList<NewsModel>()
        for (i in 0..9) {

            val contact = NewsModel(
                newsImages[i],
                newsTitles[i],
                newsWebsites[i]
            )
            contactList.add(contact)

        }
        return contactList
    }
}