package com.mobile_pablo.uicomponents.views.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import com.mobile_pablo.uicomponents.theme.spacing

@Composable
fun IconRoundTextField(
    modifier: Modifier = Modifier,
    iconResource: Painter,
    hint: String
) {
    var textValue by remember { mutableStateOf("") }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(
                MaterialTheme.spacing.spacing_24
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Icon(
            painter = iconResource,
            contentDescription = hint,
            modifier = Modifier
                .fillMaxHeight()
                .aspectRatio(
                    1f,
                    matchHeightConstraintsFirst = true
                )
        )
        BasicTextField(
            value = textValue,
            onValueChange = { textValue = it },
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize()
        )
    }
}