package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiStrength3: ImageVector
    get() {
        if (_WifiStrength3 != null) {
            return _WifiStrength3!!
        }
        _WifiStrength3 = ImageVector.Builder(
            name = "WifiStrength3",
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
                lineTo(18.77f, 9.88f)
                curveTo(17.26f, 9f, 14.88f, 8f, 12f, 8f)
                curveTo(9f, 8f, 6.68f, 9f, 5.21f, 9.84f)
                lineTo(3.27f, 7.44f)
                curveTo(5.91f, 5.85f, 8.93f, 5f, 12f, 5f)
                close()
            }
        }.build()

        return _WifiStrength3!!
    }

@Suppress("ObjectPropertyName")
private var _WifiStrength3: ImageVector? = null
