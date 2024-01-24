package com.example.weatherapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapplication.data.WeatherDetail
import com.example.weatherapplication.data.WeatherTime
import com.example.weatherapplication.databinding.WeatherDetailsBinding
import com.example.weatherapplication.databinding.WeatherItemBinding

class WeatherDetailsAdapter(
    private val context: Context,
    private val itemList: List<WeatherDetail>
) : RecyclerView.Adapter<WeatherDetailsAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: WeatherDetailsBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = WeatherDetailsBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.binding.imageIcon.setImageResource(item.img)
        holder.binding.value .text= item.value
        holder.binding.condition .text= item.condition
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}