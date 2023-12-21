package com.example.myapplication20

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication20.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mFirstImage: ImageView
    private lateinit var mSecondImage: ImageView
    private lateinit var mFirstScore: TextView
    private lateinit var mSecondScore: TextView


    private var mFirstPlayerScore = 0
    private var mSecondPlayerScore = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buton4.setOnClickListener {
            mFirstPlayerScore = 0
            mSecondPlayerScore = 0
            mFirstScore.text = mFirstPlayerScore.toString()
            mSecondScore.text = mSecondPlayerScore.toString()
        }
        setupView()
        binding.buton1.setOnClickListener {
            val firstImage = R.drawable.tas
            val secondImage = Generator.getimage()

            setImageResource(firstImage, secondImage)

            val result = Comparator.compare(firstImage, secondImage)
            writeScore(result)
        }
        binding.buton2.setOnClickListener {
            val firstImage = R.drawable.kagit
            val secondImage = Generator.getimage()

            setImageResource(firstImage, secondImage)

            val result = Comparator.compare(firstImage, secondImage)
            writeScore(result)
        }
        binding.buton3.setOnClickListener {
            val firstImage = R.drawable.maksa
            val secondImage = Generator.getimage()

            setImageResource(firstImage, secondImage)

            val result = Comparator.compare(firstImage, secondImage)
            writeScore(result)
        }
    }

    fun setupView() {
        mFirstImage = binding.img1
        mSecondImage = binding.img2
        mFirstScore = binding.tv3
        mSecondScore = binding.tv4
    }

    fun setImageResource(firstImage: Int, secondImage: Int) {
        mFirstImage.setImageResource(firstImage)
        mSecondImage.setImageResource(secondImage)
    }

    fun writeScore(winner: Winner) {
        when (winner) {
            Winner.DRAW -> Toast.makeText(this, "Berabere", Toast.LENGTH_SHORT).show()
            Winner.FIRST -> {
                Toast.makeText(this, "Sen kazandın", Toast.LENGTH_SHORT).show()
                mFirstPlayerScore++
                mFirstScore.text = mFirstPlayerScore.toString()
            }

            Winner.SECOND -> {
                Toast.makeText(this, "Rakip Kazandı", Toast.LENGTH_SHORT).show()
                mSecondPlayerScore++
                mSecondScore.text = mSecondPlayerScore.toString()
            }
        }
    }
}