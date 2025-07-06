package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerMultiple: ImageVector
    get() {
        if (_MapMarkerMultiple != null) {
            return _MapMarkerMultiple!!
        }
        _MapMarkerMultiple = ImageVector.Builder(
            name = "MapMarkerMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 11.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 11.5f)
                moveTo(14f, 2f)
                curveTo(17.86f, 2f, 21f, 5.13f, 21f, 9f)
                curveTo(21f, 14.25f, 14f, 22f, 14f, 22f)
                curveTo(14f, 22f, 7f, 14.25f, 7f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 2f)
                moveTo(5f, 9f)
                curveTo(5f, 13.5f, 10.08f, 19.66f, 11f, 20.81f)
                lineTo(10f, 22f)
                curveTo(10f, 22f, 3f, 14.25f, 3f, 9f)
                curveTo(3f, 5.83f, 5.11f, 3.15f, 8f, 2.29f)
                curveTo(6.16f, 3.94f, 5f, 6.33f, 5f, 9f)
                close()
            }
        }.build()

        return _MapMarkerMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerMultiple: ImageVector? = null
