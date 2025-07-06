package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyKrw: ImageVector
    get() {
        if (_CurrencyKrw != null) {
            return _CurrencyKrw!!
        }
        _CurrencyKrw = ImageVector.Builder(
            name = "CurrencyKrw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                horizontalLineTo(4f)
                lineTo(5.33f, 9f)
                horizontalLineTo(9.33f)
                lineTo(10.67f, 3f)
                horizontalLineTo(13.33f)
                lineTo(14.67f, 9f)
                horizontalLineTo(18.67f)
                lineTo(20f, 3f)
                horizontalLineTo(22f)
                lineTo(20.67f, 9f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(20.22f)
                lineTo(19.78f, 13f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(19.33f)
                lineTo(18f, 21f)
                horizontalLineTo(15.33f)
                lineTo(14f, 15f)
                horizontalLineTo(10f)
                lineTo(8.67f, 21f)
                horizontalLineTo(6f)
                lineTo(4.67f, 15f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(4.22f)
                lineTo(3.78f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(3.33f)
                lineTo(2f, 3f)
                moveTo(13.11f, 11f)
                horizontalLineTo(10.89f)
                lineTo(10.44f, 13f)
                horizontalLineTo(13.56f)
                lineTo(13.11f, 11f)
                moveTo(7.33f, 18f)
                lineTo(8f, 15f)
                horizontalLineTo(6.67f)
                lineTo(7.33f, 18f)
                moveTo(8.89f, 11f)
                horizontalLineTo(5.78f)
                lineTo(6.22f, 13f)
                horizontalLineTo(8.44f)
                lineTo(8.89f, 11f)
                moveTo(16.67f, 18f)
                lineTo(17.33f, 15f)
                horizontalLineTo(16f)
                lineTo(16.67f, 18f)
                moveTo(18.22f, 11f)
                horizontalLineTo(15.11f)
                lineTo(15.56f, 13f)
                horizontalLineTo(17.78f)
                lineTo(18.22f, 11f)
                moveTo(12f, 6f)
                lineTo(11.33f, 9f)
                horizontalLineTo(12.67f)
                lineTo(12f, 6f)
                close()
            }
        }.build()

        return _CurrencyKrw!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyKrw: ImageVector? = null
