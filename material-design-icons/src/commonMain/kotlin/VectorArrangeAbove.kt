package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorArrangeAbove: ImageVector
    get() {
        if (_VectorArrangeAbove != null) {
            return _VectorArrangeAbove!!
        }
        _VectorArrangeAbove = ImageVector.Builder(
            name = "VectorArrangeAbove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 1f)
                curveTo(1.89f, 1f, 1f, 1.89f, 1f, 3f)
                verticalLineTo(14f)
                curveTo(1f, 15.11f, 1.89f, 16f, 3f, 16f)
                curveTo(6.67f, 16f, 10.33f, 16f, 14f, 16f)
                curveTo(15.11f, 16f, 16f, 15.11f, 16f, 14f)
                curveTo(16f, 10.33f, 16f, 6.67f, 16f, 3f)
                curveTo(16f, 1.89f, 15.11f, 1f, 14f, 1f)
                horizontalLineTo(3f)
                moveTo(3f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(18f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                curveTo(7f, 21.11f, 7.89f, 22f, 9f, 22f)
                horizontalLineTo(20f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(9f)
                curveTo(22f, 7.89f, 21.11f, 7f, 20f, 7f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _VectorArrangeAbove!!
    }

@Suppress("ObjectPropertyName")
private var _VectorArrangeAbove: ImageVector? = null
