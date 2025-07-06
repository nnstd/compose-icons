package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardWirelessOutline: ImageVector
    get() {
        if (_CreditCardWirelessOutline != null) {
            return _CreditCardWirelessOutline!!
        }
        _CreditCardWirelessOutline = ImageVector.Builder(
            name = "CreditCardWirelessOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 11f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 13f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 23f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 21f)
                verticalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 11f)
                moveTo(18f, 21f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                moveTo(18f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                moveTo(4.93f, 4.92f)
                lineTo(6.34f, 6.33f)
                curveTo(9.46f, 3.2f, 14.53f, 3.2f, 17.66f, 6.33f)
                lineTo(19.07f, 4.92f)
                curveTo(15.17f, 1f, 8.84f, 1f, 4.93f, 4.92f)
                moveTo(7.76f, 7.75f)
                lineTo(9.17f, 9.16f)
                curveTo(10.73f, 7.6f, 13.26f, 7.6f, 14.83f, 9.16f)
                lineTo(16.24f, 7.75f)
                curveTo(13.9f, 5.41f, 10.1f, 5.41f, 7.76f, 7.75f)
                close()
            }
        }.build()

        return _CreditCardWirelessOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardWirelessOutline: ImageVector? = null
