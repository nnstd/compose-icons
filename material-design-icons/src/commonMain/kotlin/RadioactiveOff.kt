package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RadioactiveOff: ImageVector
    get() {
        if (_RadioactiveOff != null) {
            return _RadioactiveOff!!
        }
        _RadioactiveOff = ImageVector.Builder(
            name = "RadioactiveOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 22.7f)
                lineTo(15.9f, 17.8f)
                lineTo(16.9f, 19.6f)
                curveTo(15.4f, 20.5f, 13.7f, 20.9f, 11.9f, 20.9f)
                reflectiveCurveTo(8.4f, 20.4f, 6.9f, 19.6f)
                curveTo(7.3f, 18.8f, 8.7f, 16.5f, 9.9f, 14.4f)
                curveTo(10.5f, 14.7f, 11.2f, 15f, 11.9f, 15f)
                curveTo(12.2f, 15f, 12.6f, 15f, 12.9f, 14.9f)
                lineTo(8.1f, 10f)
                curveTo(8.1f, 10.3f, 8f, 10.7f, 8f, 11f)
                horizontalLineTo(2f)
                curveTo(2f, 9f, 2.6f, 7.1f, 3.6f, 5.5f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(16f, 11f)
                horizontalLineTo(22f)
                curveTo(22f, 7.3f, 20f, 4.1f, 17f, 2.3f)
                lineTo(14f, 7.5f)
                curveTo(15.2f, 8.2f, 16f, 9.5f, 16f, 11f)
                moveTo(12.2f, 9f)
                lineTo(14f, 10.8f)
                curveTo(13.9f, 9.9f, 13.1f, 9.1f, 12.2f, 9f)
                moveTo(7f, 2.3f)
                lineTo(6.1f, 2.9f)
                lineTo(9f, 5.8f)
                curveTo(8.1f, 4.3f, 7.3f, 2.9f, 7f, 2.3f)
                close()
            }
        }.build()

        return _RadioactiveOff!!
    }

@Suppress("ObjectPropertyName")
private var _RadioactiveOff: ImageVector? = null
