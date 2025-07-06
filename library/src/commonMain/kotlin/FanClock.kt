package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FanClock: ImageVector
    get() {
        if (_FanClock != null) {
            return _FanClock!!
        }
        _FanClock = ImageVector.Builder(
            name = "FanClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 14f)
                horizontalLineTo(17.5f)
                verticalLineTo(16.8f)
                lineTo(19.9f, 18.2f)
                lineTo(19.1f, 19.5f)
                lineTo(16f, 17.7f)
                verticalLineTo(14f)
                moveTo(21f, 11.3f)
                curveTo(20.8f, 7.9f, 17f, 7.2f, 13.3f, 9.2f)
                curveTo(13f, 8.8f, 12.6f, 8.5f, 12.1f, 8.3f)
                curveTo(12.3f, 7.4f, 12.7f, 6.3f, 13.7f, 5.8f)
                curveTo(16.1f, 4.6f, 16f, 1f, 11.5f, 1f)
                curveTo(7.9f, 1f, 7.2f, 5f, 9.1f, 8.7f)
                curveTo(8.7f, 9f, 8.4f, 9.4f, 8.2f, 9.9f)
                curveTo(7.3f, 9.7f, 6.2f, 9.3f, 5.7f, 8.3f)
                curveTo(4.6f, 5.9f, 1f, 6f, 1f, 10.5f)
                curveTo(1f, 14.1f, 5f, 14.8f, 8.7f, 12.9f)
                curveTo(9f, 13.3f, 9.5f, 13.6f, 9.9f, 13.8f)
                curveTo(9.7f, 14.7f, 9.3f, 15.8f, 8.3f, 16.3f)
                curveTo(5.9f, 17.4f, 6f, 21f, 10.5f, 21f)
                curveTo(10.8f, 21f, 11f, 21f, 11.2f, 20.9f)
                curveTo(12.5f, 22.8f, 14.6f, 24f, 17f, 24f)
                curveTo(20.9f, 24f, 24f, 20.9f, 24f, 17f)
                curveTo(24f, 14.6f, 22.8f, 12.5f, 21f, 11.3f)
                moveTo(11f, 10f)
                curveTo(11.6f, 10f, 12f, 10.4f, 12f, 11f)
                reflectiveCurveTo(11.6f, 12f, 11f, 12f)
                reflectiveCurveTo(10f, 11.6f, 10f, 11f)
                reflectiveCurveTo(10.4f, 10f, 11f, 10f)
                moveTo(17f, 22f)
                curveTo(14.2f, 22f, 12f, 19.8f, 12f, 17f)
                reflectiveCurveTo(14.2f, 12f, 17f, 12f)
                reflectiveCurveTo(22f, 14.2f, 22f, 17f)
                reflectiveCurveTo(19.8f, 22f, 17f, 22f)
                close()
            }
        }.build()

        return _FanClock!!
    }

@Suppress("ObjectPropertyName")
private var _FanClock: ImageVector? = null
