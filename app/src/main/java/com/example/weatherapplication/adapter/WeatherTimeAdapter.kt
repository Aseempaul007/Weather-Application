package com.example.weatherapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapplication.data.WeatherTime
import com.example.weatherapplication.databinding.WeatherItemBinding

class WeatherTimeAdapter(
    private val context: Context,
    private val itemList: List<WeatherTime>
) :
    RecyclerView.Adapter<WeatherTimeAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: WeatherItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = WeatherItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.binding.weatherImage.setImageResource(item.img)
        holder.binding.weatherTime.text= item.time
        holder.binding.weatherDegree.text= item.temp
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}