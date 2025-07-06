package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerStarOutline: ImageVector
    get() {
        if (_MapMarkerStarOutline != null) {
            return _MapMarkerStarOutline!!
        }
        _MapMarkerStarOutline = ImageVector.Builder(
            name = "MapMarkerStarOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(15.9f, 2f, 19f, 5.1f, 19f, 9f)
                curveTo(19f, 14.2f, 12f, 22f, 12f, 22f)
                reflectiveCurveTo(5f, 14.2f, 5f, 9f)
                curveTo(5f, 5.1f, 8.1f, 2f, 12f, 2f)
                moveTo(12f, 4f)
                curveTo(9.2f, 4f, 7f, 6.2f, 7f, 9f)
                curveTo(7f, 10f, 7f, 12f, 12f, 18.7f)
                curveTo(17f, 12f, 17f, 10f, 17f, 9f)
                curveTo(17f, 6.2f, 14.8f, 4f, 12f, 4f)
                moveTo(12f, 11.5f)
                lineTo(14.4f, 13f)
                lineTo(13.8f, 10.2f)
                lineTo(16f, 8.3f)
                lineTo(13.1f, 8.1f)
                lineTo(12f, 5.4f)
                lineTo(10.9f, 8f)
                lineTo(8f, 8.3f)
                lineTo(10.2f, 10.2f)
                lineTo(9.5f, 13f)
                lineTo(12f, 11.5f)
                close()
            }
        }.build()

        return _MapMarkerStarOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerStarOutline: ImageVector? = null
