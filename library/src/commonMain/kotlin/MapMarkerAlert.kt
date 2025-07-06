package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerAlert: ImageVector
    get() {
        if (_MapMarkerAlert != null) {
            return _MapMarkerAlert!!
        }
        _MapMarkerAlert = ImageVector.Builder(
            name = "MapMarkerAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(15.9f, 2f, 19f, 5.1f, 19f, 9f)
                curveTo(19f, 14.2f, 12f, 22f, 12f, 22f)
                reflectiveCurveTo(5f, 14.2f, 5f, 9f)
                curveTo(5f, 5.1f, 8.1f, 2f, 12f, 2f)
                moveTo(11f, 6f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                moveTo(11f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _MapMarkerAlert!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerAlert: ImageVector? = null
