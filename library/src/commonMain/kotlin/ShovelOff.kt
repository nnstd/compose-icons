package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShovelOff: ImageVector
    get() {
        if (_ShovelOff != null) {
            return _ShovelOff!!
        }
        _ShovelOff = ImageVector.Builder(
            name = "ShovelOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.1f, 1.81f)
                lineTo(12.27f, 4.65f)
                curveTo(11.5f, 5.43f, 11.5f, 6.69f, 12.27f, 7.47f)
                lineTo(13.68f, 8.89f)
                lineTo(13f, 9.62f)
                lineTo(14.44f, 11.06f)
                lineTo(15.17f, 10.33f)
                lineTo(16.56f, 11.72f)
                curveTo(17.34f, 12.5f, 18.61f, 12.5f, 19.39f, 11.72f)
                lineTo(22.22f, 8.88f)
                lineTo(15.1f, 1.81f)
                moveTo(17.93f, 10.28f)
                lineTo(13.7f, 6.06f)
                lineTo(15.11f, 4.65f)
                lineTo(19.34f, 8.88f)
                lineTo(17.93f, 10.28f)
                moveTo(20.7f, 20.24f)
                lineTo(19.29f, 21.65f)
                lineTo(11.5f, 13.88f)
                lineTo(10.5f, 14.88f)
                lineTo(13.33f, 17.69f)
                lineTo(12f, 19.09f)
                curveTo(7f, 24f, 3.5f, 20.5f, 3.5f, 20.5f)
                curveTo(3.5f, 20.5f, -0.06f, 17f, 4.89f, 12f)
                lineTo(6.31f, 10.6f)
                lineTo(9.13f, 13.43f)
                lineTo(10.13f, 12.43f)
                lineTo(2.35f, 4.68f)
                lineTo(3.77f, 3.26f)
                lineTo(20.7f, 20.24f)
                close()
            }
        }.build()

        return _ShovelOff!!
    }

@Suppress("ObjectPropertyName")
private var _ShovelOff: ImageVector? = null
