package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryHigh: ImageVector
    get() {
        if (_BatteryHigh != null) {
            return _BatteryHigh!!
        }
        _BatteryHigh = ImageVector.Builder(
            name = "BatteryHigh",
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
                moveTo(15f, 7f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                moveTo(15f, 11.5f)
                horizontalLineTo(9f)
                verticalLineTo(14.5f)
                horizontalLineTo(15f)
                verticalLineTo(11.5f)
                close()
            }
        }.build()

        return _BatteryHigh!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryHigh: ImageVector? = null
