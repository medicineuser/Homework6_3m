package com.geeks.homework6_3m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.homework6_3m.databinding.FragmentAnimalBinding

class AnimalFragment : Fragment() {

    private lateinit var binding: FragmentAnimalBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAnimalBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter= AnimalAdapter(
            arrayListOf(
                Animal("https://www.dartmoorzoo.org.uk/wp-content/uploads/2021/01/Tiger-1.jpg"),
                Animal("https://animals.sandiegozoo.org/sites/default/files/2016-08/category-thumbnail-mammals_0.jpg"),
                Animal("https://www.cbc.ca/kids/images/wild_and_wonderful_asian_animals_header_1140.jpg"),
                Animal("https://animals.sandiegozoo.org/sites/default/files/2016-08/hero_zebra_animals.jpg"),
                Animal("https://sc0.blr1.cdn.digitaloceanspaces.com/article/185413-vqcxffymgj-1673259068.jpg"),
                Animal("https://cdn.britannica.com/79/232779-050-6B0411D7/German-Shepherd-dog-Alsatian.jpg"),
            )
        )
        binding.rvAnimal.adapter = adapter
    }

}