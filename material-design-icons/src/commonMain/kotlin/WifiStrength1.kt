package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiStrength1: ImageVector
    get() {
        if (_WifiStrength1 != null) {
            return _WifiStrength1!!
        }
        _WifiStrength1 = ImageVector.Builder(
            name = "WifiStrength1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(7.79f, 3f, 3.7f, 4.41f, 0.38f, 7f)
                curveTo(4.41f, 12.06f, 7.89f, 16.37f, 12f, 21.5f)
                curveTo(16.08f, 16.42f, 20.24f, 11.24f, 23.65f, 7f)
                curveTo(20.32f, 4.41f, 16.22f, 3f, 12f, 3f)
                moveTo(12f, 5f)
                curveTo(15.07f, 5f, 18.09f, 5.86f, 20.71f, 7.45f)
                lineTo(15.61f, 13.81f)
                curveTo(14.5f, 13.28f, 13.25f, 13f, 12f, 13f)
                curveTo(10.75f, 13f, 9.5f, 13.28f, 8.39f, 13.8f)
                lineTo(3.27f, 7.44f)
                curveTo(5.91f, 5.85f, 8.93f, 5f, 12f, 5f)
                close()
            }
        }.build()

        return _WifiStrength1!!
    }

@Suppress("ObjectPropertyName")
private var _WifiStrength1: ImageVector? = null
