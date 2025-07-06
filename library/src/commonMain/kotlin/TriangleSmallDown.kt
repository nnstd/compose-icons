package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TriangleSmallDown: ImageVector
    get() {
        if (_TriangleSmallDown != null) {
            return _TriangleSmallDown!!
        }
        _TriangleSmallDown = ImageVector.Builder(
            name = "TriangleSmallDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 9f)
                horizontalLineTo(16f)
                lineTo(12f, 16f)
            }
        }.build()

        return _TriangleSmallDown!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleSmallDown: ImageVector? = null
