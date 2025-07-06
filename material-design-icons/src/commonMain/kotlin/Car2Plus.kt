package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Car2Plus: ImageVector
    get() {
        if (_Car2Plus != null) {
            return _Car2Plus!!
        }
        _Car2Plus = ImageVector.Builder(
            name = "Car2Plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 16f)
                curveTo(8f, 13.6f, 9.1f, 11.5f, 10.7f, 10f)
                horizontalLineTo(3f)
                lineTo(4.5f, 5.5f)
                horizontalLineTo(15.5f)
                lineTo(16.3f, 8f)
                curveTo(16.9f, 8f, 17.5f, 8.1f, 18f, 8.3f)
                lineTo(16.9f, 5f)
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
                moveTo(4.5f, 15f)
                curveTo(3.7f, 15f, 3f, 14.3f, 3f, 13.5f)
                reflectiveCurveTo(3.7f, 12f, 4.5f, 12f)
                reflectiveCurveTo(6f, 12.7f, 6f, 13.5f)
                reflectiveCurveTo(5.3f, 15f, 4.5f, 15f)
                moveTo(16f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                curveTo(15.1f, 17f, 16f, 16.1f, 16f, 15f)
                verticalLineTo(14f)
                curveTo(16f, 12.9f, 15.1f, 12f, 14f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                curveTo(11.9f, 15f, 11f, 15.9f, 11f, 17f)
                verticalLineTo(20f)
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
                close()
            }
        }.build()

        return _Car2Plus!!
    }

@Suppress("ObjectPropertyName")
private var _Car2Plus: ImageVector? = null
