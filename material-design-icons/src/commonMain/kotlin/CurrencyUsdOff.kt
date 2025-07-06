package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyUsdOff: ImageVector
    get() {
        if (_CurrencyUsdOff != null) {
            return _CurrencyUsdOff!!
        }
        _CurrencyUsdOff = ImageVector.Builder(
            name = "CurrencyUsdOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4.27f)
                lineTo(4.28f, 3f)
                lineTo(21f, 19.72f)
                lineTo(19.73f, 21f)
                lineTo(16.06f, 17.33f)
                curveTo(15.44f, 18f, 14.54f, 18.55f, 13.5f, 18.82f)
                verticalLineTo(21f)
                horizontalLineTo(10.5f)
                verticalLineTo(18.82f)
                curveTo(8.47f, 18.31f, 7f, 16.79f, 7f, 15f)
                horizontalLineTo(9f)
                curveTo(9f, 16.08f, 10.37f, 17f, 12f, 17f)
                curveTo(13.13f, 17f, 14.14f, 16.56f, 14.65f, 15.92f)
                lineTo(11.68f, 12.95f)
                curveTo(9.58f, 12.42f, 7f, 11.75f, 7f, 9f)
                curveTo(7f, 8.77f, 7f, 8.55f, 7.07f, 8.34f)
                lineTo(3f, 4.27f)
                moveTo(10.5f, 5.18f)
                verticalLineTo(3f)
                horizontalLineTo(13.5f)
                verticalLineTo(5.18f)
                curveTo(15.53f, 5.69f, 17f, 7.21f, 17f, 9f)
                horizontalLineTo(15f)
                curveTo(15f, 7.92f, 13.63f, 7f, 12f, 7f)
                curveTo(11.63f, 7f, 11.28f, 7.05f, 10.95f, 7.13f)
                lineTo(9.4f, 5.58f)
                lineTo(10.5f, 5.18f)
                close()
            }
        }.build()

        return _CurrencyUsdOff!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyUsdOff: ImageVector? = null
