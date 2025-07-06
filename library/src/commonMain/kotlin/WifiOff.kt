package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiOff: ImageVector
    get() {
        if (_WifiOff != null) {
            return _WifiOff!!
        }
        _WifiOff = ImageVector.Builder(
            name = "WifiOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.28f, 3f)
                lineTo(1f, 4.27f)
                lineTo(2.47f, 5.74f)
                curveTo(2.04f, 6f, 1.61f, 6.29f, 1.2f, 6.6f)
                lineTo(3f, 9f)
                curveTo(3.53f, 8.6f, 4.08f, 8.25f, 4.66f, 7.93f)
                lineTo(6.89f, 10.16f)
                curveTo(6.15f, 10.5f, 5.44f, 10.91f, 4.8f, 11.4f)
                lineTo(6.6f, 13.8f)
                curveTo(7.38f, 13.22f, 8.26f, 12.77f, 9.2f, 12.47f)
                lineTo(11.75f, 15f)
                curveTo(10.5f, 15.07f, 9.34f, 15.5f, 8.4f, 16.2f)
                lineTo(12f, 21f)
                lineTo(14.46f, 17.73f)
                lineTo(17.74f, 21f)
                lineTo(19f, 19.72f)
                moveTo(12f, 3f)
                curveTo(9.85f, 3f, 7.8f, 3.38f, 5.9f, 4.07f)
                lineTo(8.29f, 6.47f)
                curveTo(9.5f, 6.16f, 10.72f, 6f, 12f, 6f)
                curveTo(15.38f, 6f, 18.5f, 7.11f, 21f, 9f)
                lineTo(22.8f, 6.6f)
                curveTo(19.79f, 4.34f, 16.06f, 3f, 12f, 3f)
                moveTo(12f, 9f)
                curveTo(11.62f, 9f, 11.25f, 9f, 10.88f, 9.05f)
                lineTo(14.07f, 12.25f)
                curveTo(15.29f, 12.53f, 16.43f, 13.07f, 17.4f, 13.8f)
                lineTo(19.2f, 11.4f)
                curveTo(17.2f, 9.89f, 14.7f, 9f, 12f, 9f)
                close()
            }
        }.build()

        return _WifiOff!!
    }

@Suppress("ObjectPropertyName")
private var _WifiOff: ImageVector? = null
