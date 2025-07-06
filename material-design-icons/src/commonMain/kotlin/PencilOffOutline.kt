package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PencilOffOutline: ImageVector
    get() {
        if (_PencilOffOutline != null) {
            return _PencilOffOutline!!
        }
        _PencilOffOutline = ImageVector.Builder(
            name = "PencilOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 10.2f)
                lineTo(14f, 6.2f)
                lineTo(17.8f, 10f)
                lineTo(13.8f, 14f)
                lineTo(12.4f, 12.6f)
                lineTo(15f, 9.9f)
                lineTo(14.1f, 9f)
                lineTo(11.5f, 11.6f)
                lineTo(10f, 10.2f)
                moveTo(20.7f, 5.6f)
                lineTo(18.4f, 3.3f)
                curveTo(18.2f, 3.1f, 17.9f, 3f, 17.7f, 3f)
                curveTo(17.5f, 3f, 17.2f, 3.1f, 17f, 3.3f)
                lineTo(15.2f, 5.1f)
                lineTo(19f, 8.9f)
                lineTo(20.7f, 7f)
                curveTo(21.1f, 6.7f, 21.1f, 6f, 20.7f, 5.6f)
                moveTo(19f, 21.7f)
                lineTo(17.7f, 23f)
                lineTo(11.2f, 16.5f)
                lineTo(6.8f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(17.2f)
                lineTo(7.5f, 12.7f)
                lineTo(1f, 6.3f)
                lineTo(2.3f, 5f)
                lineTo(19f, 21.7f)
                moveTo(9.8f, 15.1f)
                lineTo(8.9f, 14.2f)
                lineTo(5f, 18.1f)
                verticalLineTo(19f)
                horizontalLineTo(5.9f)
                lineTo(9.8f, 15.1f)
                close()
            }
        }.build()

        return _PencilOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PencilOffOutline: ImageVector? = null
