package com.teguh.alodoktermobiletest.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.teguh.alodoktermobiletest.HomeActivity
import com.teguh.alodoktermobiletest.R

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var images: List<ImageButton>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        if (container != null) {
            images = listOf(view.findViewById(R.id.sample1), view.findViewById(R.id.sample2), view.findViewById(R.id.sample3), view.findViewById(R.id.sample4))

            for (item in images) {
                item.setOnClickListener {
                    startActivity(Intent(view.context, HomeActivity::class.java))
                }
            }
        }

        return view
    }
}