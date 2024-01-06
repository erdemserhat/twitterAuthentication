package com.erdemserhat.twitterauthentication.ui.viewmodels

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.erdemserhat.twitterauthentication.model.TwitterAuthService
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.OAuthProvider

class TwitterAuthFlowViewModel:ViewModel() {
    private val _twitterAuthentication = TwitterAuthService()
    private val provider = OAuthProvider.newBuilder("twitter.com")
    private val firebaseAuth= FirebaseAuth.getInstance()
    private val pendingResultTask = firebaseAuth.pendingAuthResult

    fun authenticateUser(){


    }


}