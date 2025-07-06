package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneBluetoothOutline: ImageVector
    get() {
        if (_PhoneBluetoothOutline != null) {
            return _PhoneBluetoothOutline!!
        }
        _PhoneBluetoothOutline = ImageVector.Builder(
            name = "PhoneBluetoothOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 15.5f)
                curveTo(18.8f, 15.5f, 17.5f, 15.3f, 16.4f, 14.9f)
                horizontalLineTo(16.1f)
                curveTo(15.8f, 14.9f, 15.6f, 15f, 15.4f, 15.2f)
                lineTo(13.2f, 17.4f)
                curveTo(10.4f, 15.9f, 8f, 13.6f, 6.6f, 10.8f)
                lineTo(8.8f, 8.6f)
                curveTo(9.1f, 8.3f, 9.2f, 7.9f, 9f, 7.6f)
                curveTo(8.7f, 6.5f, 8.5f, 5.2f, 8.5f, 4f)
                curveTo(8.5f, 3.5f, 8f, 3f, 7.5f, 3f)
                horizontalLineTo(4f)
                curveTo(3.5f, 3f, 3f, 3.5f, 3f, 4f)
                curveTo(3f, 13.4f, 10.6f, 21f, 20f, 21f)
                curveTo(20.5f, 21f, 21f, 20.5f, 21f, 20f)
                verticalLineTo(16.5f)
                curveTo(21f, 16f, 20.5f, 15.5f, 20f, 15.5f)
                moveTo(5f, 5f)
                horizontalLineTo(6.5f)
                curveTo(6.6f, 5.9f, 6.8f, 6.8f, 7f, 7.6f)
                lineTo(5.8f, 8.8f)
                curveTo(5.4f, 7.6f, 5.1f, 6.3f, 5f, 5f)
                moveTo(19f, 19f)
                curveTo(17.7f, 18.9f, 16.4f, 18.6f, 15.2f, 18.2f)
                lineTo(16.4f, 17f)
                curveTo(17.2f, 17.2f, 18.1f, 17.4f, 19f, 17.4f)
                verticalLineTo(19f)
                moveTo(18f, 7.21f)
                lineTo(18.94f, 8.14f)
                lineTo(18f, 9.08f)
                moveTo(18f, 2.91f)
                lineTo(18.94f, 3.85f)
                lineTo(18f, 4.79f)
                moveTo(14.71f, 9.5f)
                lineTo(17f, 7.21f)
                verticalLineTo(11f)
                horizontalLineTo(17.5f)
                lineTo(20.35f, 8.14f)
                lineTo(18.21f, 6f)
                lineTo(20.35f, 3.85f)
                lineTo(17.5f, 1f)
                horizontalLineTo(17f)
                verticalLineTo(4.79f)
                lineTo(14.71f, 2.5f)
                lineTo(14f, 3.21f)
                lineTo(16.79f, 6f)
                lineTo(14f, 8.79f)
                lineTo(14.71f, 9.5f)
                close()
            }
        }.build()

        return _PhoneBluetoothOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneBluetoothOutline: ImageVector? = null
