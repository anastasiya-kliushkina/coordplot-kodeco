package com.kodeco.android.coordplot.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kodeco.android.coordplot.R
import com.kodeco.android.coordplot.ui.components.Map
import com.kodeco.android.coordplot.ui.components.MapSlider
import com.kodeco.android.coordplot.ui.theme.CoordplotTheme

@Composable
fun PlotSurfaceScreen(onNextClick: () -> Unit) {
    var xPercentage: Float by remember { mutableStateOf(0.5f) }
    var yPercentage: Float by remember { mutableStateOf(0.5f) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Map(xPercentage, yPercentage)
        Spacer(modifier = Modifier.height(20.dp))

        MapSlider(
            titleRes = R.string.x_axis_text,
            percentage = xPercentage,
            onPercentageChange = { newPercentage ->
                xPercentage = newPercentage
            }
        )
        MapSlider(
            titleRes = R.string.y_axis_text,
            percentage = yPercentage,
            onPercentageChange = { newPercentage ->
                yPercentage = newPercentage
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PlotSurfacePreview() {
    CoordplotTheme {
        PlotSurfaceScreen(onNextClick = {})
    }
}

