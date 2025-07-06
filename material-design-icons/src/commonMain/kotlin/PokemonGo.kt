package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PokemonGo: ImageVector
    get() {
        if (_PokemonGo != null) {
            return _PokemonGo!!
        }
        _PokemonGo = ImageVector.Builder(
            name = "PokemonGo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 9f)
                curveTo(19f, 10.4f, 18.59f, 11.71f, 17.88f, 12.8f)
                lineTo(12f, 22.21f)
                lineTo(6.12f, 12.8f)
                curveTo(5.41f, 11.71f, 5f, 10.4f, 5f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 3.5f)
                curveTo(9.3f, 3.5f, 7.06f, 5.44f, 6.59f, 8f)
                horizontalLineTo(9.17f)
                curveTo(9.58f, 6.83f, 10.69f, 6f, 12f, 6f)
                curveTo(13.31f, 6f, 14.42f, 6.83f, 14.83f, 8f)
                horizontalLineTo(17.41f)
                curveTo(16.94f, 5.44f, 14.7f, 3.5f, 12f, 3.5f)
                moveTo(12f, 12f)
                curveTo(10.69f, 12f, 9.58f, 11.17f, 9.17f, 10f)
                horizontalLineTo(6.59f)
                curveTo(6.72f, 10.69f, 6.97f, 11.34f, 7.34f, 11.91f)
                verticalLineTo(11.91f)
                lineTo(7.38f, 12f)
                curveTo(8.36f, 13.5f, 10.06f, 14.5f, 12f, 14.5f)
                curveTo(13.94f, 14.5f, 15.64f, 13.5f, 16.62f, 12f)
                lineTo(16.66f, 11.91f)
                verticalLineTo(11.91f)
                curveTo(17.03f, 11.34f, 17.28f, 10.69f, 17.41f, 10f)
                horizontalLineTo(14.83f)
                curveTo(14.42f, 11.17f, 13.31f, 12f, 12f, 12f)
                moveTo(12f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7.5f)
                close()
            }
        }.build()

        return _PokemonGo!!
    }

@Suppress("ObjectPropertyName")
private var _PokemonGo: ImageVector? = null
