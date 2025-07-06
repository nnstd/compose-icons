package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatQuoteOpen: ImageVector
    get() {
        if (_FormatQuoteOpen != null) {
            return _FormatQuoteOpen!!
        }
        _FormatQuoteOpen = ImageVector.Builder(
            name = "FormatQuoteOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 7f)
                lineTo(8f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                lineTo(7f, 7f)
                horizontalLineTo(10f)
                moveTo(18f, 7f)
                lineTo(16f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                lineTo(15f, 7f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _FormatQuoteOpen!!
    }

@Suppress("ObjectPropertyName")
private var _FormatQuoteOpen: ImageVector? = null
