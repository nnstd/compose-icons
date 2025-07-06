package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BluetoothAudio: ImageVector
    get() {
        if (_BluetoothAudio != null) {
            return _BluetoothAudio!!
        }
        _BluetoothAudio = ImageVector.Builder(
            name = "BluetoothAudio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.88f, 16.29f)
                lineTo(11f, 18.17f)
                verticalLineTo(14.41f)
                moveTo(11f, 5.83f)
                lineTo(12.88f, 7.71f)
                lineTo(11f, 9.58f)
                moveTo(15.71f, 7.71f)
                lineTo(10f, 2f)
                horizontalLineTo(9f)
                verticalLineTo(9.58f)
                lineTo(4.41f, 5f)
                lineTo(3f, 6.41f)
                lineTo(8.59f, 12f)
                lineTo(3f, 17.58f)
                lineTo(4.41f, 19f)
                lineTo(9f, 14.41f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                lineTo(15.71f, 16.29f)
                lineTo(11.41f, 12f)
                moveTo(19.53f, 6.71f)
                lineTo(18.26f, 8f)
                curveTo(18.89f, 9.18f, 19.25f, 10.55f, 19.25f, 12f)
                curveTo(19.25f, 13.45f, 18.89f, 14.82f, 18.26f, 16f)
                lineTo(19.46f, 17.22f)
                curveTo(20.43f, 15.68f, 21f, 13.87f, 21f, 11.91f)
                curveTo(21f, 10f, 20.46f, 8.23f, 19.53f, 6.71f)
                moveTo(14.24f, 12f)
                lineTo(16.56f, 14.33f)
                curveTo(16.84f, 13.6f, 17f, 12.82f, 17f, 12f)
                curveTo(17f, 11.18f, 16.84f, 10.4f, 16.57f, 9.68f)
                lineTo(14.24f, 12f)
                close()
            }
        }.build()

        return _BluetoothAudio!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothAudio: ImageVector? = null
