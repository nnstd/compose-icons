package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatFontSizeDecrease: ImageVector
    get() {
        if (_FormatFontSizeDecrease != null) {
            return _FormatFontSizeDecrease!!
        }
        _FormatFontSizeDecrease = ImageVector.Builder(
            name = "FormatFontSizeDecrease",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.12f, 14f)
                lineTo(7.5f, 7.67f)
                lineTo(9.87f, 14f)
                moveTo(6.5f, 5f)
                lineTo(1f, 19f)
                horizontalLineTo(3.25f)
                lineTo(4.37f, 16f)
                horizontalLineTo(10.62f)
                lineTo(11.75f, 19f)
                horizontalLineTo(14f)
                lineTo(8.5f, 5f)
                horizontalLineTo(6.5f)
                moveTo(18f, 17f)
                lineTo(23f, 11.93f)
                lineTo(21.59f, 10.5f)
                lineTo(19f, 13.1f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(13.1f)
                lineTo(14.41f, 10.5f)
                lineTo(13f, 11.93f)
                lineTo(18f, 17f)
                close()
            }
        }.build()

        return _FormatFontSizeDecrease!!
    }

@Suppress("ObjectPropertyName")
private var _FormatFontSizeDecrease: ImageVector? = null
