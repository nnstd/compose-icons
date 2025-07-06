package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentRemoveOutline: ImageVector
    get() {
        if (_CommentRemoveOutline != null) {
            return _CommentRemoveOutline!!
        }
        _CommentRemoveOutline = ImageVector.Builder(
            name = "CommentRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 21f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16f)
                verticalLineTo(4f)
                curveTo(2f, 2.89f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 18f)
                horizontalLineTo(13.9f)
                lineTo(10.2f, 21.71f)
                curveTo(10f, 21.9f, 9.75f, 22f, 9.5f, 22f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                moveTo(10f, 16f)
                verticalLineTo(19.08f)
                lineTo(13.08f, 16f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                moveTo(9.41f, 6f)
                lineTo(12f, 8.59f)
                lineTo(14.59f, 6f)
                lineTo(16f, 7.41f)
                lineTo(13.41f, 10f)
                lineTo(16f, 12.59f)
                lineTo(14.59f, 14f)
                lineTo(12f, 11.41f)
                lineTo(9.41f, 14f)
                lineTo(8f, 12.59f)
                lineTo(10.59f, 10f)
                lineTo(8f, 7.41f)
                lineTo(9.41f, 6f)
                close()
            }
        }.build()

        return _CommentRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CommentRemoveOutline: ImageVector? = null
