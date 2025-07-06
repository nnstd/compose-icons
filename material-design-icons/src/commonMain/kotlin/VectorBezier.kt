package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorBezier: ImageVector
    get() {
        if (_VectorBezier != null) {
            return _VectorBezier!!
        }
        _VectorBezier = ImageVector.Builder(
            name = "VectorBezier",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 4f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 7f)
                curveTo(8.13f, 7f, 8.7f, 6.6f, 8.91f, 6f)
                horizontalLineTo(13f)
                curveTo(13.67f, 5.33f, 14.33f, 5f, 15f, 5f)
                horizontalLineTo(8.91f)
                curveTo(8.7f, 4.4f, 8.13f, 4f, 7.5f, 4f)
                moveTo(19f, 5f)
                curveTo(8f, 5f, 14f, 17f, 5f, 17f)
                verticalLineTo(19f)
                curveTo(16f, 19f, 10f, 7f, 19f, 7f)
                verticalLineTo(5f)
                moveTo(16.5f, 17f)
                curveTo(15.87f, 17f, 15.3f, 17.4f, 15.09f, 18f)
                horizontalLineTo(11f)
                curveTo(10.33f, 18.67f, 9.67f, 19f, 9f, 19f)
                horizontalLineTo(15.09f)
                curveTo(15.3f, 19.6f, 15.87f, 20f, 16.5f, 20f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 17f)
                close()
            }
        }.build()

        return _VectorBezier!!
    }

@Suppress("ObjectPropertyName")
private var _VectorBezier: ImageVector? = null
