package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThermostatBoxAuto: ImageVector
    get() {
        if (_ThermostatBoxAuto != null) {
            return _ThermostatBoxAuto!!
        }
        _ThermostatBoxAuto = ImageVector.Builder(
            name = "ThermostatBoxAuto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 14f)
                horizontalLineTo(18f)
                lineTo(14.8f, 23f)
                horizontalLineTo(16.7f)
                lineTo(17.4f, 21f)
                horizontalLineTo(20.6f)
                lineTo(21.3f, 23f)
                horizontalLineTo(23.2f)
                lineTo(20f, 14f)
                moveTo(17.8f, 19.7f)
                lineTo(19f, 16f)
                lineTo(20.2f, 19.7f)
                horizontalLineTo(17.8f)
                moveTo(15.4f, 15.4f)
                lineTo(14.8f, 14.8f)
                curveTo(15.5f, 14.1f, 16f, 13.1f, 16f, 12f)
                curveTo(16f, 11.3f, 15.8f, 10.6f, 15.4f, 10f)
                lineTo(17.6f, 7.8f)
                curveTo(18.5f, 9f, 19f, 10.4f, 19f, 12f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(13.4f)
                lineTo(15.4f, 15.4f)
                moveTo(9.2f, 14.8f)
                lineTo(7f, 17f)
                curveTo(5.7f, 15.7f, 5f, 14f, 5f, 12f)
                curveTo(5f, 8.1f, 8.1f, 5f, 12f, 5f)
                curveTo(13.6f, 5f, 15f, 5.5f, 16.2f, 6.4f)
                lineTo(14f, 8.6f)
                curveTo(13.4f, 8.2f, 12.7f, 8f, 12f, 8f)
                curveTo(9.8f, 8f, 8f, 9.8f, 8f, 12f)
                curveTo(8f, 13.1f, 8.5f, 14.1f, 9.2f, 14.8f)
                close()
            }
        }.build()

        return _ThermostatBoxAuto!!
    }

@Suppress("ObjectPropertyName")
private var _ThermostatBoxAuto: ImageVector? = null
