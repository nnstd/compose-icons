package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChefHat: ImageVector
    get() {
        if (_ChefHat != null) {
            return _ChefHat!!
        }
        _ChefHat = ImageVector.Builder(
            name = "ChefHat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 1.5f)
                curveTo(10.73f, 1.5f, 9.17f, 2.67f, 8.67f, 4.37f)
                curveTo(8.14f, 4.13f, 7.58f, 4f, 7f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 8f)
                curveTo(3f, 9.82f, 4.24f, 11.41f, 6f, 11.87f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(11.87f)
                curveTo(20.76f, 11.41f, 22f, 9.82f, 22f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 4f)
                curveTo(17.42f, 4f, 16.86f, 4.13f, 16.33f, 4.37f)
                curveTo(15.83f, 2.67f, 14.27f, 1.5f, 12.5f, 1.5f)
                moveTo(12f, 10.5f)
                horizontalLineTo(13f)
                verticalLineTo(17.5f)
                horizontalLineTo(12f)
                verticalLineTo(10.5f)
                moveTo(9f, 12.5f)
                horizontalLineTo(10f)
                verticalLineTo(17.5f)
                horizontalLineTo(9f)
                verticalLineTo(12.5f)
                moveTo(15f, 12.5f)
                horizontalLineTo(16f)
                verticalLineTo(17.5f)
                horizontalLineTo(15f)
                verticalLineTo(12.5f)
                moveTo(6f, 20f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 22f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _ChefHat!!
    }

@Suppress("ObjectPropertyName")
private var _ChefHat: ImageVector? = null
