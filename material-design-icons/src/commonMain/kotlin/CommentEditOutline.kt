package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentEditOutline: ImageVector
    get() {
        if (_CommentEditOutline != null) {
            return _CommentEditOutline!!
        }
        _CommentEditOutline = ImageVector.Builder(
            name = "CommentEditOutline",
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
                moveTo(15.84f, 8.2f)
                lineTo(14.83f, 9.21f)
                lineTo(12.76f, 7.18f)
                lineTo(13.77f, 6.16f)
                curveTo(13.97f, 5.95f, 14.31f, 5.94f, 14.55f, 6.16f)
                lineTo(15.84f, 7.41f)
                curveTo(16.05f, 7.62f, 16.06f, 7.96f, 15.84f, 8.2f)
                moveTo(8f, 11.91f)
                lineTo(12.17f, 7.72f)
                lineTo(14.24f, 9.8f)
                lineTo(10.08f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(11.91f)
                close()
            }
        }.build()

        return _CommentEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CommentEditOutline: ImageVector? = null
