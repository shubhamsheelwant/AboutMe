package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Shubh Sheelwant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName
        initClickListener()
    }

    private fun initClickListener() {
        binding.button.setOnClickListener{
            myName.nickName = binding.editText.text.toString()
            binding.invalidateAll()
            val message = binding.editText.text.toString()
            Toast.makeText(this, message,Toast.LENGTH_SHORT).show()
        }
    }


}