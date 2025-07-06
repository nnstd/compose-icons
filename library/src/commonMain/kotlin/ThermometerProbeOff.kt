package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThermometerProbeOff: ImageVector
    get() {
        if (_ThermometerProbeOff != null) {
            return _ThermometerProbeOff!!
        }
        _ThermometerProbeOff = ImageVector.Builder(
            name = "ThermometerProbeOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3.64f)
                lineTo(9.24f, 10.88f)
                lineTo(2.81f, 17.31f)
                curveTo(1.74f, 18.38f, 1.74f, 20.12f, 2.81f, 21.2f)
                curveTo(3.88f, 22.27f, 5.62f, 22.27f, 6.7f, 21.2f)
                lineTo(13.13f, 14.77f)
                lineTo(20.73f, 22.37f)
                lineTo(22f, 21.1f)
                lineTo(3.27f, 2.37f)
                lineTo(2f, 3.64f)
                moveTo(10.23f, 11.86f)
                lineTo(12.14f, 13.77f)
                curveTo(11.89f, 14.14f, 11.47f, 14.38f, 11f, 14.38f)
                curveTo(10.24f, 14.38f, 9.62f, 13.76f, 9.62f, 13f)
                curveTo(9.62f, 12.53f, 9.86f, 12.11f, 10.23f, 11.86f)
                moveTo(14.46f, 11f)
                lineTo(13f, 9.55f)
                lineTo(13.47f, 9.47f)
                lineTo(19.47f, 3.47f)
                lineTo(22f, 2f)
                lineTo(20.54f, 4.54f)
                lineTo(14.54f, 10.54f)
                lineTo(14.46f, 11f)
                close()
            }
        }.build()

        return _ThermometerProbeOff!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerProbeOff: ImageVector? = null
