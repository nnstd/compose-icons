package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiStrengthOutline: ImageVector
    get() {
        if (_WifiStrengthOutline != null) {
            return _WifiStrengthOutline!!
        }
        _WifiStrengthOutline = ImageVector.Builder(
            name = "WifiStrengthOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(7.79f, 3f, 3.7f, 4.41f, 0.38f, 7f)
                horizontalLineTo(0.36f)
                curveTo(4.24f, 11.83f, 8.13f, 16.66f, 12f, 21.5f)
                curveTo(15.89f, 16.66f, 19.77f, 11.83f, 23.64f, 7f)
                horizontalLineTo(23.65f)
                curveTo(20.32f, 4.41f, 16.22f, 3f, 12f, 3f)
                moveTo(12f, 5f)
                curveTo(15.07f, 5f, 18.09f, 5.86f, 20.71f, 7.45f)
                lineTo(12f, 18.3f)
                lineTo(3.27f, 7.44f)
                curveTo(5.9f, 5.85f, 8.92f, 5f, 12f, 5f)
                close()
            }
        }.build()

        return _WifiStrengthOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WifiStrengthOutline: ImageVector? = null
