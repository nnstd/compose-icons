package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ElevatorUp: ImageVector
    get() {
        if (_ElevatorUp != null) {
            return _ElevatorUp!!
        }
        _ElevatorUp = ImageVector.Builder(
            name = "ElevatorUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                lineTo(11f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                lineTo(7f, 2f)
                moveTo(17f, 2f)
                lineTo(13f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                lineTo(17f, 2f)
                moveTo(7f, 12f)
                horizontalLineTo(17f)
                curveTo(18.11f, 12f, 19f, 12.9f, 19f, 14f)
                verticalLineTo(20f)
                curveTo(19f, 21.11f, 18.11f, 22f, 17f, 22f)
                horizontalLineTo(7f)
                curveTo(5.9f, 22f, 5f, 21.11f, 5f, 20f)
                verticalLineTo(14f)
                curveTo(5f, 12.9f, 5.9f, 12f, 7f, 12f)
                moveTo(7f, 14f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _ElevatorUp!!
    }

@Suppress("ObjectPropertyName")
private var _ElevatorUp: ImageVector? = null
