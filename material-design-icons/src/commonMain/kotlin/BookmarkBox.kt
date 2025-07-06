package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookmarkBox: ImageVector
    get() {
        if (_BookmarkBox != null) {
            return _BookmarkBox!!
        }
        _BookmarkBox = ImageVector.Builder(
            name = "BookmarkBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(18f, 14f)
                lineTo(15.5f, 12.5f)
                lineTo(13f, 14f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _BookmarkBox!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkBox: ImageVector? = null
