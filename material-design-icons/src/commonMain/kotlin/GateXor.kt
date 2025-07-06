package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GateXor: ImageVector
    get() {
        if (_GateXor != null) {
            return _GateXor!!
        }
        _GateXor = ImageVector.Builder(
            name = "GateXor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                curveTo(5f, 10f, 5f, 14f, 2f, 20f)
                horizontalLineTo(4f)
                curveTo(7f, 14f, 7f, 10f, 4.1f, 4f)
                horizontalLineTo(2f)
                moveTo(6f, 4f)
                curveTo(9f, 10f, 9f, 14f, 6f, 20f)
                horizontalLineTo(9f)
                curveTo(14f, 20f, 18f, 17f, 22f, 12f)
                curveTo(18f, 7f, 14f, 4f, 9f, 4f)
                horizontalLineTo(6f)
                moveTo(9f, 6f)
                curveTo(12.8f, 6f, 16f, 8.1f, 19.3f, 12f)
                curveTo(15.9f, 15.9f, 12.8f, 18f, 9f, 18f)
                curveTo(10.5f, 14f, 10.5f, 10f, 9f, 6f)
                close()
            }
        }.build()

        return _GateXor!!
    }

@Suppress("ObjectPropertyName")
private var _GateXor: ImageVector? = null
