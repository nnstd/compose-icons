package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryCharging: ImageVector
    get() {
        if (_BatteryCharging != null) {
            return _BatteryCharging!!
        }
        _BatteryCharging = ImageVector.Builder(
            name = "BatteryCharging",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.67f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(7.33f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5.33f)
                verticalLineTo(20.66f)
                curveTo(6f, 21.4f, 6.6f, 22f, 7.33f, 22f)
                horizontalLineTo(16.66f)
                curveTo(17.4f, 22f, 18f, 21.4f, 18f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(18f, 4.6f, 17.4f, 4f, 16.67f, 4f)
                moveTo(11f, 20f)
                verticalLineTo(14.5f)
                horizontalLineTo(9f)
                lineTo(13f, 7f)
                verticalLineTo(12.5f)
                horizontalLineTo(15f)
            }
        }.build()

        return _BatteryCharging!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryCharging: ImageVector? = null
