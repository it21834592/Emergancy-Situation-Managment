package com.example.emergancysituationmanagment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.emergancysituationmanagment.database.Emergency

class MainActivityData : ViewModel() {
    private val _data = MutableLiveData<List<Emergency>>()

    val data: LiveData<List<Emergency>> = _data

    fun setData(data:List<Emergency>){
        _data.value = data
    }
}