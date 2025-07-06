package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Origin: ImageVector
    get() {
        if (_Origin != null) {
            return _Origin!!
        }
        _Origin = ImageVector.Builder(
            name = "Origin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.13f)
                curveTo(12f, 2.23f, 11.95f, 2.33f, 11.89f, 2.41f)
                curveTo(11.5f, 3f, 11.16f, 3.64f, 11.04f, 4.33f)
                lineTo(11f, 4.56f)
                lineTo(12f, 4.5f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 12f)
                curveTo(19.5f, 13.62f, 19f, 15.11f, 18.12f, 16.34f)
                curveTo(16.73f, 18.68f, 14.72f, 20.65f, 12.34f, 21.97f)
                curveTo(12.25f, 22f, 12.12f, 22f, 12.06f, 21.93f)
                curveTo(12f, 21.83f, 12f, 21.7f, 12.09f, 21.61f)
                curveTo(12.47f, 21.09f, 12.73f, 20.5f, 12.87f, 19.85f)
                lineTo(12.93f, 19.44f)
                lineTo(12f, 19.5f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 12f)
                curveTo(4.5f, 10.39f, 5f, 8.89f, 5.88f, 7.67f)
                curveTo(7.26f, 5.32f, 9.28f, 3.34f, 11.67f, 2f)
                curveTo(11.78f, 1.95f, 11.94f, 2f, 12f, 2.13f)
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                close()
            }
        }.build()

        return _Origin!!
    }

@Suppress("ObjectPropertyName")
private var _Origin: ImageVector? = null
