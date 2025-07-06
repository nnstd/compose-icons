package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarKey: ImageVector
    get() {
        if (_CarKey != null) {
            return _CarKey!!
        }
        _CarKey = ImageVector.Builder(
            name = "CarKey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 0f)
                curveTo(7.3f, 0f, 6f, 1.3f, 6f, 3f)
                reflectiveCurveTo(7.3f, 6f, 9f, 6f)
                curveTo(10.3f, 6f, 11.4f, 5.2f, 11.8f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                horizontalLineTo(11.8f)
                curveTo(11.4f, 0.8f, 10.3f, 0f, 9f, 0f)
                moveTo(9f, 2f)
                curveTo(9.6f, 2f, 10f, 2.4f, 10f, 3f)
                reflectiveCurveTo(9.6f, 4f, 9f, 4f)
                reflectiveCurveTo(8f, 3.6f, 8f, 3f)
                reflectiveCurveTo(8.4f, 2f, 9f, 2f)
                moveTo(6.5f, 8f)
                curveTo(5.8f, 8f, 5.3f, 8.4f, 5.1f, 9f)
                lineTo(3f, 15f)
                verticalLineTo(23f)
                curveTo(3f, 23.6f, 3.4f, 24f, 4f, 24f)
                horizontalLineTo(5f)
                curveTo(5.6f, 24f, 6f, 23.6f, 6f, 23f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                curveTo(18f, 23.6f, 18.4f, 24f, 19f, 24f)
                horizontalLineTo(20f)
                curveTo(20.6f, 24f, 21f, 23.6f, 21f, 23f)
                verticalLineTo(15f)
                lineTo(18.9f, 9f)
                curveTo(18.7f, 8.4f, 18.1f, 8f, 17.5f, 8f)
                horizontalLineTo(6.5f)
                moveTo(6.5f, 9.5f)
                horizontalLineTo(17.5f)
                lineTo(19f, 14f)
                horizontalLineTo(5f)
                lineTo(6.5f, 9.5f)
                moveTo(6.5f, 16f)
                curveTo(7.3f, 16f, 8f, 16.7f, 8f, 17.5f)
                reflectiveCurveTo(7.3f, 19f, 6.5f, 19f)
                reflectiveCurveTo(5f, 18.3f, 5f, 17.5f)
                reflectiveCurveTo(5.7f, 16f, 6.5f, 16f)
                moveTo(17.5f, 16f)
                curveTo(18.3f, 16f, 19f, 16.7f, 19f, 17.5f)
                reflectiveCurveTo(18.3f, 19f, 17.5f, 19f)
                reflectiveCurveTo(16f, 18.3f, 16f, 17.5f)
                reflectiveCurveTo(16.7f, 16f, 17.5f, 16f)
                close()
            }
        }.build()

        return _CarKey!!
    }

@Suppress("ObjectPropertyName")
private var _CarKey: ImageVector? = null
