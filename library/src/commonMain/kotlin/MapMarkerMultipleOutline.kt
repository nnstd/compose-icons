package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerMultipleOutline: ImageVector
    get() {
        if (_MapMarkerMultipleOutline != null) {
            return _MapMarkerMultipleOutline!!
        }
        _MapMarkerMultipleOutline = ImageVector.Builder(
            name = "MapMarkerMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 9f)
                curveTo(11.5f, 7.62f, 12.62f, 6.5f, 14f, 6.5f)
                curveTo(15.1f, 6.5f, 16.03f, 7.21f, 16.37f, 8.19f)
                curveTo(16.45f, 8.45f, 16.5f, 8.72f, 16.5f, 9f)
                curveTo(16.5f, 10.38f, 15.38f, 11.5f, 14f, 11.5f)
                curveTo(12.91f, 11.5f, 12f, 10.81f, 11.64f, 9.84f)
                curveTo(11.55f, 9.58f, 11.5f, 9.29f, 11.5f, 9f)
                moveTo(5f, 9f)
                curveTo(5f, 13.5f, 10.08f, 19.66f, 11f, 20.81f)
                lineTo(10f, 22f)
                curveTo(10f, 22f, 3f, 14.25f, 3f, 9f)
                curveTo(3f, 5.83f, 5.11f, 3.15f, 8f, 2.29f)
                curveTo(6.16f, 3.94f, 5f, 6.33f, 5f, 9f)
                moveTo(14f, 2f)
                curveTo(17.86f, 2f, 21f, 5.13f, 21f, 9f)
                curveTo(21f, 14.25f, 14f, 22f, 14f, 22f)
                curveTo(14f, 22f, 7f, 14.25f, 7f, 9f)
                curveTo(7f, 5.13f, 10.14f, 2f, 14f, 2f)
                moveTo(14f, 4f)
                curveTo(11.24f, 4f, 9f, 6.24f, 9f, 9f)
                curveTo(9f, 10f, 9f, 12f, 14f, 18.71f)
                curveTo(19f, 12f, 19f, 10f, 19f, 9f)
                curveTo(19f, 6.24f, 16.76f, 4f, 14f, 4f)
                close()
            }
        }.build()

        return _MapMarkerMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerMultipleOutline: ImageVector? = null
