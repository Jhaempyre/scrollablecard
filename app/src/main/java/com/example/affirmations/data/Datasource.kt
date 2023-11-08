package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.guy, R.drawable.cow),
            Affirmation(R.string.dog, R.drawable.kutta),
            Affirmation(R.string.bhoot, R.drawable.bhutni),
            Affirmation(R.string.photu,R.drawable.photu),
            Affirmation(R.string.sgn,R.drawable.sign))
}
}