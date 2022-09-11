package com.mobile_pablo.uicomponents.config.theme

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

data class ProjectColor(
    val Color_60 : Color = Color(0xFFFFFFFF),
    val Color_30 : Color = Color(0xFFFFFFFF),
    val Color_10 : Color = Color(0xFFFFFFFF),
    val Paragraph : Color = Color(0xFFFFFFFF),
    val H4 : Color = Color(0xFFFFFFFF),
    val H3 : Color = Color(0xFFFFFFFF),
    val H2 : Color = Color(0xFFFFFFFF),
    val H1 : Color = Color(0xFFFFFFFF),
)

val LocalProjectColor = compositionLocalOf { ProjectColor() }