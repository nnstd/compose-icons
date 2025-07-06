package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryCharging70: ImageVector
    get() {
        if (_BatteryCharging70 != null) {
            return _BatteryCharging70!!
        }
        _BatteryCharging70 = ImageVector.Builder(
            name = "BatteryCharging70",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                moveTo(12.67f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(3.33f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(2f, 21.4f, 2.6f, 22f, 3.33f, 22f)
                horizontalLineTo(12.67f)
                curveTo(13.4f, 22f, 14f, 21.4f, 14f, 20.67f)
                verticalLineTo(5.33f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.67f, 4f)
                moveTo(23f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                lineTo(15f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                lineTo(23f, 11f)
                close()
            }
        }.build()

        return _BatteryCharging70!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryCharging70: ImageVector? = null
