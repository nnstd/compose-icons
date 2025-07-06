package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentQuote: ImageVector
    get() {
        if (_CommentQuote != null) {
            return _CommentQuote!!
        }
        _CommentQuote = ImageVector.Builder(
            name = "CommentQuote",
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
                moveTo(11f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(8.8f)
                lineTo(8.3f, 6f)
                horizontalLineTo(10.3f)
                lineTo(8.9f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                moveTo(17f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(8.8f)
                lineTo(14.3f, 6f)
                horizontalLineTo(16.3f)
                lineTo(14.9f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _CommentQuote!!
    }

@Suppress("ObjectPropertyName")
private var _CommentQuote: ImageVector? = null
