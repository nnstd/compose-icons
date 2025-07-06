package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageSearch: ImageVector
    get() {
        if (_ImageSearch != null) {
            return _ImageSearch!!
        }
        _ImageSearch = ImageVector.Builder(
            name = "ImageSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 2f)
                curveTo(18f, 2f, 20f, 4f, 20f, 6.5f)
                curveTo(20f, 7.38f, 19.75f, 8.21f, 19.31f, 8.9f)
                lineTo(22.39f, 12f)
                lineTo(21f, 13.39f)
                lineTo(17.88f, 10.32f)
                curveTo(17.19f, 10.75f, 16.37f, 11f, 15.5f, 11f)
                curveTo(13f, 11f, 11f, 9f, 11f, 6.5f)
                curveTo(11f, 4f, 13f, 2f, 15.5f, 2f)
                moveTo(15.5f, 4f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 4f)
                moveTo(7.5f, 14.5f)
                lineTo(4f, 19f)
                horizontalLineTo(18f)
                lineTo(13.5f, 13f)
                lineTo(10f, 17.5f)
                lineTo(7.5f, 14.5f)
                moveTo(20f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineTo(9.5f)
                curveTo(9.18f, 4.77f, 9f, 5.61f, 9f, 6.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 13f)
                curveTo(16.18f, 13f, 16.84f, 12.89f, 17.46f, 12.7f)
                lineTo(20f, 15.24f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _ImageSearch!!
    }

@Suppress("ObjectPropertyName")
private var _ImageSearch: ImageVector? = null
