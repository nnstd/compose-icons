package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Gnome: ImageVector
    get() {
        if (_Gnome != null) {
            return _Gnome!!
        }
        _Gnome = ImageVector.Builder(
            name = "Gnome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.42f, 2f)
                curveTo(14.26f, 2f, 13.5f, 7.93f, 15.82f, 7.93f)
                curveTo(18.16f, 7.93f, 22.58f, 2f, 18.42f, 2f)
                moveTo(12f, 2.73f)
                curveTo(11.92f, 2.73f, 11.85f, 2.73f, 11.78f, 2.74f)
                curveTo(9.44f, 3.04f, 10.26f, 7.12f, 11.5f, 7.19f)
                curveTo(12.72f, 7.27f, 14.04f, 2.73f, 12f, 2.73f)
                moveTo(7.93f, 4.34f)
                curveTo(7.81f, 4.34f, 7.67f, 4.37f, 7.53f, 4.43f)
                curveTo(5.65f, 5.21f, 7.24f, 8.41f, 8.3f, 8.2f)
                curveTo(9.27f, 8f, 9.39f, 4.3f, 7.93f, 4.34f)
                moveTo(4.93f, 6.85f)
                curveTo(4.77f, 6.84f, 4.59f, 6.9f, 4.41f, 7.03f)
                curveTo(2.9f, 8.07f, 4.91f, 10.58f, 5.8f, 10.19f)
                curveTo(6.57f, 9.85f, 6.08f, 6.89f, 4.93f, 6.85f)
                moveTo(13.29f, 8.77f)
                curveTo(10.1f, 8.8f, 6.03f, 10.42f, 5.32f, 13.59f)
                curveTo(4.53f, 17.11f, 8.56f, 22f, 12.76f, 22f)
                curveTo(14.83f, 22f, 17.21f, 20.13f, 17.66f, 17.77f)
                curveTo(18f, 15.97f, 13.65f, 16.69f, 13.81f, 17.88f)
                curveTo(14f, 19.31f, 12.76f, 20f, 11.55f, 19.1f)
                curveTo(7.69f, 16.16f, 17.93f, 14.7f, 17.25f, 10.69f)
                curveTo(17.03f, 9.39f, 15.34f, 8.76f, 13.29f, 8.77f)
                close()
            }
        }.build()

        return _Gnome!!
    }

@Suppress("ObjectPropertyName")
private var _Gnome: ImageVector? = null
