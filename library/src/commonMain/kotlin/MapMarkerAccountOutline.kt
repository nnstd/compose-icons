package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerAccountOutline: ImageVector
    get() {
        if (_MapMarkerAccountOutline != null) {
            return _MapMarkerAccountOutline!!
        }
        _MapMarkerAccountOutline = ImageVector.Builder(
            name = "MapMarkerAccountOutline",
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
                moveTo(12f, 10f)
                curveTo(13.33f, 10f, 16f, 10.67f, 16f, 12f)
                verticalLineTo(12.16f)
                curveTo(15.03f, 13.28f, 13.6f, 14f, 12f, 14f)
                reflectiveCurveTo(8.97f, 13.28f, 8f, 12.16f)
                verticalLineTo(12f)
                curveTo(8f, 10.67f, 10.67f, 10f, 12f, 10f)
                moveTo(12f, 9f)
                curveTo(10.9f, 9f, 10f, 8.1f, 10f, 7f)
                reflectiveCurveTo(10.9f, 5f, 12f, 5f)
                reflectiveCurveTo(14f, 5.9f, 14f, 7f)
                reflectiveCurveTo(13.1f, 9f, 12f, 9f)
                close()
            }
        }.build()

        return _MapMarkerAccountOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerAccountOutline: ImageVector? = null
