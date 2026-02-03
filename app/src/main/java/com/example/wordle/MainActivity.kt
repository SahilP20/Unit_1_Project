package com.example.wordle

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var wordToGuess = ""
    private var guessCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val guessInput = findViewById<EditText>(R.id.guessInput)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val targetWordLabel = findViewById<TextView>(R.id.targetWordLabel)
        val targetWordTv = findViewById<TextView>(R.id.targetWord)

        val guessTvs = listOf(
            findViewById<TextView>(R.id.guess1),
            findViewById<TextView>(R.id.guess2),
            findViewById<TextView>(R.id.guess3)
        )
        val guessCheckTvs = listOf(
            findViewById<TextView>(R.id.guess1Check),
            findViewById<TextView>(R.id.guess2Check),
            findViewById<TextView>(R.id.guess3Check)
        )

        fun resetGame() {
            wordToGuess = FourLetterWordList.getRandomFourLetterWord()
            guessCount = 0
            guessInput.text.clear()
            guessInput.isEnabled = true
            submitButton.visibility = View.VISIBLE
            resetButton.visibility = View.GONE
            targetWordLabel.visibility = View.GONE
            targetWordTv.visibility = View.GONE
            targetWordTv.text = wordToGuess

            for (tv in guessTvs) tv.text = ""
            for (tv in guessCheckTvs) tv.text = ""
        }

        resetGame()

        submitButton.setOnClickListener {
            val guess = guessInput.text.toString().uppercase()
            if (guess.length != 4) {
                Toast.makeText(this, "Enter a 4 letter word", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            guessTvs[guessCount].text = guess
            guessCheckTvs[guessCount].text = checkGuess(guess)
            guessCount++
            guessInput.text.clear()

            if (guessCount == 3 || guess == wordToGuess) {
                submitButton.visibility = View.GONE
                resetButton.visibility = View.VISIBLE
                guessInput.isEnabled = false
                targetWordLabel.visibility = View.VISIBLE
                targetWordTv.visibility = View.VISIBLE
                if (guessCount == 3 && guess != wordToGuess) {
                    Toast.makeText(this, "You've exceeded your number of guesses!", Toast.LENGTH_LONG).show()
                }
            }
        }

        resetButton.setOnClickListener {
            resetGame()
        }
    }

    /**
     * Parameters / Keyboard:
     * word -> The target word the user is trying to guess
     * guess -> The word the user entered
     */
    private fun checkGuess(guess: String): String {
        var result = ""
        for (i in 0..3) {
            if (guess[i] == wordToGuess[i]) {
                result += "O"
            } else if (guess[i] in wordToGuess) {
                result += "+"
            } else {
                result += "X"
            }
        }
        return result
    }
}
