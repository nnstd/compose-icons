package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SineWave: ImageVector
    get() {
        if (_SineWave != null) {
            return _SineWave!!
        }
        _SineWave = ImageVector.Builder(
            name = "SineWave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 21f)
                curveTo(13.5f, 21f, 12.31f, 16.76f, 11.05f, 12.28f)
                curveTo(10.14f, 9.04f, 9f, 5f, 7.5f, 5f)
                curveTo(4.11f, 5f, 4f, 11.93f, 4f, 12f)
                horizontalLineTo(2f)
                curveTo(2f, 11.63f, 2.06f, 3f, 7.5f, 3f)
                curveTo(10.5f, 3f, 11.71f, 7.25f, 12.97f, 11.74f)
                curveTo(13.83f, 14.8f, 15f, 19f, 16.5f, 19f)
                curveTo(19.94f, 19f, 20.03f, 12.07f, 20.03f, 12f)
                horizontalLineTo(22.03f)
                curveTo(22.03f, 12.37f, 21.97f, 21f, 16.5f, 21f)
                close()
            }
        }.build()

        return _SineWave!!
    }

@Suppress("ObjectPropertyName")
private var _SineWave: ImageVector? = null
