package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageRemove: ImageVector
    get() {
        if (_ImageRemove != null) {
            return _ImageRemove!!
        }
        _ImageRemove = ImageVector.Builder(
            name = "ImageRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.3f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(13.3f)
                curveTo(20.4f, 13.1f, 19.7f, 13f, 19f, 13f)
                curveTo(17.9f, 13f, 16.8f, 13.3f, 15.9f, 13.9f)
                lineTo(14.5f, 12f)
                lineTo(11f, 16.5f)
                lineTo(8.5f, 13.5f)
                lineTo(5f, 18f)
                horizontalLineTo(13.1f)
                curveTo(13f, 18.3f, 13f, 18.7f, 13f, 19f)
                curveTo(13f, 19.7f, 13.1f, 20.4f, 13.3f, 21f)
                moveTo(20.4f, 19f)
                lineTo(22.5f, 21.1f)
                lineTo(21.1f, 22.5f)
                lineTo(19f, 20.4f)
                lineTo(16.9f, 22.5f)
                lineTo(15.5f, 21.1f)
                lineTo(17.6f, 19f)
                lineTo(15.5f, 16.9f)
                lineTo(16.9f, 15.5f)
                lineTo(19f, 17.6f)
                lineTo(21.1f, 15.5f)
                lineTo(22.5f, 16.9f)
                lineTo(20.4f, 19f)
                close()
            }
        }.build()

        return _ImageRemove!!
    }

@Suppress("ObjectPropertyName")
private var _ImageRemove: ImageVector? = null
