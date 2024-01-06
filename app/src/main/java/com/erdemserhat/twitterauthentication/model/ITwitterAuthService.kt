package com.erdemserhat.twitterauthentication.model

interface ITwitterAuthService {
    fun signUpWithTwitter()
    fun signInWithTwitter()
    fun signOut()
}