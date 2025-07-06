package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentFlash: ImageVector
    get() {
        if (_CommentFlash != null) {
            return _CommentFlash!!
        }
        _CommentFlash = ImageVector.Builder(
            name = "CommentFlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 16f)
                horizontalLineTo(20.3f)
                lineTo(22f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                lineTo(22.5f, 16f)
                moveTo(15f, 18f)
                horizontalLineTo(13.9f)
                lineTo(10.2f, 21.7f)
                curveTo(10f, 21.9f, 9.8f, 22f, 9.5f, 22f)
                horizontalLineTo(9f)
                curveTo(8.4f, 22f, 8f, 21.6f, 8f, 21f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                curveTo(2.9f, 18f, 2f, 17.1f, 2f, 16f)
                verticalLineTo(4f)
                curveTo(2f, 2.9f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(20f)
                curveTo(21.1f, 2f, 22f, 2.9f, 22f, 4f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _CommentFlash!!
    }

@Suppress("ObjectPropertyName")
private var _CommentFlash: ImageVector? = null
