package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BroadcastOff: ImageVector
    get() {
        if (_BroadcastOff != null) {
            return _BroadcastOff!!
        }
        _BroadcastOff = ImageVector.Builder(
            name = "BroadcastOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.6f, 14.2f)
                curveTo(17.9f, 13.5f, 18f, 12.8f, 18f, 12f)
                curveTo(18f, 8.7f, 15.3f, 6f, 12f, 6f)
                curveTo(11.2f, 6f, 10.4f, 6.2f, 9.8f, 6.4f)
                lineTo(11.4f, 8f)
                horizontalLineTo(12f)
                curveTo(14.2f, 8f, 16f, 9.8f, 16f, 12f)
                curveTo(16f, 12.2f, 16f, 12.4f, 15.9f, 12.6f)
                lineTo(17.6f, 14.2f)
                moveTo(12f, 4f)
                curveTo(16.4f, 4f, 20f, 7.6f, 20f, 12f)
                curveTo(20f, 13.4f, 19.6f, 14.6f, 19f, 15.7f)
                lineTo(20.5f, 17.2f)
                curveTo(21.4f, 15.7f, 22f, 13.9f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                curveTo(10.1f, 2f, 8.3f, 2.5f, 6.8f, 3.5f)
                lineTo(8.3f, 5f)
                curveTo(9.4f, 4.3f, 10.6f, 4f, 12f, 4f)
                moveTo(3.3f, 2.5f)
                lineTo(2f, 3.8f)
                lineTo(4.1f, 5.9f)
                curveTo(2.8f, 7.6f, 2f, 9.7f, 2f, 12f)
                curveTo(2f, 15.7f, 4f, 18.9f, 7f, 20.6f)
                lineTo(8f, 18.9f)
                curveTo(5.6f, 17.5f, 4f, 14.9f, 4f, 12f)
                curveTo(4f, 10.2f, 4.6f, 8.6f, 5.5f, 7.3f)
                lineTo(7f, 8.8f)
                curveTo(6.4f, 9.7f, 6f, 10.8f, 6f, 12f)
                curveTo(6f, 14.2f, 7.2f, 16.1f, 9f, 17.2f)
                lineTo(10f, 15.5f)
                curveTo(8.8f, 14.8f, 8f, 13.5f, 8f, 12.1f)
                curveTo(8f, 11.5f, 8.2f, 10.9f, 8.4f, 10.3f)
                lineTo(10f, 11.9f)
                verticalLineTo(12.1f)
                curveTo(10f, 13.2f, 10.9f, 14.1f, 12f, 14.1f)
                horizontalLineTo(12.2f)
                lineTo(19.7f, 21.6f)
                lineTo(21f, 20.3f)
                lineTo(4.3f, 3.5f)
                lineTo(3.3f, 2.5f)
                close()
            }
        }.build()

        return _BroadcastOff!!
    }

@Suppress("ObjectPropertyName")
private var _BroadcastOff: ImageVector? = null
