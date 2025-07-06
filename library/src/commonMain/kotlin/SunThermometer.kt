package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SunThermometer: ImageVector
    get() {
        if (_SunThermometer != null) {
            return _SunThermometer!!
        }
        _SunThermometer = ImageVector.Builder(
            name = "SunThermometer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                lineTo(7.6f, 5.4f)
                curveTo(8.4f, 5.2f, 9.2f, 5f, 10f, 5f)
                curveTo(10.8f, 5f, 11.6f, 5.2f, 12.4f, 5.4f)
                moveTo(19f, 5f)
                curveTo(17.89f, 5f, 17f, 5.89f, 17f, 7f)
                verticalLineTo(13.76f)
                curveTo(16.36f, 14.33f, 16f, 15.15f, 16f, 16f)
                curveTo(16f, 17.66f, 17.34f, 19f, 19f, 19f)
                curveTo(20.66f, 19f, 22f, 17.66f, 22f, 16f)
                curveTo(22f, 15.15f, 21.64f, 14.33f, 21f, 13.77f)
                verticalLineTo(7f)
                curveTo(21f, 5.89f, 20.11f, 5f, 19f, 5f)
                moveTo(19f, 6f)
                curveTo(19.55f, 6f, 20f, 6.45f, 20f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                curveTo(18f, 6.45f, 18.45f, 6f, 19f, 6f)
                moveTo(5.5f, 6.7f)
                lineTo(1.3f, 7f)
                lineTo(3.1f, 10.8f)
                curveTo(3.2f, 10f, 3.5f, 9.2f, 3.9f, 8.5f)
                curveTo(4.4f, 7.8f, 4.9f, 7.2f, 5.5f, 6.7f)
                moveTo(10f, 7f)
                curveTo(7.2f, 7f, 5f, 9.2f, 5f, 12f)
                curveTo(5f, 14.8f, 7.2f, 17f, 10f, 17f)
                curveTo(12.8f, 17f, 15f, 14.8f, 15f, 12f)
                curveTo(15f, 9.2f, 12.8f, 7f, 10f, 7f)
                moveTo(3.2f, 13.2f)
                lineTo(1.4f, 17f)
                lineTo(5.5f, 17.4f)
                curveTo(5f, 16.9f, 4.4f, 16.2f, 4f, 15.5f)
                curveTo(3.5f, 14.8f, 3.3f, 14f, 3.2f, 13.2f)
                moveTo(7.6f, 18.6f)
                lineTo(10f, 22f)
                lineTo(12.4f, 18.6f)
                curveTo(11.6f, 18.8f, 10.8f, 19f, 10f, 19f)
                curveTo(9.1f, 19f, 8.3f, 18.8f, 7.6f, 18.6f)
                close()
            }
        }.build()

        return _SunThermometer!!
    }

@Suppress("ObjectPropertyName")
private var _SunThermometer: ImageVector? = null
