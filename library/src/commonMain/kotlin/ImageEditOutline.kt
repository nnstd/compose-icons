package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageEditOutline: ImageVector
    get() {
        if (_ImageEditOutline != null) {
            return _ImageEditOutline!!
        }
        _ImageEditOutline = ImageVector.Builder(
            name = "ImageEditOutline",
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
                moveTo(11.21f, 15.83f)
                lineTo(9.25f, 13.47f)
                lineTo(6.5f, 17f)
                horizontalLineTo(13.12f)
                lineTo(15.66f, 14.55f)
                lineTo(13.96f, 12.29f)
                lineTo(11.21f, 15.83f)
                moveTo(11f, 19.9f)
                verticalLineTo(19.05f)
                lineTo(11.05f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(11.31f)
                lineTo(21f, 9.38f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(19.9f)
                close()
            }
        }.build()

        return _ImageEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ImageEditOutline: ImageVector? = null
