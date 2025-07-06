package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Artstation: ImageVector
    get() {
        if (_Artstation != null) {
            return _Artstation!!
        }
        _Artstation = ImageVector.Builder(
            name = "Artstation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.77f, 16.88f)
                lineTo(3.5f, 19.86f)
                curveTo(3.84f, 20.54f, 4.54f, 21f, 5.33f, 21f)
                horizontalLineTo(16.79f)
                lineTo(14.43f, 16.88f)
                horizontalLineTo(1.77f)
                moveTo(22.23f, 16.9f)
                curveTo(22.23f, 16.5f, 22.11f, 16.11f, 21.9f, 15.78f)
                lineTo(15.17f, 4.1f)
                curveTo(14.82f, 3.44f, 14.15f, 3f, 13.35f, 3f)
                horizontalLineTo(9.8f)
                lineTo(20.18f, 21f)
                lineTo(21.82f, 18.14f)
                curveTo(22.13f, 17.6f, 22.23f, 17.36f, 22.23f, 16.9f)
                moveTo(12.73f, 13.94f)
                lineTo(8.1f, 5.92f)
                lineTo(3.45f, 13.94f)
                horizontalLineTo(12.73f)
                close()
            }
        }.build()

        return _Artstation!!
    }

@Suppress("ObjectPropertyName")
private var _Artstation: ImageVector? = null
