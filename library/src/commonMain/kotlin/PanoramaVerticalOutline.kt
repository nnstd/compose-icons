package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanoramaVerticalOutline: ImageVector
    get() {
        if (_PanoramaVerticalOutline != null) {
            return _PanoramaVerticalOutline!!
        }
        _PanoramaVerticalOutline = ImageVector.Builder(
            name = "PanoramaVerticalOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.54f, 20f)
                curveTo(7.31f, 17.4f, 7.7f, 14.72f, 7.7f, 12f)
                curveTo(7.7f, 9.28f, 7.31f, 6.6f, 6.54f, 4f)
                horizontalLineTo(17.45f)
                curveTo(16.68f, 6.6f, 16.29f, 9.28f, 16.29f, 12f)
                curveTo(16.29f, 14.72f, 16.68f, 17.4f, 17.45f, 20f)
                moveTo(19.94f, 21.12f)
                curveTo(18.84f, 18.18f, 18.3f, 15.09f, 18.3f, 12f)
                curveTo(18.3f, 8.91f, 18.85f, 5.82f, 19.94f, 2.88f)
                curveTo(20f, 2.77f, 20f, 2.66f, 20f, 2.57f)
                curveTo(20f, 2.23f, 19.77f, 2f, 19.37f, 2f)
                horizontalLineTo(4.63f)
                curveTo(4.23f, 2f, 4f, 2.23f, 4f, 2.57f)
                curveTo(4f, 2.67f, 4f, 2.77f, 4.06f, 2.88f)
                curveTo(5.16f, 5.82f, 5.71f, 8.91f, 5.71f, 12f)
                curveTo(5.71f, 15.09f, 5.16f, 18.18f, 4.07f, 21.12f)
                curveTo(4f, 21.23f, 4f, 21.34f, 4f, 21.43f)
                curveTo(4f, 21.76f, 4.23f, 22f, 4.63f, 22f)
                horizontalLineTo(19.38f)
                curveTo(19.77f, 22f, 20f, 21.76f, 20f, 21.43f)
                curveTo(20f, 21.33f, 20f, 21.23f, 19.94f, 21.12f)
                close()
            }
        }.build()

        return _PanoramaVerticalOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaVerticalOutline: ImageVector? = null
