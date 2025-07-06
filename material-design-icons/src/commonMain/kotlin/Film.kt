package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Film: ImageVector
    get() {
        if (_Film != null) {
            return _Film!!
        }
        _Film = ImageVector.Builder(
            name = "Film",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.5f, 3f)
                horizontalLineTo(5f)
                verticalLineTo(1.8f)
                curveTo(5f, 1.36f, 5.36f, 1f, 5.8f, 1f)
                horizontalLineTo(10.2f)
                curveTo(10.64f, 1f, 11f, 1.36f, 11f, 1.8f)
                verticalLineTo(3f)
                horizontalLineTo(12.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 4.5f)
                verticalLineTo(5f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(20.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 22f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20.5f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3f)
                moveTo(18f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                moveTo(14f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                moveTo(10f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                moveTo(14f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                moveTo(18f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                moveTo(10f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _Film!!
    }

@Suppress("ObjectPropertyName")
private var _Film: ImageVector? = null
