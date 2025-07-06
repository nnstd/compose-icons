package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanoramaOutline: ImageVector
    get() {
        if (_PanoramaOutline != null) {
            return _PanoramaOutline!!
        }
        _PanoramaOutline = ImageVector.Builder(
            name = "PanoramaOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4f)
                horizontalLineTo(3f)
                curveTo(1.9f, 4f, 1f, 4.9f, 1f, 6f)
                verticalLineTo(18f)
                curveTo(1f, 19.1f, 1.9f, 20f, 3f, 20f)
                horizontalLineTo(21f)
                curveTo(22.1f, 20f, 23f, 19.1f, 23f, 18f)
                verticalLineTo(6f)
                curveTo(23f, 4.9f, 22.1f, 4f, 21f, 4f)
                moveTo(21f, 18f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                moveTo(14.5f, 11f)
                lineTo(11f, 15.5f)
                lineTo(8.5f, 12.5f)
                lineTo(5f, 17f)
                horizontalLineTo(19f)
                lineTo(14.5f, 11f)
                close()
            }
        }.build()

        return _PanoramaOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaOutline: ImageVector? = null
