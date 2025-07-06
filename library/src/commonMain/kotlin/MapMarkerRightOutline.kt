package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerRightOutline: ImageVector
    get() {
        if (_MapMarkerRightOutline != null) {
            return _MapMarkerRightOutline!!
        }
        _MapMarkerRightOutline = ImageVector.Builder(
            name = "MapMarkerRightOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 6.5f)
                curveTo(10.38f, 6.5f, 11.5f, 7.62f, 11.5f, 9f)
                reflectiveCurveTo(10.38f, 11.5f, 9f, 11.5f)
                reflectiveCurveTo(6.5f, 10.38f, 6.5f, 9f)
                reflectiveCurveTo(7.62f, 6.5f, 9f, 6.5f)
                moveTo(9f, 2f)
                curveTo(12.87f, 2f, 16f, 5.13f, 16f, 9f)
                curveTo(16f, 14.25f, 9f, 22f, 9f, 22f)
                reflectiveCurveTo(2f, 14.25f, 2f, 9f)
                curveTo(2f, 5.13f, 5.13f, 2f, 9f, 2f)
                moveTo(9f, 4f)
                curveTo(6.24f, 4f, 4f, 6.24f, 4f, 9f)
                curveTo(4f, 10f, 4f, 12f, 9f, 18.71f)
                curveTo(14f, 12f, 14f, 10f, 14f, 9f)
                curveTo(14f, 6.24f, 11.76f, 4f, 9f, 4f)
                moveTo(18f, 17f)
                lineTo(23f, 12f)
                lineTo(18f, 7f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _MapMarkerRightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerRightOutline: ImageVector? = null
