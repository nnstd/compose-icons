package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarTextOutline: ImageVector
    get() {
        if (_CalendarTextOutline != null) {
            return _CalendarTextOutline!!
        }
        _CalendarTextOutline = ImageVector.Builder(
            name = "CalendarTextOutline",
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
                moveTo(7f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                moveTo(7f, 15f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _CalendarTextOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarTextOutline: ImageVector? = null
