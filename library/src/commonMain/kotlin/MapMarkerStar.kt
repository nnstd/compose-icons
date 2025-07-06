package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerStar: ImageVector
    get() {
        if (_MapMarkerStar != null) {
            return _MapMarkerStar!!
        }
        _MapMarkerStar = ImageVector.Builder(
            name = "MapMarkerStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(8.1f, 2f, 5f, 5.1f, 5f, 9f)
                curveTo(5f, 14.2f, 12f, 22f, 12f, 22f)
                reflectiveCurveTo(19f, 14.2f, 19f, 9f)
                curveTo(19f, 5.1f, 15.9f, 2f, 12f, 2f)
                moveTo(14.5f, 13f)
                lineTo(12f, 11.5f)
                lineTo(9.5f, 13f)
                lineTo(10.2f, 10.2f)
                lineTo(8f, 8.3f)
                lineTo(10.9f, 8.1f)
                lineTo(12f, 5.4f)
                lineTo(13.1f, 8f)
                lineTo(16f, 8.3f)
                lineTo(13.8f, 10.2f)
                lineTo(14.5f, 13f)
                close()
            }
        }.build()

        return _MapMarkerStar!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerStar: ImageVector? = null
