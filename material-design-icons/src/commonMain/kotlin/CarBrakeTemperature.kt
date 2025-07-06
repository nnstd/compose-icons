package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarBrakeTemperature: ImageVector
    get() {
        if (_CarBrakeTemperature != null) {
            return _CarBrakeTemperature!!
        }
        _CarBrakeTemperature = ImageVector.Builder(
            name = "CarBrakeTemperature",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                curveTo(12f, 6.4f, 11.6f, 6f, 11f, 6f)
                reflectiveCurveTo(10f, 6.4f, 10f, 7f)
                verticalLineTo(17.3f)
                curveTo(9.4f, 17.6f, 9f, 18.3f, 9f, 19f)
                curveTo(9f, 20.1f, 9.9f, 21f, 11f, 21f)
                reflectiveCurveTo(13f, 20.1f, 13f, 19f)
                curveTo(13f, 18.3f, 12.6f, 17.6f, 12f, 17.3f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                moveTo(24f, 12f)
                curveTo(24f, 15.31f, 22.66f, 18.31f, 20.5f, 20.5f)
                lineTo(19.42f, 19.42f)
                curveTo(21.32f, 17.5f, 22.5f, 14.9f, 22.5f, 12f)
                curveTo(22.5f, 9.11f, 21.32f, 6.5f, 19.42f, 4.58f)
                lineTo(20.5f, 3.5f)
                curveTo(22.66f, 5.69f, 24f, 8.69f, 24f, 12f)
                moveTo(1.5f, 12f)
                curveTo(1.5f, 14.9f, 2.68f, 17.5f, 4.58f, 19.42f)
                lineTo(3.5f, 20.5f)
                curveTo(1.34f, 18.31f, 0f, 15.31f, 0f, 12f)
                reflectiveCurveTo(1.34f, 5.69f, 3.5f, 3.5f)
                lineTo(4.58f, 4.58f)
                curveTo(2.68f, 6.5f, 1.5f, 9.11f, 1.5f, 12f)
                moveTo(21f, 12f)
                curveTo(21f, 15.53f, 18.96f, 18.58f, 16f, 20.05f)
                verticalLineTo(17.74f)
                curveTo(17.81f, 16.47f, 19f, 14.37f, 19f, 12f)
                curveTo(19f, 8.14f, 15.86f, 5f, 12f, 5f)
                reflectiveCurveTo(5f, 8.14f, 5f, 12f)
                curveTo(5f, 14.37f, 6.19f, 16.47f, 8f, 17.74f)
                verticalLineTo(20.05f)
                curveTo(5.04f, 18.58f, 3f, 15.53f, 3f, 12f)
                curveTo(3f, 7.03f, 7.03f, 3f, 12f, 3f)
                reflectiveCurveTo(21f, 7.03f, 21f, 12f)
                close()
            }
        }.build()

        return _CarBrakeTemperature!!
    }

@Suppress("ObjectPropertyName")
private var _CarBrakeTemperature: ImageVector? = null
