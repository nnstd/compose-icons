package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyJpy: ImageVector
    get() {
        if (_CurrencyJpy != null) {
            return _CurrencyJpy!!
        }
        _CurrencyJpy = ImageVector.Builder(
            name = "CurrencyJpy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.92f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(10.08f)
                lineTo(5f, 3f)
                horizontalLineTo(7.37f)
                lineTo(12f, 10.29f)
                lineTo(16.63f, 3f)
                horizontalLineTo(19f)
                lineTo(13.92f, 11f)
                close()
            }
        }.build()

        return _CurrencyJpy!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyJpy: ImageVector? = null
