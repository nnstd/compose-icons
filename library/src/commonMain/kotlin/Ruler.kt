package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ruler: ImageVector
    get() {
        if (_Ruler != null) {
            return _Ruler!!
        }
        _Ruler = ImageVector.Builder(
            name = "Ruler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.39f, 18.36f)
                lineTo(3.16f, 16.6f)
                lineTo(4.58f, 18f)
                lineTo(5.64f, 16.95f)
                lineTo(4.22f, 15.54f)
                lineTo(5.64f, 14.12f)
                lineTo(8.11f, 16.6f)
                lineTo(9.17f, 15.54f)
                lineTo(6.7f, 13.06f)
                lineTo(8.11f, 11.65f)
                lineTo(9.53f, 13.06f)
                lineTo(10.59f, 12f)
                lineTo(9.17f, 10.59f)
                lineTo(10.59f, 9.17f)
                lineTo(13.06f, 11.65f)
                lineTo(14.12f, 10.59f)
                lineTo(11.65f, 8.11f)
                lineTo(13.06f, 6.7f)
                lineTo(14.47f, 8.11f)
                lineTo(15.54f, 7.05f)
                lineTo(14.12f, 5.64f)
                lineTo(15.54f, 4.22f)
                lineTo(18f, 6.7f)
                lineTo(19.07f, 5.64f)
                lineTo(16.6f, 3.16f)
                lineTo(18.36f, 1.39f)
                lineTo(22.61f, 5.64f)
                lineTo(5.64f, 22.61f)
                lineTo(1.39f, 18.36f)
                close()
            }
        }.build()

        return _Ruler!!
    }

@Suppress("ObjectPropertyName")
private var _Ruler: ImageVector? = null
