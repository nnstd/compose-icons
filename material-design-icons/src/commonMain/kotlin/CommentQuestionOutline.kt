package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentQuestionOutline: ImageVector
    get() {
        if (_CommentQuestionOutline != null) {
            return _CommentQuestionOutline!!
        }
        _CommentQuestionOutline = ImageVector.Builder(
            name = "CommentQuestionOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 18f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 22f)
                horizontalLineTo(9.5f)
                verticalLineTo(22f)
                curveTo(9.75f, 22f, 10f, 21.9f, 10.2f, 21.71f)
                lineTo(13.9f, 18f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 2.89f, 21.1f, 2f, 20f, 2f)
                horizontalLineTo(4f)
                moveTo(4f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(13.08f)
                lineTo(10f, 19.08f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(12.19f, 5.5f)
                curveTo(11.3f, 5.5f, 10.59f, 5.68f, 10.05f, 6.04f)
                curveTo(9.5f, 6.4f, 9.22f, 7f, 9.27f, 7.69f)
                curveTo(0.21f, 7.69f, 6.57f, 7.69f, 11.24f, 7.69f)
                curveTo(11.24f, 7.41f, 11.34f, 7.2f, 11.5f, 7.06f)
                curveTo(11.7f, 6.92f, 11.92f, 6.85f, 12.19f, 6.85f)
                curveTo(12.5f, 6.85f, 12.77f, 6.93f, 12.95f, 7.11f)
                curveTo(13.13f, 7.28f, 13.22f, 7.5f, 13.22f, 7.8f)
                curveTo(13.22f, 8.08f, 13.14f, 8.33f, 13f, 8.54f)
                curveTo(12.83f, 8.76f, 12.62f, 8.94f, 12.36f, 9.08f)
                curveTo(11.84f, 9.4f, 11.5f, 9.68f, 11.29f, 9.92f)
                curveTo(11.1f, 10.16f, 11f, 10.5f, 11f, 11f)
                horizontalLineTo(13f)
                curveTo(13f, 10.72f, 13.05f, 10.5f, 13.14f, 10.32f)
                curveTo(13.23f, 10.15f, 13.4f, 10f, 13.66f, 9.85f)
                curveTo(14.12f, 9.64f, 14.5f, 9.36f, 14.79f, 9f)
                curveTo(15.08f, 8.63f, 15.23f, 8.24f, 15.23f, 7.8f)
                curveTo(15.23f, 7.1f, 14.96f, 6.54f, 14.42f, 6.12f)
                curveTo(13.88f, 5.71f, 13.13f, 5.5f, 12.19f, 5.5f)
                moveTo(11f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _CommentQuestionOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CommentQuestionOutline: ImageVector? = null
