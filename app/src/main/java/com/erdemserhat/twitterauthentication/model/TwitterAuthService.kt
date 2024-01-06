package com.erdemserhat.twitterauthentication.model

import android.app.Activity
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.OAuthProvider

class TwitterAuthService {

    /**
     * Construct an instance of an OAuthProvider using its
     * Builder with the provider ID Twitter.com
     */
    private val provider = OAuthProvider.newBuilder("twitter.com")
    private val firebaseAuth= FirebaseAuth.getInstance()

    private val pendingResultTask = firebaseAuth.pendingAuthResult

    fun authenticateUser(
        activity: Activity
    ) {


    }

}