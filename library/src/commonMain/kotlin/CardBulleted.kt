package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardBulleted: ImageVector
    get() {
        if (_CardBulleted != null) {
            return _CardBulleted!!
        }
        _CardBulleted = ImageVector.Builder(
            name = "CardBulleted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineTo(20f)
                moveTo(11f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                moveTo(19f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                moveTo(7f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                moveTo(19f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _CardBulleted!!
    }

@Suppress("ObjectPropertyName")
private var _CardBulleted: ImageVector? = null
