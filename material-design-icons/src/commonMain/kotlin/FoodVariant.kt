package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FoodVariant: ImageVector
    get() {
        if (_FoodVariant != null) {
            return _FoodVariant!!
        }
        _FoodVariant = ImageVector.Builder(
            name = "FoodVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(17.79f)
                lineTo(20.55f, 11.23f)
                lineTo(22.11f, 12.13f)
                lineTo(19.87f, 16f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                moveTo(9f, 22f)
                horizontalLineTo(2f)
                curveTo(2f, 19f, 2f, 16f, 2.33f, 12.83f)
                curveTo(2.6f, 10.3f, 3.08f, 7.66f, 3.6f, 5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                lineTo(7f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(7.4f)
                curveTo(7.92f, 7.66f, 8.4f, 10.3f, 8.67f, 12.83f)
                curveTo(9f, 16f, 9f, 19f, 9f, 22f)
                close()
            }
        }.build()

        return _FoodVariant!!
    }

@Suppress("ObjectPropertyName")
private var _FoodVariant: ImageVector? = null
