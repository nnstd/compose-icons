package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UsbPort: ImageVector
    get() {
        if (_UsbPort != null) {
            return _UsbPort!!
        }
        _UsbPort = ImageVector.Builder(
            name = "UsbPort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 2f)
                curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(16f)
                lineTo(9f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                lineTo(19f, 16f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                curveTo(18f, 2.9f, 17.11f, 2f, 16f, 2f)
                moveTo(8f, 4f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                moveTo(9f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                moveTo(13f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _UsbPort!!
    }

@Suppress("ObjectPropertyName")
private var _UsbPort: ImageVector? = null
