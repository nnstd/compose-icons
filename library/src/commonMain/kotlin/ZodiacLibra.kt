package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ZodiacLibra: ImageVector
    get() {
        if (_ZodiacLibra != null) {
            return _ZodiacLibra!!
        }
        _ZodiacLibra = ImageVector.Builder(
            name = "ZodiacLibra",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(15.91f)
                curveTo(16f, 15.36f, 17.96f, 12.5f, 17.41f, 9.5f)
                curveTo(16.86f, 6.5f, 14f, 4.54f, 11f, 5.09f)
                curveTo(8f, 5.65f, 6.04f, 8.5f, 6.59f, 11.5f)
                curveTo(7f, 13.74f, 8.76f, 15.5f, 11f, 15.91f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(6.92f)
                curveTo(5.37f, 14.59f, 4.5f, 12.59f, 4.5f, 10.5f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 10.5f)
                curveTo(19.5f, 12.59f, 18.63f, 14.59f, 17.08f, 16f)
                horizontalLineTo(20f)
                moveTo(20f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _ZodiacLibra!!
    }

@Suppress("ObjectPropertyName")
private var _ZodiacLibra: ImageVector? = null
