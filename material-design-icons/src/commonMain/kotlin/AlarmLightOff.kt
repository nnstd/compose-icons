package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlarmLightOff: ImageVector
    get() {
        if (_AlarmLightOff != null) {
            return _AlarmLightOff!!
        }
        _AlarmLightOff = ImageVector.Builder(
            name = "AlarmLightOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14.8f)
                lineTo(9f, 5.8f)
                curveTo(9.9f, 5.3f, 10.9f, 5f, 12f, 5f)
                curveTo(15.3f, 5f, 18f, 7.7f, 18f, 11f)
                verticalLineTo(14.8f)
                moveTo(20.1f, 4.8f)
                lineTo(18.7f, 3.4f)
                lineTo(16.6f, 5.5f)
                lineTo(18f, 6.9f)
                lineTo(20.1f, 4.8f)
                moveTo(19.5f, 10.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(22.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(19.5f)
                moveTo(4.5f, 10.5f)
                horizontalLineTo(1.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(10.5f)
                moveTo(1.1f, 3f)
                lineTo(6.6f, 8.5f)
                curveTo(6.2f, 9.2f, 6f, 10.1f, 6f, 11f)
                verticalLineTo(19f)
                horizontalLineTo(17.1f)
                lineTo(18.1f, 20f)
                horizontalLineTo(6f)
                curveTo(4.9f, 20f, 4f, 20.9f, 4f, 22f)
                horizontalLineTo(20.1f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.4f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                moveTo(13f, 1f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                close()
            }
        }.build()

        return _AlarmLightOff!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmLightOff: ImageVector? = null
