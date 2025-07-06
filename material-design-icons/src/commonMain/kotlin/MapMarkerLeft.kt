package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerLeft: ImageVector
    get() {
        if (_MapMarkerLeft != null) {
            return _MapMarkerLeft!!
        }
        _MapMarkerLeft = ImageVector.Builder(
            name = "MapMarkerLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 11.5f)
                curveTo(13.62f, 11.5f, 12.5f, 10.38f, 12.5f, 9f)
                reflectiveCurveTo(13.62f, 6.5f, 15f, 6.5f)
                reflectiveCurveTo(17.5f, 7.62f, 17.5f, 9f)
                reflectiveCurveTo(16.38f, 11.5f, 15f, 11.5f)
                moveTo(8f, 9f)
                curveTo(8f, 14.25f, 15f, 22f, 15f, 22f)
                reflectiveCurveTo(22f, 14.25f, 22f, 9f)
                curveTo(22f, 5.13f, 18.87f, 2f, 15f, 2f)
                reflectiveCurveTo(8f, 5.13f, 8f, 9f)
                moveTo(6f, 7f)
                lineTo(1f, 12f)
                lineTo(6f, 17f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _MapMarkerLeft!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerLeft: ImageVector? = null
