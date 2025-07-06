package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardWirelessOff: ImageVector
    get() {
        if (_CreditCardWirelessOff != null) {
            return _CreditCardWirelessOff!!
        }
        _CreditCardWirelessOff = ImageVector.Builder(
            name = "CreditCardWirelessOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(9.85f, 2f, 7.7f, 2.69f, 5.9f, 4.08f)
                lineTo(7.32f, 5.5f)
                curveTo(10.45f, 3.24f, 14.84f, 3.5f, 17.66f, 6.33f)
                lineTo(19.07f, 4.92f)
                curveTo(17.12f, 2.96f, 14.56f, 2f, 12f, 2f)
                moveTo(3.28f, 4f)
                lineTo(2f, 5.27f)
                lineTo(7.73f, 11f)
                horizontalLineTo(6f)
                curveTo(4.89f, 11f, 4f, 11.9f, 4f, 13f)
                verticalLineTo(21f)
                curveTo(4f, 22.11f, 4.89f, 23f, 6f, 23f)
                horizontalLineTo(18f)
                curveTo(18.5f, 23f, 18.92f, 22.82f, 19.27f, 22.54f)
                lineTo(19.73f, 23f)
                lineTo(21f, 21.72f)
                moveTo(12f, 6f)
                curveTo(10.87f, 6f, 9.75f, 6.31f, 8.77f, 6.94f)
                lineTo(10.24f, 8.41f)
                curveTo(11.73f, 7.68f, 13.58f, 7.92f, 14.83f, 9.16f)
                lineTo(16.24f, 7.75f)
                curveTo(15.07f, 6.58f, 13.54f, 6f, 12f, 6f)
                moveTo(12.82f, 11f)
                lineTo(15.82f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(16.18f)
                lineTo(20f, 18.18f)
                verticalLineTo(13f)
                curveTo(20f, 11.9f, 19.11f, 11f, 18f, 11f)
                moveTo(6f, 14f)
                horizontalLineTo(10.73f)
                lineTo(13.73f, 17f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _CreditCardWirelessOff!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardWirelessOff: ImageVector? = null
