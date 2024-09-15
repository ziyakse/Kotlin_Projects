package com.example.kotlinproject

import androidx.annotation.DrawableRes

data class Country(
        @DrawableRes
        val imageResource: Int,
        val name: String,
        val info: String,
        val capital: List<String>
)