package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryLock: ImageVector
    get() {
        if (_BatteryLock != null) {
            return _BatteryLock!!
        }
        _BatteryLock = ImageVector.Builder(
            name = "BatteryLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.8f, 16f)
                verticalLineTo(14.5f)
                curveTo(19.8f, 13.1f, 18.4f, 12f, 17f, 12f)
                reflectiveCurveTo(14.2f, 13.1f, 14.2f, 14.5f)
                verticalLineTo(16f)
                curveTo(13.6f, 16f, 13f, 16.6f, 13f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(13f, 21.4f, 13.6f, 22f, 14.2f, 22f)
                horizontalLineTo(19.7f)
                curveTo(20.4f, 22f, 21f, 21.4f, 21f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(21f, 16.6f, 20.4f, 16f, 19.8f, 16f)
                moveTo(18.5f, 16f)
                horizontalLineTo(15.5f)
                verticalLineTo(14.5f)
                curveTo(15.5f, 13.7f, 16.2f, 13.2f, 17f, 13.2f)
                reflectiveCurveTo(18.5f, 13.7f, 18.5f, 14.5f)
                verticalLineTo(16f)
                moveTo(11.27f, 22f)
                horizontalLineTo(5.33f)
                curveTo(4.6f, 22f, 4f, 21.4f, 4f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(4f, 4.6f, 4.6f, 4f, 5.33f, 4f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(14.67f)
                curveTo(15.4f, 4f, 16f, 4.6f, 16f, 5.33f)
                verticalLineTo(10.11f)
                curveTo(13.86f, 10.55f, 12.2f, 12.38f, 12.2f, 14.5f)
                verticalLineTo(14.74f)
                curveTo(11.5f, 15.34f, 11f, 16.24f, 11f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(11f, 21.16f, 11.1f, 21.6f, 11.27f, 22f)
                close()
            }
        }.build()

        return _BatteryLock!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryLock: ImageVector? = null
