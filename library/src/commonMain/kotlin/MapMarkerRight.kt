package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerRight: ImageVector
    get() {
        if (_MapMarkerRight != null) {
            return _MapMarkerRight!!
        }
        _MapMarkerRight = ImageVector.Builder(
            name = "MapMarkerRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 11.5f)
                curveTo(7.62f, 11.5f, 6.5f, 10.38f, 6.5f, 9f)
                reflectiveCurveTo(7.62f, 6.5f, 9f, 6.5f)
                reflectiveCurveTo(11.5f, 7.62f, 11.5f, 9f)
                reflectiveCurveTo(10.38f, 11.5f, 9f, 11.5f)
                moveTo(9f, 2f)
                curveTo(5.13f, 2f, 2f, 5.13f, 2f, 9f)
                curveTo(2f, 14.25f, 9f, 22f, 9f, 22f)
                reflectiveCurveTo(16f, 14.25f, 16f, 9f)
                curveTo(16f, 5.13f, 12.87f, 2f, 9f, 2f)
                moveTo(18f, 17f)
                lineTo(23f, 12f)
                lineTo(18f, 7f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _MapMarkerRight!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerRight: ImageVector? = null
