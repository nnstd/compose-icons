package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryAlert: ImageVector
    get() {
        if (_BatteryAlert != null) {
            return _BatteryAlert!!
        }
        _BatteryAlert = ImageVector.Builder(
            name = "BatteryAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                moveTo(13f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                moveTo(16.7f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(7.3f)
                curveTo(6.6f, 4f, 6f, 4.6f, 6f, 5.3f)
                verticalLineTo(20.6f)
                curveTo(6f, 21.4f, 6.6f, 22f, 7.3f, 22f)
                horizontalLineTo(16.6f)
                curveTo(17.3f, 22f, 17.9f, 21.4f, 17.9f, 20.7f)
                verticalLineTo(5.3f)
                curveTo(18f, 4.6f, 17.4f, 4f, 16.7f, 4f)
                close()
            }
        }.build()

        return _BatteryAlert!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryAlert: ImageVector? = null
