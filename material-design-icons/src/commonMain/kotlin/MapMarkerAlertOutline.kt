package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerAlertOutline: ImageVector
    get() {
        if (_MapMarkerAlertOutline != null) {
            return _MapMarkerAlertOutline!!
        }
        _MapMarkerAlertOutline = ImageVector.Builder(
            name = "MapMarkerAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 9f)
                curveTo(19f, 14.25f, 12f, 22f, 12f, 22f)
                curveTo(12f, 22f, 5f, 14.25f, 5f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 4f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 9f)
                curveTo(7f, 10f, 7f, 12f, 12f, 18.71f)
                curveTo(17f, 12f, 17f, 10f, 17f, 9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                moveTo(11f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                moveTo(11f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _MapMarkerAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerAlertOutline: ImageVector? = null
