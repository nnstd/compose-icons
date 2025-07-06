package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentSearch: ImageVector
    get() {
        if (_CommentSearch != null) {
            return _CommentSearch!!
        }
        _CommentSearch = ImageVector.Builder(
            name = "CommentSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 2f)
                curveTo(18f, 2f, 20f, 4f, 20f, 6.5f)
                curveTo(20f, 7.38f, 19.75f, 8.2f, 19.31f, 8.89f)
                lineTo(22.41f, 12f)
                lineTo(21f, 13.39f)
                lineTo(17.89f, 10.31f)
                curveTo(17.2f, 10.75f, 16.38f, 11f, 15.5f, 11f)
                curveTo(13f, 11f, 11f, 9f, 11f, 6.5f)
                curveTo(11f, 4f, 13f, 2f, 15.5f, 2f)
                moveTo(15.5f, 4f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 4f)
                moveTo(4f, 4f)
                horizontalLineTo(9.5f)
                curveTo(9.19f, 4.79f, 9f, 5.64f, 9f, 6.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 13f)
                curveTo(16.18f, 13f, 16.83f, 12.89f, 17.46f, 12.69f)
                lineTo(20f, 15.23f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 18f)
                horizontalLineTo(13.9f)
                lineTo(10.2f, 21.71f)
                curveTo(10f, 21.89f, 9.76f, 22f, 9.5f, 22f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 21f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                close()
            }
        }.build()

        return _CommentSearch!!
    }

@Suppress("ObjectPropertyName")
private var _CommentSearch: ImageVector? = null
