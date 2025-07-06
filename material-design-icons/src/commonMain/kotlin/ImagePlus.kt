package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImagePlus: ImageVector
    get() {
        if (_ImagePlus != null) {
            return _ImagePlus!!
        }
        _ImagePlus = ImageVector.Builder(
            name = "ImagePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
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
                close()
            }
        }.build()

        return _ImagePlus!!
    }

@Suppress("ObjectPropertyName")
private var _ImagePlus: ImageVector? = null
