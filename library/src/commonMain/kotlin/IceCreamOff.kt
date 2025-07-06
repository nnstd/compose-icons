package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.IceCreamOff: ImageVector
    get() {
        if (_IceCreamOff != null) {
            return _IceCreamOff!!
        }
        _IceCreamOff = ImageVector.Builder(
            name = "IceCreamOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(4.95f, 6.84f)
                curveTo(4.37f, 7.38f, 4f, 8.14f, 4f, 9f)
                curveTo(4f, 10.66f, 5.34f, 12f, 7f, 12f)
                lineTo(12f, 22f)
                lineTo(14.7f, 16.59f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12f, 17.53f)
                lineTo(8.89f, 11.31f)
                curveTo(8.95f, 11.26f, 9f, 11.21f, 9.08f, 11.16f)
                curveTo(9.21f, 11.24f, 9.35f, 11.3f, 9.5f, 11.37f)
                lineTo(13.21f, 15.1f)
                lineTo(12f, 17.53f)
                moveTo(7.15f, 3.95f)
                curveTo(8.07f, 2.2f, 9.89f, 1f, 12f, 1f)
                curveTo(14.89f, 1f, 17.25f, 3.22f, 17.5f, 6.05f)
                curveTo(18.91f, 6.28f, 20f, 7.5f, 20f, 9f)
                curveTo(20f, 10.66f, 18.66f, 12f, 17f, 12f)
                lineTo(16.4f, 13.2f)
                lineTo(7.15f, 3.95f)
                close()
            }
        }.build()

        return _IceCreamOff!!
    }

@Suppress("ObjectPropertyName")
private var _IceCreamOff: ImageVector? = null
