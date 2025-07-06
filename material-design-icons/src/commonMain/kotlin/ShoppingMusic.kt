package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShoppingMusic: ImageVector
    get() {
        if (_ShoppingMusic != null) {
            return _ShoppingMusic!!
        }
        _ShoppingMusic = ImageVector.Builder(
            name = "ShoppingMusic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 6f)
                horizontalLineTo(15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                moveTo(19f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 8f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 22f)
                horizontalLineTo(5f)
                curveTo(3.89f, 22f, 3f, 21.1f, 3f, 20f)
                verticalLineTo(8f)
                curveTo(3f, 6.89f, 3.89f, 6f, 5f, 6f)
                horizontalLineTo(7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 6f)
                horizontalLineTo(19f)
                moveTo(9f, 19f)
                lineTo(16.5f, 14f)
                lineTo(9f, 10f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _ShoppingMusic!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingMusic: ImageVector? = null
