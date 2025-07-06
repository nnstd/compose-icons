package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ElevatorPassengerOutline: ImageVector
    get() {
        if (_ElevatorPassengerOutline != null) {
            return _ElevatorPassengerOutline!!
        }
        _ElevatorPassengerOutline = ImageVector.Builder(
            name = "ElevatorPassengerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(10f, 18f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(11.5f)
                curveTo(11f, 10.4f, 10.1f, 9.5f, 9f, 9.5f)
                horizontalLineTo(8f)
                curveTo(6.9f, 9.5f, 6f, 10.4f, 6f, 11.5f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                moveTo(8.5f, 8.5f)
                curveTo(9.19f, 8.5f, 9.75f, 7.94f, 9.75f, 7.25f)
                reflectiveCurveTo(9.19f, 6f, 8.5f, 6f)
                reflectiveCurveTo(7.25f, 6.56f, 7.25f, 7.25f)
                reflectiveCurveTo(7.81f, 8.5f, 8.5f, 8.5f)
                moveTo(18f, 11f)
                lineTo(15.5f, 7f)
                lineTo(13f, 11f)
                horizontalLineTo(18f)
                moveTo(13f, 13f)
                lineTo(15.5f, 17f)
                lineTo(18f, 13f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _ElevatorPassengerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ElevatorPassengerOutline: ImageVector? = null
