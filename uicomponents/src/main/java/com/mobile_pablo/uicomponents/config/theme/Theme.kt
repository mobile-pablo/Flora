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
            Color_60 = Color(0xFF38A739),
            Color_30 = Color(0xFF73C174),
            Color_10 = Color(0xFFAFDBAF),
            Paragraph = Color(0xFF323B2F),
            H1 = Color(0xFF232920),
            H2 = Color(0xFF1f241c),
            H3 = Color(0xFF1c2019),
            H4 = Color(0xFF181c16),
            H5 = Color(0xFF151813),
        )
    } else {
        ProjectColor(
            Color_60 = Color(0xFFFF8C00),
            Color_30 = Color(0xFFFFAE4C),
            Color_10 = Color(0xFFFFD199),
            Paragraph = Color(0xFF323B2F),
            H1 = Color(0xFF232920),
            H2 = Color(0xFF1f241c),
            H3 = Color(0xFF1c2019),
            H4 = Color(0xFF181c16),
            H5 = Color(0xFF151813),
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