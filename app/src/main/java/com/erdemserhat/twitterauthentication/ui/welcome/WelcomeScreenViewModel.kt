package com.erdemserhat.twitterauthentication.ui.welcome

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.erdemserhat.twitterauthentication.ui.main.MainActivity
import com.erdemserhat.twitterauthentication.ui.main.onAuthenticate

class WelcomeScreenViewModel(
):ViewModel() {
    private val _onAuthenticate=onAuthenticate

    fun login(){
        _onAuthenticate()


    }

    fun signUp(){
        _onAuthenticate()
    }
}