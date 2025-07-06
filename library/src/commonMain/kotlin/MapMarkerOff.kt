package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerOff: ImageVector
    get() {
        if (_MapMarkerOff != null) {
            return _MapMarkerOff!!
        }
        _MapMarkerOff = ImageVector.Builder(
            name = "MapMarkerOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.37f, 16.1f)
                lineTo(11.75f, 11.47f)
                lineTo(11.64f, 11.36f)
                lineTo(3.27f, 3f)
                lineTo(2f, 4.27f)
                lineTo(5.18f, 7.45f)
                curveTo(5.06f, 7.95f, 5f, 8.46f, 5f, 9f)
                curveTo(5f, 14.25f, 12f, 22f, 12f, 22f)
                curveTo(12f, 22f, 13.67f, 20.15f, 15.37f, 17.65f)
                lineTo(18.73f, 21f)
                lineTo(20f, 19.72f)
                moveTo(12f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 9f)
                curveTo(14.5f, 9.73f, 14.17f, 10.39f, 13.67f, 10.85f)
                lineTo(17.3f, 14.5f)
                curveTo(18.28f, 12.62f, 19f, 10.68f, 19f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                curveTo(10f, 2f, 8.24f, 2.82f, 6.96f, 4.14f)
                lineTo(10.15f, 7.33f)
                curveTo(10.61f, 6.82f, 11.26f, 6.5f, 12f, 6.5f)
                close()
            }
        }.build()

        return _MapMarkerOff!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerOff: ImageVector? = null
