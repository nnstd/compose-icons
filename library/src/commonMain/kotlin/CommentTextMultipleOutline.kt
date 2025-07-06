package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentTextMultipleOutline: ImageVector
    get() {
        if (_CommentTextMultipleOutline != null) {
            return _CommentTextMultipleOutline!!
        }
        _CommentTextMultipleOutline = ImageVector.Builder(
            name = "CommentTextMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 22f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 17f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 5f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 19f)
                horizontalLineTo(16.9f)
                lineTo(13.2f, 22.71f)
                curveTo(13f, 22.89f, 12.76f, 23f, 12.5f, 23f)
                horizontalLineTo(12f)
                moveTo(13f, 17f)
                verticalLineTo(20.08f)
                lineTo(16.08f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                moveTo(3f, 15f)
                horizontalLineTo(1f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 1f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                moveTo(9f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                moveTo(9f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _CommentTextMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CommentTextMultipleOutline: ImageVector? = null
