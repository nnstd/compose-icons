package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookmarkCheckOutline: ImageVector
    get() {
        if (_BookmarkCheckOutline != null) {
            return _BookmarkCheckOutline!!
        }
        _BookmarkCheckOutline = ImageVector.Builder(
            name = "BookmarkCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.47f, 9.65f)
                lineTo(8.06f, 11.07f)
                lineTo(11f, 14f)
                lineTo(16.19f, 8.82f)
                lineTo(14.78f, 7.4f)
                lineTo(11f, 11.18f)
                moveTo(17f, 3f)
                horizontalLineTo(7f)
                curveTo(5.9f, 3f, 5f, 3.9f, 5f, 5f)
                lineTo(5f, 21f)
                lineTo(12f, 18f)
                lineTo(19f, 21f)
                verticalLineTo(5f)
                curveTo(19f, 3.9f, 18.1f, 3f, 17f, 3f)
                moveTo(17f, 18f)
                lineTo(12f, 15.82f)
                lineTo(7f, 18f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _BookmarkCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkCheckOutline: ImageVector? = null
