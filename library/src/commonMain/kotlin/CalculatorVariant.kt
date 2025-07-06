package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalculatorVariant: ImageVector
    get() {
        if (_CalculatorVariant != null) {
            return _CalculatorVariant!!
        }
        _CalculatorVariant = ImageVector.Builder(
            name = "CalculatorVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(13f, 7.1f)
                lineTo(14.1f, 6f)
                lineTo(15.5f, 7.4f)
                lineTo(16.9f, 6f)
                lineTo(18f, 7.1f)
                lineTo(16.6f, 8.5f)
                lineTo(18f, 9.9f)
                lineTo(16.9f, 11f)
                lineTo(15.5f, 9.6f)
                lineTo(14.1f, 11f)
                lineTo(13f, 9.9f)
                lineTo(14.4f, 8.5f)
                lineTo(13f, 7.1f)
                moveTo(6.2f, 7.7f)
                horizontalLineTo(11.2f)
                verticalLineTo(9.2f)
                horizontalLineTo(6.2f)
                verticalLineTo(7.7f)
                moveTo(11.5f, 16f)
                horizontalLineTo(9.5f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(14.5f)
                horizontalLineTo(8f)
                verticalLineTo(12.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(16f)
                moveTo(18f, 17.2f)
                horizontalLineTo(13f)
                verticalLineTo(15.7f)
                horizontalLineTo(18f)
                verticalLineTo(17.2f)
                moveTo(18f, 14.8f)
                horizontalLineTo(13f)
                verticalLineTo(13.3f)
                horizontalLineTo(18f)
                verticalLineTo(14.8f)
                close()
            }
        }.build()

        return _CalculatorVariant!!
    }

@Suppress("ObjectPropertyName")
private var _CalculatorVariant: ImageVector? = null
