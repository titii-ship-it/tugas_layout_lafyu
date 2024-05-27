package com.example.pa_syamsi2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home_layout)

        val goToFlashSale: TextView = findViewById(R.id.see_more_flash_sale)
        val goToFavProduct: ImageView = findViewById(R.id.fav_product)
        val goToDetail: ImageView = findViewById(R.id.item_product)

        goToFlashSale.setOnClickListener {
            val intent = Intent(this, FlashSaleActivity::class.java)
            startActivity(intent)
        }

        goToFavProduct.setOnClickListener {
            val intent = Intent(this, FavProdActivity::class.java)
            startActivity(intent)
        }

        goToDetail.setOnClickListener {
            val intent = Intent(this, ProductActivity::class.java)
            startActivity(intent)
        }
    }
}