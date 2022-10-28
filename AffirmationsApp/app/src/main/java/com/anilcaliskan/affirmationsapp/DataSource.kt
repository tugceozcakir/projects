package com.anilcaliskan.affirmationsapp

class Datasource {

    fun loadAffirmations(): List<Landscape> {
        return listOf<Landscape>(
            Landscape(R.string.affirmation1),
            Landscape(R.string.affirmation2),
            Landscape(R.string.affirmation3),
            Landscape(R.string.affirmation4),
            Landscape(R.string.affirmation5),
            Landscape(R.string.affirmation6),
            Landscape(R.string.affirmation7),
            Landscape(R.string.affirmation8),
            Landscape(R.string.affirmation9),
            Landscape(R.string.affirmation10)
        )
    }
}