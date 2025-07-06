package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagOff: ImageVector
    get() {
        if (_TagOff != null) {
            return _TagOff!!
        }
        _TagOff = ImageVector.Builder(
            name = "TagOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.33f, 8.5f)
                lineTo(22.92f, 3.92f)
                lineTo(21.5f, 2.5f)
                lineTo(2.5f, 21.5f)
                lineTo(3.92f, 22.92f)
                lineTo(8.5f, 18.33f)
                lineTo(11.58f, 21.41f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.41f, 21.41f)
                lineTo(21.41f, 14.41f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.41f, 11.58f)
                moveTo(5.61f, 15.43f)
                lineTo(15.47f, 5.65f)
                lineTo(12.41f, 2.58f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 2f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.59f, 12.41f)
                moveTo(5.5f, 4f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 5.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 4f)
                close()
            }
        }.build()

        return _TagOff!!
    }

@Suppress("ObjectPropertyName")
private var _TagOff: ImageVector? = null
