package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookmarkMusicOutline: ImageVector
    get() {
        if (_BookmarkMusicOutline != null) {
            return _BookmarkMusicOutline!!
        }
        _BookmarkMusicOutline = ImageVector.Builder(
            name = "BookmarkMusicOutline",
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
                moveTo(12f, 6f)
                verticalLineTo(11.3f)
                curveTo(11.7f, 11.1f, 11.4f, 11f, 11f, 11f)
                curveTo(9.9f, 11f, 9f, 11.9f, 9f, 13f)
                curveTo(9f, 14.11f, 9.9f, 15f, 11f, 15f)
                curveTo(12.11f, 15f, 13f, 14.11f, 13f, 13f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _BookmarkMusicOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkMusicOutline: ImageVector? = null
