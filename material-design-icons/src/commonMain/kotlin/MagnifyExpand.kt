package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MagnifyExpand: ImageVector
    get() {
        if (_MagnifyExpand != null) {
            return _MagnifyExpand!!
        }
        _MagnifyExpand = ImageVector.Builder(
            name = "MagnifyExpand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 16f)
                horizontalLineTo(17.42f)
                lineTo(16.61f, 15.19f)
                curveTo(17.5f, 14f, 18f, 12.5f, 18f, 11f)
                curveTo(18f, 7.13f, 14.87f, 4f, 11f, 4f)
                curveTo(9.5f, 4f, 8f, 4.5f, 6.79f, 5.4f)
                curveTo(3.7f, 7.72f, 3.07f, 12.11f, 5.39f, 15.2f)
                curveTo(7.71f, 18.29f, 12.1f, 18.92f, 15.19f, 16.6f)
                lineTo(16f, 17.41f)
                verticalLineTo(18f)
                lineTo(21f, 23f)
                lineTo(23f, 21f)
                lineTo(18f, 16f)
                moveTo(11f, 16f)
                curveTo(8.24f, 16f, 6f, 13.76f, 6f, 11f)
                reflectiveCurveTo(8.24f, 6f, 11f, 6f)
                reflectiveCurveTo(16f, 8.24f, 16f, 11f)
                reflectiveCurveTo(13.76f, 16f, 11f, 16f)
                moveTo(3f, 6f)
                lineTo(1f, 8f)
                verticalLineTo(1f)
                horizontalLineTo(8f)
                lineTo(6f, 3f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                moveTo(21f, 1f)
                verticalLineTo(8f)
                lineTo(19f, 6f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                lineTo(14f, 1f)
                horizontalLineTo(21f)
                moveTo(6f, 19f)
                lineTo(8f, 21f)
                horizontalLineTo(1f)
                verticalLineTo(14f)
                lineTo(3f, 16f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _MagnifyExpand!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyExpand: ImageVector? = null
