package com.mobile_pablo.uicomponents.config.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

data class ProjectColor(
    val Color_60 : Color = Color(0xFF38A739),
    val Color_30 : Color = Color(0xFF73C174),
    val Color_10 : Color = Color(0xFFAFDBAF),
    val Main : Color = Color(0xFFFFFFFF),
    val Secondary : Color = Color(0xFF1C2019),
)

val LocalProjectColor = compositionLocalOf { ProjectColor() }

val projectColor: ProjectColor
    @Composable
    @ReadOnlyComposable
    get() = LocalProjectColor.current