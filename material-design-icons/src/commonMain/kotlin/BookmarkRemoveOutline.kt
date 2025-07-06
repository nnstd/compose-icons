package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookmarkRemoveOutline: ImageVector
    get() {
        if (_BookmarkRemoveOutline != null) {
            return _BookmarkRemoveOutline!!
        }
        _BookmarkRemoveOutline = ImageVector.Builder(
            name = "BookmarkRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 3f)
                curveTo(5.9f, 3f, 5f, 3.9f, 5f, 5f)
                verticalLineTo(21f)
                lineTo(12f, 18f)
                lineTo(19f, 21f)
                verticalLineTo(5f)
                curveTo(19f, 3.89f, 18.1f, 3f, 17f, 3f)
                horizontalLineTo(7f)
                moveTo(7f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                lineTo(12f, 15.82f)
                lineTo(7f, 18f)
                verticalLineTo(5f)
                moveTo(9.88f, 7.47f)
                lineTo(8.47f, 8.88f)
                lineTo(10.59f, 11f)
                lineTo(8.47f, 13.12f)
                lineTo(9.88f, 14.54f)
                lineTo(12f, 12.42f)
                lineTo(14.12f, 14.53f)
                lineTo(15.54f, 13.12f)
                lineTo(13.42f, 11f)
                lineTo(15.53f, 8.88f)
                lineTo(14.12f, 7.47f)
                lineTo(12f, 9.59f)
                lineTo(9.88f, 7.47f)
                close()
            }
        }.build()

        return _BookmarkRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkRemoveOutline: ImageVector? = null
