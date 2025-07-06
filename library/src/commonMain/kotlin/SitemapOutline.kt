package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SitemapOutline: ImageVector
    get() {
        if (_SitemapOutline != null) {
            return _SitemapOutline!!
        }
        _SitemapOutline = ImageVector.Builder(
            name = "SitemapOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                verticalLineTo(13f)
                curveTo(21f, 11.89f, 20.11f, 11f, 19f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
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
                moveTo(11f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                moveTo(5f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                moveTo(13f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                moveTo(21f, 20f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _SitemapOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SitemapOutline: ImageVector? = null
