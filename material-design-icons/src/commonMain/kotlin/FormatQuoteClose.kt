package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatQuoteClose: ImageVector
    get() {
        if (_FormatQuoteClose != null) {
            return _FormatQuoteClose!!
        }
        _FormatQuoteClose = ImageVector.Builder(
            name = "FormatQuoteClose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 17f)
                horizontalLineTo(17f)
                lineTo(19f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                moveTo(6f, 17f)
                horizontalLineTo(9f)
                lineTo(11f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                lineTo(6f, 17f)
                close()
            }
        }.build()

        return _FormatQuoteClose!!
    }

@Suppress("ObjectPropertyName")
private var _FormatQuoteClose: ImageVector? = null
