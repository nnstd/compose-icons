package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BluetoothSettings: ImageVector
    get() {
        if (_BluetoothSettings != null) {
            return _BluetoothSettings!!
        }
        _BluetoothSettings = ImageVector.Builder(
            name = "BluetoothSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.88f, 14.29f)
                lineTo(13f, 16.17f)
                verticalLineTo(12.41f)
                lineTo(14.88f, 14.29f)
                moveTo(13f, 3.83f)
                lineTo(14.88f, 5.71f)
                lineTo(13f, 7.59f)
                moveTo(17.71f, 5.71f)
                lineTo(12f, 0f)
                horizontalLineTo(11f)
                verticalLineTo(7.59f)
                lineTo(6.41f, 3f)
                lineTo(5f, 4.41f)
                lineTo(10.59f, 10f)
                lineTo(5f, 15.59f)
                lineTo(6.41f, 17f)
                lineTo(11f, 12.41f)
                verticalLineTo(20f)
                horizontalLineTo(12f)
                lineTo(17.71f, 14.29f)
                lineTo(13.41f, 10f)
                lineTo(17.71f, 5.71f)
                moveTo(15f, 24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                moveTo(7f, 24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                moveTo(11f, 24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
                close()
            }
        }.build()

        return _BluetoothSettings!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothSettings: ImageVector? = null
