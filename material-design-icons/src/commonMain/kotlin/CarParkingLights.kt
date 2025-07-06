package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarParkingLights: ImageVector
    get() {
        if (_CarParkingLights != null) {
            return _CarParkingLights!!
        }
        _CarParkingLights = ImageVector.Builder(
            name = "CarParkingLights",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.3f, 9.2f)
                curveTo(8.1f, 9.6f, 9f, 10.5f, 9f, 12f)
                curveTo(9f, 13.5f, 8.1f, 14.4f, 7.3f, 14.8f)
                curveTo(6.9f, 13.4f, 6.9f, 10.6f, 7.3f, 9.2f)
                moveTo(6.5f, 7f)
                curveTo(4.5f, 7f, 4.5f, 17f, 6.5f, 17f)
                curveTo(8.5f, 17f, 11f, 15.1f, 11f, 12f)
                curveTo(11f, 8.9f, 8.5f, 7f, 6.5f, 7f)
                moveTo(16.7f, 9.2f)
                curveTo(17f, 10.6f, 17f, 13.4f, 16.7f, 14.8f)
                curveTo(15.9f, 14.4f, 15f, 13.5f, 15f, 12f)
                curveTo(15f, 10.5f, 15.9f, 9.6f, 16.7f, 9.2f)
                moveTo(17.5f, 7f)
                curveTo(15.5f, 7f, 13f, 8.9f, 13f, 12f)
                curveTo(13f, 15.1f, 15.5f, 17f, 17.5f, 17f)
                curveTo(19.5f, 17f, 19.5f, 7f, 17.5f, 7f)
                moveTo(4.9f, 6.2f)
                lineTo(2.5f, 4.6f)
                lineTo(1.4f, 6.3f)
                lineTo(4f, 8f)
                curveTo(4.2f, 7.3f, 4.5f, 6.6f, 4.9f, 6.2f)
                moveTo(20f, 8f)
                lineTo(22.6f, 6.3f)
                lineTo(21.5f, 4.6f)
                lineTo(19.1f, 6.2f)
                curveTo(19.4f, 6.6f, 19.8f, 7.2f, 20f, 8f)
                moveTo(4f, 16f)
                lineTo(1.4f, 17.7f)
                lineTo(2.5f, 19.4f)
                lineTo(4.9f, 17.8f)
                curveTo(4.6f, 17.4f, 4.2f, 16.8f, 4f, 16f)
                moveTo(20.5f, 11f)
                curveTo(20.5f, 11.3f, 20.5f, 11.7f, 20.5f, 12f)
                curveTo(20.5f, 12.3f, 20.5f, 12.6f, 20.5f, 13f)
                horizontalLineTo(24f)
                verticalLineTo(11f)
                horizontalLineTo(20.5f)
                moveTo(19.1f, 17.8f)
                lineTo(21.5f, 19.4f)
                lineTo(22.6f, 17.7f)
                lineTo(20f, 16f)
                curveTo(19.8f, 16.7f, 19.5f, 17.4f, 19.1f, 17.8f)
                moveTo(3.5f, 12f)
                curveTo(3.5f, 11.7f, 3.5f, 11.4f, 3.5f, 11f)
                horizontalLineTo(0f)
                verticalLineTo(13f)
                horizontalLineTo(3.5f)
                curveTo(3.5f, 12.7f, 3.5f, 12.3f, 3.5f, 12f)
                close()
            }
        }.build()

        return _CarParkingLights!!
    }

@Suppress("ObjectPropertyName")
private var _CarParkingLights: ImageVector? = null
