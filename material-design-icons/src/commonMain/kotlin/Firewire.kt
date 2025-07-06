package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Firewire: ImageVector
    get() {
        if (_Firewire != null) {
            return _Firewire!!
        }
        _Firewire = ImageVector.Builder(
            name = "Firewire",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                curveTo(13.1f, 10f, 14f, 10.9f, 14f, 12f)
                reflectiveCurveTo(13.1f, 14f, 12f, 14f)
                reflectiveCurveTo(10f, 13.1f, 10f, 12f)
                reflectiveCurveTo(10.9f, 10f, 12f, 10f)
                moveTo(12f, 8f)
                curveTo(9.8f, 8f, 8f, 9.8f, 8f, 12f)
                reflectiveCurveTo(9.8f, 16f, 12f, 16f)
                reflectiveCurveTo(16f, 14.2f, 16f, 12f)
                reflectiveCurveTo(14.2f, 8f, 12f, 8f)
                moveTo(15f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                moveTo(15f, 20f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                moveTo(6.3f, 10.6f)
                lineTo(10.5f, 6.4f)
                lineTo(9.2f, 4.9f)
                lineTo(4.9f, 9.2f)
                lineTo(6.3f, 10.6f)
                moveTo(4.2f, 8.5f)
                lineTo(8.4f, 4.3f)
                lineTo(7.1f, 2.8f)
                lineTo(2.8f, 7.1f)
                lineTo(4.2f, 8.5f)
                moveTo(15f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                moveTo(13.4f, 6.3f)
                lineTo(17.6f, 10.5f)
                lineTo(21.1f, 7f)
                lineTo(16.9f, 2.8f)
                lineTo(13.4f, 6.3f)
                close()
            }
        }.build()

        return _Firewire!!
    }

@Suppress("ObjectPropertyName")
private var _Firewire: ImageVector? = null
