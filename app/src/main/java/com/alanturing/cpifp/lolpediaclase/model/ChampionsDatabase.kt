package com.alanturing.cpifp.lolpediaclase.model

import com.alanturing.cpifp.lolpediaclase.R

class ChampionsDatabase {
    companion object {
        private val champions = listOf(
            Champion(R.string.blitzcrank, R.drawable.loading_blitzcrank),
            Champion(R.string.caitlyn, R.drawable.loading_caitlyn),
            Champion(R.string.camille, R.drawable.loading_camille),
            Champion(R.string.drmundo, R.drawable.loading_drmundo),
            Champion(R.string.ekko, R.drawable.loading_ekko),
            Champion(R.string.ezreal, R.drawable.loading_ezreal),
            Champion(R.string.heimerdinger, R.drawable.loading_heimerdinger),
            Champion(R.string.janna, R.drawable.loading_janna),
            Champion(R.string.jayce, R.drawable.loading_jayce),
            Champion(R.string.jinx, R.drawable.loading_jinx),
            Champion(R.string.orianna, R.drawable.loading_orianna),
            Champion(R.string.renata, R.drawable.loading_renata),
            Champion(R.string.seraphine, R.drawable.loading_seraphine),
            Champion(R.string.singed, R.drawable.loading_singed),
            Champion(R.string.twitch, R.drawable.loading_twitch),
            Champion(R.string.urgot, R.drawable.loading_urgot),
            Champion(R.string.vi, R.drawable.loading_vi),
            Champion(R.string.viktor, R.drawable.loading_viktor),
            Champion(R.string.warwick, R.drawable.loading_warwick),
            Champion(R.string.zac, R.drawable.loading_zac),
            Champion(R.string.zeri, R.drawable.loading_zeri),
            Champion(R.string.ziggs, R.drawable.loading_ziggs),
        )
        fun getDatabase() = champions
    }
}