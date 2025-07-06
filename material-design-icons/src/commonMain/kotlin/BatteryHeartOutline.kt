package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryHeartOutline: ImageVector
    get() {
        if (_BatteryHeartOutline != null) {
            return _BatteryHeartOutline!!
        }
        _BatteryHeartOutline = ImageVector.Builder(
            name = "BatteryHeartOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 16.2f)
                lineTo(18.4f, 15.7f)
                curveTo(16.4f, 13.8f, 15f, 12.5f, 15f, 11f)
                curveTo(15f, 9.8f, 16f, 8.8f, 17.2f, 8.8f)
                curveTo(17.9f, 8.8f, 18.5f, 9.1f, 19f, 9.6f)
                curveTo(19.5f, 9.1f, 20.1f, 8.8f, 20.8f, 8.8f)
                curveTo(22f, 8.8f, 23f, 9.8f, 23f, 11f)
                curveTo(23f, 12.5f, 21.6f, 13.7f, 19.6f, 15.6f)
                lineTo(19f, 16.2f)
                moveTo(12.7f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(3.3f)
                curveTo(2.6f, 4f, 2f, 4.6f, 2f, 5.3f)
                verticalLineTo(20.6f)
                curveTo(2f, 21.4f, 2.6f, 22f, 3.3f, 22f)
                horizontalLineTo(12.6f)
                curveTo(13.3f, 22f, 13.9f, 21.4f, 13.9f, 20.7f)
                verticalLineTo(5.3f)
                curveTo(14f, 4.6f, 13.4f, 4f, 12.7f, 4f)
                moveTo(12f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _BatteryHeartOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryHeartOutline: ImageVector? = null
