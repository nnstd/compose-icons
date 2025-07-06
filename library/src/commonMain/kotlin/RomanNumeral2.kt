package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RomanNumeral2: ImageVector
    get() {
        if (_RomanNumeral2 != null) {
            return _RomanNumeral2!!
        }
        _RomanNumeral2 = ImageVector.Builder(
            name = "RomanNumeral2",
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

        return _RomanNumeral2!!
    }

@Suppress("ObjectPropertyName")
private var _RomanNumeral2: ImageVector? = null
