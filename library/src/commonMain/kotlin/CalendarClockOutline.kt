package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarClockOutline: ImageVector
    get() {
        if (_CalendarClockOutline != null) {
            return _CalendarClockOutline!!
        }
        _CalendarClockOutline = ImageVector.Builder(
            name = "CalendarClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 1f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(11.1f)
                curveTo(12.36f, 22.24f, 14.09f, 23f, 16f, 23f)
                curveTo(19.87f, 23f, 23f, 19.87f, 23f, 16f)
                curveTo(23f, 14.09f, 22.24f, 12.36f, 21f, 11.1f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(1f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                moveTo(5f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                moveTo(5f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(9.67f)
                curveTo(18.09f, 9.24f, 17.07f, 9f, 16f, 9f)
                curveTo(12.13f, 9f, 9f, 12.13f, 9f, 16f)
                curveTo(9f, 17.07f, 9.24f, 18.09f, 9.67f, 19f)
                horizontalLineTo(5f)
                moveTo(16f, 11.15f)
                curveTo(18.68f, 11.15f, 20.85f, 13.32f, 20.85f, 16f)
                curveTo(20.85f, 18.68f, 18.68f, 20.85f, 16f, 20.85f)
                curveTo(13.32f, 20.85f, 11.15f, 18.68f, 11.15f, 16f)
                curveTo(11.15f, 13.32f, 13.32f, 11.15f, 16f, 11.15f)
                moveTo(15f, 13f)
                verticalLineTo(16.69f)
                lineTo(18.19f, 18.53f)
                lineTo(18.94f, 17.23f)
                lineTo(16.5f, 15.82f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _CalendarClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarClockOutline: ImageVector? = null
