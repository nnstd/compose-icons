package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GlassCocktailOff: ImageVector
    get() {
        if (_GlassCocktailOff != null) {
            return _GlassCocktailOff!!
        }
        _GlassCocktailOff = ImageVector.Builder(
            name = "GlassCocktailOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.33f, 12.67f)
                lineTo(7.66f, 7f)
                lineTo(6.13f, 5.47f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(3f, 4.89f)
                verticalLineTo(5f)
                lineTo(11f, 13f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(19.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(13.33f, 12.67f)
                moveTo(13f, 19f)
                verticalLineTo(14.89f)
                lineTo(17.11f, 19f)
                horizontalLineTo(13f)
                moveTo(8.2f, 5f)
                lineTo(6.2f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                lineTo(14.6f, 11.4f)
                lineTo(10.2f, 7f)
                horizontalLineTo(16.5f)
                lineTo(18.5f, 5f)
                horizontalLineTo(8.2f)
                close()
            }
        }.build()

        return _GlassCocktailOff!!
    }

@Suppress("ObjectPropertyName")
private var _GlassCocktailOff: ImageVector? = null
