package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RomanNumeral7: ImageVector
    get() {
        if (_RomanNumeral7 != null) {
            return _RomanNumeral7!!
        }
        _RomanNumeral7 = ImageVector.Builder(
            name = "RomanNumeral7",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 7f)
                lineTo(6f, 17f)
                horizontalLineTo(8f)
                lineTo(10f, 7f)
                horizontalLineTo(8f)
                lineTo(7f, 12f)
                lineTo(6f, 7f)
                horizontalLineTo(4f)
                moveTo(15f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                moveTo(20f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _RomanNumeral7!!
    }

@Suppress("ObjectPropertyName")
private var _RomanNumeral7: ImageVector? = null
