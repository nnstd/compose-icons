package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GateOr: ImageVector
    get() {
        if (_GateOr != null) {
            return _GateOr!!
        }
        _GateOr = ImageVector.Builder(
            name = "GateOr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                curveTo(5f, 10f, 5f, 14f, 2f, 20f)
                horizontalLineTo(8f)
                curveTo(13f, 20f, 19f, 16f, 22f, 12f)
                curveTo(19f, 8f, 13f, 4f, 8f, 4f)
                horizontalLineTo(2f)
                moveTo(5f, 6f)
                horizontalLineTo(8f)
                curveTo(11.5f, 6f, 16.3f, 9f, 19.3f, 12f)
                curveTo(16.3f, 15f, 11.5f, 18f, 8f, 18f)
                horizontalLineTo(5f)
                curveTo(6.4f, 13.9f, 6.4f, 10.1f, 5f, 6f)
                close()
            }
        }.build()

        return _GateOr!!
    }

@Suppress("ObjectPropertyName")
private var _GateOr: ImageVector? = null
