package com.example.hellokotlin.repository

import androidx.lifecycle.LiveData
import com.example.hellokotlin.data.UserDao
import com.example.hellokotlin.model.User

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User) {
        userDao.addUser(user)
    }

}