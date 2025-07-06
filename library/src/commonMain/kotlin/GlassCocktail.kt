package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GlassCocktail: ImageVector
    get() {
        if (_GlassCocktail != null) {
            return _GlassCocktail!!
        }
        _GlassCocktail = ImageVector.Builder(
            name = "GlassCocktail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 7f)
                lineTo(5.5f, 5f)
                horizontalLineTo(18.5f)
                lineTo(16.5f, 7f)
                moveTo(11f, 13f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                lineTo(21f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                lineTo(11f, 13f)
                close()
            }
        }.build()

        return _GlassCocktail!!
    }

@Suppress("ObjectPropertyName")
private var _GlassCocktail: ImageVector? = null
