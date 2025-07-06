package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatItalic: ImageVector
    get() {
        if (_FormatItalic != null) {
            return _FormatItalic!!
        }
        _FormatItalic = ImageVector.Builder(
            name = "FormatItalic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(12.21f)
                lineTo(8.79f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(11.79f)
                lineTo(15.21f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _FormatItalic!!
    }

@Suppress("ObjectPropertyName")
private var _FormatItalic: ImageVector? = null
