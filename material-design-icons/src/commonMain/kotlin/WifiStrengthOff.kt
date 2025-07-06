package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiStrengthOff: ImageVector
    get() {
        if (_WifiStrengthOff != null) {
            return _WifiStrengthOff!!
        }
        _WifiStrengthOff = ImageVector.Builder(
            name = "WifiStrengthOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.27f, 1.44f)
                lineTo(2f, 2.72f)
                lineTo(4.05f, 4.77f)
                curveTo(2.75f, 5.37f, 1.5f, 6.11f, 0.38f, 7f)
                curveTo(4.41f, 12.06f, 12f, 21.5f, 12f, 21.5f)
                lineTo(15.91f, 16.63f)
                lineTo(19.23f, 19.95f)
                lineTo(20.5f, 18.68f)
                moveTo(12f, 3f)
                curveTo(10.6f, 3f, 9.21f, 3.17f, 7.86f, 3.5f)
                lineTo(18.18f, 13.81f)
                curveTo(20f, 11.5f, 22.05f, 9f, 23.65f, 7f)
                curveTo(20.32f, 4.41f, 16.22f, 3f, 12f, 3f)
                close()
            }
        }.build()

        return _WifiStrengthOff!!
    }

@Suppress("ObjectPropertyName")
private var _WifiStrengthOff: ImageVector? = null
