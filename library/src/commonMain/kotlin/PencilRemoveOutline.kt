package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PencilRemoveOutline: ImageVector
    get() {
        if (_PencilRemoveOutline != null) {
            return _PencilRemoveOutline!!
        }
        _PencilRemoveOutline = ImageVector.Builder(
            name = "PencilRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.7f, 3f)
                curveTo(17.5f, 3f, 17.2f, 3.1f, 17f, 3.3f)
                lineTo(15.2f, 5.1f)
                lineTo(18.9f, 8.9f)
                lineTo(20.7f, 7f)
                curveTo(21.1f, 6.6f, 21.1f, 6f, 20.7f, 5.6f)
                lineTo(18.4f, 3.3f)
                curveTo(18.2f, 3.1f, 17.9f, 3f, 17.7f, 3f)
                moveTo(14.1f, 6.2f)
                lineTo(3f, 17.2f)
                verticalLineTo(21f)
                horizontalLineTo(6.8f)
                lineTo(17.8f, 9.9f)
                lineTo(14.1f, 6.2f)
                moveTo(5.9f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(18.1f)
                lineTo(14.1f, 9f)
                lineTo(15f, 9.9f)
                lineTo(5.9f, 19f)
                moveTo(3.9f, 2.5f)
                lineTo(6f, 4.6f)
                lineTo(8.1f, 2.5f)
                lineTo(9.5f, 3.9f)
                lineTo(7.4f, 6f)
                lineTo(9.5f, 8.1f)
                lineTo(8.1f, 9.5f)
                lineTo(6f, 7.4f)
                lineTo(3.9f, 9.5f)
                lineTo(2.5f, 8.1f)
                lineTo(4.6f, 6f)
                lineTo(2.5f, 3.9f)
                lineTo(3.9f, 2.5f)
                close()
            }
        }.build()

        return _PencilRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PencilRemoveOutline: ImageVector? = null
