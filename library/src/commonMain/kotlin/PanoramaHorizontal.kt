package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanoramaHorizontal: ImageVector
    get() {
        if (_PanoramaHorizontal != null) {
            return _PanoramaHorizontal!!
        }
        _PanoramaHorizontal = ImageVector.Builder(
            name = "PanoramaHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5.5f)
                curveTo(8.1f, 5.5f, 5.1f, 4.7f, 3.3f, 4.1f)
                curveTo(2.7f, 3.8f, 2f, 4.3f, 2f, 5f)
                verticalLineTo(19f)
                curveTo(2f, 19.7f, 2.7f, 20.2f, 3.3f, 20f)
                curveTo(5.4f, 19.3f, 8.1f, 18.5f, 12f, 18.5f)
                curveTo(15.9f, 18.5f, 18.7f, 19.3f, 20.7f, 20f)
                curveTo(21.4f, 20.2f, 22f, 19.7f, 22f, 19f)
                verticalLineTo(5f)
                curveTo(22f, 4.3f, 21.3f, 3.8f, 20.7f, 4.1f)
                curveTo(18.7f, 4.7f, 15.9f, 5.5f, 12f, 5.5f)
                close()
            }
        }.build()

        return _PanoramaHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaHorizontal: ImageVector? = null
