package com.example.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer

class Frag2 : androidx.fragment.app.Fragment(R.layout.frag2) {
    val viewModel :TestViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tv = view.findViewById<TextView>(R.id.tvName)
        viewModel.liveName.observe(this.viewLifecycleOwner,Observer{
            tv.text = "Hello $it!"
        })
    }
}
