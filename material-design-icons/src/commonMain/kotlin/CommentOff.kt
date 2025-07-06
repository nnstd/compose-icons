package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentOff: ImageVector
    get() {
        if (_CommentOff != null) {
            return _CommentOff!!
        }
        _CommentOff = ImageVector.Builder(
            name = "CommentOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(16.11f, 18f)
                horizontalLineTo(13.9f)
                lineTo(10.2f, 21.71f)
                curveTo(10f, 21.9f, 9.75f, 22f, 9.5f, 22f)
                horizontalLineTo(9f)
                curveTo(8.45f, 22f, 8f, 21.55f, 8f, 21f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                curveTo(2.9f, 18f, 2f, 17.11f, 2f, 16f)
                verticalLineTo(4f)
                verticalLineTo(3.9f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.11f, 2f, 20f, 2f)
                horizontalLineTo(5.2f)
                lineTo(20.95f, 17.75f)
                curveTo(21.57f, 17.41f, 22f, 16.76f, 22f, 16f)
                close()
            }
        }.build()

        return _CommentOff!!
    }

@Suppress("ObjectPropertyName")
private var _CommentOff: ImageVector? = null
