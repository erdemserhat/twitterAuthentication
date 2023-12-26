package com.erdemserhat.twitterauthentication

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
import com.erdemserhat.twitterauthentication.ui.theme.TwitterAuthenticationTheme
import com.google.firebase.*
import com.google.firebase.auth.OAuthProvider
import com.google.firebase.auth.FirebaseAuth




class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //Construct an instance of an OAuthProvider using its Builder with the provider ID Twitter.com
        val provider = OAuthProvider.newBuilder("twitter.com")
        val firebaseAuth=FirebaseAuth.getInstance()

        super.onCreate(savedInstanceState)

        //Setting View.
        setContent {
            TwitterAuthenticationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }



        val pendingResultTask = firebaseAuth.pendingAuthResult
        if (pendingResultTask != null) {
            // There's something already here! Finish the sign-in for your user.
            pendingResultTask
                .addOnSuccessListener {
                    // User is signed in.
                    // IdP data available in
                    // authResult.getAdditionalUserInfo().getProfile().
                    // The OAuth access token can also be retrieved:
                    // ((OAuthCredential)authResult.getCredential()).getAccessToken().
                    // The OAuth secret can be retrieved by calling:
                    // ((OAuthCredential)authResult.getCredential()).getSecret().
                    Toast.makeText(this,"Signed in successfully",Toast.LENGTH_LONG).show()
                }
                .addOnFailureListener {
                    // Handle failure.
                    Toast.makeText(this,it.message,Toast.LENGTH_LONG).show()
                }
        } else {
            // There's no pending result so you need to start the sign-in flow.
            // See below.

            firebaseAuth
                .startActivityForSignInWithProvider(this, provider.build())
                .addOnSuccessListener {
                    // User is signed in.
                    // IdP data available in
                    // authResult.getAdditionalUserInfo().getProfile().
                    // The OAuth access token can also be retrieved:
                    // ((OAuthCredential)authResult.getCredential()).getAccessToken().
                    // The OAuth secret can be retrieved by calling:
                    // ((OAuthCredential)authResult.getCredential()).getSecret().
                    Toast.makeText(this,"Signed in successfully",Toast.LENGTH_LONG).show()
                }
                .addOnFailureListener {
                    Toast.makeText(this,it.message,Toast.LENGTH_LONG).show()
                }
        }





    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TwitterAuthenticationTheme {
        Greeting("Android")
    }
}