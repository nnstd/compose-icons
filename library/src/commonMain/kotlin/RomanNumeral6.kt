package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RomanNumeral6: ImageVector
    get() {
        if (_RomanNumeral6 != null) {
            return _RomanNumeral6!!
        }
        _RomanNumeral6 = ImageVector.Builder(
            name = "RomanNumeral6",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 7f)
                lineTo(8f, 17f)
                horizontalLineTo(10f)
                lineTo(12f, 7f)
                horizontalLineTo(10f)
                lineTo(9f, 12f)
                lineTo(8f, 7f)
                horizontalLineTo(6f)
                moveTo(17f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _RomanNumeral6!!
    }

@Suppress("ObjectPropertyName")
private var _RomanNumeral6: ImageVector? = null
