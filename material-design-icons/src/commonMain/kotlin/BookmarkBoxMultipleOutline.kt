package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookmarkBoxMultipleOutline: ImageVector
    get() {
        if (_BookmarkBoxMultipleOutline != null) {
            return _BookmarkBoxMultipleOutline!!
        }
        _BookmarkBoxMultipleOutline = ImageVector.Builder(
            name = "BookmarkBoxMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                moveTo(22f, 4f)
                verticalLineTo(16f)
                curveTo(22f, 17.1f, 21.1f, 18f, 20f, 18f)
                horizontalLineTo(8f)
                curveTo(6.9f, 18f, 6f, 17.1f, 6f, 16f)
                verticalLineTo(4f)
                curveTo(6f, 2.9f, 6.9f, 2f, 8f, 2f)
                horizontalLineTo(20f)
                curveTo(21.1f, 2f, 22f, 2.9f, 22f, 4f)
                moveTo(20f, 4f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                moveTo(18f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                lineTo(15.5f, 11.5f)
                lineTo(18f, 13f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _BookmarkBoxMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkBoxMultipleOutline: ImageVector? = null
