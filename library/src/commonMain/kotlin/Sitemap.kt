package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sitemap: ImageVector
    get() {
        if (_Sitemap != null) {
            return _Sitemap!!
        }
        _Sitemap = ImageVector.Builder(
            name = "Sitemap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                curveTo(3.89f, 11f, 3f, 11.89f, 3f, 13f)
                verticalLineTo(16f)
                horizontalLineTo(1f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(23f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                curveTo(21f, 11.89f, 20.11f, 11f, 19f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _Sitemap!!
    }

@Suppress("ObjectPropertyName")
private var _Sitemap: ImageVector? = null
