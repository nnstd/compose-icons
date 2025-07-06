package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiStrengthOffOutline: ImageVector
    get() {
        if (_WifiStrengthOffOutline != null) {
            return _WifiStrengthOffOutline!!
        }
        _WifiStrengthOffOutline = ImageVector.Builder(
            name = "WifiStrengthOffOutline",
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
                curveTo(4.2f, 11.8f, 8.14f, 16.67f, 12f, 21.5f)
                lineTo(15.91f, 16.63f)
                lineTo(19.23f, 19.95f)
                lineTo(20.5f, 18.68f)
                curveTo(14.87f, 13.04f, 3.27f, 1.44f, 3.27f, 1.44f)
                moveTo(12f, 3f)
                curveTo(10.6f, 3f, 9.21f, 3.17f, 7.86f, 3.5f)
                lineTo(9.56f, 5.19f)
                curveTo(10.37f, 5.07f, 11.18f, 5f, 12f, 5f)
                curveTo(15.07f, 5f, 18.09f, 5.86f, 20.71f, 7.45f)
                lineTo(16.76f, 12.38f)
                lineTo(18.18f, 13.8f)
                curveTo(20.08f, 11.43f, 22f, 9f, 23.65f, 7f)
                curveTo(20.32f, 4.41f, 16.22f, 3f, 12f, 3f)
                moveTo(5.57f, 6.29f)
                lineTo(14.5f, 15.21f)
                lineTo(12f, 18.3f)
                lineTo(3.27f, 7.44f)
                curveTo(4f, 7f, 4.78f, 6.61f, 5.57f, 6.29f)
                close()
            }
        }.build()

        return _WifiStrengthOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WifiStrengthOffOutline: ImageVector? = null
