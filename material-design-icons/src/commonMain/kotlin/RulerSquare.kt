package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RulerSquare: ImageVector
    get() {
        if (_RulerSquare != null) {
            return _RulerSquare!!
        }
        _RulerSquare = ImageVector.Builder(
            name = "RulerSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(19.5f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(16.5f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(13.5f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(10.5f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(10.5f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(13.5f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(16.5f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(19.5f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                moveTo(6f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 7f)
                close()
            }
        }.build()

        return _RulerSquare!!
    }

@Suppress("ObjectPropertyName")
private var _RulerSquare: ImageVector? = null
