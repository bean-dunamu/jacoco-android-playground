package com.madrapps.playground

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    fun validate(userId: String): Boolean {
        return userId == "admin"
    }

    fun verifyAccess(userId: String): Boolean {
        return userId == "super-admin"
    }

    fun verifyNormal(userId: String): Boolean {
        return userId == "user"
    }
}
