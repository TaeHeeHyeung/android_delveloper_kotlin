package com.example.kotlin.viewbinding.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlin.viewbinding.data.User

//(): 자식클래스가 주 생성자가 없을 떄 () 를 추가해줘야한다.
class MyViewModel(
    private val dataSource: DataSource
) : ViewModel() {
    //주 생성자
    //constructor() : super()

    private val users: MutableLiveData<List<User>> by lazy {
        MutableLiveData<List<User>>().also {
            loadUsers()
        }
    }

    fun getUsers(): LiveData<List<User>> {
        return users
    }

    private fun loadUsers() {
        // Do an asynchronous operation to fetch users.
    }
}