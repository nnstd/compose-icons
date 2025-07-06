package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarCursorOutline: ImageVector
    get() {
        if (_CalendarCursorOutline != null) {
            return _CalendarCursorOutline!!
        }
        _CalendarCursorOutline = ImageVector.Builder(
            name = "CalendarCursorOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(11.1f)
                lineTo(21f, 12.8f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
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
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                moveTo(19f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(7f, 16f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                moveTo(22.9f, 17.7f)
                curveTo(22.8f, 17.8f, 22.7f, 17.9f, 22.6f, 17.9f)
                lineTo(20.7f, 18.3f)
                lineTo(22f, 21.1f)
                curveTo(22.2f, 21.4f, 22f, 21.7f, 21.7f, 21.9f)
                lineTo(19.6f, 22.9f)
                curveTo(19.4f, 23f, 19.4f, 23f, 19.3f, 23f)
                curveTo(19.1f, 23f, 18.9f, 22.9f, 18.8f, 22.7f)
                lineTo(17.5f, 19.9f)
                lineTo(16f, 21f)
                curveTo(15.9f, 21.1f, 15.8f, 21.1f, 15.6f, 21.1f)
                curveTo(15.3f, 21.1f, 15f, 20.8f, 15f, 20.5f)
                verticalLineTo(11.5f)
                curveTo(15f, 11.2f, 15.3f, 10.9f, 15.6f, 10.9f)
                curveTo(15.7f, 10.9f, 15.9f, 11f, 16f, 11f)
                lineTo(22.8f, 16.8f)
                curveTo(23f, 17.1f, 23.1f, 17.5f, 22.9f, 17.7f)
                close()
            }
        }.build()

        return _CalendarCursorOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarCursorOutline: ImageVector? = null
