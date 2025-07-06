package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BrushOff: ImageVector
    get() {
        if (_BrushOff != null) {
            return _BrushOff!!
        }
        _BrushOff = ImageVector.Builder(
            name = "BrushOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 22.7f)
                lineTo(12.4f, 14.3f)
                lineTo(11.8f, 15f)
                lineTo(9f, 12.2f)
                lineTo(9.7f, 11.5f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(7f, 14f)
                curveTo(5.3f, 14f, 4f, 15.3f, 4f, 17f)
                curveTo(4f, 18.3f, 2.8f, 19f, 2f, 19f)
                curveTo(2.9f, 20.2f, 4.5f, 21f, 6f, 21f)
                curveTo(8.2f, 21f, 10f, 19.2f, 10f, 17f)
                curveTo(10f, 15.3f, 8.7f, 14f, 7f, 14f)
                moveTo(20.7f, 6f)
                curveTo(21.1f, 5.6f, 21.1f, 5f, 20.7f, 4.6f)
                lineTo(19.4f, 3.3f)
                curveTo(19f, 2.9f, 18.4f, 2.9f, 18f, 3.3f)
                lineTo(12.2f, 9f)
                lineTo(15f, 11.8f)
                lineTo(20.7f, 6f)
                close()
            }
        }.build()

        return _BrushOff!!
    }

@Suppress("ObjectPropertyName")
private var _BrushOff: ImageVector? = null
