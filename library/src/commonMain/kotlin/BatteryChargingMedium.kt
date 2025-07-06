package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryChargingMedium: ImageVector
    get() {
        if (_BatteryChargingMedium != null) {
            return _BatteryChargingMedium!!
        }
        _BatteryChargingMedium = ImageVector.Builder(
            name = "BatteryChargingMedium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                moveTo(12.67f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(3.33f)
                curveTo(2.6f, 4f, 2f, 4.6f, 2f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(2f, 21.4f, 2.6f, 22f, 3.33f, 22f)
                horizontalLineTo(12.67f)
                curveTo(13.41f, 22f, 14f, 21.41f, 14f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(14f, 4.6f, 13.4f, 4f, 12.67f, 4f)
                moveTo(11f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                moveTo(11f, 11.5f)
                horizontalLineTo(5f)
                verticalLineTo(14.5f)
                horizontalLineTo(11f)
                verticalLineTo(11.5f)
                moveTo(23f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(3f)
                lineTo(15f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
            }
        }.build()

        return _BatteryChargingMedium!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryChargingMedium: ImageVector? = null
