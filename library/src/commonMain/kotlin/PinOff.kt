package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PinOff: ImageVector
    get() {
        if (_PinOff != null) {
            return _PinOff!!
        }
        _PinOff = ImageVector.Builder(
            name = "PinOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(12.8f, 16.07f)
                verticalLineTo(22f)
                horizontalLineTo(11.2f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                lineTo(8f, 12f)
                verticalLineTo(11.27f)
                lineTo(2f, 5.27f)
                moveTo(16f, 12f)
                lineTo(18f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(17.82f)
                lineTo(8f, 6.18f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _PinOff!!
    }

@Suppress("ObjectPropertyName")
private var _PinOff: ImageVector? = null
