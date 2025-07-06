package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Donkey: ImageVector
    get() {
        if (_Donkey != null) {
            return _Donkey!!
        }
        _Donkey = ImageVector.Builder(
            name = "Donkey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.34f, 10.35f)
                lineTo(21.27f, 10.28f)
                lineTo(21.18f, 10.19f)
                lineTo(18f, 7f)
                verticalLineTo(6f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 5.5f)
                curveTo(17.36f, 5.5f, 17.22f, 5.56f, 17.13f, 5.66f)
                lineTo(13.46f, 9f)
                horizontalLineTo(7f)
                curveTo(6.32f, 9f, 5.69f, 9.35f, 5.32f, 9.92f)
                lineTo(2.62f, 12.59f)
                curveTo(2.29f, 13.04f, 2.39f, 13.66f, 2.84f, 14f)
                curveTo(3.18f, 14.24f, 3.65f, 14.25f, 4f, 14f)
                lineTo(5f, 13.07f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                verticalLineTo(13.83f)
                curveTo(16f, 13.3f, 16.21f, 12.79f, 16.59f, 12.42f)
                lineTo(18f, 11f)
                lineTo(20f, 12f)
                verticalLineTo(12f)
                curveTo(20.15f, 12.08f, 20.32f, 12.13f, 20.5f, 12.13f)
                curveTo(21.1f, 12.11f, 21.59f, 11.61f, 21.58f, 11f)
                curveTo(21.57f, 10.76f, 21.5f, 10.53f, 21.34f, 10.35f)
                close()
            }
        }.build()

        return _Donkey!!
    }

@Suppress("ObjectPropertyName")
private var _Donkey: ImageVector? = null
