package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Waveform: ImageVector
    get() {
        if (_Waveform != null) {
            return _Waveform!!
        }
        _Waveform = ImageVector.Builder(
            name = "Waveform",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                lineTo(20f, 13f)
                lineTo(19f, 14f)
                lineTo(18f, 13f)
                lineTo(17f, 16f)
                lineTo(16f, 13f)
                lineTo(15f, 21f)
                lineTo(14f, 13f)
                lineTo(13f, 15f)
                lineTo(12f, 13f)
                lineTo(11f, 17f)
                lineTo(10f, 13f)
                lineTo(9f, 22f)
                lineTo(8f, 13f)
                lineTo(7f, 19f)
                lineTo(6f, 13f)
                lineTo(5f, 14f)
                lineTo(4f, 13f)
                lineTo(2f, 12f)
                lineTo(4f, 11f)
                lineTo(5f, 10f)
                lineTo(6f, 11f)
                lineTo(7f, 5f)
                lineTo(8f, 11f)
                lineTo(9f, 2f)
                lineTo(10f, 11f)
                lineTo(11f, 7f)
                lineTo(12f, 11f)
                lineTo(13f, 9f)
                lineTo(14f, 11f)
                lineTo(15f, 3f)
                lineTo(16f, 11f)
                lineTo(17f, 8f)
                lineTo(18f, 11f)
                lineTo(19f, 10f)
                lineTo(20f, 11f)
                lineTo(22f, 12f)
                close()
            }
        }.build()

        return _Waveform!!
    }

@Suppress("ObjectPropertyName")
private var _Waveform: ImageVector? = null
