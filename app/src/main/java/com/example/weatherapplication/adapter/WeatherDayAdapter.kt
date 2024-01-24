package com.example.weatherapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapplication.data.WeatherDay
import com.example.weatherapplication.data.WeatherTime
import com.example.weatherapplication.databinding.WeatherDayItemBinding
import com.example.weatherapplication.databinding.WeatherItemBinding

class WeatherDayAdapter(
    private val context: Context,
    private val itemList: List<WeatherDay>
) :
    RecyclerView.Adapter<WeatherDayAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: WeatherDayItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = WeatherDayItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.binding.image.setImageResource(item.img)
        holder.binding.day.text= item.day
        holder.binding.weather.text= item.weather
        holder.binding.minTemp .text= item.minTemp
        holder.binding.maxTemp.text= item.maxTemp
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}