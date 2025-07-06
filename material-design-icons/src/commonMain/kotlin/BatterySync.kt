package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatterySync: ImageVector
    get() {
        if (_BatterySync != null) {
            return _BatterySync!!
        }
        _BatterySync = ImageVector.Builder(
            name = "BatterySync",
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
                curveTo(14.69f, 12f, 12f, 14.69f, 12f, 18f)
                curveTo(12f, 19.54f, 12.58f, 20.94f, 13.54f, 22f)
                moveTo(18f, 13f)
                lineTo(20.25f, 15.25f)
                lineTo(18f, 17.5f)
                verticalLineTo(16f)
                curveTo(16.15f, 16f, 14.94f, 17.96f, 15.76f, 19.62f)
                lineTo(14.67f, 20.71f)
                curveTo(12.91f, 18.05f, 14.81f, 14.5f, 18f, 14.5f)
                verticalLineTo(13f)
                moveTo(18f, 24f)
                lineTo(15.75f, 21.75f)
                lineTo(18f, 19.5f)
                verticalLineTo(21f)
                curveTo(19.85f, 21f, 21.06f, 19.04f, 20.24f, 17.38f)
                lineTo(21.33f, 16.29f)
                curveTo(23.09f, 18.95f, 21.19f, 22.5f, 18f, 22.5f)
                verticalLineTo(24f)
            }
        }.build()

        return _BatterySync!!
    }

@Suppress("ObjectPropertyName")
private var _BatterySync: ImageVector? = null
