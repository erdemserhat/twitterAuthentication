package com.erdemserhat.twitterauthentication.ui.main

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.erdemserhat.twitterauthentication.model.TwitterAuthService
import com.erdemserhat.twitterauthentication.ui.welcome.LoginScreen
import com.erdemserhat.twitterauthentication.ui.theme.TwitterAuthenticationTheme
import com.erdemserhat.twitterauthentication.ui.welcome.WelcomeScreenViewModel
import com.google.firebase.auth.OAuthProvider
import com.google.firebase.auth.FirebaseAuth


class MainActivity : ComponentActivity() {
    /**
     * Construct an instance of an OAuthProvider using its
     * Builder with the provider ID Twitter.com
     */
    private val provider = OAuthProvider.newBuilder("twitter.com")
    private val firebaseAuth = FirebaseAuth.getInstance()
    private val pendingResultTask = firebaseAuth.pendingAuthResult



    override fun onCreate(savedInstanceState: Bundle?) {
        //Construct an instance of an OAuthProvider using its Builder with the provider ID Twitter.com
        //val welcomeScreenViewModel:WelcomeScreenViewModel = WelcomeScreenViewModel { onAuthenticate }
        super.onCreate(savedInstanceState)
        welcomeScreenViewModel = ViewModelProvider(this).get(WelcomeScreenViewModel::class.java)
        //Setting View.
        setContent {
            TwitterAuthenticationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    LoginScreen()

                }
            }
        }

    }

    private val onAuthenticate: () -> Unit = {
        if (pendingResultTask != null) {
            // There's something already here! Finish the sign-in for your user.
            pendingResultTask
                .addOnSuccessListener {
                    // User is signed in.
                    // IdP data available in
                    //authResult.getAdditionalUserInfo().getProfile().
                    // The OAuth access token can also be retrieved:
                    // ((OAuthCredential)authResult.getCredential()).getAccessToken().
                    // The OAuth secret can be retrieved by calling:
                    // ((OAuthCredential)authResult.getCredential()).getSecret().
                    //Toast.makeText(activity.applicationContext,"Signed in", Toast.LENGTH_LONG).show()

                }
                .addOnFailureListener {
                    // Handle failure.

                }
        } else {
            // There's no pending result so you need to start the sign-in flow.
            // See below.

            firebaseAuth
                .startActivityForSignInWithProvider(this, provider.build())
                .addOnSuccessListener {
                    /// User is signed in.
                    /// IdP data available in
                    /// auth


                }
        }
    }
}






