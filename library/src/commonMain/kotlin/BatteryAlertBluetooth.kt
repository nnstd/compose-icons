package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryAlertBluetooth: ImageVector
    get() {
        if (_BatteryAlertBluetooth != null) {
            return _BatteryAlertBluetooth!!
        }
        _BatteryAlertBluetooth = ImageVector.Builder(
            name = "BatteryAlertBluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(3.3f)
                curveTo(2.6f, 4f, 2f, 4.6f, 2f, 5.3f)
                verticalLineTo(20.6f)
                curveTo(2f, 21.4f, 2.6f, 22f, 3.3f, 22f)
                horizontalLineTo(12.6f)
                curveTo(13.3f, 22f, 13.9f, 21.4f, 13.9f, 20.7f)
                verticalLineTo(5.3f)
                curveTo(14f, 4.6f, 13.4f, 4f, 12.7f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                moveTo(19f, 8f)
                verticalLineTo(11.8f)
                lineTo(16.7f, 9.5f)
                lineTo(16f, 10.2f)
                lineTo(18.8f, 13f)
                lineTo(16f, 15.8f)
                lineTo(16.7f, 16.5f)
                lineTo(19f, 14.2f)
                verticalLineTo(18f)
                horizontalLineTo(19.5f)
                lineTo(22.4f, 15.1f)
                lineTo(20.2f, 13f)
                lineTo(22.3f, 10.9f)
                lineTo(19.5f, 8f)
                horizontalLineTo(19f)
                moveTo(7f, 8f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                moveTo(20f, 9.9f)
                lineTo(20.9f, 10.8f)
                lineTo(20f, 11.8f)
                verticalLineTo(9.9f)
                moveTo(20f, 14.2f)
                lineTo(20.9f, 15.1f)
                lineTo(20f, 16.1f)
                verticalLineTo(14.2f)
                moveTo(7f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _BatteryAlertBluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryAlertBluetooth: ImageVector? = null
