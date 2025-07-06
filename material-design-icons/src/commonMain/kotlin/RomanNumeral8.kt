package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RomanNumeral8: ImageVector
    get() {
        if (_RomanNumeral8 != null) {
            return _RomanNumeral8!!
        }
        _RomanNumeral8 = ImageVector.Builder(
            name = "RomanNumeral8",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 7f)
                lineTo(3f, 17f)
                horizontalLineTo(5f)
                lineTo(7f, 7f)
                horizontalLineTo(5f)
                lineTo(4f, 12f)
                lineTo(3f, 7f)
                horizontalLineTo(1f)
                moveTo(12f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
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
                moveTo(22f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _RomanNumeral8!!
    }

@Suppress("ObjectPropertyName")
private var _RomanNumeral8: ImageVector? = null
