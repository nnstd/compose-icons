package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TriangleOutline: ImageVector
    get() {
        if (_TriangleOutline != null) {
            return _TriangleOutline!!
        }
        _TriangleOutline = ImageVector.Builder(
            name = "TriangleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineTo(1f, 21f)
                horizontalLineTo(23f)
                moveTo(12f, 6f)
                lineTo(19.53f, 19f)
                horizontalLineTo(4.47f)
            }
        }.build()

        return _TriangleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleOutline: ImageVector? = null
