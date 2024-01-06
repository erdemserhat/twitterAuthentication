package com.erdemserhat.twitterauthentication.ui.welcome

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.erdemserhat.twitterauthentication.R
import com.erdemserhat.twitterauthentication.snippets.text.inter
import com.erdemserhat.twitterauthentication.snippets.text.interExtraBold
import com.erdemserhat.twitterauthentication.snippets.text.jockey
import com.erdemserhat.twitterauthentication.ui.theme.ButtonColor
import com.erdemserhat.twitterauthentication.ui.theme.LoginBackgroundColor
import com.erdemserhat.twitterauthentication.ui.theme.TitleColor
import com.erdemserhat.twitterauthentication.ui.theme.TwitterAuthenticationTheme

@Composable
fun LoginScreen(welcomeScreenViewModel: WelcomeScreenViewModel = viewModel()) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = LoginBackgroundColor
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            TitleSection()
            GreetingImageAndText()
            LoginRegisterButtons(
                onLoginClicked = {welcomeScreenViewModel.login()},
                onSignUpClicked = {welcomeScreenViewModel.signUp()}
                )


            
        }


    }


}


@Preview
@Composable
fun LoginScreenPreview() {
    TwitterAuthenticationTheme {
        MaterialTheme {
            //LoginScreen({})
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

@OptIn(ExperimentalFoundationApi::class)
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
                .basicMarquee()

        )


    }
}

@Composable
fun LoginRegisterButtons(
    onLoginClicked:()->Unit,
    onSignUpClicked:()->Unit

) {
    Button(
        onClick = onLoginClicked,
        shape = RoundedCornerShape(30.dp),
        colors = ButtonDefaults.outlinedButtonColors(containerColor = ButtonColor),
        modifier = Modifier
            .size(height = 45.dp, width = 300.dp)




    ) {
        Text(
            text = stringResource(id = R.string.login_text),
            fontFamily = interExtraBold,
            fontWeight = FontWeight.W900,
            color=Color.Black,


        )
    }

    Spacer(modifier = Modifier.size(20.dp))


    Button(
        onClick = onSignUpClicked,
        shape = RoundedCornerShape(30.dp),
        colors = ButtonDefaults.outlinedButtonColors(containerColor = ButtonColor),
        modifier = Modifier
            .size(height = 45.dp, width = 300.dp)




    ) {
        Text(
            text = stringResource(id = R.string.register_text),
            fontFamily = interExtraBold,
            fontWeight = FontWeight.W900,
            color=Color.Black

        )
    }
    
}