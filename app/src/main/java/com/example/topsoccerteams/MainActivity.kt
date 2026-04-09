package com.example.topsoccerteams

import android.annotation.SuppressLint
import android.hardware.biometrics.BiometricManager
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays

class MainActivity : AppCompatActivity() {


    val teams =  arrayOf<String> ( "Mam Sundowns FC", " Orlando Pirates", "Bidvest Wits",
        "Stellenbosch FC", " Sek united FC")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val teamsTxt = findViewById<TextView>(R.id.teamsTxt)
        var teamsDisplay = ""
        var count = 0

        // re-assigning position 0 of the teams array
        teams[0] = "Mam Sundowns FC :)"

      // while loop to iterate through the teams array
        while (count < teams.count()) {
            teamsDisplay += " $({teams[counter]}\n"
            count++
        }

            teamsDisplay +=" ${teams[0]}\n"
            teamsDisplay +="${teams[1]}\n"
            teamsDisplay +="${teams[2]}\n"
            teamsDisplay +="${teams[3]}\n"
            teamsDisplay +="${teams[4]}\n"

        //displaying top soccer team in text view on UI
        teamsTxt.text = Arrays.toString(teams)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}