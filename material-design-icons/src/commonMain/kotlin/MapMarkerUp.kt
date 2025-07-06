package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerUp: ImageVector
    get() {
        if (_MapMarkerUp != null) {
            return _MapMarkerUp!!
        }
        _MapMarkerUp = ImageVector.Builder(
            name = "MapMarkerUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 9f)
                curveTo(5f, 14.25f, 12f, 22f, 12f, 22f)
                reflectiveCurveTo(19f, 14.25f, 19f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(16.5f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(7.5f)
                lineTo(12f, 4.5f)
                close()
            }
        }.build()

        return _MapMarkerUp!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerUp: ImageVector? = null
