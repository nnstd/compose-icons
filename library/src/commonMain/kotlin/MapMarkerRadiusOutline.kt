package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerRadiusOutline: ImageVector
    get() {
        if (_MapMarkerRadiusOutline != null) {
            return _MapMarkerRadiusOutline!!
        }
        _MapMarkerRadiusOutline = ImageVector.Builder(
            name = "MapMarkerRadiusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(14.2f, 4f, 16f, 5.8f, 16f, 8f)
                curveTo(16f, 10.1f, 13.9f, 13.5f, 12f, 15.9f)
                curveTo(10.1f, 13.4f, 8f, 10.1f, 8f, 8f)
                curveTo(8f, 5.8f, 9.8f, 4f, 12f, 4f)
                moveTo(12f, 2f)
                curveTo(8.7f, 2f, 6f, 4.7f, 6f, 8f)
                curveTo(6f, 12.5f, 12f, 19f, 12f, 19f)
                reflectiveCurveTo(18f, 12.4f, 18f, 8f)
                curveTo(18f, 4.7f, 15.3f, 2f, 12f, 2f)
                moveTo(12f, 6f)
                curveTo(10.9f, 6f, 10f, 6.9f, 10f, 8f)
                reflectiveCurveTo(10.9f, 10f, 12f, 10f)
                reflectiveCurveTo(14f, 9.1f, 14f, 8f)
                reflectiveCurveTo(13.1f, 6f, 12f, 6f)
                moveTo(20f, 19f)
                curveTo(20f, 21.2f, 16.4f, 23f, 12f, 23f)
                reflectiveCurveTo(4f, 21.2f, 4f, 19f)
                curveTo(4f, 17.7f, 5.2f, 16.6f, 7.1f, 15.8f)
                lineTo(7.7f, 16.7f)
                curveTo(6.7f, 17.2f, 6f, 17.8f, 6f, 18.5f)
                curveTo(6f, 19.9f, 8.7f, 21f, 12f, 21f)
                reflectiveCurveTo(18f, 19.9f, 18f, 18.5f)
                curveTo(18f, 17.8f, 17.3f, 17.2f, 16.2f, 16.7f)
                lineTo(16.8f, 15.8f)
                curveTo(18.8f, 16.6f, 20f, 17.7f, 20f, 19f)
                close()
            }
        }.build()

        return _MapMarkerRadiusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerRadiusOutline: ImageVector? = null
