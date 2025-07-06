package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GlassWine: ImageVector
    get() {
        if (_GlassWine != null) {
            return _GlassWine!!
        }
        _GlassWine = ImageVector.Builder(
            name = "GlassWine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 21.27f)
                lineTo(14.66f, 21.18f)
                curveTo(13.9f, 21.11f, 13.25f, 20.6f, 13f, 19.87f)
                curveTo(12.47f, 17.91f, 12.47f, 15.83f, 13f, 13.87f)
                curveTo(15.32f, 13.4f, 17f, 11.37f, 17f, 9f)
                curveTo(17f, 7f, 15f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(9f, 2f, 7f, 7f, 7f, 9f)
                curveTo(7f, 11.38f, 8.67f, 13.42f, 11f, 13.9f)
                curveTo(11.53f, 15.86f, 11.53f, 17.94f, 11f, 19.9f)
                curveTo(10.76f, 20.62f, 10.12f, 21.13f, 9.37f, 21.21f)
                lineTo(8.5f, 21.3f)
                curveTo(8.5f, 21.3f, 8f, 21.28f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(16f, 21.28f, 15.5f, 21.27f, 15.5f, 21.27f)
                moveTo(9.44f, 7f)
                lineTo(10.44f, 4f)
                horizontalLineTo(13.56f)
                lineTo(14.56f, 7f)
                horizontalLineTo(9.44f)
                close()
            }
        }.build()

        return _GlassWine!!
    }

@Suppress("ObjectPropertyName")
private var _GlassWine: ImageVector? = null
