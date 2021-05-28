package com.example.baseproject.presentation.character.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.example.baseproject.data.models.Character
import com.example.baseproject.databinding.ItemCharacterBinding

class CharacterAdapter() : ListAdapter<Character, CharacterAdapter.ViewHolder>(CharacterDiffCallback()) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CharacterAdapter.ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: CharacterAdapter.ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }


    class ViewHolder private constructor(private val binding: ItemCharacterBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Character) {
            (binding as ItemCharacterBinding).item = item

            Glide.with(binding.root)
                .load(item.getImage())
                .transform(CircleCrop())
                .into(binding.img)
        }

        companion object {
            fun from(parent: ViewGroup) : ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemCharacterBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }

    }


    class CharacterDiffCallback : DiffUtil.ItemCallback<Character>() {
        override fun areItemsTheSame(oldItem: Character, newItem: Character): Boolean {
           return true
        }

        override fun areContentsTheSame(oldItem: Character, newItem: Character): Boolean {
            return true
        }

    }

}