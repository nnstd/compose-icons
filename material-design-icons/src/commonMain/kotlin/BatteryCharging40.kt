package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryCharging40: ImageVector
    get() {
        if (_BatteryCharging40 != null) {
            return _BatteryCharging40!!
        }
        _BatteryCharging40 = ImageVector.Builder(
            name = "BatteryCharging40",
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
                moveTo(12f, 14.5f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                verticalLineTo(14.5f)
                moveTo(23f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                lineTo(15f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
            }
        }.build()

        return _BatteryCharging40!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryCharging40: ImageVector? = null
