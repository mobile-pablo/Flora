package com.mobile_pablo.uicomponents.config.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

data class ProjectColor(
    val color_60 : Color = Color(0xFF38A739),
    val color_30 : Color = Color(0xFF73C174),
    val color_10 : Color = Color(0xFFAFDBAF),
    val main : Color = Color(0xFFFFFFFF),
    val secondary : Color = Color(0xFF1C2019),
)

val LocalProjectColor = compositionLocalOf { ProjectColor() }

val MaterialTheme.projectColor: ProjectColor
    @Composable
    @ReadOnlyComposable
    get() = LocalProjectColor.current