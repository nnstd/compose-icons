package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ZodiacTaurus: ImageVector
    get() {
        if (_ZodiacTaurus != null) {
            return _ZodiacTaurus!!
        }
        _ZodiacTaurus = ImageVector.Builder(
            name = "ZodiacTaurus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.59f, 9f)
                curveTo(17.7f, 7.74f, 19f, 5.46f, 19f, 3f)
                horizontalLineTo(17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 3f)
                horizontalLineTo(5f)
                curveTo(5f, 5.46f, 6.3f, 7.74f, 8.41f, 9f)
                curveTo(5.09f, 11f, 4f, 15.28f, 6f, 18.6f)
                curveTo(7.97f, 21.92f, 12.27f, 23f, 15.59f, 21f)
                curveTo(18.91f, 19.04f, 20f, 14.74f, 18f, 11.42f)
                curveTo(17.42f, 10.43f, 16.58f, 9.59f, 15.59f, 9f)
                moveTo(12f, 20f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 15f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 15f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
            }
        }.build()

        return _ZodiacTaurus!!
    }

@Suppress("ObjectPropertyName")
private var _ZodiacTaurus: ImageVector? = null
