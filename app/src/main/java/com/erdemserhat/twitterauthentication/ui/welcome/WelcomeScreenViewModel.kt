package com.erdemserhat.twitterauthentication.ui.welcome

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class WelcomeScreenViewModel(
    onAuthenticate:()->Unit
):ViewModel() {
    private val _onAuthenticate=onAuthenticate

    fun login(){
        _onAuthenticate()


    }

    fun signUp(){
        _onAuthenticate()
    }
}