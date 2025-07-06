package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatOverline: ImageVector
    get() {
        if (_FormatOverline != null) {
            return _FormatOverline!!
        }
        _FormatOverline = ImageVector.Builder(
            name = "FormatOverline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                moveTo(9.62f, 16f)
                lineTo(12f, 9.67f)
                lineTo(14.37f, 16f)
                moveTo(11f, 7f)
                lineTo(5.5f, 21f)
                horizontalLineTo(7.75f)
                lineTo(8.87f, 18f)
                horizontalLineTo(15.12f)
                lineTo(16.25f, 21f)
                horizontalLineTo(18.5f)
                lineTo(13f, 7f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _FormatOverline!!
    }

@Suppress("ObjectPropertyName")
private var _FormatOverline: ImageVector? = null
