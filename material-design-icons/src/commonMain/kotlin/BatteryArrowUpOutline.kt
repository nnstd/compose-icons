package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryArrowUpOutline: ImageVector
    get() {
        if (_BatteryArrowUpOutline != null) {
            return _BatteryArrowUpOutline!!
        }
        _BatteryArrowUpOutline = ImageVector.Builder(
            name = "BatteryArrowUpOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.54f, 22f)
                horizontalLineTo(7.33f)
                curveTo(6.6f, 22f, 6f, 21.4f, 6f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(6f, 4.6f, 6.6f, 4f, 7.33f, 4f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(16.67f)
                curveTo(17.4f, 4f, 18f, 4.6f, 18f, 5.33f)
                verticalLineTo(12f)
                curveTo(17.3f, 12f, 16.63f, 12.13f, 16f, 12.35f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(12.35f)
                curveTo(12.61f, 20.75f, 13f, 21.42f, 13.54f, 22f)
                moveTo(20.94f, 17.5f)
                lineTo(17.94f, 14.5f)
                lineTo(14.94f, 17.5f)
                horizontalLineTo(16.94f)
                verticalLineTo(21.5f)
                horizontalLineTo(18.94f)
                verticalLineTo(17.5f)
                horizontalLineTo(20.94f)
            }
        }.build()

        return _BatteryArrowUpOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryArrowUpOutline: ImageVector? = null
