package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BluetoothOff: ImageVector
    get() {
        if (_BluetoothOff != null) {
            return _BluetoothOff!!
        }
        _BluetoothOff = ImageVector.Builder(
            name = "BluetoothOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 5.83f)
                lineTo(14.88f, 7.71f)
                lineTo(13.28f, 9.31f)
                lineTo(14.69f, 10.72f)
                lineTo(17.71f, 7.7f)
                lineTo(12f, 2f)
                horizontalLineTo(11f)
                verticalLineTo(7.03f)
                lineTo(13f, 9.03f)
                moveTo(5.41f, 4f)
                lineTo(4f, 5.41f)
                lineTo(10.59f, 12f)
                lineTo(5f, 17.59f)
                lineTo(6.41f, 19f)
                lineTo(11f, 14.41f)
                verticalLineTo(22f)
                horizontalLineTo(12f)
                lineTo(16.29f, 17.71f)
                lineTo(18.59f, 20f)
                lineTo(20f, 18.59f)
                moveTo(13f, 18.17f)
                verticalLineTo(14.41f)
                lineTo(14.88f, 16.29f)
            }
        }.build()

        return _BluetoothOff!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothOff: ImageVector? = null
