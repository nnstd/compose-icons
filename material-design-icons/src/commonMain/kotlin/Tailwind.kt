package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Tailwind: ImageVector
    get() {
        if (_Tailwind != null) {
            return _Tailwind!!
        }
        _Tailwind = ImageVector.Builder(
            name = "Tailwind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                curveTo(9.33f, 6f, 7.67f, 7.33f, 7f, 10f)
                curveTo(8f, 8.67f, 9.17f, 8.17f, 10.5f, 8.5f)
                curveTo(11.26f, 8.69f, 11.81f, 9.24f, 12.41f, 9.85f)
                curveTo(13.39f, 10.85f, 14.5f, 12f, 17f, 12f)
                curveTo(19.67f, 12f, 21.33f, 10.67f, 22f, 8f)
                curveTo(21f, 9.33f, 19.83f, 9.83f, 18.5f, 9.5f)
                curveTo(17.74f, 9.31f, 17.2f, 8.76f, 16.59f, 8.15f)
                curveTo(15.61f, 7.15f, 14.5f, 6f, 12f, 6f)
                moveTo(7f, 12f)
                curveTo(4.33f, 12f, 2.67f, 13.33f, 2f, 16f)
                curveTo(3f, 14.67f, 4.17f, 14.17f, 5.5f, 14.5f)
                curveTo(6.26f, 14.69f, 6.8f, 15.24f, 7.41f, 15.85f)
                curveTo(8.39f, 16.85f, 9.5f, 18f, 12f, 18f)
                curveTo(14.67f, 18f, 16.33f, 16.67f, 17f, 14f)
                curveTo(16f, 15.33f, 14.83f, 15.83f, 13.5f, 15.5f)
                curveTo(12.74f, 15.31f, 12.2f, 14.76f, 11.59f, 14.15f)
                curveTo(10.61f, 13.15f, 9.5f, 12f, 7f, 12f)
                close()
            }
        }.build()

        return _Tailwind!!
    }

@Suppress("ObjectPropertyName")
private var _Tailwind: ImageVector? = null
