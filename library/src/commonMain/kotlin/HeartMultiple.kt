package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartMultiple: ImageVector
    get() {
        if (_HeartMultiple != null) {
            return _HeartMultiple!!
        }
        _HeartMultiple = ImageVector.Builder(
            name = "HeartMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 20f)
                curveTo(6.9f, 13.9f, 3.5f, 10.8f, 3.5f, 7.1f)
                curveTo(3.5f, 4f, 5.9f, 1.6f, 9f, 1.6f)
                curveTo(10.7f, 1.6f, 12.4f, 2.4f, 13.5f, 3.7f)
                curveTo(14.6f, 2.4f, 16.3f, 1.6f, 18f, 1.6f)
                curveTo(21.1f, 1.6f, 23.5f, 4f, 23.5f, 7.1f)
                curveTo(23.5f, 10.9f, 20.1f, 14f, 13.5f, 20f)
                moveTo(12f, 21.1f)
                curveTo(5.4f, 15.2f, 1.5f, 11.7f, 1.5f, 7f)
                curveTo(1.5f, 6.8f, 1.5f, 6.6f, 1.5f, 6.4f)
                curveTo(0.9f, 7.3f, 0.5f, 8.4f, 0.5f, 9.6f)
                curveTo(0.5f, 13.4f, 3.9f, 16.5f, 10.5f, 22.4f)
                lineTo(12f, 21.1f)
                close()
            }
        }.build()

        return _HeartMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _HeartMultiple: ImageVector? = null
