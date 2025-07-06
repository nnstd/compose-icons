package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RobotIndustrialOutline: ImageVector
    get() {
        if (_RobotIndustrialOutline != null) {
            return _RobotIndustrialOutline!!
        }
        _RobotIndustrialOutline = ImageVector.Builder(
            name = "RobotIndustrialOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 19f)
                horizontalLineTo(8.6f)
                lineTo(2.62f, 8.64f)
                curveTo(2.23f, 8f, 2f, 7.29f, 2f, 6.5f)
                curveTo(2f, 4.29f, 3.79f, 2.5f, 6f, 2.5f)
                curveTo(7.86f, 2.5f, 9.43f, 3.78f, 9.87f, 5.5f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                curveTo(14f, 1.9f, 14.9f, 1f, 16f, 1f)
                verticalLineTo(3.59f)
                lineTo(17.59f, 2f)
                horizontalLineTo(22f)
                verticalLineTo(4f)
                horizontalLineTo(18.41f)
                lineTo(16f, 6.41f)
                verticalLineTo(6.59f)
                lineTo(18.41f, 9f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(17.59f)
                lineTo(16f, 9.41f)
                verticalLineTo(12f)
                curveTo(14.9f, 12f, 14f, 11.11f, 14f, 10f)
                verticalLineTo(7.5f)
                horizontalLineTo(9.87f)
                curveTo(9.77f, 7.89f, 9.61f, 8.26f, 9.41f, 8.6f)
                lineTo(15.41f, 19f)
                horizontalLineTo(20f)
                curveTo(21.11f, 19f, 22f, 19.9f, 22f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                curveTo(2f, 19.9f, 2.9f, 19f, 4f, 19f)
                moveTo(7.91f, 10f)
                curveTo(7.35f, 10.32f, 6.7f, 10.5f, 6f, 10.5f)
                lineTo(10.91f, 19f)
                horizontalLineTo(13.1f)
                lineTo(7.91f, 10f)
                moveTo(6f, 4.5f)
                curveTo(4.89f, 4.5f, 4f, 5.4f, 4f, 6.5f)
                curveTo(4f, 7.61f, 4.89f, 8.5f, 6f, 8.5f)
                curveTo(7.11f, 8.5f, 8f, 7.61f, 8f, 6.5f)
                curveTo(8f, 5.4f, 7.11f, 4.5f, 6f, 4.5f)
                close()
            }
        }.build()

        return _RobotIndustrialOutline!!
    }

@Suppress("ObjectPropertyName")
private var _RobotIndustrialOutline: ImageVector? = null
