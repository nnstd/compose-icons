package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlarmLightOffOutline: ImageVector
    get() {
        if (_AlarmLightOffOutline != null) {
            return _AlarmLightOffOutline!!
        }
        _AlarmLightOffOutline = ImageVector.Builder(
            name = "AlarmLightOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 7.3f)
                lineTo(9f, 5.8f)
                curveTo(9.9f, 5.3f, 10.9f, 5f, 12f, 5f)
                curveTo(15.3f, 5f, 18f, 7.7f, 18f, 11f)
                verticalLineTo(14.8f)
                lineTo(16f, 12.8f)
                verticalLineTo(11f)
                curveTo(16f, 8.8f, 14.2f, 7f, 12f, 7f)
                curveTo(11.5f, 7f, 11f, 7.1f, 10.5f, 7.3f)
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
                moveTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                lineTo(20.1f, 22f)
                horizontalLineTo(4f)
                curveTo(4f, 20.9f, 4.9f, 20f, 6f, 20f)
                horizontalLineTo(18.1f)
                lineTo(17.1f, 19f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                curveTo(6f, 10.1f, 6.2f, 9.2f, 6.6f, 8.5f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                moveTo(8f, 17f)
                horizontalLineTo(15.1f)
                lineTo(8.1f, 10f)
                curveTo(8.1f, 10.3f, 8f, 10.7f, 8f, 11f)
                verticalLineTo(17f)
                moveTo(13f, 1f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                close()
            }
        }.build()

        return _AlarmLightOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmLightOffOutline: ImageVector? = null
