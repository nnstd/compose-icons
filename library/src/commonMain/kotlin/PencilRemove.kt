package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PencilRemove: ImageVector
    get() {
        if (_PencilRemove != null) {
            return _PencilRemove!!
        }
        _PencilRemove = ImageVector.Builder(
            name = "PencilRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.7f, 7f)
                curveTo(21.1f, 6.6f, 21.1f, 6f, 20.7f, 5.6f)
                lineTo(18.4f, 3.3f)
                curveTo(18f, 2.9f, 17.4f, 2.9f, 17f, 3.3f)
                lineTo(15.2f, 5.1f)
                lineTo(19f, 8.9f)
                moveTo(3f, 17.2f)
                verticalLineTo(21f)
                horizontalLineTo(6.8f)
                lineTo(17.8f, 9.9f)
                lineTo(14.1f, 6.1f)
                lineTo(3f, 17.2f)
                moveTo(3.9f, 2.4f)
                lineTo(6f, 4.5f)
                lineTo(8.1f, 2.4f)
                lineTo(9.5f, 3.8f)
                lineTo(7.4f, 5.9f)
                lineTo(9.5f, 8f)
                lineTo(8.1f, 9.5f)
                lineTo(6f, 7.4f)
                lineTo(3.9f, 9.5f)
                lineTo(2.5f, 8.1f)
                lineTo(4.6f, 6f)
                lineTo(2.5f, 3.8f)
                lineTo(3.9f, 2.4f)
                close()
            }
        }.build()

        return _PencilRemove!!
    }

@Suppress("ObjectPropertyName")
private var _PencilRemove: ImageVector? = null
