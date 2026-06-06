package com.example.generation

import android.os.Bundle
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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}