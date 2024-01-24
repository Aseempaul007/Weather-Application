package com.example.weatherapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapplication.adapter.WeatherDayAdapter
import com.example.weatherapplication.adapter.WeatherDetailsAdapter
import com.example.weatherapplication.adapter.WeatherTimeAdapter
import com.example.weatherapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    val weatherTime = Constants.getWeatherByTime()
    val weatherDay = Constants.getWeatherByDate()
    val weatherDetail = Constants.getWeatherDetail()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.weatherRecyclerTime.adapter = WeatherTimeAdapter(this,weatherTime)
        binding.weatherRecyclerTime.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)


        binding.weatherRecyclerDay.adapter = WeatherDayAdapter(this,weatherDay)
        binding.weatherRecyclerDay.layoutManager = LinearLayoutManager(this)

    }
}