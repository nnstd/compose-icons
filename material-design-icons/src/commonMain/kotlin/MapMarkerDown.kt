package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerDown: ImageVector
    get() {
        if (_MapMarkerDown != null) {
            return _MapMarkerDown!!
        }
        _MapMarkerDown = ImageVector.Builder(
            name = "MapMarkerDown",
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
                moveTo(7.5f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(16.5f)
                lineTo(12f, 14.5f)
                close()
            }
        }.build()

        return _MapMarkerDown!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerDown: ImageVector? = null
