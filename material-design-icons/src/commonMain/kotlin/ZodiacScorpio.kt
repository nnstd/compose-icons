package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ZodiacScorpio: ImageVector
    get() {
        if (_ZodiacScorpio != null) {
            return _ZodiacScorpio!!
        }
        _ZodiacScorpio = ImageVector.Builder(
            name = "ZodiacScorpio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.71f, 15.29f)
                lineTo(16.29f, 16.71f)
                lineTo(17.59f, 18f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 16f)
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
                verticalLineTo(16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 20f)
                horizontalLineTo(17.59f)
                lineTo(16.29f, 21.29f)
                lineTo(17.71f, 22.71f)
                lineTo(21.41f, 19f)
                lineTo(17.71f, 15.29f)
                close()
            }
        }.build()

        return _ZodiacScorpio!!
    }

@Suppress("ObjectPropertyName")
private var _ZodiacScorpio: ImageVector? = null
