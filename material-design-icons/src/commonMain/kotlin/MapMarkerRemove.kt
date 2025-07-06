package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerRemove: ImageVector
    get() {
        if (_MapMarkerRemove != null) {
            return _MapMarkerRemove!!
        }
        _MapMarkerRemove = ImageVector.Builder(
            name = "MapMarkerRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2f)
                curveTo(5.14f, 2f, 2f, 5.14f, 2f, 9f)
                curveTo(2f, 14.25f, 9f, 22f, 9f, 22f)
                curveTo(9f, 22f, 16f, 14.25f, 16f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 2f)
                moveTo(9f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 11.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 6.5f)
                moveTo(16.58f, 14.16f)
                lineTo(15.17f, 15.58f)
                lineTo(17.58f, 18f)
                lineTo(15.17f, 20.41f)
                lineTo(16.58f, 21.82f)
                lineTo(19f, 19.41f)
                lineTo(21.41f, 21.82f)
                lineTo(22.83f, 20.41f)
                lineTo(20.41f, 18f)
                lineTo(22.83f, 15.58f)
                lineTo(21.41f, 14.16f)
                lineTo(19f, 16.58f)
            }
        }.build()

        return _MapMarkerRemove!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerRemove: ImageVector? = null
