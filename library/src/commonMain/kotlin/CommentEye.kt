package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentEye: ImageVector
    get() {
        if (_CommentEye != null) {
            return _CommentEye!!
        }
        _CommentEye = ImageVector.Builder(
            name = "CommentEye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                verticalLineTo(16f)
                curveTo(20f, 17.11f, 19.11f, 18f, 18f, 18f)
                horizontalLineTo(13.9f)
                lineTo(10.2f, 21.71f)
                curveTo(10f, 21.89f, 9.76f, 22f, 9.5f, 22f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 21f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.9f, 4f, 4f, 4f)
                horizontalLineTo(9.5f)
                curveTo(8.95f, 4.67f, 8.5f, 5.42f, 8.14f, 6.25f)
                lineTo(7.85f, 7f)
                lineTo(8.14f, 7.75f)
                curveTo(9.43f, 10.94f, 12.5f, 13f, 16f, 13f)
                curveTo(17.44f, 13f, 18.8f, 12.63f, 20f, 12f)
                moveTo(16f, 6f)
                curveTo(16.56f, 6f, 17f, 6.44f, 17f, 7f)
                curveTo(17f, 7.56f, 16.56f, 8f, 16f, 8f)
                curveTo(15.44f, 8f, 15f, 7.56f, 15f, 7f)
                curveTo(15f, 6.44f, 15.44f, 6f, 16f, 6f)
                moveTo(16f, 3f)
                curveTo(18.73f, 3f, 21.06f, 4.66f, 22f, 7f)
                curveTo(21.06f, 9.34f, 18.73f, 11f, 16f, 11f)
                curveTo(13.27f, 11f, 10.94f, 9.34f, 10f, 7f)
                curveTo(10.94f, 4.66f, 13.27f, 3f, 16f, 3f)
                moveTo(16f, 4.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 7f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 7f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 4.5f)
            }
        }.build()

        return _CommentEye!!
    }

@Suppress("ObjectPropertyName")
private var _CommentEye: ImageVector? = null
