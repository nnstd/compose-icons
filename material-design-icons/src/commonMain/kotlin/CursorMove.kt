package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CursorMove: ImageVector
    get() {
        if (_CursorMove != null) {
            return _CursorMove!!
        }
        _CursorMove = ImageVector.Builder(
            name = "CursorMove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 6f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(7.75f)
                lineTo(22.25f, 12f)
                lineTo(18f, 16.25f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(16.25f)
                lineTo(12f, 22.25f)
                lineTo(7.75f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(16.25f)
                lineTo(1.75f, 12f)
                lineTo(6f, 7.75f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(7.75f)
                lineTo(12f, 1.75f)
                lineTo(16.25f, 6f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _CursorMove!!
    }

@Suppress("ObjectPropertyName")
private var _CursorMove: ImageVector? = null
