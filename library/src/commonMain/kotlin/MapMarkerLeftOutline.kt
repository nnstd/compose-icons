package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerLeftOutline: ImageVector
    get() {
        if (_MapMarkerLeftOutline != null) {
            return _MapMarkerLeftOutline!!
        }
        _MapMarkerLeftOutline = ImageVector.Builder(
            name = "MapMarkerLeftOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 6.5f)
                curveTo(16.38f, 6.5f, 17.5f, 7.62f, 17.5f, 9f)
                reflectiveCurveTo(16.38f, 11.5f, 15f, 11.5f)
                reflectiveCurveTo(12.5f, 10.38f, 12.5f, 9f)
                reflectiveCurveTo(13.62f, 6.5f, 15f, 6.5f)
                moveTo(15f, 2f)
                curveTo(18.87f, 2f, 22f, 5.13f, 22f, 9f)
                curveTo(22f, 14.25f, 15f, 22f, 15f, 22f)
                reflectiveCurveTo(8f, 14.25f, 8f, 9f)
                curveTo(8f, 5.13f, 11.13f, 2f, 15f, 2f)
                moveTo(10f, 9f)
                curveTo(10f, 10f, 10f, 12f, 15f, 18.71f)
                curveTo(20f, 12f, 20f, 10f, 20f, 9f)
                curveTo(20f, 6.24f, 17.76f, 4f, 15f, 4f)
                reflectiveCurveTo(10f, 6.24f, 10f, 9f)
                moveTo(6f, 7f)
                lineTo(1f, 12f)
                lineTo(6f, 17f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _MapMarkerLeftOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerLeftOutline: ImageVector? = null
