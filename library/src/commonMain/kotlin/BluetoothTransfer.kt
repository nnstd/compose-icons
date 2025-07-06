package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BluetoothTransfer: ImageVector
    get() {
        if (_BluetoothTransfer != null) {
            return _BluetoothTransfer!!
        }
        _BluetoothTransfer = ImageVector.Builder(
            name = "BluetoothTransfer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.71f, 7.71f)
                lineTo(10.41f, 12f)
                lineTo(14.71f, 16.29f)
                lineTo(9f, 22f)
                horizontalLineTo(8f)
                verticalLineTo(14.41f)
                lineTo(3.41f, 19f)
                lineTo(2f, 17.59f)
                lineTo(7.59f, 12f)
                lineTo(2f, 6.41f)
                lineTo(3.41f, 5f)
                lineTo(8f, 9.59f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                lineTo(14.71f, 7.71f)
                moveTo(10f, 5.83f)
                verticalLineTo(9.59f)
                lineTo(11.88f, 7.71f)
                lineTo(10f, 5.83f)
                moveTo(11.88f, 16.29f)
                lineTo(10f, 14.41f)
                verticalLineTo(18.17f)
                lineTo(11.88f, 16.29f)
                moveTo(22f, 8f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                lineTo(19f, 4f)
                lineTo(22f, 8f)
                moveTo(22f, 16f)
                lineTo(19f, 20f)
                lineTo(16f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _BluetoothTransfer!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothTransfer: ImageVector? = null
