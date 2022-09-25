package com.mobile_pablo.uicomponents.theme

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
    val colors = if (darkTheme) {
        ProjectColor(
            color_60 = Color(0xFFFF8C00),
            color_30 = Color(0xFFFFAE4C),
            color_10 = Color(0xFFFFD199),
        )
    } else {
        ProjectColor(
            color_60 = Color(0xFF38A739),
            color_30 = Color(0xFF73C174),
            color_10 = Color(0xFFAFDBAF),
        )
    }

    CompositionLocalProvider(
        LocalSpacing provides Spacing(),
        LocalProjectColor provides colors,
        LocalFontSize provides FontSize()
    ) {
        MaterialTheme(
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}