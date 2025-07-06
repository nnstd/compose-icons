package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarRangeOutline: ImageVector
    get() {
        if (_CalendarRangeOutline != null) {
            return _CalendarRangeOutline!!
        }
        _CalendarRangeOutline = ImageVector.Builder(
            name = "CalendarRangeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                moveTo(21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.11f, 20.11f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(1f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(1f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.9f, 21f, 5f)
                moveTo(5f, 7f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                moveTo(19f, 19f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                moveTo(15f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                moveTo(11f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _CalendarRangeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarRangeOutline: ImageVector? = null
