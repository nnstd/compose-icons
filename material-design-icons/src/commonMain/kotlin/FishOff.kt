package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FishOff: ImageVector
    get() {
        if (_FishOff != null) {
            return _FishOff!!
        }
        _FishOff = ImageVector.Builder(
            name = "FishOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 22.7f)
                lineTo(15.7f, 17.6f)
                curveTo(15.1f, 18.3f, 14.6f, 18.9f, 14.1f, 19.3f)
                curveTo(13.3f, 20f, 12.7f, 20f, 12f, 20f)
                lineTo(12.8f, 17f)
                curveTo(9.5f, 16.8f, 6.6f, 15.4f, 5.8f, 13.6f)
                curveTo(5.7f, 14.1f, 5.6f, 14.5f, 5.4f, 14.8f)
                curveTo(4.7f, 16f, 3.3f, 16f, 2f, 16f)
                curveTo(3.1f, 16f, 3.5f, 14.4f, 3.5f, 12.5f)
                reflectiveCurveTo(3.1f, 9f, 2f, 9f)
                curveTo(3.3f, 9f, 4.7f, 9f, 5.3f, 10.2f)
                curveTo(5.5f, 10.5f, 5.6f, 11f, 5.7f, 11.4f)
                curveTo(6f, 10.7f, 6.7f, 10f, 7.6f, 9.5f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(9.8f, 6.6f)
                lineTo(9f, 5f)
                curveTo(11f, 5f, 13f, 5f, 14.3f, 5.7f)
                curveTo(15.4f, 6.3f, 16.1f, 7.3f, 16.7f, 8.4f)
                curveTo(19.6f, 9.1f, 22f, 10.7f, 22f, 12.5f)
                curveTo(22f, 13.8f, 20.8f, 15f, 19f, 15.8f)
                lineTo(9.8f, 6.6f)
                moveTo(16f, 12f)
                curveTo(16f, 12.6f, 16.4f, 13f, 17f, 13f)
                reflectiveCurveTo(18f, 12.6f, 18f, 12f)
                reflectiveCurveTo(17.6f, 11f, 17f, 11f)
                reflectiveCurveTo(16f, 11.4f, 16f, 12f)
                close()
            }
        }.build()

        return _FishOff!!
    }

@Suppress("ObjectPropertyName")
private var _FishOff: ImageVector? = null
