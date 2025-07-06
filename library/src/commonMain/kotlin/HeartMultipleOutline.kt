package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartMultipleOutline: ImageVector
    get() {
        if (_HeartMultipleOutline != null) {
            return _HeartMultipleOutline!!
        }
        _HeartMultipleOutline = ImageVector.Builder(
            name = "HeartMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21.1f)
                lineTo(10.5f, 22.4f)
                curveTo(3.9f, 16.5f, 0.5f, 13.4f, 0.5f, 9.6f)
                curveTo(0.5f, 8.4f, 0.9f, 7.3f, 1.5f, 6.4f)
                curveTo(1.5f, 6.6f, 1.5f, 6.8f, 1.5f, 7f)
                curveTo(1.5f, 11.7f, 5.4f, 15.2f, 12f, 21.1f)
                moveTo(13.6f, 17f)
                curveTo(18.3f, 12.7f, 21.5f, 9.9f, 21.6f, 7f)
                curveTo(21.6f, 5f, 20.1f, 3.5f, 18.1f, 3.5f)
                curveTo(16.5f, 3.5f, 15f, 4.5f, 14.5f, 5.9f)
                horizontalLineTo(12.6f)
                curveTo(12f, 4.5f, 10.5f, 3.5f, 9f, 3.5f)
                curveTo(7f, 3.5f, 5.5f, 5f, 5.5f, 7f)
                curveTo(5.5f, 9.9f, 8.6f, 12.7f, 13.4f, 17f)
                lineTo(13.5f, 17.1f)
                moveTo(18f, 1.5f)
                curveTo(21.1f, 1.5f, 23.5f, 3.9f, 23.5f, 7f)
                curveTo(23.5f, 10.7f, 20.1f, 13.8f, 13.5f, 19.8f)
                curveTo(6.9f, 13.9f, 3.5f, 10.8f, 3.5f, 7f)
                curveTo(3.5f, 3.9f, 5.9f, 1.5f, 9f, 1.5f)
                curveTo(10.7f, 1.5f, 12.4f, 2.3f, 13.5f, 3.6f)
                curveTo(14.6f, 2.3f, 16.3f, 1.5f, 18f, 1.5f)
                close()
            }
        }.build()

        return _HeartMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HeartMultipleOutline: ImageVector? = null
