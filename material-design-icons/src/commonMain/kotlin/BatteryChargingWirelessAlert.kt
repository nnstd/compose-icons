package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryChargingWirelessAlert: ImageVector
    get() {
        if (_BatteryChargingWirelessAlert != null) {
            return _BatteryChargingWirelessAlert!!
        }
        _BatteryChargingWirelessAlert = ImageVector.Builder(
            name = "BatteryChargingWirelessAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                curveTo(2.4f, 4f, 2f, 4.4f, 2f, 5f)
                verticalLineTo(21f)
                curveTo(2f, 21.6f, 2.4f, 22f, 3f, 22f)
                horizontalLineTo(13f)
                curveTo(13.6f, 22f, 14f, 21.6f, 14f, 21f)
                verticalLineTo(5f)
                curveTo(14f, 4.4f, 13.6f, 4f, 13f, 4f)
                moveTo(9f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                moveTo(9f, 14f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                moveTo(20.1f, 4.9f)
                lineTo(18.7f, 6.3f)
                curveTo(21.8f, 9.4f, 21.8f, 14.5f, 18.7f, 17.6f)
                lineTo(20.1f, 19f)
                curveTo(24f, 15.2f, 24f, 8.8f, 20.1f, 4.9f)
                moveTo(17.2f, 7.8f)
                lineTo(15.8f, 9.2f)
                curveTo(17.4f, 10.8f, 17.4f, 13.3f, 15.8f, 14.9f)
                lineTo(17.2f, 16.3f)
                curveTo(19.6f, 13.9f, 19.6f, 10.1f, 17.2f, 7.8f)
                close()
            }
        }.build()

        return _BatteryChargingWirelessAlert!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryChargingWirelessAlert: ImageVector? = null
