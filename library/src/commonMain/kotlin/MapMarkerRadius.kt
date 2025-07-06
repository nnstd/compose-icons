package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerRadius: ImageVector
    get() {
        if (_MapMarkerRadius != null) {
            return _MapMarkerRadius!!
        }
        _MapMarkerRadius = ImageVector.Builder(
            name = "MapMarkerRadius",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(15.31f, 2f, 18f, 4.66f, 18f, 7.95f)
                curveTo(18f, 12.41f, 12f, 19f, 12f, 19f)
                curveTo(12f, 19f, 6f, 12.41f, 6f, 7.95f)
                curveTo(6f, 4.66f, 8.69f, 2f, 12f, 2f)
                moveTo(12f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                moveTo(20f, 19f)
                curveTo(20f, 21.21f, 16.42f, 23f, 12f, 23f)
                curveTo(7.58f, 23f, 4f, 21.21f, 4f, 19f)
                curveTo(4f, 17.71f, 5.22f, 16.56f, 7.11f, 15.83f)
                lineTo(7.75f, 16.74f)
                curveTo(6.67f, 17.19f, 6f, 17.81f, 6f, 18.5f)
                curveTo(6f, 19.88f, 8.69f, 21f, 12f, 21f)
                curveTo(15.31f, 21f, 18f, 19.88f, 18f, 18.5f)
                curveTo(18f, 17.81f, 17.33f, 17.19f, 16.25f, 16.74f)
                lineTo(16.89f, 15.83f)
                curveTo(18.78f, 16.56f, 20f, 17.71f, 20f, 19f)
                close()
            }
        }.build()

        return _MapMarkerRadius!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerRadius: ImageVector? = null
