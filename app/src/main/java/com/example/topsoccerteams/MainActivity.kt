package com.example.topsoccerteams

import android.annotation.SuppressLint
import android.hardware.biometrics.BiometricManager
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays

//created functiion to log array values

fun logArrValues(arr: Array<String>, limit: Int =0) {
    //if statement to  check if thers a limit - if ther is a limit , cut the array at the index
    if (limit == 0) {
        Log.v("Array Values: " , Arrays.toString(arr))
    } else {

        Log.v("Array Values: ", Arrays.toString(arr.sliceArray(0..limit - 1)))
    }
}

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

        // calling logArrValues function to log array values
        logArrValues(teams)



        // re-assigning position 0 of the teams array
        teams[0] = "Mam Sundowns FC :)"

      // while loop to iterate through the teams array
        while (count < teams.count()) {
            teamsDisplay += " $({teams[counter]}\n"
            count++
        }
        // for loop to iterate through the teams array and display them
        for (team in teams){
            teamsDisplay += "${teams}\n"
        }
        //displaying top soccer team in text view on UI
        teamsTxt.text = Arrays.toString(teams)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}