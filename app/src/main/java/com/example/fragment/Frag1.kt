package com.example.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels

class Frag1 : androidx.fragment.app.Fragment(R.layout.frag1) {
    val viewModel : TestViewModel by activityViewModels()
    override fun onViewCreated(view: View, saveInstanceState: Bundle?) {
        val etName = view.findViewById<EditText>(R.id.etName)
        view.findViewById<Button>(R.id.btn1).setOnClickListener{
            viewModel.currentName = etName.text.toString()
        }
    }

}