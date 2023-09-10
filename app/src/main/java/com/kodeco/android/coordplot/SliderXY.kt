package com.kodeco.android.coordplot

import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kodeco.android.coordplot.ui.theme.BlueGrey40
import com.kodeco.android.coordplot.ui.theme.CoordplotTheme
import com.kodeco.android.coordplot.ui.theme.Red40
import com.kodeco.android.coordplot.ui.theme.Teal40

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
            thumbColor = Red40,
            activeTrackColor = Teal40,
            inactiveTrackColor = BlueGrey40,
        )
    )
}

@Preview(showBackground = true)
@Composable
fun SliderXYPreview() {
    CoordplotTheme {
        SliderXY(0.7f, valueChanged = { it })
    }
}
