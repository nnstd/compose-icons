package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ElevatorPassenger: ImageVector
    get() {
        if (_ElevatorPassenger != null) {
            return _ElevatorPassenger!!
        }
        _ElevatorPassenger = ImageVector.Builder(
            name = "ElevatorPassenger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(8.5f, 6f)
                curveTo(9.19f, 6f, 9.75f, 6.56f, 9.75f, 7.25f)
                reflectiveCurveTo(9.19f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveTo(7.25f, 7.94f, 7.25f, 7.25f)
                reflectiveCurveTo(7.81f, 6f, 8.5f, 6f)
                moveTo(11f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(11.5f)
                curveTo(6f, 10.4f, 6.9f, 9.5f, 8f, 9.5f)
                horizontalLineTo(9f)
                curveTo(10.1f, 9.5f, 11f, 10.4f, 11f, 11.5f)
                verticalLineTo(14f)
                moveTo(15.5f, 17f)
                lineTo(13f, 13f)
                horizontalLineTo(18f)
                lineTo(15.5f, 17f)
                moveTo(13f, 11f)
                lineTo(15.5f, 7f)
                lineTo(18f, 11f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _ElevatorPassenger!!
    }

@Suppress("ObjectPropertyName")
private var _ElevatorPassenger: ImageVector? = null
