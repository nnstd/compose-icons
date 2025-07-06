package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerDistance: ImageVector
    get() {
        if (_MapMarkerDistance != null) {
            return _MapMarkerDistance!!
        }
        _MapMarkerDistance = ImageVector.Builder(
            name = "MapMarkerDistance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 8.11f)
                curveTo(5.61f, 8.11f, 4.89f, 7.39f, 4.89f, 6.5f)
                arcTo(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 4.89f)
                curveTo(7.39f, 4.89f, 8.11f, 5.61f, 8.11f, 6.5f)
                verticalLineTo(6.5f)
                arcTo(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 8.11f)
                moveTo(6.5f, 2f)
                curveTo(4f, 2f, 2f, 4f, 2f, 6.5f)
                curveTo(2f, 9.87f, 6.5f, 14.86f, 6.5f, 14.86f)
                curveTo(6.5f, 14.86f, 11f, 9.87f, 11f, 6.5f)
                curveTo(11f, 4f, 9f, 2f, 6.5f, 2f)
                moveTo(17.5f, 8.11f)
                arcTo(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.89f, 6.5f)
                curveTo(15.89f, 5.61f, 16.61f, 4.89f, 17.5f, 4.89f)
                curveTo(18.39f, 4.89f, 19.11f, 5.61f, 19.11f, 6.5f)
                arcTo(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 8.11f)
                moveTo(17.5f, 2f)
                curveTo(15f, 2f, 13f, 4f, 13f, 6.5f)
                curveTo(13f, 9.87f, 17.5f, 14.86f, 17.5f, 14.86f)
                curveTo(17.5f, 14.86f, 22f, 9.87f, 22f, 6.5f)
                curveTo(22f, 4f, 20f, 2f, 17.5f, 2f)
                moveTo(17.5f, 16f)
                curveTo(16.23f, 16f, 15.1f, 16.8f, 14.68f, 18f)
                horizontalLineTo(9.32f)
                curveTo(8.77f, 16.44f, 7.05f, 15.62f, 5.5f, 16.17f)
                curveTo(3.93f, 16.72f, 3.11f, 18.44f, 3.66f, 20f)
                curveTo(4.22f, 21.56f, 5.93f, 22.38f, 7.5f, 21.83f)
                curveTo(8.35f, 21.53f, 9f, 20.85f, 9.32f, 20f)
                horizontalLineTo(14.69f)
                curveTo(15.24f, 21.56f, 16.96f, 22.38f, 18.5f, 21.83f)
                curveTo(20.08f, 21.28f, 20.9f, 19.56f, 20.35f, 18f)
                curveTo(19.92f, 16.8f, 18.78f, 16f, 17.5f, 16f)
                verticalLineTo(16f)
                moveTo(17.5f, 20.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 19f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 19f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 20.5f)
                close()
            }
        }.build()

        return _MapMarkerDistance!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerDistance: ImageVector? = null
