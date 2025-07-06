package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Nuxt: ImageVector
    get() {
        if (_Nuxt != null) {
            return _Nuxt!!
        }
        _Nuxt = ImageVector.Builder(
            name = "Nuxt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 18.36f)
                lineTo(16.03f, 8.08f)
                curveTo(15.93f, 8f, 15.63f, 7.43f, 15.03f, 7.43f)
                curveTo(14.78f, 7.43f, 14.43f, 7.53f, 14.07f, 8.08f)
                lineTo(13.33f, 9.26f)
                lineTo(11.31f, 5.65f)
                curveTo(11.26f, 5.55f, 10.91f, 5f, 10.31f, 5f)
                curveTo(10.06f, 5f, 9.66f, 5.1f, 9.36f, 5.65f)
                lineTo(2.18f, 18.31f)
                curveTo(2.13f, 18.41f, 1.83f, 19f, 2.13f, 19.5f)
                curveTo(2.23f, 19.75f, 2.53f, 20f, 3.19f, 20f)
                horizontalLineTo(20.85f)
                curveTo(20.95f, 20f, 21.6f, 20f, 21.9f, 19.5f)
                curveTo(22f, 19.26f, 22.1f, 18.86f, 21.8f, 18.36f)
                moveTo(8.1f, 18.31f)
                lineTo(7.95f, 18.86f)
                horizontalLineTo(3.24f)
                lineTo(10.36f, 6.34f)
                lineTo(12.66f, 10.47f)
                lineTo(8.1f, 18.31f)
                moveTo(9.21f, 18.86f)
                lineTo(13.32f, 11.66f)
                lineTo(17.5f, 18.86f)
                horizontalLineTo(9.21f)
                moveTo(18.74f, 18.86f)
                lineTo(18.54f, 18.31f)
                lineTo(14f, 10.46f)
                lineTo(15.03f, 8.73f)
                lineTo(20.75f, 18.86f)
                horizontalLineTo(18.74f)
                close()
            }
        }.build()

        return _Nuxt!!
    }

@Suppress("ObjectPropertyName")
private var _Nuxt: ImageVector? = null
