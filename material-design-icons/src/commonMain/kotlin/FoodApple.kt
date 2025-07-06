package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FoodApple: ImageVector
    get() {
        if (_FoodApple != null) {
            return _FoodApple!!
        }
        _FoodApple = ImageVector.Builder(
            name = "FoodApple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10f)
                curveTo(22f, 13f, 17f, 22f, 15f, 22f)
                curveTo(13f, 22f, 13f, 21f, 12f, 21f)
                curveTo(11f, 21f, 11f, 22f, 9f, 22f)
                curveTo(7f, 22f, 2f, 13f, 4f, 10f)
                curveTo(6f, 7f, 9f, 7f, 11f, 8f)
                verticalLineTo(5f)
                curveTo(5.38f, 8.07f, 4.11f, 3.78f, 4.11f, 3.78f)
                curveTo(4.11f, 3.78f, 6.77f, 0.19f, 11f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                curveTo(15f, 7f, 18f, 7f, 20f, 10f)
                close()
            }
        }.build()

        return _FoodApple!!
    }

@Suppress("ObjectPropertyName")
private var _FoodApple: ImageVector? = null
