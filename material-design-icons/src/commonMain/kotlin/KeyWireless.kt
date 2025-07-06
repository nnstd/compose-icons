package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyWireless: ImageVector
    get() {
        if (_KeyWireless != null) {
            return _KeyWireless!!
        }
        _KeyWireless = ImageVector.Builder(
            name = "KeyWireless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.9f, 5.9f)
                lineTo(6.3f, 7.3f)
                curveTo(9.4f, 4.2f, 14.5f, 4.2f, 17.6f, 7.3f)
                lineTo(19f, 5.9f)
                curveTo(15.2f, 2f, 8.8f, 2f, 4.9f, 5.9f)
                moveTo(7.8f, 8.8f)
                lineTo(9.2f, 10.2f)
                curveTo(10.8f, 8.6f, 13.3f, 8.6f, 14.9f, 10.2f)
                lineTo(16.3f, 8.8f)
                curveTo(13.9f, 6.4f, 10.1f, 6.4f, 7.8f, 8.8f)
                moveTo(11.8f, 15f)
                curveTo(11f, 12.7f, 8.4f, 11.4f, 6.1f, 12.3f)
                reflectiveCurveTo(2.4f, 15.7f, 3.3f, 18f)
                reflectiveCurveTo(6.7f, 21.6f, 9f, 20.7f)
                curveTo(10.3f, 20.2f, 11.3f, 19.2f, 11.7f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                moveTo(7.5f, 18f)
                curveTo(6.7f, 18f, 6f, 17.3f, 6f, 16.5f)
                curveTo(6f, 15.7f, 6.7f, 15f, 7.5f, 15f)
                reflectiveCurveTo(9f, 15.7f, 9f, 16.5f)
                curveTo(9f, 17.3f, 8.3f, 18f, 7.5f, 18f)
                close()
            }
        }.build()

        return _KeyWireless!!
    }

@Suppress("ObjectPropertyName")
private var _KeyWireless: ImageVector? = null
