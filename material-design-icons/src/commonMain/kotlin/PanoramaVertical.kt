package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanoramaVertical: ImageVector
    get() {
        if (_PanoramaVertical != null) {
            return _PanoramaVertical!!
        }
        _PanoramaVertical = ImageVector.Builder(
            name = "PanoramaVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 12f)
                curveTo(18.5f, 8.1f, 19.3f, 5.1f, 19.9f, 3.3f)
                curveTo(20.1f, 2.7f, 19.7f, 2f, 19f, 2f)
                horizontalLineTo(5f)
                curveTo(4.3f, 2f, 3.8f, 2.7f, 4.1f, 3.3f)
                curveTo(4.7f, 5.4f, 5.5f, 8.1f, 5.5f, 12f)
                curveTo(5.5f, 15.9f, 4.7f, 18.7f, 4.1f, 20.7f)
                curveTo(3.8f, 21.3f, 4.3f, 22f, 5f, 22f)
                horizontalLineTo(19f)
                curveTo(19.7f, 22f, 20.2f, 21.3f, 20f, 20.7f)
                curveTo(19.3f, 18.7f, 18.5f, 15.9f, 18.5f, 12f)
                close()
            }
        }.build()

        return _PanoramaVertical!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaVertical: ImageVector? = null
