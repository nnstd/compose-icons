package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageOff: ImageVector
    get() {
        if (_ImageOff != null) {
            return _ImageOff!!
        }
        _ImageOff = ImageVector.Builder(
            name = "ImageOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 17.2f)
                lineTo(6.8f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(17.2f)
                moveTo(20.7f, 22f)
                lineTo(19.7f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(4.3f)
                lineTo(2f, 3.3f)
                lineTo(3.3f, 2f)
                lineTo(22f, 20.7f)
                lineTo(20.7f, 22f)
                moveTo(16.8f, 18f)
                lineTo(12.9f, 14.1f)
                lineTo(11f, 16.5f)
                lineTo(8.5f, 13.5f)
                lineTo(5f, 18f)
                horizontalLineTo(16.8f)
                close()
            }
        }.build()

        return _ImageOff!!
    }

@Suppress("ObjectPropertyName")
private var _ImageOff: ImageVector? = null
