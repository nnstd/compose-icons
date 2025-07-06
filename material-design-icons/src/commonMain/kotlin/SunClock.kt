package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SunClock: ImageVector
    get() {
        if (_SunClock != null) {
            return _SunClock!!
        }
        _SunClock = ImageVector.Builder(
            name = "SunClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.1f, 9.3f)
                lineTo(19.6f, 6f)
                lineTo(15.5f, 5.6f)
                curveTo(16.1f, 6.1f, 16.6f, 6.7f, 17f, 7.5f)
                curveTo(17.3f, 8.1f, 17.5f, 8.6f, 17.7f, 9.2f)
                curveTo(17.2f, 9.1f, 16.6f, 9f, 16f, 9f)
                horizontalLineTo(15.6f)
                curveTo(14.8f, 7.2f, 13.1f, 6f, 11f, 6f)
                curveTo(8.2f, 6f, 6f, 8.2f, 6f, 11f)
                curveTo(6f, 13.1f, 7.2f, 14.8f, 9f, 15.6f)
                verticalLineTo(16f)
                curveTo(9f, 19.9f, 12.1f, 23f, 16f, 23f)
                reflectiveCurveTo(23f, 19.9f, 23f, 16f)
                curveTo(23f, 12.9f, 20.9f, 10.2f, 18.1f, 9.3f)
                moveTo(16f, 21f)
                curveTo(13.2f, 21f, 11f, 18.8f, 11f, 16f)
                reflectiveCurveTo(13.2f, 11f, 16f, 11f)
                reflectiveCurveTo(21f, 13.2f, 21f, 16f)
                reflectiveCurveTo(18.8f, 21f, 16f, 21f)
                moveTo(16.5f, 16.2f)
                lineTo(19.4f, 17.9f)
                lineTo(18.6f, 19.1f)
                lineTo(15f, 17f)
                verticalLineTo(12f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.2f)
                moveTo(11f, 4f)
                curveTo(10.2f, 4f, 9.4f, 4.2f, 8.6f, 4.4f)
                lineTo(11f, 1f)
                lineTo(13.4f, 4.4f)
                curveTo(12.6f, 4.2f, 11.8f, 4f, 11f, 4f)
                moveTo(4.9f, 14.5f)
                curveTo(5.3f, 15.2f, 5.9f, 15.9f, 6.5f, 16.4f)
                lineTo(2.4f, 16f)
                lineTo(4.2f, 12.2f)
                curveTo(4.3f, 13f, 4.5f, 13.8f, 4.9f, 14.5f)
                moveTo(4.1f, 9.8f)
                lineTo(2.3f, 6f)
                lineTo(6.5f, 5.7f)
                curveTo(5.9f, 6.2f, 5.4f, 6.8f, 4.9f, 7.5f)
                curveTo(4.5f, 8.2f, 4.2f, 9f, 4.1f, 9.8f)
                close()
            }
        }.build()

        return _SunClock!!
    }

@Suppress("ObjectPropertyName")
private var _SunClock: ImageVector? = null
