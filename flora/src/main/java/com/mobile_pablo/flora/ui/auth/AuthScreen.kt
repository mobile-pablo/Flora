package com.mobile_pablo.flora.ui.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mobile_pablo.uicomponents.theme.projectColor

@Preview
@Composable
fun AuthScreen() {
    Box(
        modifier = Modifier
            .background(MaterialTheme.projectColor.color_60)
            .fillMaxSize()
    ) {
        Column {
            AuthHeaderSection()
        }
    }
}