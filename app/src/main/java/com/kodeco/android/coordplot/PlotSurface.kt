package com.kodeco.android.coordplot

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kodeco.android.coordplot.ui.theme.MyApplicationTheme

@Composable
fun PlotSurface() {
    var xPercentage: Float by remember { mutableStateOf(0.5f) }
    var yPercentage: Float by remember { mutableStateOf(0.5f) }

    // TODO Build out the plot surface
    //  This should include a Column composable that
    //  includes a Map, and two MapSlider composables
    //  (one slider for each axis).
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Map(xPercent = xPercentage, yPercent = yPercentage)
        Spacer(modifier = Modifier.height(20.dp))
        SliderX(
            value = xPercentage,
            valueChanged = { value ->
                xPercentage = value
            }
        )
        Spacer(modifier = Modifier.height(20.dp))
        SliderY(
            value = yPercentage,
            valueChanged = { value ->
                yPercentage = value
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PlotSurfacePreview() {
    MyApplicationTheme {
        PlotSurface()
    }
}

@Composable
fun SliderX(
    value: Float = 0.5f,
    valueChanged: (Float) -> Unit
) {
    Box(
        modifier = Modifier
    ) {
        Slider(
            value = value,
            valueRange = 0f..1f,
            onValueChange = valueChanged
        )
    }
}

@Composable
fun SliderY(
    value: Float = 0.5f,
    valueChanged: (Float) -> Unit
) {
    Box(
        modifier = Modifier
    ) {
        Slider(
            value = value,
            valueRange = 0f..1f,
            onValueChange = valueChanged
        )
    }
}

