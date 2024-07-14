package com.route.routejobfair.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.route.routejobfair.databinding.ActivitySplashBinding

import com.route.routejobfair.ui.product.activity.ProductActivity

class SplashScreenActivity : AppCompatActivity() {
    private var _binding: ActivitySplashBinding? = null
    val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        _binding = ActivitySplashBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        enableEdgeToEdge()
        NavigateToProductsScreen()
    }

    private fun NavigateToProductsScreen() {
        Handler(mainLooper).postDelayed({
            val intent = Intent(this, ProductActivity::class.java)
            startActivity(intent)
            finish()
        }, 2500)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}