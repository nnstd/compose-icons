package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MotorbikeOff: ImageVector
    get() {
        if (_MotorbikeOff != null) {
            return _MotorbikeOff!!
        }
        _MotorbikeOff = ImageVector.Builder(
            name = "MotorbikeOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(8.1f, 10f)
                horizontalLineTo(6.5f)
                curveTo(4f, 10f, 2f, 12f, 2f, 14.5f)
                reflectiveCurveTo(4f, 19f, 6.5f, 19f)
                curveTo(8.7f, 19f, 10.6f, 17.4f, 10.9f, 15.3f)
                lineTo(12.4f, 14.4f)
                lineTo(13f, 15f)
                curveTo(13.2f, 17.1f, 14.9f, 18.8f, 17f, 19f)
                lineTo(20.8f, 22.8f)
                lineTo(22.1f, 21.5f)
                moveTo(8.8f, 15.3f)
                curveTo(8.5f, 16.3f, 7.5f, 17f, 6.4f, 17f)
                curveTo(5.1f, 17f, 4f, 15.9f, 4f, 14.5f)
                reflectiveCurveTo(5.1f, 12f, 6.5f, 12f)
                curveTo(7.6f, 12f, 8.5f, 12.7f, 8.9f, 13.8f)
                horizontalLineTo(6f)
                verticalLineTo(15.3f)
                horizontalLineTo(8.8f)
                moveTo(11.2f, 8f)
                lineTo(9.2f, 6f)
                horizontalLineTo(13.4f)
                lineTo(17.4f, 10f)
                horizontalLineTo(17.5f)
                curveTo(20f, 10f, 22f, 12f, 22f, 14.5f)
                curveTo(22f, 15.7f, 21.5f, 16.8f, 20.8f, 17.6f)
                lineTo(19.4f, 16.2f)
                curveTo(19.8f, 15.8f, 20f, 15.2f, 20f, 14.6f)
                curveTo(20f, 13.2f, 18.9f, 12.1f, 17.5f, 12.1f)
                curveTo(16.9f, 12.1f, 16.3f, 12.3f, 15.9f, 12.7f)
                lineTo(13.2f, 10f)
                horizontalLineTo(14.6f)
                lineTo(12.6f, 8f)
                horizontalLineTo(11.2f)
                close()
            }
        }.build()

        return _MotorbikeOff!!
    }

@Suppress("ObjectPropertyName")
private var _MotorbikeOff: ImageVector? = null
