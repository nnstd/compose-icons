package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PenOff: ImageVector
    get() {
        if (_PenOff != null) {
            return _PenOff!!
        }
        _PenOff = ImageVector.Builder(
            name = "PenOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.3f, 5f)
                lineTo(1f, 6.3f)
                lineTo(7.5f, 12.8f)
                lineTo(3f, 17.2f)
                verticalLineTo(21f)
                horizontalLineTo(6.8f)
                lineTo(11.3f, 16.5f)
                lineTo(17.8f, 23f)
                lineTo(19.1f, 21.7f)
                lineTo(2.3f, 5f)
                moveTo(16.9f, 10.9f)
                lineTo(13.1f, 7.1f)
                lineTo(17f, 3.3f)
                curveTo(17.4f, 2.9f, 18f, 2.9f, 18.4f, 3.3f)
                lineTo(20.7f, 5.6f)
                curveTo(21.1f, 6f, 21.1f, 6.6f, 20.7f, 7f)
                curveTo(20.4f, 7.4f, 20f, 7.7f, 20f, 8f)
                curveTo(20f, 8.3f, 20.3f, 8.7f, 20.6f, 9f)
                curveTo(21.1f, 9.5f, 21.6f, 10f, 21.5f, 10.4f)
                curveTo(21.5f, 10.9f, 21f, 11.4f, 20.5f, 11.9f)
                lineTo(16.4f, 16f)
                lineTo(15f, 14.7f)
                lineTo(19.2f, 10.5f)
                lineTo(18.2f, 9.5f)
                lineTo(16.9f, 10.9f)
                moveTo(10f, 10.2f)
                lineTo(12.5f, 7.7f)
                lineTo(16.3f, 11.5f)
                lineTo(13.8f, 14f)
                lineTo(10f, 10.2f)
                close()
            }
        }.build()

        return _PenOff!!
    }

@Suppress("ObjectPropertyName")
private var _PenOff: ImageVector? = null
