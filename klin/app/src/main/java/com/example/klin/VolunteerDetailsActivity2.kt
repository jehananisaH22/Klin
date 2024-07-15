package com.example.klin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.klin.databinding.ActivityVolunteerDetailsBinding

class VolunteerDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVolunteerDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVolunteerDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up any additional logic for the activity here
        binding.btnNext.setOnClickListener {
            // Handle the button click event here
            // You can add logic to hide the confirmation dialog or proceed to the next activity
        }
    }
}
