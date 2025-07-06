package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorArrangeBelow: ImageVector
    get() {
        if (_VectorArrangeBelow != null) {
            return _VectorArrangeBelow!!
        }
        _VectorArrangeBelow = ImageVector.Builder(
            name = "VectorArrangeBelow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 22f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(9f)
                curveTo(22f, 7.89f, 21.11f, 7f, 20f, 7f)
                curveTo(16.33f, 7f, 12.67f, 7f, 9f, 7f)
                curveTo(7.89f, 7f, 7f, 7.89f, 7f, 9f)
                curveTo(7f, 12.67f, 7f, 16.33f, 7f, 20f)
                curveTo(7f, 21.11f, 7.89f, 22f, 9f, 22f)
                horizontalLineTo(20f)
                moveTo(20f, 20f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                moveTo(5f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                curveTo(16f, 1.89f, 15.11f, 1f, 14f, 1f)
                horizontalLineTo(3f)
                curveTo(1.89f, 1f, 1f, 1.89f, 1f, 3f)
                verticalLineTo(14f)
                curveTo(1f, 15.11f, 1.89f, 16f, 3f, 16f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _VectorArrangeBelow!!
    }

@Suppress("ObjectPropertyName")
private var _VectorArrangeBelow: ImageVector? = null
