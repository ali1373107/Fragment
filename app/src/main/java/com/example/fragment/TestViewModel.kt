package com.example.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel :ViewModel() {
    var currentName = ""
        set(newValue){
            field = newValue
            liveName.value = newValue
        }
    var liveName = MutableLiveData<String>()
}