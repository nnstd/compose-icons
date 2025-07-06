package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorCombine: ImageVector
    get() {
        if (_VectorCombine != null) {
            return _VectorCombine!!
        }
        _VectorCombine = ImageVector.Builder(
            name = "VectorCombine",
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
                curveTo(4.33f, 16f, 7f, 16f, 7f, 16f)
                curveTo(7f, 16f, 7f, 18.67f, 7f, 20f)
                curveTo(7f, 21.11f, 7.89f, 22f, 9f, 22f)
                horizontalLineTo(20f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(9f)
                curveTo(22f, 7.89f, 21.11f, 7f, 20f, 7f)
                curveTo(18.67f, 7f, 16f, 7f, 16f, 7f)
                curveTo(16f, 7f, 16f, 4.33f, 16f, 3f)
                curveTo(16f, 1.89f, 15.11f, 1f, 14f, 1f)
                horizontalLineTo(3f)
                moveTo(3f, 3f)
                horizontalLineTo(14f)
                curveTo(14f, 4.33f, 14f, 7f, 14f, 7f)
                horizontalLineTo(9f)
                curveTo(7.89f, 7f, 7f, 7.89f, 7f, 9f)
                verticalLineTo(14f)
                curveTo(7f, 14f, 4.33f, 14f, 3f, 14f)
                verticalLineTo(3f)
                moveTo(9f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                moveTo(16f, 9f)
                curveTo(16f, 9f, 18.67f, 9f, 20f, 9f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                curveTo(9f, 18.67f, 9f, 16f, 9f, 16f)
                horizontalLineTo(14f)
                curveTo(15.11f, 16f, 16f, 15.11f, 16f, 14f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _VectorCombine!!
    }

@Suppress("ObjectPropertyName")
private var _VectorCombine: ImageVector? = null
