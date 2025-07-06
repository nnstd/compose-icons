package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookmarkPlus: ImageVector
    get() {
        if (_BookmarkPlus != null) {
            return _BookmarkPlus!!
        }
        _BookmarkPlus = ImageVector.Builder(
            name = "BookmarkPlus",
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
                moveTo(11f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _BookmarkPlus!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkPlus: ImageVector? = null
