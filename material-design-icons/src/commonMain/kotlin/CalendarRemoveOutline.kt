package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarRemoveOutline: ImageVector
    get() {
        if (_CalendarRemoveOutline != null) {
            return _CalendarRemoveOutline!!
        }
        _CalendarRemoveOutline = ImageVector.Builder(
            name = "CalendarRemoveOutline",
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
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(5f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                moveTo(8.23f, 16.41f)
                lineTo(9.29f, 17.47f)
                lineTo(11.73f, 15.03f)
                lineTo(14.17f, 17.47f)
                lineTo(15.23f, 16.41f)
                lineTo(12.79f, 13.97f)
                lineTo(15.23f, 11.53f)
                lineTo(14.17f, 10.47f)
                lineTo(11.73f, 12.91f)
                lineTo(9.29f, 10.47f)
                lineTo(8.23f, 11.53f)
                lineTo(10.67f, 13.97f)
                lineTo(8.23f, 16.41f)
                close()
            }
        }.build()

        return _CalendarRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarRemoveOutline: ImageVector? = null
