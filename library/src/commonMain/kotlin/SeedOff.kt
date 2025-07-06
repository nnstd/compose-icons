package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SeedOff: ImageVector
    get() {
        if (_SeedOff != null) {
            return _SeedOff!!
        }
        _SeedOff = ImageVector.Builder(
            name = "SeedOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(5.9f, 7.8f)
                curveTo(3.8f, 10.5f, 2.6f, 14.6f, 3.2f, 20.8f)
                curveTo(4.3f, 20.9f, 5.4f, 21f, 6.4f, 21f)
                curveTo(10.9f, 21f, 14.1f, 19.9f, 16.3f, 18.2f)
                lineTo(20.9f, 22.8f)
                lineTo(22.1f, 21.5f)
                moveTo(7f, 17f)
                curveTo(7f, 17f, 7f, 13.7f, 8.9f, 10.8f)
                lineTo(10.2f, 12.1f)
                curveTo(9.1f, 13.4f, 8f, 15f, 7f, 17f)
                moveTo(11.6f, 8.4f)
                lineTo(8.5f, 5.3f)
                curveTo(11.3f, 3.4f, 14.7f, 3f, 17.2f, 3f)
                curveTo(19.3f, 3f, 20.7f, 3.3f, 20.7f, 3.3f)
                reflectiveCurveTo(22.1f, 10.3f, 18.7f, 15.5f)
                lineTo(12.8f, 9.6f)
                curveTo(15.1f, 7.6f, 17f, 7f, 17f, 7f)
                curveTo(14.7f, 7f, 12.9f, 7.5f, 11.6f, 8.4f)
                close()
            }
        }.build()

        return _SeedOff!!
    }

@Suppress("ObjectPropertyName")
private var _SeedOff: ImageVector? = null
