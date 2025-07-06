package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryChargingOutline: ImageVector
    get() {
        if (_BatteryChargingOutline != null) {
            return _BatteryChargingOutline!!
        }
        _BatteryChargingOutline = ImageVector.Builder(
            name = "BatteryChargingOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.05f, 11f)
                horizontalLineTo(20.05f)
                verticalLineTo(4f)
                lineTo(15.05f, 14f)
                horizontalLineTo(18.05f)
                verticalLineTo(22f)
                moveTo(12f, 20f)
                horizontalLineTo(4f)
                lineTo(4.05f, 6f)
                horizontalLineTo(12.05f)
                moveTo(12.72f, 4f)
                horizontalLineTo(11.05f)
                verticalLineTo(2f)
                horizontalLineTo(5.05f)
                verticalLineTo(4f)
                horizontalLineTo(3.38f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.05f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(2.05f, 21.4f, 2.65f, 22f, 3.38f, 22f)
                horizontalLineTo(12.72f)
                curveTo(13.45f, 22f, 14.05f, 21.4f, 14.05f, 20.67f)
                verticalLineTo(5.33f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.72f, 4f)
                close()
            }
        }.build()

        return _BatteryChargingOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryChargingOutline: ImageVector? = null
