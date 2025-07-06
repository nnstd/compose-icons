package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FoodAppleOutline: ImageVector
    get() {
        if (_FoodAppleOutline != null) {
            return _FoodAppleOutline!!
        }
        _FoodAppleOutline = ImageVector.Builder(
            name = "FoodAppleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10f)
                curveTo(18.58f, 7.57f, 15.5f, 6.69f, 13f, 8f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                curveTo(8.5f, 6.69f, 5.42f, 7.57f, 4f, 10f)
                curveTo(2f, 13f, 7f, 22f, 9f, 22f)
                curveTo(11f, 22f, 11f, 21f, 12f, 21f)
                curveTo(13f, 21f, 13f, 22f, 15f, 22f)
                curveTo(17f, 22f, 22f, 13f, 20f, 10f)
                moveTo(18.25f, 13.38f)
                curveTo(17.63f, 15.85f, 16.41f, 18.12f, 14.7f, 20f)
                curveTo(14.5f, 20f, 14.27f, 19.9f, 14.1f, 19.75f)
                curveTo(12.87f, 18.76f, 11.13f, 18.76f, 9.9f, 19.75f)
                curveTo(9.73f, 19.9f, 9.5f, 20f, 9.3f, 20f)
                curveTo(7.59f, 18.13f, 6.36f, 15.85f, 5.75f, 13.39f)
                curveTo(5.5f, 12.66f, 5.45f, 11.87f, 5.66f, 11.12f)
                curveTo(6.24f, 10.09f, 7.32f, 9.43f, 8.5f, 9.4f)
                curveTo(9.06f, 9.41f, 9.61f, 9.54f, 10.11f, 9.79f)
                lineTo(11f, 10.24f)
                horizontalLineTo(13f)
                lineTo(13.89f, 9.79f)
                curveTo(14.39f, 9.54f, 14.94f, 9.41f, 15.5f, 9.4f)
                curveTo(16.68f, 9.43f, 17.76f, 10.08f, 18.34f, 11.11f)
                curveTo(18.55f, 11.86f, 18.5f, 12.65f, 18.25f, 13.38f)
                moveTo(11f, 5f)
                curveTo(5.38f, 8.07f, 4.11f, 3.78f, 4.11f, 3.78f)
                curveTo(4.11f, 3.78f, 6.77f, 0.19f, 11f, 5f)
                close()
            }
        }.build()

        return _FoodAppleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FoodAppleOutline: ImageVector? = null
