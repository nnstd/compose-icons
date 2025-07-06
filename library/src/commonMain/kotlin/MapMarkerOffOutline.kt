package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerOffOutline: ImageVector
    get() {
        if (_MapMarkerOffOutline != null) {
            return _MapMarkerOffOutline!!
        }
        _MapMarkerOffOutline = ImageVector.Builder(
            name = "MapMarkerOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19.7f)
                lineTo(3.3f, 3f)
                lineTo(2f, 4.3f)
                lineTo(5.2f, 7.5f)
                curveTo(5.1f, 8f, 5f, 8.5f, 5f, 9f)
                curveTo(5f, 14.2f, 12f, 22f, 12f, 22f)
                reflectiveCurveTo(13.7f, 20.1f, 15.4f, 17.6f)
                lineTo(18.8f, 21f)
                lineTo(20f, 19.7f)
                moveTo(12f, 18.7f)
                curveTo(7.4f, 12.5f, 7f, 10.4f, 7f, 9.3f)
                lineTo(13.8f, 16.1f)
                curveTo(13.3f, 16.9f, 12.7f, 17.7f, 12f, 18.7f)
                moveTo(8.4f, 5.6f)
                lineTo(7f, 4.2f)
                curveTo(8.2f, 2.8f, 10f, 2f, 12f, 2f)
                curveTo(15.9f, 2f, 19f, 5.1f, 19f, 9f)
                curveTo(19f, 10.7f, 18.3f, 12.6f, 17.3f, 14.5f)
                lineTo(15.8f, 13f)
                curveTo(17f, 10.6f, 17f, 9.6f, 17f, 9f)
                curveTo(17f, 6.2f, 14.8f, 4f, 12f, 4f)
                curveTo(10.6f, 4f, 9.3f, 4.6f, 8.4f, 5.6f)
                moveTo(12f, 6.5f)
                curveTo(13.4f, 6.5f, 14.5f, 7.6f, 14.5f, 9f)
                curveTo(14.5f, 9.7f, 14.2f, 10.4f, 13.7f, 10.9f)
                lineTo(10.2f, 7.4f)
                curveTo(10.6f, 6.8f, 11.3f, 6.5f, 12f, 6.5f)
                close()
            }
        }.build()

        return _MapMarkerOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerOffOutline: ImageVector? = null
