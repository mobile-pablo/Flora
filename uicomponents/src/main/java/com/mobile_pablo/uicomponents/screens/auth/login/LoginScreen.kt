package com.mobile_pablo.uicomponents.screens.auth.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mobile_pablo.uicomponents.R
import com.mobile_pablo.uicomponents.theme.fontSize
import com.mobile_pablo.uicomponents.theme.spacing
import com.mobile_pablo.uicomponents.views.common.IconRoundTextField

@Preview
@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_background),
            contentDescription = "Sign up",
            modifier = Modifier
                .fillMaxWidth()
                .padding(MaterialTheme.spacing.spacing_12)
                .aspectRatio(
                    1f,
                    matchHeightConstraintsFirst = true
                )
        )
        Text(
            text = "Login",
            fontWeight = FontWeight.Bold,
            fontSize = MaterialTheme.fontSize.font_34
        )
        Spacer(modifier = Modifier.height(4.dp))
        IconRoundTextField(
            iconResource = painterResource(id = R.drawable.ic_background),
            hint = "Hello world",
            modifier = Modifier.padding(
                horizontal = MaterialTheme.spacing.spacing_8
            )
        )
    }
}