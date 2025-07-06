package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerCheckOutline: ImageVector
    get() {
        if (_MapMarkerCheckOutline != null) {
            return _MapMarkerCheckOutline!!
        }
        _MapMarkerCheckOutline = ImageVector.Builder(
            name = "MapMarkerCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(14.8f, 4f, 17f, 6.2f, 17f, 9f)
                curveTo(17f, 11.9f, 14.1f, 16.2f, 12f, 18.9f)
                curveTo(9.9f, 16.2f, 7f, 11.9f, 7f, 9f)
                curveTo(7f, 6.2f, 9.2f, 4f, 12f, 4f)
                moveTo(12f, 2f)
                curveTo(8.1f, 2f, 5f, 5.1f, 5f, 9f)
                curveTo(5f, 14.2f, 12f, 22f, 12f, 22f)
                reflectiveCurveTo(19f, 14.2f, 19f, 9f)
                curveTo(19f, 5.1f, 15.9f, 2f, 12f, 2f)
                moveTo(11.3f, 14f)
                lineTo(16.2f, 9f)
                lineTo(14.8f, 7.6f)
                lineTo(11.3f, 11.2f)
                lineTo(9.7f, 9.6f)
                lineTo(8.3f, 11f)
                lineTo(11.3f, 14f)
                close()
            }
        }.build()

        return _MapMarkerCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerCheckOutline: ImageVector? = null
