package com.example.udolegue.Activity

import android.content.Intent
import android.os.Bundle
import com.example.udolegue.databinding.ActivityIntroBinding

class IntroActivity : BaseActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startBtn.setOnClickListener {
            startActivity(Intent(this@IntroActivity, MainActivity::class.java))
        }
    }
}