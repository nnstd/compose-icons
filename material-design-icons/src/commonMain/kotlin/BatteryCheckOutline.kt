package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryCheckOutline: ImageVector
    get() {
        if (_BatteryCheckOutline != null) {
            return _BatteryCheckOutline!!
        }
        _BatteryCheckOutline = ImageVector.Builder(
            name = "BatteryCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.75f, 21.16f)
                lineTo(14f, 18.16f)
                lineTo(15.16f, 17f)
                lineTo(16.75f, 18.59f)
                lineTo(20.34f, 15f)
                lineTo(21.5f, 16.41f)
                lineTo(16.75f, 21.16f)
                moveTo(12.35f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(12.35f)
                curveTo(16.63f, 12.13f, 17.3f, 12f, 18f, 12f)
                verticalLineTo(5.33f)
                curveTo(18f, 4.6f, 17.4f, 4f, 16.67f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(7.33f)
                curveTo(6.6f, 4f, 6f, 4.6f, 6f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(6f, 21.4f, 6.6f, 22f, 7.33f, 22f)
                horizontalLineTo(13.54f)
                curveTo(13f, 21.42f, 12.61f, 20.75f, 12.35f, 20f)
                close()
            }
        }.build()

        return _BatteryCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryCheckOutline: ImageVector? = null
