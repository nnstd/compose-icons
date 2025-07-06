package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardWireless: ImageVector
    get() {
        if (_CreditCardWireless != null) {
            return _CreditCardWireless!!
        }
        _CreditCardWireless = ImageVector.Builder(
            name = "CreditCardWireless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(18f, 11f)
                horizontalLineTo(6f)
                curveTo(4.89f, 11f, 4f, 11.9f, 4f, 13f)
                verticalLineTo(21f)
                curveTo(4f, 22.11f, 4.89f, 23f, 6f, 23f)
                horizontalLineTo(18f)
                curveTo(19.11f, 23f, 20f, 22.11f, 20f, 21f)
                verticalLineTo(13f)
                curveTo(20f, 11.9f, 19.11f, 11f, 18f, 11f)
                moveTo(18f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _CreditCardWireless!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardWireless: ImageVector? = null
