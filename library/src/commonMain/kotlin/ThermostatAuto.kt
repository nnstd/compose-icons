package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThermostatAuto: ImageVector
    get() {
        if (_ThermostatAuto != null) {
            return _ThermostatAuto!!
        }
        _ThermostatAuto = ImageVector.Builder(
            name = "ThermostatAuto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                curveTo(12.4f, 22f, 12.7f, 22f, 13.1f, 21.9f)
                lineTo(15.4f, 15.3f)
                lineTo(14.8f, 14.7f)
                curveTo(15.5f, 14f, 16f, 13f, 16f, 11.9f)
                curveTo(16f, 11.2f, 15.8f, 10.5f, 15.4f, 9.9f)
                lineTo(17.6f, 7.7f)
                curveTo(18.5f, 9f, 19f, 10.4f, 19f, 12f)
                horizontalLineTo(20f)
                curveTo(20.3f, 12f, 20.6f, 12.1f, 20.8f, 12.2f)
                curveTo(20.8f, 12.2f, 20.9f, 12.2f, 20.9f, 12.3f)
                curveTo(21.3f, 12.5f, 21.7f, 12.9f, 21.9f, 13.4f)
                curveTo(22f, 12.9f, 22f, 12.5f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                moveTo(14f, 8.6f)
                curveTo(13.4f, 8.2f, 12.7f, 8f, 12f, 8f)
                curveTo(9.8f, 8f, 8f, 9.8f, 8f, 12f)
                curveTo(8f, 13.1f, 8.4f, 14.1f, 9.2f, 14.8f)
                lineTo(7.1f, 16.9f)
                curveTo(5.8f, 15.7f, 5f, 13.9f, 5f, 12f)
                curveTo(5f, 8.1f, 8.1f, 5f, 12f, 5f)
                curveTo(13.6f, 5f, 15f, 5.5f, 16.2f, 6.4f)
                lineTo(14f, 8.6f)
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
                close()
            }
        }.build()

        return _ThermostatAuto!!
    }

@Suppress("ObjectPropertyName")
private var _ThermostatAuto: ImageVector? = null
