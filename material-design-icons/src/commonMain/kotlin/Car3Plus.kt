package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Car3Plus: ImageVector
    get() {
        if (_Car3Plus != null) {
            return _Car3Plus!!
        }
        _Car3Plus = ImageVector.Builder(
            name = "Car3Plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.9f, 5f)
                curveTo(16.7f, 4.4f, 16.1f, 4f, 15.5f, 4f)
                horizontalLineTo(4.5f)
                curveTo(3.8f, 4f, 3.3f, 4.4f, 3.1f, 5f)
                lineTo(1f, 11f)
                verticalLineTo(19f)
                curveTo(1f, 19.5f, 1.5f, 20f, 2f, 20f)
                horizontalLineTo(3f)
                curveTo(3.5f, 20f, 4f, 19.5f, 4f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(8.3f)
                curveTo(8.1f, 17.4f, 8f, 16.7f, 8f, 16f)
                curveTo(8f, 13.6f, 9.1f, 11.5f, 10.7f, 10f)
                horizontalLineTo(3f)
                lineTo(4.5f, 5.5f)
                horizontalLineTo(15.5f)
                lineTo(16.3f, 8f)
                curveTo(16.9f, 8f, 17.5f, 8.1f, 18f, 8.3f)
                lineTo(16.9f, 5f)
                moveTo(4.5f, 12f)
                curveTo(5.3f, 12f, 6f, 12.7f, 6f, 13.5f)
                reflectiveCurveTo(5.3f, 15f, 4.5f, 15f)
                reflectiveCurveTo(3f, 14.3f, 3f, 13.5f)
                reflectiveCurveTo(3.7f, 12f, 4.5f, 12f)
                moveTo(23f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                moveTo(14.5f, 16f)
                curveTo(15.3f, 16f, 16f, 14.8f, 16f, 14f)
                curveTo(16f, 12.9f, 15.1f, 12f, 14f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                curveTo(15.1f, 20f, 16f, 19.1f, 16f, 18f)
                curveTo(16f, 17.2f, 15.3f, 16f, 14.5f, 16f)
                close()
            }
        }.build()

        return _Car3Plus!!
    }

@Suppress("ObjectPropertyName")
private var _Car3Plus: ImageVector? = null
