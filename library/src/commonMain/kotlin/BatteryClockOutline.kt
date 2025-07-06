package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryClockOutline: ImageVector
    get() {
        if (_BatteryClockOutline != null) {
            return _BatteryClockOutline!!
        }
        _BatteryClockOutline = ImageVector.Builder(
            name = "BatteryClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 9.29f)
                verticalLineTo(5.33f)
                curveTo(18f, 4.6f, 17.4f, 4f, 16.67f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(7.33f)
                curveTo(6.6f, 4f, 6f, 4.6f, 6f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(6f, 21.4f, 6.6f, 22f, 7.33f, 22f)
                horizontalLineTo(12.41f)
                curveTo(13.46f, 22.63f, 14.69f, 23f, 16f, 23f)
                curveTo(19.87f, 23f, 23f, 19.87f, 23f, 16f)
                curveTo(23f, 12.83f, 20.89f, 10.15f, 18f, 9.29f)
                moveTo(8f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                curveTo(12.13f, 9f, 9f, 12.13f, 9f, 16f)
                curveTo(9f, 17.5f, 9.47f, 18.87f, 10.26f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                moveTo(16f, 21f)
                curveTo(13.24f, 21f, 11f, 18.76f, 11f, 16f)
                reflectiveCurveTo(13.24f, 11f, 16f, 11f)
                reflectiveCurveTo(21f, 13.24f, 21f, 16f)
                reflectiveCurveTo(18.76f, 21f, 16f, 21f)
                moveTo(16.5f, 16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15f, 17f)
                verticalLineTo(12f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                close()
            }
        }.build()

        return _BatteryClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryClockOutline: ImageVector? = null
