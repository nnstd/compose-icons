package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UsbFlashDriveOutline: ImageVector
    get() {
        if (_UsbFlashDriveOutline != null) {
            return _UsbFlashDriveOutline!!
        }
        _UsbFlashDriveOutline = ImageVector.Builder(
            name = "UsbFlashDriveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 13f)
                curveTo(9.66f, 13f, 11f, 14.34f, 11f, 16f)
                curveTo(11f, 17.66f, 9.66f, 19f, 8f, 19f)
                curveTo(6.34f, 19f, 5f, 17.66f, 5f, 16f)
                curveTo(5f, 14.34f, 6.34f, 13f, 8f, 13f)
                moveTo(8f, 15f)
                curveTo(7.45f, 15f, 7f, 15.45f, 7f, 16f)
                curveTo(7f, 16.55f, 7.45f, 17f, 8f, 17f)
                curveTo(8.55f, 17f, 9f, 16.55f, 9f, 16f)
                curveTo(9f, 15.45f, 8.55f, 15f, 8f, 15f)
                moveTo(9.77f, 4.33f)
                lineTo(10.5f, 5.08f)
                lineTo(14.29f, 1.29f)
                curveTo(14.47f, 1.11f, 14.72f, 1f, 15f, 1f)
                curveTo(15.28f, 1f, 15.53f, 1.11f, 15.71f, 1.29f)
                lineTo(22.78f, 8.36f)
                lineTo(22.78f, 8.37f)
                curveTo(22.92f, 8.54f, 23f, 8.76f, 23f, 9f)
                curveTo(23f, 9.3f, 22.87f, 9.57f, 22.66f, 9.76f)
                lineTo(22.66f, 9.76f)
                lineTo(18.93f, 13.5f)
                lineTo(19.67f, 14.23f)
                lineTo(12.95f, 20.95f)
                curveTo(11.68f, 22.22f, 9.93f, 23f, 8f, 23f)
                curveTo(4.13f, 23f, 1f, 19.87f, 1f, 16f)
                curveTo(1f, 14.07f, 1.78f, 12.32f, 3.05f, 11.05f)
                lineTo(9.77f, 4.33f)
                moveTo(11.54f, 19.54f)
                lineTo(16.84f, 14.23f)
                lineTo(9.77f, 7.16f)
                lineTo(4.46f, 12.46f)
                curveTo(3.56f, 13.37f, 3f, 14.62f, 3f, 16f)
                curveTo(3f, 18.76f, 5.24f, 21f, 8f, 21f)
                curveTo(9.38f, 21f, 10.63f, 20.44f, 11.54f, 19.54f)
                moveTo(15.07f, 4.69f)
                lineTo(16.5f, 6.1f)
                lineTo(15.07f, 7.5f)
                lineTo(13.66f, 6.1f)
                lineTo(15.07f, 4.69f)
                moveTo(17.9f, 7.5f)
                lineTo(19.31f, 8.93f)
                lineTo(17.9f, 10.34f)
                lineTo(16.5f, 8.93f)
                lineTo(17.9f, 7.5f)
                moveTo(20.59f, 9f)
                lineTo(15f, 3.41f)
                lineTo(11.93f, 6.5f)
                lineTo(17.5f, 12.08f)
                lineTo(20.59f, 9f)
                close()
            }
        }.build()

        return _UsbFlashDriveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _UsbFlashDriveOutline: ImageVector? = null
