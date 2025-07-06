package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RobotVacuumVariantOff: ImageVector
    get() {
        if (_RobotVacuumVariantOff != null) {
            return _RobotVacuumVariantOff!!
        }
        _RobotVacuumVariantOff = ImageVector.Builder(
            name = "RobotVacuumVariantOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 22.7f)
                lineTo(17.3f, 19.2f)
                curveTo(15.8f, 20.3f, 14f, 21f, 12f, 21f)
                curveTo(7f, 21f, 3f, 17f, 3f, 12f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                curveTo(5f, 15.9f, 8.1f, 19f, 12f, 19f)
                curveTo(13.4f, 19f, 14.8f, 18.5f, 15.9f, 17.8f)
                lineTo(14f, 15.9f)
                curveTo(13.5f, 16.5f, 12.8f, 17f, 12f, 17f)
                curveTo(10.6f, 17f, 9.5f, 15.9f, 9.5f, 14.5f)
                curveTo(9.5f, 13.7f, 9.9f, 12.9f, 10.6f, 12.5f)
                lineTo(5f, 6.9f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(4.9f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(19f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(6.2f)
                lineTo(8.2f, 5f)
                horizontalLineTo(19f)
                moveTo(19f, 12f)
                curveTo(19f, 13.1f, 18.7f, 14.1f, 18.3f, 15.1f)
                lineTo(19.8f, 16.6f)
                curveTo(20.6f, 15.3f, 21f, 13.7f, 21f, 12f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                moveTo(16f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(10.2f)
                lineTo(12.2f, 9f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _RobotVacuumVariantOff!!
    }

@Suppress("ObjectPropertyName")
private var _RobotVacuumVariantOff: ImageVector? = null
