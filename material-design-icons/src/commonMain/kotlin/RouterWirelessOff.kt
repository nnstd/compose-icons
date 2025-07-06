package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RouterWirelessOff: ImageVector
    get() {
        if (_RouterWirelessOff != null) {
            return _RouterWirelessOff!!
        }
        _RouterWirelessOff = ImageVector.Builder(
            name = "RouterWirelessOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.8f, 5.9f)
                lineTo(11f, 5.1f)
                curveTo(12.4f, 3.7f, 14.2f, 3f, 16f, 3f)
                reflectiveCurveTo(19.6f, 3.7f, 21f, 5.1f)
                lineTo(20.2f, 5.9f)
                curveTo(19f, 4.8f, 17.5f, 4.2f, 16f, 4.2f)
                reflectiveCurveTo(13f, 4.8f, 11.8f, 5.9f)
                moveTo(21f, 15f)
                curveTo(21f, 13.9f, 20.1f, 13f, 19f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(11.8f)
                lineTo(21f, 17.8f)
                verticalLineTo(15f)
                moveTo(18.5f, 7.5f)
                lineTo(19.3f, 6.7f)
                curveTo(18.4f, 5.8f, 17.2f, 5.3f, 16f, 5.3f)
                reflectiveCurveTo(13.6f, 5.8f, 12.7f, 6.7f)
                lineTo(13.5f, 7.5f)
                curveTo(14.2f, 6.8f, 15.1f, 6.5f, 16f, 6.5f)
                curveTo(16.9f, 6.5f, 17.8f, 6.8f, 18.5f, 7.5f)
                moveTo(22.1f, 21.5f)
                lineTo(20.8f, 22.8f)
                lineTo(19.1f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(15f)
                curveTo(3f, 13.9f, 3.9f, 13f, 5f, 13f)
                horizontalLineTo(11.1f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.5f)
                moveTo(8f, 16f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                moveTo(11.5f, 16f)
                horizontalLineTo(9.5f)
                verticalLineTo(18f)
                horizontalLineTo(11.5f)
                verticalLineTo(16f)
                moveTo(15f, 16.9f)
                lineTo(14.1f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(16.9f)
                close()
            }
        }.build()

        return _RouterWirelessOff!!
    }

@Suppress("ObjectPropertyName")
private var _RouterWirelessOff: ImageVector? = null
