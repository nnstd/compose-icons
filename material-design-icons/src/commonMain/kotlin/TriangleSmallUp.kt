package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TriangleSmallUp: ImageVector
    get() {
        if (_TriangleSmallUp != null) {
            return _TriangleSmallUp!!
        }
        _TriangleSmallUp = ImageVector.Builder(
            name = "TriangleSmallUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 15f)
                horizontalLineTo(16f)
                lineTo(12f, 8f)
            }
        }.build()

        return _TriangleSmallUp!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleSmallUp: ImageVector? = null
