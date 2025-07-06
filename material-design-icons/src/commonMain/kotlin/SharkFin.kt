package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SharkFin: ImageVector
    get() {
        if (_SharkFin != null) {
            return _SharkFin!!
        }
        _SharkFin = ImageVector.Builder(
            name = "SharkFin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                curveTo(18.6f, 18f, 17.2f, 17.6f, 16f, 17f)
                curveTo(13.5f, 18.3f, 10.5f, 18.3f, 8f, 17f)
                curveTo(6.8f, 17.6f, 5.4f, 18f, 4f, 18f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                curveTo(5.4f, 16f, 6.8f, 15.5f, 8f, 14.7f)
                curveTo(10.4f, 16.4f, 13.6f, 16.4f, 16f, 14.7f)
                curveTo(17.2f, 15.5f, 18.6f, 16f, 20f, 16f)
                horizontalLineTo(22f)
                moveTo(5.28f, 13.79f)
                curveTo(5.82f, 13.63f, 6.37f, 13.38f, 6.89f, 13.04f)
                lineTo(8.03f, 12.27f)
                lineTo(9.16f, 13.07f)
                curveTo(10f, 13.66f, 11f, 14f, 12f, 14f)
                curveTo(13f, 14f, 14f, 13.66f, 14.84f, 13.07f)
                lineTo(15.97f, 12.27f)
                lineTo(17.11f, 13.04f)
                curveTo(17.93f, 13.59f, 18.83f, 13.9f, 19.67f, 13.97f)
                curveTo(18.24f, 7.4f, 12.37f, 2f, 6f, 2f)
                curveTo(5.65f, 2f, 5.33f, 2.18f, 5.15f, 2.47f)
                curveTo(4.97f, 2.77f, 4.95f, 3.14f, 5.11f, 3.45f)
                curveTo(7.28f, 7.79f, 6.61f, 11.29f, 5.28f, 13.79f)
                moveTo(16f, 18.7f)
                curveTo(13.6f, 20.4f, 10.4f, 20.4f, 8f, 18.7f)
                curveTo(6.8f, 19.5f, 5.4f, 20f, 4f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(5.4f, 22f, 6.8f, 21.6f, 8f, 21f)
                curveTo(10.5f, 22.3f, 13.5f, 22.3f, 16f, 21f)
                curveTo(17.2f, 21.6f, 18.6f, 22f, 20f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                curveTo(18.6f, 20f, 17.2f, 19.5f, 16f, 18.7f)
                close()
            }
        }.build()

        return _SharkFin!!
    }

@Suppress("ObjectPropertyName")
private var _SharkFin: ImageVector? = null
