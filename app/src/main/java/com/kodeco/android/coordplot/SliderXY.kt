package com.kodeco.android.coordplot

import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.kodeco.android.coordplot.ui.theme.MyApplicationTheme

@Composable
fun SliderXY(
    value: Float = 0.5f,
    valueChanged: (Float) -> Unit
) {
    Slider(
        value = value,
        valueRange = 0f..1f,
        onValueChange = valueChanged,
        colors = SliderDefaults.colors(
            thumbColor = Color.Red,
            activeTrackColor = Color.Blue,
            inactiveTrackColor = Color.Gray,
        )
    )
}

@Preview(showBackground = true)
@Composable
fun SliderXYPreview() {
    MyApplicationTheme {
        SliderXY(0.7f, valueChanged = { it })
    }
}
