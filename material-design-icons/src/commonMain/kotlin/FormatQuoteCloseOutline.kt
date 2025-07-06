package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatQuoteCloseOutline: ImageVector
    get() {
        if (_FormatQuoteCloseOutline != null) {
            return _FormatQuoteCloseOutline!!
        }
        _FormatQuoteCloseOutline = ImageVector.Builder(
            name = "FormatQuoteCloseOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 6f)
                verticalLineTo(14f)
                horizontalLineTo(14.88f)
                lineTo(12.88f, 18f)
                horizontalLineTo(18.62f)
                lineTo(21f, 13.24f)
                verticalLineTo(6f)
                moveTo(15f, 8f)
                horizontalLineTo(19f)
                verticalLineTo(12.76f)
                lineTo(17.38f, 16f)
                horizontalLineTo(16.12f)
                lineTo(18.12f, 12f)
                horizontalLineTo(15f)
                moveTo(3f, 6f)
                verticalLineTo(14f)
                horizontalLineTo(4.88f)
                lineTo(2.88f, 18f)
                horizontalLineTo(8.62f)
                lineTo(11f, 13.24f)
                verticalLineTo(6f)
                moveTo(5f, 8f)
                horizontalLineTo(9f)
                verticalLineTo(12.76f)
                lineTo(7.38f, 16f)
                horizontalLineTo(6.12f)
                lineTo(8.12f, 12f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _FormatQuoteCloseOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FormatQuoteCloseOutline: ImageVector? = null
