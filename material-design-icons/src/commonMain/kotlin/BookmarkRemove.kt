package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookmarkRemove: ImageVector
    get() {
        if (_BookmarkRemove != null) {
            return _BookmarkRemove!!
        }
        _BookmarkRemove = ImageVector.Builder(
            name = "BookmarkRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 5f)
                verticalLineTo(21f)
                lineTo(12f, 18f)
                lineTo(5f, 21f)
                verticalLineTo(5f)
                curveTo(5f, 3.89f, 5.9f, 3f, 7f, 3f)
                horizontalLineTo(17f)
                moveTo(8.17f, 8.58f)
                lineTo(10.59f, 11f)
                lineTo(8.17f, 13.41f)
                lineTo(9.59f, 14.83f)
                lineTo(12f, 12.41f)
                lineTo(14.41f, 14.83f)
                lineTo(15.83f, 13.41f)
                lineTo(13.41f, 11f)
                lineTo(15.83f, 8.58f)
                lineTo(14.41f, 7.17f)
                lineTo(12f, 9.58f)
                lineTo(9.59f, 7.17f)
                lineTo(8.17f, 8.58f)
                close()
            }
        }.build()

        return _BookmarkRemove!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkRemove: ImageVector? = null
