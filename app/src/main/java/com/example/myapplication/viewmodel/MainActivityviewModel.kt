package com.example.myapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityviewModel: ViewModel() {
    var Successvalue : MutableLiveData<Boolean> = MutableLiveData()
    var Success : MutableLiveData<String> = MutableLiveData()
    fun delete (){
        Successvalue.value = true
        Success.postValue("activity Loading success")
    }
}