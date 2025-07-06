package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ElevatorPassengerOff: ImageVector
    get() {
        if (_ElevatorPassengerOff != null) {
            return _ElevatorPassengerOff!!
        }
        _ElevatorPassengerOff = ImageVector.Builder(
            name = "ElevatorPassengerOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(20.7f, 20.05f)
                lineTo(20.7f, 20.04f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(3f, 4.9f)
                curveTo(3f, 4.94f, 3f, 4.97f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(19.03f, 21f, 19.06f, 21f, 19.1f, 21f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(11f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(11.5f)
                curveTo(6f, 10.5f, 6.71f, 9.71f, 7.65f, 9.54f)
                lineTo(11f, 12.89f)
                verticalLineTo(14f)
                moveTo(13.46f, 10.26f)
                lineTo(6.2f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(17.8f)
                lineTo(17.31f, 14.11f)
                lineTo(18f, 13f)
                horizontalLineTo(16.2f)
                lineTo(14.2f, 11f)
                horizontalLineTo(18f)
                lineTo(15.5f, 7f)
                lineTo(13.46f, 10.26f)
                close()
            }
        }.build()

        return _ElevatorPassengerOff!!
    }

@Suppress("ObjectPropertyName")
private var _ElevatorPassengerOff: ImageVector? = null
