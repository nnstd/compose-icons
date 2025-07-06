package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GateXnor: ImageVector
    get() {
        if (_GateXnor != null) {
            return _GateXnor!!
        }
        _GateXnor = ImageVector.Builder(
            name = "GateXnor",
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
                curveTo(12.2f, 20f, 14.8f, 16.8f, 16.7f, 14f)
                curveTo(17.28f, 14.65f, 18.12f, 15f, 19f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9f)
                curveTo(18.12f, 9f, 17.28f, 9.35f, 16.7f, 10f)
                curveTo(14.7f, 7.2f, 12.2f, 4f, 9f, 4f)
                horizontalLineTo(6f)
                moveTo(9f, 6f)
                curveTo(12f, 6f, 14f, 10f, 15.5f, 12f)
                curveTo(14f, 14f, 12f, 18f, 9f, 18f)
                curveTo(10.6f, 14f, 10.6f, 10f, 9f, 6f)
                moveTo(19f, 11f)
                curveTo(19.5f, 11f, 20f, 11.5f, 20f, 12f)
                curveTo(20f, 12.5f, 19.5f, 13f, 19f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                curveTo(18f, 11.5f, 18.5f, 11f, 19f, 11f)
                close()
            }
        }.build()

        return _GateXnor!!
    }

@Suppress("ObjectPropertyName")
private var _GateXnor: ImageVector? = null
