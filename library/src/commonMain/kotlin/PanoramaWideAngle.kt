package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanoramaWideAngle: ImageVector
    get() {
        if (_PanoramaWideAngle != null) {
            return _PanoramaWideAngle!!
        }
        _PanoramaWideAngle = ImageVector.Builder(
            name = "PanoramaWideAngle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(8f, 4f, 5.2f, 4.6f, 3f, 5f)
                curveTo(2.5f, 7f, 2f, 8.9f, 2f, 12f)
                curveTo(2f, 15f, 2.5f, 17f, 3f, 19f)
                curveTo(5.2f, 19.4f, 8f, 20f, 12f, 20f)
                curveTo(16f, 20f, 18.9f, 19.4f, 21f, 19f)
                curveTo(21.6f, 17f, 22f, 15f, 22f, 12f)
                curveTo(22f, 9f, 21.5f, 6.9f, 21f, 5f)
                curveTo(18.9f, 4.6f, 16f, 4f, 12f, 4f)
                close()
            }
        }.build()

        return _PanoramaWideAngle!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaWideAngle: ImageVector? = null
