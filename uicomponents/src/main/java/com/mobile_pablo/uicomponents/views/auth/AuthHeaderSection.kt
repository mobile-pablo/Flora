package com.mobile_pablo.uicomponents.views.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun AuthHeaderSection(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(MaterialTheme.colors.primary)
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = "Welcome to Flora",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
            Text(
                text = "Sell houseplants in Your local community",
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp
            )
        }
    }
}