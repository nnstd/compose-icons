package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatLetterSpacing: ImageVector
    get() {
        if (_FormatLetterSpacing != null) {
            return _FormatLetterSpacing!!
        }
        _FormatLetterSpacing = ImageVector.Builder(
            name = "FormatLetterSpacing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.4f, 10.7f)
                horizontalLineTo(18.5f)
                lineTo(16.5f, 5.3f)
                lineTo(14.4f, 10.7f)
                moveTo(15.6f, 3f)
                horizontalLineTo(17.3f)
                lineTo(22f, 15f)
                horizontalLineTo(20.1f)
                lineTo(19.1f, 12.4f)
                horizontalLineTo(13.7f)
                lineTo(12.7f, 15f)
                horizontalLineTo(10.8f)
                lineTo(15.6f, 3f)
                moveTo(11.2f, 3f)
                horizontalLineTo(13.1f)
                lineTo(8.4f, 15f)
                horizontalLineTo(6.7f)
                lineTo(2f, 3f)
                horizontalLineTo(3.9f)
                lineTo(7.5f, 12.7f)
                moveTo(19f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(22f)
                lineTo(2f, 19f)
                lineTo(5f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                lineTo(22f, 19f)
                lineTo(19f, 22f)
                close()
            }
        }.build()

        return _FormatLetterSpacing!!
    }

@Suppress("ObjectPropertyName")
private var _FormatLetterSpacing: ImageVector? = null
