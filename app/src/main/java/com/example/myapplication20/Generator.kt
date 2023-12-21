package com.example.myapplication20

import kotlin.random.Random

object Generator {

    fun genareteRandomNumber(): Int = Random.nextInt(3)


    fun getimage(): Int {
        val images = listOf(R.drawable.tas, R.drawable.maksa, R.drawable.kagit)
        return images[genareteRandomNumber()]
    }
}