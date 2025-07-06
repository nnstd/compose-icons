package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Texture: ImageVector
    get() {
        if (_Texture != null) {
            return _Texture!!
        }
        _Texture = ImageVector.Builder(
            name = "Texture",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.29f, 21f)
                horizontalLineTo(12.12f)
                lineTo(21f, 12.12f)
                verticalLineTo(9.29f)
                moveTo(19f, 21f)
                curveTo(19.55f, 21f, 20.05f, 20.78f, 20.41f, 20.41f)
                curveTo(20.78f, 20.05f, 21f, 19.55f, 21f, 19f)
                verticalLineTo(17f)
                lineTo(17f, 21f)
                moveTo(5f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(7f)
                lineTo(7f, 3f)
                moveTo(11.88f, 3f)
                lineTo(3f, 11.88f)
                verticalLineTo(14.71f)
                lineTo(14.71f, 3f)
                moveTo(19.5f, 3.08f)
                lineTo(3.08f, 19.5f)
                curveTo(3.17f, 19.85f, 3.35f, 20.16f, 3.59f, 20.41f)
                curveTo(3.84f, 20.65f, 4.15f, 20.83f, 4.5f, 20.92f)
                lineTo(20.93f, 4.5f)
                curveTo(20.74f, 3.8f, 20.2f, 3.26f, 19.5f, 3.08f)
                close()
            }
        }.build()

        return _Texture!!
    }

@Suppress("ObjectPropertyName")
private var _Texture: ImageVector? = null
