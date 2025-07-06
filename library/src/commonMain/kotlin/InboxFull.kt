package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InboxFull: ImageVector
    get() {
        if (_InboxFull != null) {
            return _InboxFull!!
        }
        _InboxFull = ImageVector.Builder(
            name = "InboxFull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                curveTo(9f, 16.66f, 10.34f, 18f, 12f, 18f)
                curveTo(13.66f, 18f, 15f, 16.66f, 15f, 15f)
                horizontalLineTo(19f)
                moveTo(19f, 3f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.1f, 20.1f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                lineTo(3f, 5f)
                curveTo(3f, 3.9f, 3.89f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                moveTo(7f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                moveTo(7f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _InboxFull!!
    }

@Suppress("ObjectPropertyName")
private var _InboxFull: ImageVector? = null
