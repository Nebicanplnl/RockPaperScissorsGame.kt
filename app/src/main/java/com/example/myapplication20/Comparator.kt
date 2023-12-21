package com.example.myapplication20

object Comparator {

    fun compare(firstimgae: Int, secondImage: Int): Winner {
        var result: Winner = Winner.DRAW
        if (firstimgae == secondImage) {
            result = Winner.DRAW
        } else if (firstimgae == R.drawable.tas && secondImage == R.drawable.kagit) {
            result = Winner.SECOND
        } else if (firstimgae == R.drawable.tas && secondImage == R.drawable.maksa) {
            result = Winner.FIRST
        } else if (firstimgae == R.drawable.kagit && secondImage == R.drawable.tas) {
            result = Winner.FIRST
        } else if (firstimgae == R.drawable.maksa && secondImage == R.drawable.tas) {
            result = Winner.SECOND
        } else if (firstimgae == R.drawable.kagit && secondImage == R.drawable.maksa) {
            result = Winner.SECOND
        } else if (firstimgae == R.drawable.maksa && secondImage == R.drawable.kagit) {
            result = Winner.FIRST
        }
        return result
    }

}