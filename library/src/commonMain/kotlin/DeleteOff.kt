package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeleteOff: ImageVector
    get() {
        if (_DeleteOff != null) {
            return _DeleteOff!!
        }
        _DeleteOff = ImageVector.Builder(
            name = "DeleteOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(5f, 5.72f)
                lineTo(5.28f, 6f)
                lineTo(6.28f, 7f)
                lineTo(18f, 18.72f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(17.27f, 20.54f)
                curveTo(16.93f, 20.83f, 16.5f, 21f, 16f, 21f)
                horizontalLineTo(8f)
                curveTo(6.9f, 21f, 6f, 20.1f, 6f, 19f)
                verticalLineTo(9.27f)
                lineTo(2f, 5.27f)
                moveTo(19f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(7.82f)
                lineTo(5.82f, 4f)
                horizontalLineTo(8.5f)
                lineTo(9.5f, 3f)
                horizontalLineTo(14.5f)
                lineTo(15.5f, 4f)
                horizontalLineTo(19f)
                moveTo(18f, 7f)
                verticalLineTo(16.18f)
                lineTo(8.82f, 7f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _DeleteOff!!
    }

@Suppress("ObjectPropertyName")
private var _DeleteOff: ImageVector? = null
