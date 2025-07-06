package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarAlert: ImageVector
    get() {
        if (_CalendarAlert != null) {
            return _CalendarAlert!!
        }
        _CalendarAlert = ImageVector.Builder(
            name = "CalendarAlert",
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
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(1f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                moveTo(5f, 8f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                moveTo(11f, 9f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                moveTo(11f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _CalendarAlert!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarAlert: ImageVector? = null
