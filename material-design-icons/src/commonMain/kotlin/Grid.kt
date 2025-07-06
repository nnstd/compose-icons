package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Grid: ImageVector
    get() {
        if (_Grid != null) {
            return _Grid!!
        }
        _Grid = ImageVector.Builder(
            name = "Grid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                moveTo(16f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                moveTo(16f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                moveTo(16f, 16f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                moveTo(14f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                moveTo(8f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                moveTo(8f, 14f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                moveTo(8f, 8f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                moveTo(10f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                moveTo(4f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(4f)
                curveTo(2.92f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                close()
            }
        }.build()

        return _Grid!!
    }

@Suppress("ObjectPropertyName")
private var _Grid: ImageVector? = null
