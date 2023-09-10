package com.kodeco.android.coordplot

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kodeco.android.coordplot.ui.theme.CoordplotTheme

@Composable
fun MapSlider(
    titleRes: Int,
    percentage: Float = 0.5f,
    onPercentageChange: (Float) -> Unit
) {
    var currentPercentage by remember { mutableStateOf(percentage) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .padding(16.dp, 0.dp, 16.dp, 0.dp)
    ) {
        Text(
            text = "${stringResource(id = titleRes)} ${(currentPercentage * 100).toInt()} % ",
            modifier = Modifier
                .width(120.dp)
                .padding(start = 8.dp)
        )

        SliderXY(
            value = currentPercentage,
            valueChanged = {
                currentPercentage = it
                onPercentageChange(it)
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MapSliderPreview() {
    CoordplotTheme {
        MapSlider(R.string.x_axis_text, 0.7f, onPercentageChange = { it })
    }
}