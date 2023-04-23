package com.example.movieappmad23.utils

import androidx.room.TypeConverter

class MyConvertor {
    @TypeConverter
    fun convertListToString(value: List<String>) = value.joinToString(";")

    @TypeConverter
    fun convertStringToList(value: String) = value.split(";").map { it.trim() }
}