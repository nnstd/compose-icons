package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ladybug: ImageVector
    get() {
        if (_Ladybug != null) {
            return _Ladybug!!
        }
        _Ladybug = ImageVector.Builder(
            name = "Ladybug",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                curveTo(12.74f, 5f, 13.47f, 5.1f, 14.15f, 5.29f)
                lineTo(15.78f, 2.46f)
                curveTo(16.06f, 2f, 16.67f, 1.82f, 17.15f, 2.1f)
                curveTo(17.63f, 2.37f, 17.79f, 3f, 17.5f, 3.46f)
                lineTo(16f, 6.07f)
                curveTo(17.22f, 6.78f, 18.23f, 7.79f, 18.93f, 9f)
                horizontalLineTo(5.07f)
                curveTo(5.77f, 7.79f, 6.78f, 6.78f, 8f, 6.07f)
                lineTo(6.5f, 3.46f)
                curveTo(6.21f, 3f, 6.37f, 2.37f, 6.85f, 2.1f)
                curveTo(7.33f, 1.82f, 7.94f, 2f, 8.22f, 2.46f)
                lineTo(9.85f, 5.29f)
                curveTo(10.53f, 5.1f, 11.26f, 5f, 12f, 5f)
                moveTo(20f, 13f)
                curveTo(20f, 17.17f, 16.82f, 20.59f, 12.75f, 20.97f)
                verticalLineTo(10.5f)
                horizontalLineTo(19.6f)
                curveTo(19.86f, 11.29f, 20f, 12.13f, 20f, 13f)
                moveTo(4f, 13f)
                curveTo(4f, 12.13f, 4.14f, 11.29f, 4.4f, 10.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(20.97f)
                curveTo(7.18f, 20.59f, 4f, 17.17f, 4f, 13f)
                close()
            }
        }.build()

        return _Ladybug!!
    }

@Suppress("ObjectPropertyName")
private var _Ladybug: ImageVector? = null
