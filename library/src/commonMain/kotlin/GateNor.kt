package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GateNor: ImageVector
    get() {
        if (_GateNor != null) {
            return _GateNor!!
        }
        _GateNor = ImageVector.Builder(
            name = "GateNor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                curveTo(5f, 10f, 5f, 14f, 2f, 20f)
                horizontalLineTo(5f)
                curveTo(9.4f, 20f, 13f, 17.7f, 16.6f, 13.7f)
                curveTo(17.15f, 14.5f, 18.04f, 15f, 19f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9f)
                curveTo(18.04f, 9f, 17.15f, 9.5f, 16.6f, 10.3f)
                curveTo(13f, 6.3f, 9.4f, 4f, 5f, 4f)
                horizontalLineTo(2f)
                moveTo(5f, 6f)
                curveTo(8.8f, 6f, 12f, 8.1f, 15.3f, 12f)
                curveTo(12f, 15.9f, 8.8f, 18f, 5f, 18f)
                curveTo(6.5f, 14f, 6.5f, 10f, 5f, 6f)
                moveTo(19f, 11f)
                curveTo(19.5f, 11f, 20f, 11.5f, 20f, 12f)
                curveTo(20f, 12.5f, 19.5f, 13f, 19f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                curveTo(18f, 11.5f, 18.5f, 11f, 19f, 11f)
                close()
            }
        }.build()

        return _GateNor!!
    }

@Suppress("ObjectPropertyName")
private var _GateNor: ImageVector? = null
