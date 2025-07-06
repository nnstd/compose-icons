package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerRemoveOutline: ImageVector
    get() {
        if (_MapMarkerRemoveOutline != null) {
            return _MapMarkerRemoveOutline!!
        }
        _MapMarkerRemoveOutline = ImageVector.Builder(
            name = "MapMarkerRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.6f, 14.2f)
                lineTo(15.2f, 15.6f)
                lineTo(17.6f, 18f)
                lineTo(15.2f, 20.4f)
                lineTo(16.6f, 21.8f)
                lineTo(19f, 19.4f)
                lineTo(21.4f, 21.8f)
                lineTo(22.8f, 20.4f)
                lineTo(20.4f, 18f)
                lineTo(22.8f, 15.6f)
                lineTo(21.4f, 14.2f)
                lineTo(19f, 16.6f)
                moveTo(9f, 6.5f)
                curveTo(10.4f, 6.5f, 11.5f, 7.6f, 11.5f, 9f)
                reflectiveCurveTo(10.4f, 11.5f, 9f, 11.5f)
                reflectiveCurveTo(6.5f, 10.4f, 6.5f, 9f)
                reflectiveCurveTo(7.6f, 6.5f, 9f, 6.5f)
                moveTo(9f, 2f)
                curveTo(12.9f, 2f, 16f, 5.1f, 16f, 9f)
                curveTo(16f, 14.2f, 9f, 22f, 9f, 22f)
                reflectiveCurveTo(2f, 14.2f, 2f, 9f)
                curveTo(2f, 5.1f, 5.1f, 2f, 9f, 2f)
                moveTo(9f, 4f)
                curveTo(6.2f, 4f, 4f, 6.2f, 4f, 9f)
                curveTo(4f, 10f, 4f, 12f, 9f, 18.7f)
                curveTo(14f, 12f, 14f, 10f, 14f, 9f)
                curveTo(14f, 6.2f, 11.8f, 4f, 9f, 4f)
                close()
            }
        }.build()

        return _MapMarkerRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerRemoveOutline: ImageVector? = null
