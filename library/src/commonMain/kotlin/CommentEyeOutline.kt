package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CommentEyeOutline: ImageVector
    get() {
        if (_CommentEyeOutline != null) {
            return _CommentEyeOutline!!
        }
        _CommentEyeOutline = ImageVector.Builder(
            name = "CommentEyeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(18f, 12.75f)
                verticalLineTo(16f)
                horizontalLineTo(13.08f)
                lineTo(10f, 19.08f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(8.27f)
                curveTo(8.59f, 5.27f, 9f, 4.6f, 9.5f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(16f)
                curveTo(2f, 17.11f, 2.9f, 18f, 4f, 18f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 22f)
                horizontalLineTo(9.5f)
                curveTo(9.75f, 22f, 10f, 21.9f, 10.2f, 21.71f)
                lineTo(13.9f, 18f)
                horizontalLineTo(18f)
                curveTo(19.11f, 18f, 20f, 17.11f, 20f, 16f)
                verticalLineTo(12f)
                curveTo(19.37f, 12.33f, 18.7f, 12.58f, 18f, 12.75f)
                close()
            }
        }.build()

        return _CommentEyeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CommentEyeOutline: ImageVector? = null
