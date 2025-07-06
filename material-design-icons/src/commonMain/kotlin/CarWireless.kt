package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarWireless: ImageVector
    get() {
        if (_CarWireless != null) {
            return _CarWireless!!
        }
        _CarWireless = ImageVector.Builder(
            name = "CarWireless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                curveTo(10.9f, 5f, 10f, 5.9f, 10f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(6.5f)
                curveTo(5.84f, 8f, 5.28f, 8.42f, 5.08f, 9f)
                lineTo(3f, 15f)
                verticalLineTo(23f)
                curveTo(3f, 23.55f, 3.45f, 24f, 4f, 24f)
                horizontalLineTo(5f)
                curveTo(5.55f, 24f, 6f, 23.55f, 6f, 23f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                curveTo(18f, 23.55f, 18.45f, 24f, 19f, 24f)
                horizontalLineTo(20f)
                curveTo(20.55f, 24f, 21f, 23.55f, 21f, 23f)
                verticalLineTo(15f)
                lineTo(18.92f, 9f)
                curveTo(18.72f, 8.42f, 18.16f, 8f, 17.5f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                curveTo(14f, 5.9f, 13.11f, 5f, 12f, 5f)
                moveTo(6.5f, 9.5f)
                horizontalLineTo(17.5f)
                lineTo(19f, 14f)
                horizontalLineTo(5f)
                lineTo(6.5f, 9.5f)
                moveTo(6.5f, 16f)
                curveTo(7.33f, 16f, 8f, 16.67f, 8f, 17.5f)
                reflectiveCurveTo(7.33f, 19f, 6.5f, 19f)
                reflectiveCurveTo(5f, 18.33f, 5f, 17.5f)
                reflectiveCurveTo(5.67f, 16f, 6.5f, 16f)
                moveTo(17.5f, 16f)
                curveTo(18.33f, 16f, 19f, 16.67f, 19f, 17.5f)
                reflectiveCurveTo(18.33f, 19f, 17.5f, 19f)
                reflectiveCurveTo(16f, 18.33f, 16f, 17.5f)
                reflectiveCurveTo(16.67f, 16f, 17.5f, 16f)
                moveTo(16.2f, 3.4f)
                curveTo(15f, 2.3f, 13.5f, 1.7f, 12f, 1.7f)
                reflectiveCurveTo(9f, 2.3f, 7.8f, 3.4f)
                lineTo(7f, 2.6f)
                curveTo(8.4f, 1.2f, 10.2f, 0.5f, 12f, 0.5f)
                reflectiveCurveTo(15.6f, 1.2f, 17f, 2.6f)
                lineTo(16.2f, 3.4f)
                moveTo(15.3f, 4.2f)
                lineTo(14.5f, 5f)
                curveTo(13.8f, 4.3f, 12.9f, 4f, 12f, 4f)
                reflectiveCurveTo(10.2f, 4.3f, 9.5f, 5f)
                lineTo(8.7f, 4.2f)
                curveTo(9.6f, 3.3f, 10.8f, 2.8f, 12f, 2.8f)
                reflectiveCurveTo(14.4f, 3.3f, 15.3f, 4.2f)
            }
        }.build()

        return _CarWireless!!
    }

@Suppress("ObjectPropertyName")
private var _CarWireless: ImageVector? = null
