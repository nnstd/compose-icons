package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarRefreshOutline: ImageVector
    get() {
        if (_CalendarRefreshOutline != null) {
            return _CalendarRefreshOutline!!
        }
        _CalendarRefreshOutline = ImageVector.Builder(
            name = "CalendarRefreshOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(1f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(14f)
                curveTo(13.4f, 20.5f, 12.9f, 19.8f, 12.5f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(10.6f)
                curveTo(19.7f, 10.7f, 20.4f, 10.9f, 21f, 11.3f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(19f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(18f, 12.5f)
                curveTo(19.1f, 12.5f, 20.1f, 12.9f, 20.8f, 13.7f)
                lineTo(22f, 12.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(18f)
                lineTo(19.8f, 14.7f)
                curveTo(19.3f, 14.3f, 18.7f, 14f, 18f, 14f)
                curveTo(16.6f, 14f, 15.5f, 15.1f, 15.5f, 16.5f)
                reflectiveCurveTo(16.6f, 19f, 18f, 19f)
                curveTo(18.8f, 19f, 19.5f, 18.6f, 20f, 18f)
                horizontalLineTo(21.7f)
                curveTo(21.1f, 19.5f, 19.7f, 20.5f, 18f, 20.5f)
                curveTo(15.8f, 20.5f, 14f, 18.7f, 14f, 16.5f)
                reflectiveCurveTo(15.8f, 12.5f, 18f, 12.5f)
                close()
            }
        }.build()

        return _CalendarRefreshOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarRefreshOutline: ImageVector? = null
