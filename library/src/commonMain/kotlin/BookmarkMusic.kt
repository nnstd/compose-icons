package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookmarkMusic: ImageVector
    get() {
        if (_BookmarkMusic != null) {
            return _BookmarkMusic!!
        }
        _BookmarkMusic = ImageVector.Builder(
            name = "BookmarkMusic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 5f)
                verticalLineTo(21f)
                lineTo(12f, 18f)
                lineTo(5f, 21f)
                verticalLineTo(5f)
                curveTo(5f, 3.89f, 5.9f, 3f, 7f, 3f)
                horizontalLineTo(17f)
                moveTo(11f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 13f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                verticalLineTo(11.27f)
                curveTo(11.71f, 11.1f, 11.36f, 11f, 11f, 11f)
                close()
            }
        }.build()

        return _BookmarkMusic!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkMusic: ImageVector? = null
