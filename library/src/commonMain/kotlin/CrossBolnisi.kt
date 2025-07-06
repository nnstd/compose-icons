package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CrossBolnisi: ImageVector
    get() {
        if (_CrossBolnisi != null) {
            return _CrossBolnisi!!
        }
        _CrossBolnisi = ImageVector.Builder(
            name = "CrossBolnisi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 7f)
                lineTo(21.5f, 6.5f)
                curveTo(19.93f, 8f, 18.47f, 9.4f, 16.93f, 10.18f)
                curveTo(15.5f, 10.91f, 14.44f, 10.91f, 13f, 11f)
                curveTo(13.09f, 9.56f, 13.09f, 8.5f, 13.82f, 7.07f)
                curveTo(14.6f, 5.53f, 16f, 4.07f, 17.5f, 2.5f)
                lineTo(17f, 2f)
                curveTo(15.32f, 3.23f, 13.64f, 3.83f, 12f, 3.83f)
                curveTo(10.36f, 3.83f, 8.68f, 3.23f, 7f, 2f)
                lineTo(6.5f, 2.5f)
                curveTo(8f, 4.07f, 9.4f, 5.53f, 10.18f, 7.07f)
                curveTo(10.91f, 8.5f, 10.91f, 9.56f, 11f, 11f)
                curveTo(9.56f, 10.91f, 8.5f, 10.91f, 7.07f, 10.18f)
                curveTo(5.53f, 9.4f, 4.06f, 8f, 2.5f, 6.5f)
                lineTo(2f, 7f)
                curveTo(3.23f, 8.68f, 3.83f, 10.36f, 3.83f, 12f)
                curveTo(3.83f, 13.64f, 3.23f, 15.32f, 2f, 17f)
                lineTo(2.5f, 17.5f)
                curveTo(4.07f, 16f, 5.53f, 14.6f, 7.07f, 13.82f)
                curveTo(8.5f, 13.09f, 9.56f, 13.09f, 11f, 13f)
                curveTo(10.91f, 14.44f, 10.91f, 15.5f, 10.18f, 16.93f)
                curveTo(9.4f, 18.47f, 8f, 19.93f, 6.5f, 21.5f)
                lineTo(7f, 22f)
                curveTo(8.68f, 20.77f, 10.36f, 20.17f, 12f, 20.17f)
                curveTo(13.64f, 20.17f, 15.32f, 20.77f, 17f, 22f)
                lineTo(17.5f, 21.5f)
                curveTo(16f, 19.93f, 14.6f, 18.47f, 13.82f, 16.93f)
                curveTo(13.09f, 15.5f, 13.09f, 14.44f, 13f, 13f)
                curveTo(14.44f, 13.09f, 15.5f, 13.09f, 16.93f, 13.82f)
                curveTo(18.47f, 14.6f, 19.93f, 16f, 21.5f, 17.5f)
                lineTo(22f, 17f)
                curveTo(20.77f, 15.32f, 20.17f, 13.64f, 20.17f, 12f)
                curveTo(20.17f, 10.36f, 20.77f, 8.68f, 22f, 7f)
                close()
            }
        }.build()

        return _CrossBolnisi!!
    }

@Suppress("ObjectPropertyName")
private var _CrossBolnisi: ImageVector? = null
