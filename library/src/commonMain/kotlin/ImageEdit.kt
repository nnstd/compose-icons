package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageEdit: ImageVector
    get() {
        if (_ImageEdit != null) {
            return _ImageEdit!!
        }
        _ImageEdit = ImageVector.Builder(
            name = "ImageEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.7f, 14.3f)
                lineTo(21.7f, 15.3f)
                lineTo(19.7f, 13.3f)
                lineTo(20.7f, 12.3f)
                curveTo(20.8f, 12.2f, 20.9f, 12.1f, 21.1f, 12.1f)
                curveTo(21.2f, 12.1f, 21.4f, 12.2f, 21.5f, 12.3f)
                lineTo(22.8f, 13.6f)
                curveTo(22.9f, 13.8f, 22.9f, 14.1f, 22.7f, 14.3f)
                moveTo(13f, 19.9f)
                verticalLineTo(22f)
                horizontalLineTo(15.1f)
                lineTo(21.2f, 15.9f)
                lineTo(19.2f, 13.9f)
                lineTo(13f, 19.9f)
                moveTo(21f, 5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(19.1f)
                lineTo(12.1f, 18f)
                horizontalLineTo(5f)
                lineTo(8.5f, 13.5f)
                lineTo(11f, 16.5f)
                lineTo(14.5f, 12f)
                lineTo(16.1f, 14.1f)
                lineTo(21f, 9.1f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _ImageEdit!!
    }

@Suppress("ObjectPropertyName")
private var _ImageEdit: ImageVector? = null
