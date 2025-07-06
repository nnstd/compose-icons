package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalculatorVariantOutline: ImageVector
    get() {
        if (_CalculatorVariantOutline != null) {
            return _CalculatorVariantOutline!!
        }
        _CalculatorVariantOutline = ImageVector.Builder(
            name = "CalculatorVariantOutline",
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
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(6.2f, 7.7f)
                horizontalLineTo(11.2f)
                verticalLineTo(9.2f)
                horizontalLineTo(6.2f)
                verticalLineTo(7.7f)
                moveTo(13f, 15.8f)
                horizontalLineTo(18f)
                verticalLineTo(17.3f)
                horizontalLineTo(13f)
                verticalLineTo(15.8f)
                moveTo(13f, 13.2f)
                horizontalLineTo(18f)
                verticalLineTo(14.7f)
                horizontalLineTo(13f)
                verticalLineTo(13.2f)
                moveTo(8f, 18f)
                horizontalLineTo(9.5f)
                verticalLineTo(16f)
                horizontalLineTo(11.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(8f)
                verticalLineTo(14.5f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                moveTo(14.1f, 10.9f)
                lineTo(15.5f, 9.5f)
                lineTo(16.9f, 10.9f)
                lineTo(18f, 9.9f)
                lineTo(16.6f, 8.5f)
                lineTo(18f, 7.1f)
                lineTo(16.9f, 6f)
                lineTo(15.5f, 7.4f)
                lineTo(14.1f, 6f)
                lineTo(13f, 7.1f)
                lineTo(14.4f, 8.5f)
                lineTo(13f, 9.9f)
                lineTo(14.1f, 10.9f)
                close()
            }
        }.build()

        return _CalculatorVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalculatorVariantOutline: ImageVector? = null
