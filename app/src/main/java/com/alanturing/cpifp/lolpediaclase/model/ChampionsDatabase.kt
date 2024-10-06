package com.alanturing.cpifp.lolpediaclase.model

import com.alanturing.cpifp.lolpediaclase.R

class ChampionsDatabase {
    companion object {
        private val champions = listOf(
            Champion(R.string.blitzcrank),
            Champion(R.string.caitlyn),
        )
        fun getDatabase() = champions
    }
}