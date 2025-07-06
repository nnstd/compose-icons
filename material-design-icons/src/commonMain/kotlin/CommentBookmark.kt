package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentBookmark: ImageVector
    get() {
        if (_CommentBookmark != null) {
            return _CommentBookmark!!
        }
        _CommentBookmark = ImageVector.Builder(
            name = "CommentBookmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(16f)
                curveTo(2f, 17.1f, 2.9f, 18f, 4f, 18f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                curveTo(8f, 21.6f, 8.4f, 22f, 9f, 22f)
                horizontalLineTo(9.5f)
                curveTo(9.7f, 22f, 10f, 21.9f, 10.2f, 21.7f)
                lineTo(13.9f, 18f)
                horizontalLineTo(20f)
                curveTo(21.1f, 18f, 22f, 17.1f, 22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                moveTo(19f, 13f)
                lineTo(16.5f, 11.5f)
                lineTo(14f, 13f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _CommentBookmark!!
    }

@Suppress("ObjectPropertyName")
private var _CommentBookmark: ImageVector? = null
