package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FoodForkDrink: ImageVector
    get() {
        if (_FoodForkDrink != null) {
            return _FoodForkDrink!!
        }
        _FoodForkDrink = ImageVector.Builder(
            name = "FoodForkDrink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(8f)
                lineTo(2f, 9.5f)
                curveTo(2f, 11.19f, 3.03f, 12.63f, 4.5f, 13.22f)
                verticalLineTo(19.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 21f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 19.5f)
                verticalLineTo(13.22f)
                curveTo(8.97f, 12.63f, 10f, 11.19f, 10f, 9.5f)
                verticalLineTo(8f)
                lineTo(10f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4f)
                verticalLineTo(8f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 8.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 8f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 4f)
                verticalLineTo(8f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 8.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 8f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                moveTo(19.88f, 3f)
                curveTo(19.75f, 3f, 19.62f, 3.09f, 19.5f, 3.16f)
                lineTo(16f, 5.25f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                lineTo(14f, 21f)
                horizontalLineTo(20f)
                lineTo(21f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(6.34f)
                lineTo(20.5f, 4.84f)
                curveTo(21f, 4.56f, 21.13f, 4f, 20.84f, 3.5f)
                curveTo(20.63f, 3.14f, 20.26f, 2.95f, 19.88f, 3f)
                close()
            }
        }.build()

        return _FoodForkDrink!!
    }

@Suppress("ObjectPropertyName")
private var _FoodForkDrink: ImageVector? = null
