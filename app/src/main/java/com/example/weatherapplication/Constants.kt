package com.example.weatherapplication

import com.example.weatherapplication.data.WeatherDay
import com.example.weatherapplication.data.WeatherDetail
import com.example.weatherapplication.data.WeatherTime

object Constants {

    fun getWeatherByTime(): MutableList<WeatherTime>{
        val data: MutableList<WeatherTime> = mutableListOf()

        data.add(WeatherTime("Now",R.drawable.ic_cloud,"18°"))
        data.add(WeatherTime("15:00",R.drawable.ic_foggy,"18°"))
        data.add(WeatherTime("16:00",R.drawable.ic_cloudy,"18°"))
        data.add(WeatherTime("17:00",R.drawable.ic_cloudy,"18°"))
        data.add(WeatherTime("17:33",R.drawable.ic_raining,"18°"))
        data.add(WeatherTime("18:00",R.drawable.ic_moon,"18°"))
        data.add(WeatherTime("19:00",R.drawable.ic_moon,"18°"))
        data.add(WeatherTime("20:00",R.drawable.ic_moon,"18°"))

        return data
    }

    fun getWeatherByDate(): MutableList<WeatherDay>{
        val data: MutableList<WeatherDay> = mutableListOf()

        data.add(WeatherDay("Today",R.drawable.ic_cloudy,"Partly Clo..","18°","8°"))
        data.add(WeatherDay("Tomorrow",R.drawable.ic_foggy,"Fog","21°","10°"))
        data.add(WeatherDay("Thu",R.drawable.ic_foggy,"Fog","21°","12°"))
        data.add(WeatherDay("Fri",R.drawable.ic_foggy,"Fog","22°","9°"))
        data.add(WeatherDay("Sat",R.drawable.ic_sunny,"Sunny","20°","8°"))
        data.add(WeatherDay("Sun",R.drawable.ic_sunny,"Sunny","19°","7°"))
        data.add(WeatherDay("Mon",R.drawable.ic_sunny,"Sunny","19°","6°"))

        return data
    }

    fun getWeatherDetail(): MutableList<WeatherDetail>{
        val data: MutableList<WeatherDetail> = mutableListOf()

        data.add(WeatherDetail(R.drawable.ic_temperature,"Feels Like","16"))
        data.add(WeatherDetail(R.drawable.ic_air,"W wind","13km/h"))
        data.add(WeatherDetail(R.drawable.ic_humidity,"Humidity","63%"))
        data.add(WeatherDetail(R.drawable.ic_uv,"UV","0 Very weak"))
        data.add(WeatherDetail(R.drawable.ic_visibility,"Visibility","1 km"))
        data.add(WeatherDetail(R.drawable.ic_air,"Air Pressure","1017 hpa"))

        return data
    }
}