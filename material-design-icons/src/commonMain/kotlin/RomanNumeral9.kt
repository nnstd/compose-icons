package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RomanNumeral9: ImageVector
    get() {
        if (_RomanNumeral9 != null) {
            return _RomanNumeral9!!
        }
        _RomanNumeral9 = ImageVector.Builder(
            name = "RomanNumeral9",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                moveTo(12f, 7f)
                lineTo(14f, 12f)
                lineTo(12f, 17f)
                horizontalLineTo(14f)
                lineTo(15f, 14.5f)
                lineTo(16f, 17f)
                horizontalLineTo(18f)
                lineTo(16f, 12f)
                lineTo(18f, 7f)
                horizontalLineTo(16f)
                lineTo(15f, 9.5f)
                lineTo(14f, 7f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _RomanNumeral9!!
    }

@Suppress("ObjectPropertyName")
private var _RomanNumeral9: ImageVector? = null
