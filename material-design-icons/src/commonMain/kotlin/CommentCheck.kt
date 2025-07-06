package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentCheck: ImageVector
    get() {
        if (_CommentCheck != null) {
            return _CommentCheck!!
        }
        _CommentCheck = ImageVector.Builder(
            name = "CommentCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.89f, 2f, 4f)
                verticalLineTo(16f)
                curveTo(2f, 17.11f, 2.9f, 18f, 4f, 18f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                curveTo(8f, 21.55f, 8.45f, 22f, 9f, 22f)
                horizontalLineTo(9.5f)
                curveTo(9.75f, 22f, 10f, 21.9f, 10.2f, 21.71f)
                lineTo(13.9f, 18f)
                horizontalLineTo(20f)
                curveTo(21.11f, 18f, 22f, 17.11f, 22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.11f, 2f, 20f, 2f)
                moveTo(10.47f, 14f)
                lineTo(7f, 10.5f)
                lineTo(8.4f, 9.09f)
                lineTo(10.47f, 11.17f)
                lineTo(15.6f, 6f)
                lineTo(17f, 7.41f)
                lineTo(10.47f, 14f)
                close()
            }
        }.build()

        return _CommentCheck!!
    }

@Suppress("ObjectPropertyName")
private var _CommentCheck: ImageVector? = null
