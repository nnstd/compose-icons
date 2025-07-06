package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirHumidifierOff: ImageVector
    get() {
        if (_AirHumidifierOff != null) {
            return _AirHumidifierOff!!
        }
        _AirHumidifierOff = ImageVector.Builder(
            name = "AirHumidifierOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(3.8f, 5.7f)
                curveTo(3.3f, 6.3f, 3f, 7.1f, 3f, 8f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(19.9f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(9.6f, 11.5f)
                lineTo(12.4f, 14.3f)
                curveTo(12.1f, 14.7f, 11.6f, 15f, 11f, 15f)
                curveTo(9.9f, 15f, 9f, 14.1f, 9f, 13f)
                curveTo(9f, 12.4f, 9.3f, 11.9f, 9.6f, 11.5f)
                moveTo(16f, 17.9f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                curveTo(5f, 7.7f, 5.1f, 7.4f, 5.2f, 7.1f)
                lineTo(8.2f, 10.1f)
                curveTo(7.5f, 10.8f, 7f, 11.9f, 7f, 13f)
                curveTo(7f, 15.2f, 8.8f, 17f, 11f, 17f)
                curveTo(12.1f, 17f, 13.2f, 16.5f, 13.9f, 15.8f)
                lineTo(16f, 17.9f)
                moveTo(17f, 13.8f)
                curveTo(17.1f, 12.5f, 19f, 10.5f, 19f, 10.5f)
                reflectiveCurveTo(21f, 12.7f, 21f, 14f)
                curveTo(21f, 15f, 20.2f, 15.9f, 19.2f, 16f)
                lineTo(17f, 13.8f)
                moveTo(9.2f, 6f)
                lineTo(7.2f, 4f)
                horizontalLineTo(14f)
                curveTo(16.2f, 4f, 18f, 5.8f, 18f, 8f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                curveTo(16f, 6.9f, 15.1f, 6f, 14f, 6f)
                horizontalLineTo(9.2f)
                close()
            }
        }.build()

        return _AirHumidifierOff!!
    }

@Suppress("ObjectPropertyName")
private var _AirHumidifierOff: ImageVector? = null
