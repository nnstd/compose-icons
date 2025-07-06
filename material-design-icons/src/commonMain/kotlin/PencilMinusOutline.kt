package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PencilMinusOutline: ImageVector
    get() {
        if (_PencilMinusOutline != null) {
            return _PencilMinusOutline!!
        }
        _PencilMinusOutline = ImageVector.Builder(
            name = "PencilMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.1f, 9f)
                lineTo(15f, 9.9f)
                lineTo(5.9f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(18.1f)
                lineTo(14.1f, 9f)
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
                moveTo(10f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _PencilMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PencilMinusOutline: ImageVector? = null
