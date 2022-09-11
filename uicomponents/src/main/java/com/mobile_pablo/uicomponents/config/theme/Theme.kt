package com.mobile_pablo.uicomponents.config.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color

@Composable
fun FloraTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    // TODO : Add colors
    val colors = if (darkTheme) {
        ProjectColor(
            Color_10 = Color(0xFFBB86FC)
        )
    } else {
        ProjectColor(
            Color_10 = Color(0xFFBB86FC)
        )
    }

    CompositionLocalProvider(
        LocalSpacing provides Spacing(),
        LocalProjectColor provides colors
    ) {
        MaterialTheme(
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}