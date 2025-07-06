package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanoramaHorizontalOutline: ImageVector
    get() {
        if (_PanoramaHorizontalOutline != null) {
            return _PanoramaHorizontalOutline!!
        }
        _PanoramaHorizontalOutline = ImageVector.Builder(
            name = "PanoramaHorizontalOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.43f, 4f)
                curveTo(21.33f, 4f, 21.23f, 4f, 21.12f, 4.06f)
                curveTo(18.18f, 5.16f, 15.09f, 5.7f, 12f, 5.7f)
                curveTo(8.91f, 5.7f, 5.82f, 5.15f, 2.88f, 4.06f)
                curveTo(2.77f, 4f, 2.66f, 4f, 2.57f, 4f)
                curveTo(2.23f, 4f, 2f, 4.23f, 2f, 4.63f)
                verticalLineTo(19.38f)
                curveTo(2f, 19.77f, 2.23f, 20f, 2.57f, 20f)
                curveTo(2.67f, 20f, 2.77f, 20f, 2.88f, 19.94f)
                curveTo(5.82f, 18.84f, 8.91f, 18.3f, 12f, 18.3f)
                curveTo(15.09f, 18.3f, 18.18f, 18.85f, 21.12f, 19.94f)
                curveTo(21.23f, 20f, 21.33f, 20f, 21.43f, 20f)
                curveTo(21.76f, 20f, 22f, 19.77f, 22f, 19.37f)
                verticalLineTo(4.63f)
                curveTo(22f, 4.23f, 21.76f, 4f, 21.43f, 4f)
                moveTo(20f, 6.54f)
                verticalLineTo(17.45f)
                curveTo(17.4f, 16.68f, 14.72f, 16.29f, 12f, 16.29f)
                curveTo(9.28f, 16.29f, 6.6f, 16.68f, 4f, 17.45f)
                verticalLineTo(6.54f)
                curveTo(6.6f, 7.31f, 9.28f, 7.7f, 12f, 7.7f)
                curveTo(14.72f, 7.71f, 17.4f, 7.32f, 20f, 6.54f)
                close()
            }
        }.build()

        return _PanoramaHorizontalOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaHorizontalOutline: ImageVector? = null
