package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirplaneClock: ImageVector
    get() {
        if (_AirplaneClock != null) {
            return _AirplaneClock!!
        }
        _AirplaneClock = ImageVector.Builder(
            name = "AirplaneClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9f)
                curveTo(15.09f, 9f, 14.23f, 9.18f, 13.43f, 9.5f)
                lineTo(12.73f, 6.45f)
                lineTo(16.62f, 2.56f)
                curveTo(17.2f, 2f, 17.2f, 1.03f, 16.62f, 0.44f)
                reflectiveCurveTo(15.08f, -0.146f, 14.5f, 0.44f)
                lineTo(10.61f, 4.33f)
                lineTo(1.41f, 2.21f)
                lineTo(0f, 3.62f)
                lineTo(7.43f, 7.5f)
                lineTo(3.54f, 11.4f)
                lineTo(1.06f, 11.05f)
                lineTo(0f, 12.11f)
                lineTo(3.18f, 13.87f)
                lineTo(4.95f, 17.06f)
                lineTo(6f, 16f)
                lineTo(5.66f, 13.5f)
                lineTo(9.55f, 9.63f)
                lineTo(10.57f, 11.59f)
                curveTo(9.59f, 12.79f, 9f, 14.33f, 9f, 16f)
                curveTo(9f, 19.87f, 12.13f, 23f, 16f, 23f)
                reflectiveCurveTo(23f, 19.87f, 23f, 16f)
                reflectiveCurveTo(19.87f, 9f, 16f, 9f)
                moveTo(16f, 21f)
                curveTo(13.24f, 21f, 11f, 18.76f, 11f, 16f)
                reflectiveCurveTo(13.24f, 11f, 16f, 11f)
                reflectiveCurveTo(21f, 13.24f, 21f, 16f)
                reflectiveCurveTo(18.76f, 21f, 16f, 21f)
                moveTo(16.5f, 16.25f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                lineTo(18.61f, 19.16f)
                lineTo(19.36f, 17.94f)
                lineTo(16.5f, 16.25f)
                close()
            }
        }.build()

        return _AirplaneClock!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneClock: ImageVector? = null
