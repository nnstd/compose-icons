package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SausageOff: ImageVector
    get() {
        if (_SausageOff != null) {
            return _SausageOff!!
        }
        _SausageOff = ImageVector.Builder(
            name = "SausageOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 22.7f)
                lineTo(16.3f, 18.2f)
                curveTo(14.2f, 19.9f, 11.4f, 21f, 8.5f, 21f)
                curveTo(7.1f, 21f, 5.9f, 20.2f, 5.3f, 19f)
                lineTo(3f, 20.5f)
                verticalLineTo(14.5f)
                lineTo(5.3f, 16f)
                curveTo(5.8f, 14.8f, 7.1f, 14f, 8.5f, 14f)
                curveTo(9.5f, 14f, 10.5f, 13.7f, 11.3f, 13.2f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(21f, 8.5f)
                curveTo(21f, 7.1f, 20.2f, 5.9f, 19f, 5.3f)
                lineTo(20.5f, 3f)
                horizontalLineTo(14.5f)
                lineTo(16f, 5.3f)
                curveTo(14.8f, 5.8f, 14f, 7.1f, 14f, 8.5f)
                curveTo(14f, 9.2f, 13.9f, 9.8f, 13.6f, 10.4f)
                lineTo(18.7f, 15.6f)
                curveTo(20.2f, 13.6f, 21f, 11.1f, 21f, 8.5f)
                close()
            }
        }.build()

        return _SausageOff!!
    }

@Suppress("ObjectPropertyName")
private var _SausageOff: ImageVector? = null
