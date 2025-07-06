package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryBluetoothVariant: ImageVector
    get() {
        if (_BatteryBluetoothVariant != null) {
            return _BatteryBluetoothVariant!!
        }
        _BatteryBluetoothVariant = ImageVector.Builder(
            name = "BatteryBluetoothVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(7.33f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(6f, 21.4f, 6.6f, 22f, 7.33f, 22f)
                horizontalLineTo(16.67f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(18f, 4.6f, 17.4f, 4f, 16.67f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                moveTo(11.83f, 8f)
                horizontalLineTo(12.33f)
                lineTo(15.18f, 10.85f)
                lineTo(13.04f, 13f)
                lineTo(15.17f, 15.14f)
                lineTo(12.33f, 18f)
                horizontalLineTo(11.83f)
                verticalLineTo(14.21f)
                lineTo(9.54f, 16.5f)
                lineTo(8.83f, 15.79f)
                lineTo(11.62f, 13f)
                lineTo(8.83f, 10.21f)
                lineTo(9.54f, 9.5f)
                lineTo(11.83f, 11.79f)
                verticalLineTo(8f)
                moveTo(12.83f, 9.91f)
                verticalLineTo(11.79f)
                lineTo(13.77f, 10.85f)
                lineTo(12.83f, 9.91f)
                moveTo(12.83f, 14.21f)
                verticalLineTo(16.08f)
                lineTo(13.77f, 15.14f)
                lineTo(12.83f, 14.21f)
                close()
            }
        }.build()

        return _BatteryBluetoothVariant!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryBluetoothVariant: ImageVector? = null
