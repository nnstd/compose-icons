package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarFilter: ImageVector
    get() {
        if (_CalendarFilter != null) {
            return _CalendarFilter!!
        }
        _CalendarFilter = ImageVector.Builder(
            name = "CalendarFilter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 1f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(1f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(1f)
                moveTo(17f, 21f)
                lineTo(18.8f, 22.77f)
                curveTo(19.3f, 23.27f, 20f, 22.87f, 20f, 22.28f)
                verticalLineTo(18f)
                lineTo(22.8f, 14.6f)
                curveTo(23.3f, 13.9f, 22.8f, 13f, 22f, 13f)
                horizontalLineTo(15f)
                curveTo(14.2f, 13f, 13.7f, 14f, 14.2f, 14.6f)
                lineTo(17f, 18f)
                verticalLineTo(21f)
            }
        }.build()

        return _CalendarFilter!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarFilter: ImageVector? = null
