package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerCheck: ImageVector
    get() {
        if (_MapMarkerCheck != null) {
            return _MapMarkerCheck!!
        }
        _MapMarkerCheck = ImageVector.Builder(
            name = "MapMarkerCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(15.86f, 2f, 19f, 5.14f, 19f, 9f)
                curveTo(19f, 14.25f, 12f, 22f, 12f, 22f)
                curveTo(12f, 22f, 5f, 14.25f, 5f, 9f)
                curveTo(5f, 5.14f, 8.14f, 2f, 12f, 2f)
                moveTo(10.47f, 14f)
                lineTo(17f, 7.41f)
                lineTo(15.6f, 6f)
                lineTo(10.47f, 11.18f)
                lineTo(8.4f, 9.09f)
                lineTo(7f, 10.5f)
                lineTo(10.47f, 14f)
                close()
            }
        }.build()

        return _MapMarkerCheck!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerCheck: ImageVector? = null
