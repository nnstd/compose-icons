package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatListBulleted: ImageVector
    get() {
        if (_FormatListBulleted != null) {
            return _FormatListBulleted!!
        }
        _FormatListBulleted = ImageVector.Builder(
            name = "FormatListBulleted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                moveTo(7f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                moveTo(4f, 4.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 6f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, 6f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4.5f)
                moveTo(4f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 10.5f)
                moveTo(7f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                moveTo(4f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 18f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 19.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, 18f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 16.5f)
                close()
            }
        }.build()

        return _FormatListBulleted!!
    }

@Suppress("ObjectPropertyName")
private var _FormatListBulleted: ImageVector? = null
