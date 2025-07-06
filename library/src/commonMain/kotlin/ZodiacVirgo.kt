package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ZodiacVirgo: ImageVector
    get() {
        if (_ZodiacVirgo != null) {
            return _ZodiacVirgo!!
        }
        _ZodiacVirgo = ImageVector.Builder(
            name = "ZodiacVirgo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 19.13f)
                curveTo(20f, 17.77f, 20f, 15.18f, 20f, 14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 10f)
                curveTo(15.3f, 10f, 14.6f, 10.2f, 14f, 10.56f)
                verticalLineTo(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 3f)
                curveTo(10.25f, 3f, 9.55f, 3.29f, 9f, 3.78f)
                curveTo(7.86f, 2.76f, 6.14f, 2.76f, 5f, 3.78f)
                curveTo(4.45f, 3.28f, 3.74f, 3f, 3f, 3f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 6f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 6f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                verticalLineTo(14f)
                curveTo(12f, 15.18f, 12f, 17.77f, 13.5f, 19.13f)
                curveTo(12.72f, 19.54f, 11.88f, 19.84f, 11f, 20f)
                verticalLineTo(22f)
                curveTo(12.29f, 22f, 14.84f, 20.74f, 16f, 20.13f)
                curveTo(17.16f, 20.74f, 19.71f, 22f, 21f, 22f)
                verticalLineTo(20f)
                curveTo(20.12f, 19.84f, 19.28f, 19.54f, 18.5f, 19.13f)
                moveTo(16f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 14f)
                curveTo(18f, 16.92f, 17.46f, 18f, 16f, 18f)
                curveTo(14.54f, 18f, 14f, 16.92f, 14f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12f)
                close()
            }
        }.build()

        return _ZodiacVirgo!!
    }

@Suppress("ObjectPropertyName")
private var _ZodiacVirgo: ImageVector? = null
