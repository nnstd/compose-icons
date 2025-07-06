package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryUnknownBluetooth: ImageVector
    get() {
        if (_BatteryUnknownBluetooth != null) {
            return _BatteryUnknownBluetooth!!
        }
        _BatteryUnknownBluetooth = ImageVector.Builder(
            name = "BatteryUnknownBluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(3.33f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.33f)
                verticalLineTo(20.66f)
                curveTo(2f, 21.4f, 2.6f, 22f, 3.33f, 22f)
                horizontalLineTo(12.67f)
                curveTo(13.4f, 22f, 14f, 21.4f, 14f, 20.66f)
                verticalLineTo(5.33f)
                curveTo(14f, 4.59f, 13.4f, 4f, 12.67f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                moveTo(8f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                curveTo(12f, 10.88f, 11.64f, 11.68f, 11.07f, 12.25f)
                lineTo(10.17f, 13.17f)
                curveTo(9.63f, 13.71f, 9.25f, 14.18f, 9.09f, 15f)
                horizontalLineTo(7.05f)
                curveTo(7.16f, 14.1f, 7.56f, 13.28f, 8.17f, 12.67f)
                lineTo(9.41f, 11.41f)
                curveTo(9.78f, 11.05f, 10f, 10.55f, 10f, 10f)
                curveTo(10f, 8.89f, 9.1f, 8f, 8f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 10f)
                horizontalLineTo(4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 6f)
                moveTo(19f, 8f)
                verticalLineTo(11.79f)
                lineTo(16.71f, 9.5f)
                lineTo(16f, 10.21f)
                lineTo(18.79f, 13f)
                lineTo(16f, 15.79f)
                lineTo(16.71f, 16.5f)
                lineTo(19f, 14.21f)
                verticalLineTo(18f)
                horizontalLineTo(19.5f)
                lineTo(22.35f, 15.14f)
                lineTo(20.21f, 13f)
                lineTo(22.35f, 10.85f)
                lineTo(19.5f, 8f)
                horizontalLineTo(19f)
                moveTo(20f, 9.91f)
                lineTo(20.94f, 10.85f)
                lineTo(20f, 11.79f)
                verticalLineTo(9.91f)
                moveTo(20f, 14.21f)
                lineTo(20.94f, 15.14f)
                lineTo(20f, 16.08f)
                verticalLineTo(14.21f)
                moveTo(7f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _BatteryUnknownBluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryUnknownBluetooth: ImageVector? = null
