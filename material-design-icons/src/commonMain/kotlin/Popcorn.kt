package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Popcorn: ImageVector
    get() {
        if (_Popcorn != null) {
            return _Popcorn!!
        }
        _Popcorn = ImageVector.Builder(
            name = "Popcorn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 22f)
                horizontalLineTo(4.75f)
                curveTo(4.75f, 22f, 4f, 22f, 3.81f, 20.65f)
                lineTo(2.04f, 3.81f)
                lineTo(2f, 3.5f)
                curveTo(2f, 2.67f, 2.9f, 2f, 4f, 2f)
                curveTo(5.1f, 2f, 6f, 2.67f, 6f, 3.5f)
                curveTo(6f, 2.67f, 6.9f, 2f, 8f, 2f)
                curveTo(9.1f, 2f, 10f, 2.67f, 10f, 3.5f)
                curveTo(10f, 2.67f, 10.9f, 2f, 12f, 2f)
                curveTo(13.09f, 2f, 14f, 2.66f, 14f, 3.5f)
                verticalLineTo(3.5f)
                curveTo(14f, 2.67f, 14.9f, 2f, 16f, 2f)
                curveTo(17.1f, 2f, 18f, 2.67f, 18f, 3.5f)
                curveTo(18f, 2.67f, 18.9f, 2f, 20f, 2f)
                curveTo(21.1f, 2f, 22f, 2.67f, 22f, 3.5f)
                lineTo(21.96f, 3.81f)
                lineTo(20.19f, 20.65f)
                curveTo(20f, 22f, 19.25f, 22f, 19.25f, 22f)
                horizontalLineTo(17f)
                lineTo(16.5f, 22f)
                horizontalLineTo(13.75f)
                lineTo(10.25f, 22f)
                horizontalLineTo(7.5f)
                lineTo(7f, 22f)
                moveTo(17.85f, 4.93f)
                curveTo(17.55f, 4.39f, 16.84f, 4f, 16f, 4f)
                curveTo(15.19f, 4f, 14.36f, 4.36f, 14f, 4.87f)
                lineTo(13.78f, 20f)
                horizontalLineTo(16.66f)
                lineTo(17.85f, 4.93f)
                moveTo(10f, 4.87f)
                curveTo(9.64f, 4.36f, 8.81f, 4f, 8f, 4f)
                curveTo(7.16f, 4f, 6.45f, 4.39f, 6.15f, 4.93f)
                lineTo(7.34f, 20f)
                horizontalLineTo(10.22f)
                lineTo(10f, 4.87f)
                close()
            }
        }.build()

        return _Popcorn!!
    }

@Suppress("ObjectPropertyName")
private var _Popcorn: ImageVector? = null
