package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarCursor: ImageVector
    get() {
        if (_CalendarCursor != null) {
            return _CalendarCursor!!
        }
        _CalendarCursor = ImageVector.Builder(
            name = "CalendarCursor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.86f, 17.74f)
                curveTo(22.77f, 17.85f, 22.65f, 17.91f, 22.53f, 17.94f)
                lineTo(20.66f, 18.3f)
                lineTo(21.95f, 21.14f)
                curveTo(22.11f, 21.43f, 21.97f, 21.79f, 21.67f, 21.93f)
                lineTo(19.53f, 22.94f)
                curveTo(19.44f, 23f, 19.36f, 23f, 19.27f, 23f)
                curveTo(19.05f, 23f, 18.84f, 22.88f, 18.74f, 22.66f)
                lineTo(17.45f, 19.83f)
                lineTo(15.96f, 21.04f)
                curveTo(15.86f, 21.12f, 15.74f, 21.17f, 15.59f, 21.17f)
                curveTo(15.26f, 21.17f, 15f, 20.9f, 15f, 20.57f)
                verticalLineTo(11.6f)
                curveTo(15f, 11.27f, 15.26f, 11f, 15.59f, 11f)
                curveTo(15.74f, 11f, 15.88f, 11.05f, 16f, 11.13f)
                lineTo(22.77f, 16.89f)
                curveTo(23.04f, 17.12f, 23.07f, 17.5f, 22.86f, 17.74f)
                moveTo(12f, 15f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
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
                curveTo(3.89f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(11.06f)
                lineTo(21f, 12.76f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                close()
            }
        }.build()

        return _CalendarCursor!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarCursor: ImageVector? = null
