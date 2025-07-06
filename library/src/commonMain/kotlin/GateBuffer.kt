package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GateBuffer: ImageVector
    get() {
        if (_GateBuffer != null) {
            return _GateBuffer!!
        }
        _GateBuffer = ImageVector.Builder(
            name = "GateBuffer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 7.24f)
                lineTo(15.53f, 12f)
                lineTo(6f, 16.76f)
                verticalLineTo(7.24f)
                moveTo(4f, 4f)
                verticalLineTo(20f)
                lineTo(20f, 12f)
                lineTo(4f, 4f)
                close()
            }
        }.build()

        return _GateBuffer!!
    }

@Suppress("ObjectPropertyName")
private var _GateBuffer: ImageVector? = null
