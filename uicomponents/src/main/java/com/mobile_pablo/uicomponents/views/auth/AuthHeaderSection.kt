package com.mobile_pablo.uicomponents.views.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mobile_pablo.uicomponents.R
import com.mobile_pablo.uicomponents.config.theme.fontSize
import com.mobile_pablo.uicomponents.config.theme.projectColor

@Preview
@Composable
fun AuthHeaderSection(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(MaterialTheme.projectColor.color_60)
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = stringResource(R.string.authTitle),
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.fontSize.font_20
            )
            Text(
                text = stringResource(R.string.authDescription),
                fontWeight = FontWeight.Medium,
                fontSize = MaterialTheme.fontSize.font_12
            )
        }
    }
}