package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RestartOff: ImageVector
    get() {
        if (_RestartOff != null) {
            return _RestartOff!!
        }
        _RestartOff = ImageVector.Builder(
            name = "RestartOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 22.7f)
                lineTo(16.6f, 18.5f)
                curveTo(14.9f, 19.7f, 12.9f, 20.2f, 10.9f, 19.9f)
                lineTo(11.4f, 17.9f)
                curveTo(12.7f, 18f, 14f, 17.7f, 15.1f, 17f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(16.5f, 15.8f)
                lineTo(17.9f, 17.2f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(12f, 6f)
                curveTo(13.5f, 6f, 15.1f, 6.6f, 16.2f, 7.8f)
                curveTo(18f, 9.6f, 18.4f, 12.2f, 17.5f, 14.4f)
                lineTo(19f, 15.9f)
                curveTo(20.7f, 12.9f, 20.2f, 9f, 17.6f, 6.4f)
                curveTo(16.1f, 4.8f, 14f, 4f, 12f, 4f)
                verticalLineTo(0.7f)
                lineTo(7.9f, 4.7f)
                lineTo(12f, 8.8f)
                verticalLineTo(6f)
                moveTo(6.6f, 9.4f)
                lineTo(5.1f, 7.9f)
                curveTo(3.3f, 11f, 3.7f, 15f, 6.3f, 17.7f)
                curveTo(7.1f, 18.4f, 8f, 19f, 9f, 19.4f)
                lineTo(9.5f, 17.4f)
                curveTo(8.9f, 17.1f, 8.3f, 16.7f, 7.7f, 16.2f)
                curveTo(5.9f, 14.4f, 5.5f, 11.6f, 6.6f, 9.4f)
                close()
            }
        }.build()

        return _RestartOff!!
    }

@Suppress("ObjectPropertyName")
private var _RestartOff: ImageVector? = null
