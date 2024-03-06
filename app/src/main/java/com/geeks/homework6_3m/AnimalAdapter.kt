package com.geeks.homework6_3m

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geeks.homework6_3m.databinding.ItemAnimalBinding

class AnimalAdapter(private val animalList: ArrayList<Animal>) :
    RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return animalList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(animalList[position])
    }


    class ViewHolder(private var binding: ItemAnimalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(animal: Animal) {
            binding.imgAnimal.loadImage(animal.imgAnimal)

        }

    }
}