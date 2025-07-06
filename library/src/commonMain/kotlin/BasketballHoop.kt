package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BasketballHoop: ImageVector
    get() {
        if (_BasketballHoop != null) {
            return _BasketballHoop!!
        }
        _BasketballHoop = ImageVector.Builder(
            name = "BasketballHoop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 16f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 2f)
                moveTo(17f, 12f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 7f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 9f)
                verticalLineTo(12f)
                moveTo(7f, 16f)
                verticalLineTo(19.5f)
                lineTo(8f, 23f)
                lineTo(10f, 21f)
                lineTo(12f, 23f)
                lineTo(14f, 21f)
                lineTo(16f, 23f)
                lineTo(17f, 19.5f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _BasketballHoop!!
    }

@Suppress("ObjectPropertyName")
private var _BasketballHoop: ImageVector? = null
