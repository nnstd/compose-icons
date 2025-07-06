package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hexagram: ImageVector
    get() {
        if (_Hexagram != null) {
            return _Hexagram!!
        }
        _Hexagram = ImageVector.Builder(
            name = "Hexagram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 7.66f)
                lineTo(20.64f, 6.97f)
                lineTo(17f, 12f)
                lineTo(20.68f, 16.97f)
                lineTo(14.5f, 16.32f)
                lineTo(12.03f, 22f)
                lineTo(9.5f, 16.34f)
                lineTo(3.36f, 17.03f)
                lineTo(7f, 12f)
                lineTo(3.32f, 7.03f)
                lineTo(9.5f, 7.68f)
                lineTo(11.97f, 2f)
                lineTo(14.5f, 7.66f)
                close()
            }
        }.build()

        return _Hexagram!!
    }

@Suppress("ObjectPropertyName")
private var _Hexagram: ImageVector? = null
