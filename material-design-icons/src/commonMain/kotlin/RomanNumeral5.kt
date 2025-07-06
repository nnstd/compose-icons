package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RomanNumeral5: ImageVector
    get() {
        if (_RomanNumeral5 != null) {
            return _RomanNumeral5!!
        }
        _RomanNumeral5 = ImageVector.Builder(
            name = "RomanNumeral5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                lineTo(11f, 17f)
                horizontalLineTo(13f)
                lineTo(15f, 7f)
                horizontalLineTo(13f)
                lineTo(12f, 12f)
                lineTo(11f, 7f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _RomanNumeral5!!
    }

@Suppress("ObjectPropertyName")
private var _RomanNumeral5: ImageVector? = null
