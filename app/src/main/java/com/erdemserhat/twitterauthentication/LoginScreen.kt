package com.erdemserhat.twitterauthentication

import android.content.res.Resources
import android.content.res.Resources.Theme
import android.graphics.fonts.FontFamily
import android.webkit.JavascriptInterface
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.erdemserhat.twitterauthentication.snippets.text.inter
import com.erdemserhat.twitterauthentication.snippets.text.jockey
import com.erdemserhat.twitterauthentication.ui.theme.LoginBackgroundColor
import com.erdemserhat.twitterauthentication.ui.theme.Purple40
import com.erdemserhat.twitterauthentication.ui.theme.TitleColor
import com.erdemserhat.twitterauthentication.ui.theme.TwitterAuthenticationTheme

@Composable
fun LoginScreen() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = LoginBackgroundColor
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            TitleSection()
            GreetingImageAndText()
            LoginRegisterButtons()


            
        }


    }


}


@Preview
@Composable
fun LoginScreenPreview() {
    TwitterAuthenticationTheme {
        MaterialTheme {
            LoginScreen()
        }
    }
}

@Composable
fun TitleSection() {

    Row(
        modifier = Modifier
            .padding(all = 40.dp)
            .fillMaxWidth(),
        Arrangement.SpaceBetween,
        Alignment.Top

    ) {


        Text(
            modifier = Modifier,
            text = stringResource(id = R.string.login_title),
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontFamily = jockey,
            color = TitleColor,

            )


        Image(
            painter = painterResource(id = R.drawable.pepicons_pop_menu),
            contentDescription = null,
            Modifier.size(height = 40.dp, width = 40.dp)


        )
    }

}

@Composable
fun GreetingImageAndText() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .size(420 .dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Image(
            painter = painterResource(id = R.drawable.reshot_illustration_website_development_5qs97cjh2a_9f9a1_1),
            contentDescription = null,
            Modifier.size(270.dp)

        )

        Text(
            text = stringResource(id = R.string.login_sub_title),
            fontFamily = jockey,
            color = TitleColor,
            fontSize =MaterialTheme.typography.headlineLarge.fontSize
        )

        Text(
            text = stringResource(id = R.string.login_description),
            fontFamily = inter,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            color= TitleColor,
            modifier = Modifier
                .size(width = 340.dp, height = 60.dp)

        )


    }
}

@Composable
fun LoginRegisterButtons() {
    Button(
        onClick = { /*TODO*/ },




    ) {
        Text(text = "dadasd")
    }
    
}