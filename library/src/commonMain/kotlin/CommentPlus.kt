package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentPlus: ImageVector
    get() {
        if (_CommentPlus != null) {
            return _CommentPlus!!
        }
        _CommentPlus = ImageVector.Builder(
            name = "CommentPlus",
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
                horizontalLineTo(9f)
                moveTo(11f, 6f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _CommentPlus!!
    }

@Suppress("ObjectPropertyName")
private var _CommentPlus: ImageVector? = null
