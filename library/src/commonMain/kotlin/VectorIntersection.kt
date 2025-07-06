package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorIntersection: ImageVector
    get() {
        if (_VectorIntersection != null) {
            return _VectorIntersection!!
        }
        _VectorIntersection = ImageVector.Builder(
            name = "VectorIntersection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.14f, 1f)
                arcTo(2.14f, 2.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 3.14f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineTo(1f)
                horizontalLineTo(3.14f)
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
                verticalLineTo(3.14f)
                curveTo(16f, 1.96f, 15.04f, 1f, 13.86f, 1f)
                horizontalLineTo(12f)
                moveTo(1f, 7f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(1f)
                moveTo(9f, 7f)
                curveTo(7.89f, 7f, 7f, 7.89f, 7f, 9f)
                curveTo(7f, 11.33f, 7f, 16f, 7f, 16f)
                curveTo(7f, 16f, 11.57f, 16f, 13.86f, 16f)
                arcTo(2.14f, 2.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 13.86f)
                curveTo(16f, 11.57f, 16f, 7f, 16f, 7f)
                curveTo(16f, 7f, 11.33f, 7f, 9f, 7f)
                moveTo(18f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                curveTo(22f, 7.89f, 21.11f, 7f, 20f, 7f)
                horizontalLineTo(18f)
                moveTo(9f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                moveTo(1f, 12f)
                verticalLineTo(13.86f)
                curveTo(1f, 15.04f, 1.96f, 16f, 3.14f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(1f)
                moveTo(20f, 13f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                moveTo(7f, 18f)
                verticalLineTo(20f)
                curveTo(7f, 21.11f, 7.89f, 22f, 9f, 22f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                moveTo(20f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                moveTo(13f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _VectorIntersection!!
    }

@Suppress("ObjectPropertyName")
private var _VectorIntersection: ImageVector? = null
