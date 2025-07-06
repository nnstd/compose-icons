package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ZodiacLeo: ImageVector
    get() {
        if (_ZodiacLeo != null) {
            return _ZodiacLeo!!
        }
        _ZodiacLeo = ImageVector.Builder(
            name = "ZodiacLeo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 20f)
                curveTo(15.38f, 19.92f, 14.08f, 18.62f, 14f, 17f)
                curveTo(14.16f, 15.39f, 14.5f, 13.8f, 15f, 12.26f)
                curveTo(15.54f, 10.55f, 15.87f, 8.79f, 16f, 7f)
                curveTo(15.93f, 4.27f, 13.73f, 2.07f, 11f, 2f)
                curveTo(8.27f, 2.07f, 6.07f, 4.27f, 6f, 7f)
                curveTo(6.15f, 8.53f, 6.5f, 10.03f, 7f, 11.5f)
                lineTo(7.21f, 12.2f)
                curveTo(5.1f, 11.53f, 2.86f, 12.7f, 2.19f, 14.8f)
                curveTo(1.5f, 16.91f, 2.68f, 19.16f, 4.79f, 19.83f)
                curveTo(6.9f, 20.5f, 9.14f, 19.33f, 9.81f, 17.22f)
                curveTo(9.94f, 16.83f, 10f, 16.41f, 10f, 16f)
                curveTo(9.84f, 14.27f, 9.5f, 12.56f, 8.91f, 10.92f)
                curveTo(8.47f, 9.65f, 8.16f, 8.34f, 8f, 7f)
                curveTo(8.08f, 5.38f, 9.38f, 4.08f, 11f, 4f)
                curveTo(12.62f, 4.08f, 13.92f, 5.38f, 14f, 7f)
                curveTo(13.84f, 8.61f, 13.5f, 10.2f, 13f, 11.74f)
                curveTo(12.46f, 13.45f, 12.13f, 15.21f, 12f, 17f)
                curveTo(12.07f, 19.73f, 14.27f, 21.93f, 17f, 22f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                horizontalLineTo(20f)
                moveTo(6f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 18f)
                close()
            }
        }.build()

        return _ZodiacLeo!!
    }

@Suppress("ObjectPropertyName")
private var _ZodiacLeo: ImageVector? = null
