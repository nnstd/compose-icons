package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Epsilon: ImageVector
    get() {
        if (_Epsilon != null) {
            return _Epsilon!!
        }
        _Epsilon = ImageVector.Builder(
            name = "Epsilon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.05f, 7.78f)
                lineTo(16.15f, 6.18f)
                curveTo(16.15f, 6.18f, 14.91f, 5f, 12.77f, 5f)
                curveTo(10.04f, 5f, 8.35f, 6.84f, 8.35f, 8.76f)
                curveTo(8.35f, 10.68f, 10.08f, 11.69f, 10.08f, 11.69f)
                curveTo(10.08f, 11.69f, 8f, 12.38f, 8f, 15f)
                curveTo(8f, 17.63f, 10.14f, 19f, 12.44f, 19f)
                curveTo(15.38f, 19f, 17f, 17.04f, 17f, 17.04f)
                lineTo(15.6f, 15.5f)
                curveTo(15.6f, 15.5f, 14.14f, 16.87f, 12.59f, 16.87f)
                curveTo(10.66f, 16.87f, 10.21f, 15.69f, 10.21f, 14.92f)
                curveTo(10.21f, 13.87f, 10.54f, 12.65f, 13.83f, 12.65f)
                lineTo(13.82f, 10.77f)
                curveTo(13.82f, 10.77f, 10.44f, 11.11f, 10.44f, 8.78f)
                curveTo(10.44f, 7.21f, 11.9f, 6.92f, 12.64f, 6.92f)
                curveTo(14.28f, 6.92f, 15.05f, 7.78f, 15.05f, 7.78f)
            }
        }.build()

        return _Epsilon!!
    }

@Suppress("ObjectPropertyName")
private var _Epsilon: ImageVector? = null
