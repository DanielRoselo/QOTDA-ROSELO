package com.example.QOTDA.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.example.diceroller.ui.theme.Pink40
import com.example.diceroller.ui.theme.Pink80
import com.example.diceroller.ui.theme.Purple80
import com.example.diceroller.ui.theme.PurpleGrey80
import androidx.compose.material3.Typography

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = Pink40
)

private val LightColorScheme = lightColorScheme(
    primary = PurpleGrey80,
    secondary = Pink80
)

@Composable
fun QOTDATHEME(content: @Composable () -> Unit) {
    MaterialTheme(
        typography = Typography(),
        content = content
    )
}
