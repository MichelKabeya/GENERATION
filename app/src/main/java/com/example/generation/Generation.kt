package com.example.generation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Generation : AppCompatActivity() {

    // Array of generations
    val arrGen = arrayOf(
        "LOST GENERATION",
        "GREATEST GENERATION",
        "SILENT GENERATION",
        "BABY BOOMERS",
        "GENERATION X",
        "GENERATION Y",
        "GENERATION Z",
        "GENERATIONS ALFA",
        "GENERATIONS BETA",
        "GENERATIONS GAMMA"
    )

    // descriptions of generations
    val arrDesc = arrayOf(
        "Grew up during rapid industrialization and witnessed World War I. Many experienced economic hardship and social change.",
        "Lived through the Great Depression and fought or contributed during World War II. Known for resilience and civic duty.",
        "Grew up during World War II and the early Cold War. Often associated with discipline, loyalty, and conformity.",
        "Born during the post-war population boom. Witnessed the Civil Rights Movement, the Vietnam War, and the Apollo 11 Moon Landing.",
        "Grew up during the rise of personal computers, video games, and cable TV. Experienced the end of the Cold War and the transition from analog to digital technology.",
        "Witnessed the expansion of the internet, mobile phones, and social media. Their formative years were influenced by the September 11 Attacks and the Global Financial Crisis.",
        "First generation to grow up fully connected to smartphones and social media. Experienced online learning, streaming platforms, and the COVID-19 Pandemic during their youth.",
        "Growing up with artificial intelligence, smart devices, voice assistants, and advanced digital education tools. Often called the most technologically immersed generation.",
        "Expected to grow up in a world where AI, automation, robotics, and possibly autonomous transportation are commonplace. Their defining experiences are still emerging.",
        "A projected future generation. Likely to experience technologies and societal changes that are difficult to predict today, potentially including advanced AI integration, biotechnology, and space-related developments."
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_generation)

        //Declarations of all variables
        val descripView = findViewById<TextView>(R.id.descripView)
        val genView = findViewById<TextView>(R.id.genView)
        val userYear = findViewById<EditText>(R.id.userYear)
        val checkBtn = findViewById<Button>(R.id.CheckBtn)
        val resetBtn = findViewById<Button>(R.id.resetBtn)
        resetBtn.visibility = Button.INVISIBLE
        resetBtn.isEnabled = false

        // On click listener for check button
        checkBtn.setOnClickListener {
            val yearString = userYear.text.toString()
            if (yearString.isEmpty()) {
                userYear.error = "Please enter a year"
                return@setOnClickListener
            }
            val year = yearString.toIntOrNull()
            if (year == null || year < 1000) {
                userYear.error = "Please enter a valid year"
                return@setOnClickListener
            }

            resetBtn.visibility = Button.VISIBLE
            resetBtn.isEnabled = true
            // settings conditions for generations
            when (year) {
                in 1001..<1900 -> {
                    genView.text = arrGen[0]
                    descripView.text = arrDesc[0]
                }
                in 1900..<1928 -> {
                    genView.text = arrGen[1]
                    descripView.text = arrDesc[1]
                }
                in 1928..<1946 -> {
                    genView.text = arrGen[2]
                    descripView.text = arrDesc[2]
                }
                in 1946..<1965 -> {
                    genView.text = arrGen[3]
                    descripView.text = arrDesc[3]
                }
                in 1965..<1981 -> {
                    genView.text = arrGen[4]
                    descripView.text = arrDesc[4]
                }
                in 1981..<1997 -> {
                    genView.text = arrGen[5]
                    descripView.text = arrDesc[5]
                }
                in 1997..<2013 -> {
                    genView.text = arrGen[6]
                    descripView.text = arrDesc[6]
                }
                in 2013..<2025 -> {
                    genView.text = arrGen[7]
                    descripView.text = arrDesc[7]
                }
                in 2025..<2040 -> {
                    genView.text = arrGen[8]
                    descripView.text = arrDesc[8]
                }
                else -> {
                    genView.text = arrGen[9]
                    descripView.text = arrDesc[9]
                }
            }

            // disable check button after clicking
            checkBtn.visibility = Button.INVISIBLE
            checkBtn.isEnabled = false

        }
        // On click listener for reset button
        resetBtn.setOnClickListener {
            // reset all variables
            genView.text = ""
            descripView.text = ""
            userYear.text.clear()
            checkBtn.visibility = Button.VISIBLE
            checkBtn.isEnabled = true
            resetBtn.visibility = Button.INVISIBLE
            resetBtn.isEnabled = false
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}