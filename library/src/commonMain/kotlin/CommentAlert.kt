package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentAlert: ImageVector
    get() {
        if (_CommentAlert != null) {
            return _CommentAlert!!
        }
        _CommentAlert = ImageVector.Builder(
            name = "CommentAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 22f)
                curveTo(8.4f, 22f, 8f, 21.6f, 8f, 21f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                curveTo(2.9f, 18f, 2f, 17.1f, 2f, 16f)
                verticalLineTo(4f)
                curveTo(2f, 2.9f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(20f)
                curveTo(21.1f, 2f, 22f, 2.9f, 22f, 4f)
                verticalLineTo(16f)
                curveTo(22f, 17.1f, 21.1f, 18f, 20f, 18f)
                horizontalLineTo(13.9f)
                lineTo(10.2f, 21.7f)
                curveTo(10f, 21.9f, 9.8f, 22f, 9.5f, 22f)
                horizontalLineTo(9f)
                moveTo(13f, 11f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                moveTo(13f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _CommentAlert!!
    }

@Suppress("ObjectPropertyName")
private var _CommentAlert: ImageVector? = null
