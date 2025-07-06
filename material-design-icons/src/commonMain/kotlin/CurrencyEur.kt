package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyEur: ImageVector
    get() {
        if (_CurrencyEur != null) {
            return _CurrencyEur!!
        }
        _CurrencyEur = ImageVector.Builder(
            name = "CurrencyEur",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 18.5f)
                curveTo(12.5f, 18.5f, 10.32f, 17.08f, 9.24f, 15f)
                horizontalLineTo(15f)
                lineTo(16f, 13f)
                horizontalLineTo(8.58f)
                curveTo(8.53f, 12.67f, 8.5f, 12.34f, 8.5f, 12f)
                reflectiveCurveTo(8.53f, 11.33f, 8.58f, 11f)
                horizontalLineTo(15f)
                lineTo(16f, 9f)
                horizontalLineTo(9.24f)
                curveTo(10.32f, 6.92f, 12.5f, 5.5f, 15f, 5.5f)
                curveTo(16.61f, 5.5f, 18.09f, 6.09f, 19.23f, 7.07f)
                lineTo(21f, 5.3f)
                curveTo(19.41f, 3.87f, 17.3f, 3f, 15f, 3f)
                curveTo(11.08f, 3f, 7.76f, 5.5f, 6.5f, 9f)
                horizontalLineTo(3f)
                lineTo(2f, 11f)
                horizontalLineTo(6.06f)
                curveTo(6f, 11.33f, 6f, 11.66f, 6f, 12f)
                reflectiveCurveTo(6f, 12.67f, 6.06f, 13f)
                horizontalLineTo(3f)
                lineTo(2f, 15f)
                horizontalLineTo(6.5f)
                curveTo(7.76f, 18.5f, 11.08f, 21f, 15f, 21f)
                curveTo(17.31f, 21f, 19.41f, 20.13f, 21f, 18.7f)
                lineTo(19.22f, 16.93f)
                curveTo(18.09f, 17.91f, 16.62f, 18.5f, 15f, 18.5f)
                close()
            }
        }.build()

        return _CurrencyEur!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyEur: ImageVector? = null
