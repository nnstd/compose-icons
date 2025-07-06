package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UsbCPort: ImageVector
    get() {
        if (_UsbCPort != null) {
            return _UsbCPort!!
        }
        _UsbCPort = ImageVector.Builder(
            name = "UsbCPort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 12f)
                horizontalLineTo(18f)
                curveTo(18.55f, 12f, 19f, 12.45f, 19f, 13f)
                curveTo(19f, 13.55f, 18.55f, 14f, 18f, 14f)
                horizontalLineTo(6f)
                curveTo(5.45f, 14f, 5f, 13.55f, 5f, 13f)
                curveTo(5f, 12.45f, 5.45f, 12f, 6f, 12f)
                moveTo(6f, 10f)
                curveTo(4.34f, 10f, 3f, 11.34f, 3f, 13f)
                curveTo(3f, 14.66f, 4.34f, 16f, 6f, 16f)
                horizontalLineTo(18f)
                curveTo(19.66f, 16f, 21f, 14.66f, 21f, 13f)
                curveTo(21f, 11.34f, 19.66f, 10f, 18f, 10f)
                horizontalLineTo(6f)
                moveTo(6f, 8f)
                horizontalLineTo(18f)
                curveTo(20.76f, 8f, 23f, 10.24f, 23f, 13f)
                curveTo(23f, 15.76f, 20.76f, 18f, 18f, 18f)
                horizontalLineTo(6f)
                curveTo(3.24f, 18f, 1f, 15.76f, 1f, 13f)
                curveTo(1f, 10.24f, 3.24f, 8f, 6f, 8f)
                close()
            }
        }.build()

        return _UsbCPort!!
    }

@Suppress("ObjectPropertyName")
private var _UsbCPort: ImageVector? = null
