package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThermometerBluetooth: ImageVector
    get() {
        if (_ThermometerBluetooth != null) {
            return _ThermometerBluetooth!!
        }
        _ThermometerBluetooth = ImageVector.Builder(
            name = "ThermometerBluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13f)
                verticalLineTo(5f)
                curveTo(11f, 3.34f, 9.66f, 2f, 8f, 2f)
                reflectiveCurveTo(5f, 3.34f, 5f, 5f)
                verticalLineTo(13f)
                curveTo(2.79f, 14.66f, 2.34f, 17.79f, 4f, 20f)
                reflectiveCurveTo(8.79f, 22.66f, 11f, 21f)
                reflectiveCurveTo(13.66f, 16.21f, 12f, 14f)
                curveTo(11.72f, 13.62f, 11.38f, 13.28f, 11f, 13f)
                moveTo(8f, 4f)
                curveTo(8.55f, 4f, 9f, 4.45f, 9f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                curveTo(7f, 4.45f, 7.45f, 4f, 8f, 4f)
                moveTo(18f, 8f)
                verticalLineTo(11.79f)
                lineTo(15.71f, 9.5f)
                lineTo(15f, 10.21f)
                lineTo(17.79f, 13f)
                lineTo(15f, 15.79f)
                lineTo(15.71f, 16.5f)
                lineTo(18f, 14.21f)
                verticalLineTo(18f)
                horizontalLineTo(18.5f)
                lineTo(21.35f, 15.14f)
                lineTo(19.21f, 13f)
                lineTo(21.35f, 10.85f)
                lineTo(18.5f, 8f)
                horizontalLineTo(18f)
                moveTo(19f, 9.91f)
                lineTo(19.94f, 10.85f)
                lineTo(19f, 11.79f)
                verticalLineTo(9.91f)
                moveTo(19f, 14.21f)
                lineTo(19.94f, 15.14f)
                lineTo(19f, 16.08f)
                verticalLineTo(14.21f)
                close()
            }
        }.build()

        return _ThermometerBluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerBluetooth: ImageVector? = null
