package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TriangleDownOutline: ImageVector
    get() {
        if (_TriangleDownOutline != null) {
            return _TriangleDownOutline!!
        }
        _TriangleDownOutline = ImageVector.Builder(
            name = "TriangleDownOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 22f)
                lineTo(1f, 3f)
                horizontalLineTo(23f)
                moveTo(12f, 18f)
                lineTo(19.53f, 5f)
                horizontalLineTo(4.47f)
            }
        }.build()

        return _TriangleDownOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleDownOutline: ImageVector? = null
