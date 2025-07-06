package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ZodiacCapricorn: ImageVector
    get() {
        if (_ZodiacCapricorn != null) {
            return _ZodiacCapricorn!!
        }
        _ZodiacCapricorn = ImageVector.Builder(
            name = "ZodiacCapricorn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 13f)
                curveTo(14.3f, 13f, 13.61f, 13.19f, 13f, 13.55f)
                verticalLineTo(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 3f)
                curveTo(9.25f, 3f, 8.55f, 3.29f, 8f, 3.78f)
                curveTo(7.45f, 3.28f, 6.74f, 3f, 6f, 3f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 6f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 6f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 19f)
                verticalLineTo(21f)
                curveTo(10.15f, 21f, 11.25f, 20.5f, 12f, 19.62f)
                curveTo(13.45f, 21.29f, 15.97f, 21.47f, 17.64f, 20f)
                curveTo(19.31f, 18.58f, 19.5f, 16.05f, 18.04f, 14.38f)
                curveTo(17.28f, 13.5f, 16.17f, 13f, 15f, 13f)
                moveTo(15f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 19f)
                close()
            }
        }.build()

        return _ZodiacCapricorn!!
    }

@Suppress("ObjectPropertyName")
private var _ZodiacCapricorn: ImageVector? = null
