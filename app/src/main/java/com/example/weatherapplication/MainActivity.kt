package com.example.weatherapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapplication.adapter.WeatherDayAdapter
import com.example.weatherapplication.adapter.WeatherTimeAdapter
import com.example.weatherapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val weatherTime = Constants.getWeatherByTime()
    private val weatherDay = Constants.getWeatherByDate()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initAdapters()
        initLayoutManagers()

        binding.scrollView.isVerticalScrollBarEnabled = false

    }

    private fun initAdapters() {
        binding.weatherRecyclerTime.adapter = WeatherTimeAdapter(this@MainActivity,weatherTime)
        binding.weatherRecyclerDay.adapter = WeatherDayAdapter(this,weatherDay)
    }

    private fun initLayoutManagers() {
        binding.weatherRecyclerDay.layoutManager = LinearLayoutManager(this)
        binding.weatherRecyclerTime.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
    }
}