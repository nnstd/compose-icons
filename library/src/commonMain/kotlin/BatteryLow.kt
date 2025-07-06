package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryLow: ImageVector
    get() {
        if (_BatteryLow != null) {
            return _BatteryLow!!
        }
        _BatteryLow = ImageVector.Builder(
            name = "BatteryLow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                moveTo(16.67f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(7.33f)
                curveTo(6.6f, 4f, 6f, 4.6f, 6f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(6f, 21.4f, 6.6f, 22f, 7.33f, 22f)
                horizontalLineTo(16.67f)
                curveTo(17.41f, 22f, 18f, 21.41f, 18f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(18f, 4.6f, 17.4f, 4f, 16.67f, 4f)
                moveTo(15f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
            }
        }.build()

        return _BatteryLow!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryLow: ImageVector? = null
