package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RomanNumeral4: ImageVector
    get() {
        if (_RomanNumeral4 != null) {
            return _RomanNumeral4!!
        }
        _RomanNumeral4 = ImageVector.Builder(
            name = "RomanNumeral4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                lineTo(14f, 17f)
                horizontalLineTo(16f)
                lineTo(18f, 7f)
                horizontalLineTo(16f)
                lineTo(15f, 12f)
                lineTo(14f, 7f)
                horizontalLineTo(12f)
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
                close()
            }
        }.build()

        return _RomanNumeral4!!
    }

@Suppress("ObjectPropertyName")
private var _RomanNumeral4: ImageVector? = null
