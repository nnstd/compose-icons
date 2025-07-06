package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryChargingWireless20: ImageVector
    get() {
        if (_BatteryChargingWireless20 != null) {
            return _BatteryChargingWireless20!!
        }
        _BatteryChargingWireless20 = ImageVector.Builder(
            name = "BatteryChargingWireless20",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.07f, 4.93f)
                lineTo(18.66f, 6.34f)
                curveTo(21.79f, 9.46f, 21.79f, 14.53f, 18.66f, 17.66f)
                lineTo(20.07f, 19.07f)
                curveTo(23.97f, 15.17f, 23.97f, 8.84f, 20.07f, 4.93f)
                moveTo(17.24f, 7.76f)
                lineTo(15.83f, 9.17f)
                curveTo(17.39f, 10.73f, 17.39f, 13.26f, 15.83f, 14.83f)
                lineTo(17.24f, 16.24f)
                curveTo(19.58f, 13.9f, 19.58f, 10.1f, 17.24f, 7.76f)
                moveTo(13f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 22f)
                horizontalLineTo(13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 21f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 4f)
                moveTo(12f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _BatteryChargingWireless20!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryChargingWireless20: ImageVector? = null
