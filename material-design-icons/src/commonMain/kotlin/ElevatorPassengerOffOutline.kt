package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ElevatorPassengerOffOutline: ImageVector
    get() {
        if (_ElevatorPassengerOffOutline != null) {
            return _ElevatorPassengerOffOutline!!
        }
        _ElevatorPassengerOffOutline = ImageVector.Builder(
            name = "ElevatorPassengerOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
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
                moveTo(5f, 19f)
                verticalLineTo(6.89f)
                lineTo(7.65f, 9.54f)
                curveTo(6.71f, 9.71f, 6f, 10.5f, 6f, 11.5f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(12.89f)
                lineTo(17.11f, 19f)
                horizontalLineTo(5f)
                moveTo(8.2f, 5f)
                lineTo(6.2f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(17.8f)
                lineTo(19f, 15.8f)
                verticalLineTo(5f)
                horizontalLineTo(8.2f)
                moveTo(18f, 11f)
                horizontalLineTo(14.2f)
                lineTo(13.46f, 10.26f)
                lineTo(15.5f, 7f)
                lineTo(18f, 11f)
                moveTo(17.31f, 14.11f)
                lineTo(16.2f, 13f)
                horizontalLineTo(18f)
                lineTo(17.31f, 14.11f)
                close()
            }
        }.build()

        return _ElevatorPassengerOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ElevatorPassengerOffOutline: ImageVector? = null
