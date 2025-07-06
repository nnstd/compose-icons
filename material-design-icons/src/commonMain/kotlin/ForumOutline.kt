package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ForumOutline: ImageVector
    get() {
        if (_ForumOutline != null) {
            return _ForumOutline!!
        }
        _ForumOutline = ImageVector.Builder(
            name = "ForumOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 4f)
                verticalLineTo(11f)
                horizontalLineTo(5.17f)
                lineTo(4f, 12.17f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                moveTo(16f, 2f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3f)
                verticalLineTo(17f)
                lineTo(6f, 13f)
                horizontalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 12f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 2f)
                moveTo(21f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 18f)
                horizontalLineTo(18f)
                lineTo(22f, 22f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 6f)
                close()
            }
        }.build()

        return _ForumOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ForumOutline: ImageVector? = null
