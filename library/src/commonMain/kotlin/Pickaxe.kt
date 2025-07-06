package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pickaxe: ImageVector
    get() {
        if (_Pickaxe != null) {
            return _Pickaxe!!
        }
        _Pickaxe = ImageVector.Builder(
            name = "Pickaxe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.79f, 10.62f)
                lineTo(3.5f, 21.9f)
                lineTo(2.1f, 20.5f)
                lineTo(13.38f, 9.21f)
                lineTo(14.79f, 10.62f)
                moveTo(19.27f, 7.73f)
                lineTo(19.86f, 7.14f)
                lineTo(19.07f, 6.35f)
                lineTo(19.71f, 5.71f)
                lineTo(18.29f, 4.29f)
                lineTo(17.65f, 4.93f)
                lineTo(16.86f, 4.14f)
                lineTo(16.27f, 4.73f)
                curveTo(14.53f, 3.31f, 12.57f, 2.17f, 10.47f, 1.37f)
                lineTo(9.64f, 3.16f)
                curveTo(11.39f, 4.08f, 13f, 5.19f, 14.5f, 6.5f)
                lineTo(14f, 7f)
                lineTo(17f, 10f)
                lineTo(17.5f, 9.5f)
                curveTo(18.81f, 11f, 19.92f, 12.61f, 20.84f, 14.36f)
                lineTo(22.63f, 13.53f)
                curveTo(21.83f, 11.43f, 20.69f, 9.47f, 19.27f, 7.73f)
                close()
            }
        }.build()

        return _Pickaxe!!
    }

@Suppress("ObjectPropertyName")
private var _Pickaxe: ImageVector? = null
