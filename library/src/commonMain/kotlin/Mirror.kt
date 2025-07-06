package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Mirror: ImageVector
    get() {
        if (_Mirror != null) {
            return _Mirror!!
        }
        _Mirror = ImageVector.Builder(
            name = "Mirror",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(16.69f, 1f, 20.5f, 5.93f, 20.5f, 12f)
                curveTo(20.5f, 18.08f, 16.69f, 23f, 12f, 23f)
                curveTo(7.31f, 23f, 3.5f, 18.08f, 3.5f, 12f)
                curveTo(3.5f, 5.93f, 7.31f, 1f, 12f, 1f)
                moveTo(12f, 3f)
                curveTo(8.41f, 3f, 5.5f, 7.03f, 5.5f, 12f)
                curveTo(5.5f, 16.97f, 8.41f, 21f, 12f, 21f)
                curveTo(15.59f, 21f, 18.5f, 16.97f, 18.5f, 12f)
                curveTo(18.5f, 7.03f, 15.59f, 3f, 12f, 3f)
                moveTo(8.29f, 10.28f)
                lineTo(11.53f, 7.03f)
                lineTo(12.59f, 8.09f)
                lineTo(9.35f, 11.34f)
                lineTo(8.29f, 10.28f)
                moveTo(8.7f, 14.61f)
                lineTo(14.36f, 8.95f)
                lineTo(15.42f, 10f)
                lineTo(9.76f, 15.67f)
                lineTo(8.7f, 14.61f)
                close()
            }
        }.build()

        return _Mirror!!
    }

@Suppress("ObjectPropertyName")
private var _Mirror: ImageVector? = null
