package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SawtoothWave: ImageVector
    get() {
        if (_SawtoothWave != null) {
            return _SawtoothWave!!
        }
        _SawtoothWave = ImageVector.Builder(
            name = "SawtoothWave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 22f)
                verticalLineTo(6.83f)
                lineTo(2f, 16f)
                verticalLineTo(13.17f)
                lineTo(13f, 2f)
                verticalLineTo(17.17f)
                lineTo(22f, 8f)
                verticalLineTo(10.83f)
                lineTo(11f, 22f)
                close()
            }
        }.build()

        return _SawtoothWave!!
    }

@Suppress("ObjectPropertyName")
private var _SawtoothWave: ImageVector? = null
