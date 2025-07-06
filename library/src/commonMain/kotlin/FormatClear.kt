package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatClear: ImageVector
    get() {
        if (_FormatClear != null) {
            return _FormatClear!!
        }
        _FormatClear = ImageVector.Builder(
            name = "FormatClear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 5f)
                verticalLineTo(5.18f)
                lineTo(8.82f, 8f)
                horizontalLineTo(11.22f)
                lineTo(10.5f, 9.68f)
                lineTo(12.6f, 11.78f)
                lineTo(14.21f, 8f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                moveTo(3.27f, 5f)
                lineTo(2f, 6.27f)
                lineTo(8.97f, 13.24f)
                lineTo(6.5f, 19f)
                horizontalLineTo(9.5f)
                lineTo(11.07f, 15.34f)
                lineTo(16.73f, 21f)
                lineTo(18f, 19.73f)
                lineTo(3.55f, 5.27f)
                lineTo(3.27f, 5f)
                close()
            }
        }.build()

        return _FormatClear!!
    }

@Suppress("ObjectPropertyName")
private var _FormatClear: ImageVector? = null
