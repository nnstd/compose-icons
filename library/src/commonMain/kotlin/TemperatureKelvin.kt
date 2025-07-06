package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TemperatureKelvin: ImageVector
    get() {
        if (_TemperatureKelvin != null) {
            return _TemperatureKelvin!!
        }
        _TemperatureKelvin = ImageVector.Builder(
            name = "TemperatureKelvin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 5f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                lineTo(15f, 5f)
                horizontalLineTo(19f)
                lineTo(13.88f, 10.78f)
                lineTo(19f, 20f)
                horizontalLineTo(15.38f)
                lineTo(11.76f, 13.17f)
                lineTo(10f, 15.15f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _TemperatureKelvin!!
    }

@Suppress("ObjectPropertyName")
private var _TemperatureKelvin: ImageVector? = null
