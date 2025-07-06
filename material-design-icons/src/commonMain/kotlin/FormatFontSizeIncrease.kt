package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatFontSizeIncrease: ImageVector
    get() {
        if (_FormatFontSizeIncrease != null) {
            return _FormatFontSizeIncrease!!
        }
        _FormatFontSizeIncrease = ImageVector.Builder(
            name = "FormatFontSizeIncrease",
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
                moveTo(18f, 7f)
                lineTo(13f, 12.07f)
                lineTo(14.41f, 13.5f)
                lineTo(17f, 10.9f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(10.9f)
                lineTo(21.59f, 13.5f)
                lineTo(23f, 12.07f)
                lineTo(18f, 7f)
                close()
            }
        }.build()

        return _FormatFontSizeIncrease!!
    }

@Suppress("ObjectPropertyName")
private var _FormatFontSizeIncrease: ImageVector? = null
