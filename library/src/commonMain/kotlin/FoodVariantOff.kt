package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FoodVariantOff: ImageVector
    get() {
        if (_FoodVariantOff != null) {
            return _FoodVariantOff!!
        }
        _FoodVariantOff = ImageVector.Builder(
            name = "FoodVariantOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.28f, 3f)
                lineTo(1f, 4.27f)
                lineTo(3.31f, 6.58f)
                curveTo(2.91f, 8.7f, 2.55f, 10.8f, 2.33f, 12.83f)
                curveTo(2f, 16f, 2f, 19f, 2f, 22f)
                horizontalLineTo(9f)
                curveTo(9f, 19f, 9f, 16f, 8.67f, 12.83f)
                curveTo(8.63f, 12.5f, 8.58f, 12.15f, 8.54f, 11.81f)
                lineTo(12.73f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                curveTo(11f, 20.21f, 12.79f, 22f, 15f, 22f)
                horizontalLineTo(18f)
                curveTo(18.23f, 22f, 18.45f, 22f, 18.67f, 21.94f)
                lineTo(19.73f, 23f)
                lineTo(21f, 21.72f)
                moveTo(4.82f, 3f)
                lineTo(7.53f, 5.71f)
                curveTo(7.5f, 5.47f, 7.45f, 5.24f, 7.4f, 5f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                moveTo(20.55f, 11.23f)
                lineTo(17.8f, 16f)
                lineTo(21.59f, 19.76f)
                curveTo(21.86f, 19.21f, 22f, 18.61f, 22f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(19.87f)
                lineTo(22.11f, 12.13f)
                close()
            }
        }.build()

        return _FoodVariantOff!!
    }

@Suppress("ObjectPropertyName")
private var _FoodVariantOff: ImageVector? = null
