package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookmarkMinusOutline: ImageVector
    get() {
        if (_BookmarkMinusOutline != null) {
            return _BookmarkMinusOutline!!
        }
        _BookmarkMinusOutline = ImageVector.Builder(
            name = "BookmarkMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 11f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                moveTo(19f, 5f)
                verticalLineTo(21f)
                lineTo(12f, 18f)
                lineTo(5f, 21f)
                verticalLineTo(5f)
                curveTo(5f, 3.89f, 5.9f, 3f, 7f, 3f)
                horizontalLineTo(17f)
                curveTo(18.11f, 3f, 19f, 3.9f, 19f, 5f)
                moveTo(17f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                lineTo(12f, 15.82f)
                lineTo(17f, 18f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _BookmarkMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkMinusOutline: ImageVector? = null
