package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentCheckOutline: ImageVector
    get() {
        if (_CommentCheckOutline != null) {
            return _CommentCheckOutline!!
        }
        _CommentCheckOutline = ImageVector.Builder(
            name = "CommentCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 22f)
                curveTo(8.45f, 22f, 8f, 21.55f, 8f, 21f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                curveTo(2.9f, 18f, 2f, 17.11f, 2f, 16f)
                verticalLineTo(4f)
                curveTo(2f, 2.89f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(20f)
                curveTo(21.11f, 2f, 22f, 2.9f, 22f, 4f)
                verticalLineTo(16f)
                curveTo(22f, 17.11f, 21.11f, 18f, 20f, 18f)
                horizontalLineTo(13.9f)
                lineTo(10.2f, 21.71f)
                curveTo(10f, 21.9f, 9.75f, 22f, 9.5f, 22f)
                horizontalLineTo(9f)
                moveTo(10f, 16f)
                verticalLineTo(19.08f)
                lineTo(13.08f, 16f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                moveTo(15.6f, 6f)
                lineTo(17f, 7.41f)
                lineTo(10.47f, 14f)
                lineTo(7f, 10.5f)
                lineTo(8.4f, 9.09f)
                lineTo(10.47f, 11.17f)
                lineTo(15.6f, 6f)
            }
        }.build()

        return _CommentCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CommentCheckOutline: ImageVector? = null
