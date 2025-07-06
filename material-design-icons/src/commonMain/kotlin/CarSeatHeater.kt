package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarSeatHeater: ImageVector
    get() {
        if (_CarSeatHeater != null) {
            return _CarSeatHeater!!
        }
        _CarSeatHeater = ImageVector.Builder(
            name = "CarSeatHeater",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 18f)
                curveTo(5f, 18f, 2f, 10f, 2f, 6f)
                reflectiveCurveTo(4f, 2f, 4f, 2f)
                horizontalLineTo(5f)
                curveTo(5f, 2f, 6f, 2f, 6f, 3f)
                reflectiveCurveTo(5f, 4f, 5f, 6f)
                reflectiveCurveTo(8f, 10f, 8f, 13f)
                reflectiveCurveTo(5f, 18f, 5f, 18f)
                moveTo(15f, 17f)
                curveTo(16.1f, 17f, 17f, 17.9f, 17f, 19f)
                verticalLineTo(20f)
                curveTo(17f, 21.1f, 16.1f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(7f, 22f, 6f, 20.2f, 6f, 20.2f)
                curveTo(5.8f, 20f, 5.7f, 19.6f, 6f, 19.4f)
                curveTo(6f, 19.4f, 9f, 16.9f, 10f, 16.9f)
                horizontalLineTo(15f)
                moveTo(13.7f, 3.4f)
                lineTo(12.3f, 6.8f)
                lineTo(13.7f, 10.2f)
                lineTo(11.7f, 15f)
                lineTo(10f, 13.6f)
                lineTo(11.4f, 10.2f)
                lineTo(10f, 6.8f)
                lineTo(12f, 2f)
                lineTo(13.7f, 3.4f)
                moveTo(17.9f, 3.4f)
                lineTo(16.5f, 6.8f)
                lineTo(17.9f, 10.2f)
                lineTo(15.9f, 15f)
                lineTo(14.2f, 13.6f)
                lineTo(15.6f, 10.2f)
                lineTo(14.2f, 6.8f)
                lineTo(16.2f, 2f)
                lineTo(17.9f, 3.4f)
                moveTo(22f, 3.4f)
                lineTo(20.6f, 6.8f)
                lineTo(22f, 10.2f)
                lineTo(20f, 15f)
                lineTo(18.3f, 13.6f)
                lineTo(19.7f, 10.2f)
                lineTo(18.3f, 6.8f)
                lineTo(20.3f, 2f)
                lineTo(22f, 3.4f)
            }
        }.build()

        return _CarSeatHeater!!
    }

@Suppress("ObjectPropertyName")
private var _CarSeatHeater: ImageVector? = null
