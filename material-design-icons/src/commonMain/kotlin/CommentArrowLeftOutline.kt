package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentArrowLeftOutline: ImageVector
    get() {
        if (_CommentArrowLeftOutline != null) {
            return _CommentArrowLeftOutline!!
        }
        _CommentArrowLeftOutline = ImageVector.Builder(
            name = "CommentArrowLeftOutline",
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
                moveTo(20f, 16f)
                horizontalLineTo(13.1f)
                lineTo(10f, 19.1f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                moveTo(16f, 11f)
                verticalLineTo(9f)
                horizontalLineTo(11.5f)
                lineTo(13.3f, 7.2f)
                lineTo(12f, 6f)
                lineTo(8f, 10f)
                lineTo(12f, 14f)
                lineTo(13.2f, 12.8f)
                lineTo(11.5f, 11f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _CommentArrowLeftOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CommentArrowLeftOutline: ImageVector? = null
