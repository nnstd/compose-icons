package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Wifi: ImageVector
    get() {
        if (_Wifi != null) {
            return _Wifi!!
        }
        _Wifi = ImageVector.Builder(
            name = "Wifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21f)
                lineTo(15.6f, 16.2f)
                curveTo(14.6f, 15.45f, 13.35f, 15f, 12f, 15f)
                curveTo(10.65f, 15f, 9.4f, 15.45f, 8.4f, 16.2f)
                lineTo(12f, 21f)
                moveTo(12f, 3f)
                curveTo(7.95f, 3f, 4.21f, 4.34f, 1.2f, 6.6f)
                lineTo(3f, 9f)
                curveTo(5.5f, 7.12f, 8.62f, 6f, 12f, 6f)
                curveTo(15.38f, 6f, 18.5f, 7.12f, 21f, 9f)
                lineTo(22.8f, 6.6f)
                curveTo(19.79f, 4.34f, 16.05f, 3f, 12f, 3f)
                moveTo(12f, 9f)
                curveTo(9.3f, 9f, 6.81f, 9.89f, 4.8f, 11.4f)
                lineTo(6.6f, 13.8f)
                curveTo(8.1f, 12.67f, 9.97f, 12f, 12f, 12f)
                curveTo(14.03f, 12f, 15.9f, 12.67f, 17.4f, 13.8f)
                lineTo(19.2f, 11.4f)
                curveTo(17.19f, 9.89f, 14.7f, 9f, 12f, 9f)
                close()
            }
        }.build()

        return _Wifi!!
    }

@Suppress("ObjectPropertyName")
private var _Wifi: ImageVector? = null
