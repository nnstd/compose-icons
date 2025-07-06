package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReflectVertical: ImageVector
    get() {
        if (_ReflectVertical != null) {
            return _ReflectVertical!!
        }
        _ReflectVertical = ImageVector.Builder(
            name = "ReflectVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 23f)
                horizontalLineTo(6f)
                curveTo(5.61f, 23f, 5.26f, 22.79f, 5.09f, 22.45f)
                curveTo(4.92f, 22.11f, 4.96f, 21.7f, 5.19f, 21.4f)
                lineTo(11.2f, 13.38f)
                curveTo(11.58f, 12.87f, 12.42f, 12.87f, 12.8f, 13.38f)
                lineTo(18.81f, 21.4f)
                curveTo(19.04f, 21.7f, 19.08f, 22.11f, 18.91f, 22.45f)
                curveTo(18.74f, 22.79f, 18.39f, 23f, 18f, 23f)
                moveTo(18f, 1f)
                curveTo(18.39f, 1f, 18.74f, 1.21f, 18.91f, 1.55f)
                curveTo(19.08f, 1.89f, 19.04f, 2.3f, 18.81f, 2.6f)
                lineTo(12.8f, 10.62f)
                curveTo(12.42f, 11.13f, 11.58f, 11.13f, 11.2f, 10.62f)
                lineTo(5.19f, 2.6f)
                curveTo(4.96f, 2.3f, 4.92f, 1.89f, 5.09f, 1.55f)
                curveTo(5.26f, 1.21f, 5.61f, 1f, 6f, 1f)
                horizontalLineTo(18f)
                moveTo(8f, 3f)
                lineTo(12f, 8.35f)
                lineTo(16f, 3f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _ReflectVertical!!
    }

@Suppress("ObjectPropertyName")
private var _ReflectVertical: ImageVector? = null
