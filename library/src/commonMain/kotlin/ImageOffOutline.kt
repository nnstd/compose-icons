package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageOffOutline: ImageVector
    get() {
        if (_ImageOffOutline != null) {
            return _ImageOffOutline!!
        }
        _ImageOffOutline = ImageVector.Builder(
            name = "ImageOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 20.7f)
                lineTo(3.3f, 2f)
                lineTo(2f, 3.3f)
                lineTo(3f, 4.3f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19.7f)
                lineTo(20.7f, 22f)
                lineTo(22f, 20.7f)
                moveTo(5f, 19f)
                verticalLineTo(6.3f)
                lineTo(12.6f, 13.9f)
                lineTo(11.1f, 15.8f)
                lineTo(9f, 13.1f)
                lineTo(6f, 17f)
                horizontalLineTo(15.7f)
                lineTo(17.7f, 19f)
                horizontalLineTo(5f)
                moveTo(8.8f, 5f)
                lineTo(6.8f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(17.2f)
                lineTo(19f, 15.2f)
                verticalLineTo(5f)
                horizontalLineTo(8.8f)
            }
        }.build()

        return _ImageOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ImageOffOutline: ImageVector? = null
