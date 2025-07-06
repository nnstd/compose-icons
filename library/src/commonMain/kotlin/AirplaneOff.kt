package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirplaneOff: ImageVector
    get() {
        if (_AirplaneOff != null) {
            return _AirplaneOff!!
        }
        _AirplaneOff = ImageVector.Builder(
            name = "AirplaneOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(18f, 19.9f)
                lineTo(17.38f, 20.53f)
                lineTo(16f, 17.89f)
                lineTo(12.35f, 14.24f)
                lineTo(9.6f, 17f)
                lineTo(9.96f, 19.47f)
                lineTo(8.89f, 20.53f)
                lineTo(7.13f, 17.35f)
                lineTo(3.94f, 15.58f)
                lineTo(5f, 14.5f)
                lineTo(7.5f, 14.87f)
                lineTo(10.23f, 12.12f)
                lineTo(6.59f, 8.5f)
                lineTo(3.94f, 7.09f)
                lineTo(4.57f, 6.46f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(16.67f, 9.92f)
                lineTo(20.56f, 6.03f)
                curveTo(21.15f, 5.45f, 21.15f, 4.5f, 20.56f, 3.91f)
                reflectiveCurveTo(19f, 3.33f, 18.44f, 3.91f)
                lineTo(14.55f, 7.8f)
                lineTo(9.94f, 6.74f)
                lineTo(17.74f, 14.54f)
                lineTo(16.67f, 9.92f)
                close()
            }
        }.build()

        return _AirplaneOff!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneOff: ImageVector? = null
