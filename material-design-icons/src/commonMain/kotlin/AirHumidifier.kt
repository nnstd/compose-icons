package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirHumidifier: ImageVector
    get() {
        if (_AirHumidifier != null) {
            return _AirHumidifier!!
        }
        _AirHumidifier = ImageVector.Builder(
            name = "AirHumidifier",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 9f)
                curveTo(8.79f, 9f, 7f, 10.79f, 7f, 13f)
                reflectiveCurveTo(8.79f, 17f, 11f, 17f)
                reflectiveCurveTo(15f, 15.21f, 15f, 13f)
                reflectiveCurveTo(13.21f, 9f, 11f, 9f)
                moveTo(11f, 15f)
                curveTo(9.9f, 15f, 9f, 14.11f, 9f, 13f)
                reflectiveCurveTo(9.9f, 11f, 11f, 11f)
                reflectiveCurveTo(13f, 11.9f, 13f, 13f)
                reflectiveCurveTo(12.11f, 15f, 11f, 15f)
                moveTo(7f, 4f)
                horizontalLineTo(14f)
                curveTo(16.21f, 4f, 18f, 5.79f, 18f, 8f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                curveTo(16f, 6.9f, 15.11f, 6f, 14f, 6f)
                horizontalLineTo(7f)
                curveTo(5.9f, 6f, 5f, 6.9f, 5f, 8f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                curveTo(3f, 5.79f, 4.79f, 4f, 7f, 4f)
                moveTo(19f, 10.5f)
                curveTo(19f, 10.5f, 21f, 12.67f, 21f, 14f)
                curveTo(21f, 15.1f, 20.1f, 16f, 19f, 16f)
                reflectiveCurveTo(17f, 15.1f, 17f, 14f)
                curveTo(17f, 12.67f, 19f, 10.5f, 19f, 10.5f)
            }
        }.build()

        return _AirHumidifier!!
    }

@Suppress("ObjectPropertyName")
private var _AirHumidifier: ImageVector? = null
