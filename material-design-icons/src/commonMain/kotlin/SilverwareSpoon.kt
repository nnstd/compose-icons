package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SilverwareSpoon: ImageVector
    get() {
        if (_SilverwareSpoon != null) {
            return _SilverwareSpoon!!
        }
        _SilverwareSpoon = ImageVector.Builder(
            name = "SilverwareSpoon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.88f, 11.53f)
                lineTo(5.12f, 21.29f)
                lineTo(3.71f, 19.88f)
                lineTo(13.47f, 10.12f)
                curveTo(12.76f, 8.59f, 13.26f, 6.44f, 14.85f, 4.85f)
                curveTo(16.76f, 2.93f, 19.5f, 2.57f, 20.96f, 4.03f)
                curveTo(22.43f, 5.5f, 22.07f, 8.24f, 20.15f, 10.15f)
                curveTo(18.56f, 11.74f, 16.41f, 12.24f, 14.88f, 11.53f)
                close()
            }
        }.build()

        return _SilverwareSpoon!!
    }

@Suppress("ObjectPropertyName")
private var _SilverwareSpoon: ImageVector? = null
