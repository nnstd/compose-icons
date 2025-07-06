package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiStrength4: ImageVector
    get() {
        if (_WifiStrength4 != null) {
            return _WifiStrength4!!
        }
        _WifiStrength4 = ImageVector.Builder(
            name = "WifiStrength4",
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
                close()
            }
        }.build()

        return _WifiStrength4!!
    }

@Suppress("ObjectPropertyName")
private var _WifiStrength4: ImageVector? = null
