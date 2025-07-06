package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyEurOff: ImageVector
    get() {
        if (_CurrencyEurOff != null) {
            return _CurrencyEurOff!!
        }
        _CurrencyEurOff = ImageVector.Builder(
            name = "CurrencyEurOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(6.7f, 8.59f)
                curveTo(6.64f, 8.73f, 6.57f, 8.86f, 6.5f, 9f)
                horizontalLineTo(3f)
                lineTo(2f, 11f)
                horizontalLineTo(6.06f)
                curveTo(6f, 11.33f, 6f, 11.66f, 6f, 12f)
                reflectiveCurveTo(6f, 12.67f, 6.06f, 13f)
                horizontalLineTo(3f)
                lineTo(2f, 15f)
                horizontalLineTo(6.5f)
                curveTo(7.76f, 18.5f, 11.08f, 21f, 15f, 21f)
                curveTo(16.21f, 21f, 17.36f, 20.74f, 18.41f, 20.3f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(8.58f, 13f)
                curveTo(8.53f, 12.67f, 8.5f, 12.34f, 8.5f, 12f)
                reflectiveCurveTo(8.53f, 11.33f, 8.58f, 11f)
                horizontalLineTo(9.11f)
                lineTo(11.11f, 13f)
                horizontalLineTo(8.58f)
                moveTo(15f, 18.5f)
                curveTo(12.5f, 18.5f, 10.32f, 17.08f, 9.24f, 15f)
                horizontalLineTo(13.11f)
                lineTo(16.44f, 18.33f)
                curveTo(15.97f, 18.43f, 15.5f, 18.5f, 15f, 18.5f)
                moveTo(12.2f, 9f)
                horizontalLineTo(16f)
                lineTo(15f, 11f)
                horizontalLineTo(14.2f)
                lineTo(12.2f, 9f)
                moveTo(10.5f, 7.32f)
                lineTo(8.74f, 5.54f)
                curveTo(10.36f, 3.97f, 12.56f, 3f, 15f, 3f)
                curveTo(17.3f, 3f, 19.41f, 3.87f, 21f, 5.3f)
                lineTo(19.23f, 7.07f)
                curveTo(18.09f, 6.09f, 16.61f, 5.5f, 15f, 5.5f)
                curveTo(13.26f, 5.5f, 11.69f, 6.2f, 10.5f, 7.32f)
                close()
            }
        }.build()

        return _CurrencyEurOff!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyEurOff: ImageVector? = null
