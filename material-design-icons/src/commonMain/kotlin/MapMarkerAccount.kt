package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerAccount: ImageVector
    get() {
        if (_MapMarkerAccount != null) {
            return _MapMarkerAccount!!
        }
        _MapMarkerAccount = ImageVector.Builder(
            name = "MapMarkerAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(8.14f, 2f, 5f, 5.14f, 5f, 9f)
                curveTo(5f, 14.25f, 12f, 22f, 12f, 22f)
                reflectiveCurveTo(19f, 14.25f, 19f, 9f)
                curveTo(19f, 5.14f, 15.86f, 2f, 12f, 2f)
                moveTo(12f, 4f)
                curveTo(13.1f, 4f, 14f, 4.9f, 14f, 6f)
                curveTo(14f, 7.11f, 13.1f, 8f, 12f, 8f)
                reflectiveCurveTo(10f, 7.11f, 10f, 6f)
                curveTo(10f, 4.9f, 10.9f, 4f, 12f, 4f)
                moveTo(12f, 14f)
                curveTo(10.33f, 14f, 8.86f, 13.15f, 8f, 11.85f)
                curveTo(8f, 10.53f, 10.67f, 9.8f, 12f, 9.8f)
                reflectiveCurveTo(16f, 10.53f, 16f, 11.85f)
                curveTo(15.14f, 13.15f, 13.67f, 14f, 12f, 14f)
                close()
            }
        }.build()

        return _MapMarkerAccount!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerAccount: ImageVector? = null
