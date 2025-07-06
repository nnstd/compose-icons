package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DrawingBox: ImageVector
    get() {
        if (_DrawingBox != null) {
            return _DrawingBox!!
        }
        _DrawingBox = ImageVector.Builder(
            name = "DrawingBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 18f)
                horizontalLineTo(12f)
                verticalLineTo(12.21f)
                curveTo(11.34f, 12.82f, 10.47f, 13.2f, 9.5f, 13.2f)
                curveTo(7.46f, 13.2f, 5.8f, 11.54f, 5.8f, 9.5f)
                arcTo(3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 5.8f)
                curveTo(11.54f, 5.8f, 13.2f, 7.46f, 13.2f, 9.5f)
                curveTo(13.2f, 10.47f, 12.82f, 11.34f, 12.21f, 12f)
                horizontalLineTo(18f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                close()
            }
        }.build()

        return _DrawingBox!!
    }

@Suppress("ObjectPropertyName")
private var _DrawingBox: ImageVector? = null
