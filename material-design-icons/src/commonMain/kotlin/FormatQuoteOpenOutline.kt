package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatQuoteOpenOutline: ImageVector
    get() {
        if (_FormatQuoteOpenOutline != null) {
            return _FormatQuoteOpenOutline!!
        }
        _FormatQuoteOpenOutline = ImageVector.Builder(
            name = "FormatQuoteOpenOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 18f)
                verticalLineTo(10f)
                horizontalLineTo(9.12f)
                lineTo(11.12f, 6f)
                horizontalLineTo(5.38f)
                lineTo(3f, 10.76f)
                verticalLineTo(18f)
                moveTo(9f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(11.24f)
                lineTo(6.62f, 8f)
                horizontalLineTo(7.88f)
                lineTo(5.88f, 12f)
                horizontalLineTo(9f)
                moveTo(21f, 18f)
                verticalLineTo(10f)
                horizontalLineTo(19.12f)
                lineTo(21.12f, 6f)
                horizontalLineTo(15.38f)
                lineTo(13f, 10.76f)
                verticalLineTo(18f)
                moveTo(19f, 16f)
                horizontalLineTo(15f)
                verticalLineTo(11.24f)
                lineTo(16.62f, 8f)
                horizontalLineTo(17.88f)
                lineTo(15.88f, 12f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _FormatQuoteOpenOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FormatQuoteOpenOutline: ImageVector? = null
