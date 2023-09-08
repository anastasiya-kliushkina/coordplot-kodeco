package com.kodeco.android.coordplot

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kodeco.android.coordplot.ui.theme.MyApplicationTheme

@Composable
fun Map(xPercent: Float, yPercent: Float, modifier: Modifier = Modifier) {
    Box(
        modifier
            .size(300.dp)
            .background(Color.Blue)
    ) {
        Image(
            painter = painterResource(id = R.drawable.star_icon),
            contentDescription = "Star point",
            modifier
                .size(36.dp)
                .offset((xPercent * 300 - 18).dp, (yPercent * 300 - 18).dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MapPreview() {
    MyApplicationTheme {
        Map(xPercent = 0.4f, yPercent = 0.8f)
    }
}