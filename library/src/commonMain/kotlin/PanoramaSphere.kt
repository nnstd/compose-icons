package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanoramaSphere: ImageVector
    get() {
        if (_PanoramaSphere != null) {
            return _PanoramaSphere!!
        }
        _PanoramaSphere = ImageVector.Builder(
            name = "PanoramaSphere",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 8.1f)
                curveTo(21.7f, 8f, 21.3f, 7.8f, 21f, 7.7f)
                curveTo(19.4f, 4.3f, 16f, 2f, 12f, 2f)
                reflectiveCurveTo(4.6f, 4.3f, 3f, 7.7f)
                curveTo(2.7f, 7.8f, 2.3f, 8f, 2.1f, 8.1f)
                curveTo(1.4f, 8.5f, 1f, 9.2f, 1f, 9.9f)
                verticalLineTo(14.1f)
                curveTo(1f, 14.8f, 1.4f, 15.5f, 2f, 15.9f)
                curveTo(2.3f, 16f, 2.7f, 16.2f, 3f, 16.3f)
                curveTo(4.6f, 19.7f, 8f, 22f, 12f, 22f)
                reflectiveCurveTo(19.4f, 19.7f, 21f, 16.3f)
                curveTo(21.3f, 16.2f, 21.6f, 16f, 21.9f, 15.8f)
                curveTo(22.5f, 15.4f, 23f, 14.8f, 23f, 14f)
                verticalLineTo(9.9f)
                curveTo(23f, 9.2f, 22.6f, 8.5f, 22f, 8.1f)
                moveTo(12f, 4f)
                curveTo(14.4f, 4f, 16.5f, 5f, 18f, 6.7f)
                curveTo(16.2f, 6.2f, 14.1f, 6f, 12f, 6f)
                reflectiveCurveTo(7.8f, 6.2f, 6.1f, 6.7f)
                curveTo(7.5f, 5f, 9.6f, 4f, 12f, 4f)
                moveTo(12f, 20f)
                curveTo(9.6f, 20f, 7.5f, 19f, 6.1f, 17.3f)
                curveTo(7.8f, 17.8f, 9.9f, 18f, 12f, 18f)
                reflectiveCurveTo(16.2f, 17.8f, 18f, 17.3f)
                curveTo(16.5f, 19f, 14.4f, 20f, 12f, 20f)
                close()
            }
        }.build()

        return _PanoramaSphere!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaSphere: ImageVector? = null
