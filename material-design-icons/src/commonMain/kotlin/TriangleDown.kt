package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TriangleDown: ImageVector
    get() {
        if (_TriangleDown != null) {
            return _TriangleDown!!
        }
        _TriangleDown = ImageVector.Builder(
            name = "TriangleDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 3f)
                horizontalLineTo(23f)
                lineTo(12f, 22f)
            }
        }.build()

        return _TriangleDown!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleDown: ImageVector? = null
