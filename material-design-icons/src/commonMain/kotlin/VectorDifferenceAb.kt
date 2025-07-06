package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorDifferenceAb: ImageVector
    get() {
        if (_VectorDifferenceAb != null) {
            return _VectorDifferenceAb!!
        }
        _VectorDifferenceAb = ImageVector.Builder(
            name = "VectorDifferenceAb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 1f)
                curveTo(1.89f, 1f, 1f, 1.89f, 1f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineTo(1f)
                horizontalLineTo(3f)
                moveTo(7f, 1f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(1f)
                horizontalLineTo(7f)
                moveTo(12f, 1f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                curveTo(16f, 1.89f, 15.11f, 1f, 14f, 1f)
                horizontalLineTo(12f)
                moveTo(1f, 7f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(1f)
                moveTo(14f, 7f)
                curveTo(14f, 7f, 14f, 11.67f, 14f, 14f)
                curveTo(11.67f, 14f, 7f, 14f, 7f, 14f)
                curveTo(7f, 14f, 7f, 18f, 7f, 20f)
                curveTo(7f, 21.11f, 7.89f, 22f, 9f, 22f)
                horizontalLineTo(20f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(9f)
                curveTo(22f, 7.89f, 21.11f, 7f, 20f, 7f)
                curveTo(18f, 7f, 14f, 7f, 14f, 7f)
                moveTo(16f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                curveTo(15.11f, 16f, 16f, 15.11f, 16f, 14f)
                verticalLineTo(9f)
                moveTo(1f, 12f)
                verticalLineTo(14f)
                curveTo(1f, 15.11f, 1.89f, 16f, 3f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(1f)
                close()
            }
        }.build()

        return _VectorDifferenceAb!!
    }

@Suppress("ObjectPropertyName")
private var _VectorDifferenceAb: ImageVector? = null
