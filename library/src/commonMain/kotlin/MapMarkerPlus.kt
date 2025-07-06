package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerPlus: ImageVector
    get() {
        if (_MapMarkerPlus != null) {
            return _MapMarkerPlus!!
        }
        _MapMarkerPlus = ImageVector.Builder(
            name = "MapMarkerPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 11.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 11.5f)
                moveTo(9f, 2f)
                curveTo(12.86f, 2f, 16f, 5.13f, 16f, 9f)
                curveTo(16f, 14.25f, 9f, 22f, 9f, 22f)
                curveTo(9f, 22f, 2f, 14.25f, 2f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2f)
                moveTo(15f, 17f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _MapMarkerPlus!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerPlus: ImageVector? = null
