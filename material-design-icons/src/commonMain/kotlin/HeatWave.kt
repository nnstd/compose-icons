package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeatWave: ImageVector
    get() {
        if (_HeatWave != null) {
            return _HeatWave!!
        }
        _HeatWave = ImageVector.Builder(
            name = "HeatWave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 4.5f)
                lineTo(5.4f, 9.5f)
                lineTo(8.5f, 14.7f)
                lineTo(5.2f, 20.5f)
                lineTo(3.4f, 19.6f)
                lineTo(6.1f, 14.7f)
                lineTo(3f, 9.5f)
                lineTo(6.7f, 3.6f)
                lineTo(8.5f, 4.5f)
                moveTo(14.7f, 4.4f)
                lineTo(11.6f, 9.5f)
                lineTo(14.7f, 14.5f)
                lineTo(11.4f, 20.3f)
                lineTo(9.6f, 19.4f)
                lineTo(12.3f, 14.5f)
                lineTo(9.2f, 9.5f)
                lineTo(12.9f, 3.5f)
                lineTo(14.7f, 4.4f)
                moveTo(21f, 4.4f)
                lineTo(17.9f, 9.5f)
                lineTo(21f, 14.5f)
                lineTo(17.7f, 20.3f)
                lineTo(15.9f, 19.4f)
                lineTo(18.6f, 14.5f)
                lineTo(15.5f, 9.5f)
                lineTo(19.2f, 3.5f)
                lineTo(21f, 4.4f)
            }
        }.build()

        return _HeatWave!!
    }

@Suppress("ObjectPropertyName")
private var _HeatWave: ImageVector? = null
