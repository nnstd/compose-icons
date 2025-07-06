package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Resistor: ImageVector
    get() {
        if (_Resistor != null) {
            return _Resistor!!
        }
        _Resistor = ImageVector.Builder(
            name = "Resistor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 11f)
                horizontalLineTo(7f)
                lineTo(10.07f, 15.35f)
                lineTo(13.11f, 4f)
                lineTo(18f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                lineTo(13.93f, 8.65f)
                lineTo(10.89f, 20f)
                lineTo(6f, 13f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _Resistor!!
    }

@Suppress("ObjectPropertyName")
private var _Resistor: ImageVector? = null
