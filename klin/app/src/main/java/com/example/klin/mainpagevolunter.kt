package com.example.klin
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class mainpagevolunter : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpagevolunter)


        // Check if user is already signed in
        if  {
            // If not signed in, redirect to LoginActivity
            val intent = Intent(this, ::class.java)
            startActivity(intent)
            finish() // Prevent going back to MainPageVolunter if user presses back button
        }
    }
}
