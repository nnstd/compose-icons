package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PumpOff: ImageVector
    get() {
        if (_PumpOff != null) {
            return _PumpOff!!
        }
        _PumpOff = ImageVector.Builder(
            name = "PumpOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(4.8f, 6.7f)
                curveTo(3.7f, 8.2f, 3f, 10f, 3f, 12f)
                curveTo(3f, 13f, 3.2f, 14.1f, 3.5f, 15f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                curveTo(14f, 21f, 15.8f, 20.3f, 17.3f, 19.2f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(5.9f, 15.5f)
                curveTo(5.3f, 14.5f, 5f, 13.3f, 5f, 12f)
                curveTo(5f, 10.6f, 5.5f, 9.2f, 6.2f, 8.1f)
                lineTo(9.2f, 11.1f)
                curveTo(9.1f, 11.3f, 9f, 11.7f, 9f, 12f)
                curveTo(9f, 12.5f, 9.2f, 13.1f, 9.4f, 13.5f)
                lineTo(5.9f, 15.5f)
                moveTo(12f, 19f)
                horizontalLineTo(11.3f)
                lineTo(11.7f, 15f)
                horizontalLineTo(12f)
                curveTo(12.3f, 15f, 12.6f, 14.9f, 12.9f, 14.8f)
                lineTo(15.9f, 17.8f)
                curveTo(14.8f, 18.5f, 13.4f, 19f, 12f, 19f)
                moveTo(12f, 8.8f)
                lineTo(7.4f, 4.2f)
                curveTo(8.8f, 3.5f, 10.3f, 3f, 12f, 3f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(20.5f)
                curveTo(20.8f, 9.9f, 21f, 11f, 21f, 12f)
                curveTo(21f, 13.7f, 20.5f, 15.2f, 19.8f, 16.6f)
                lineTo(12.2f, 9f)
                curveTo(13.3f, 9.1f, 14.3f, 9.8f, 14.7f, 10.7f)
                lineTo(18.3f, 9f)
                curveTo(17.3f, 6.7f, 14.8f, 5f, 12f, 5f)
                verticalLineTo(8.8f)
                close()
            }
        }.build()

        return _PumpOff!!
    }

@Suppress("ObjectPropertyName")
private var _PumpOff: ImageVector? = null
