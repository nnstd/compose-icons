package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarEditOutline: ImageVector
    get() {
        if (_CalendarEditOutline != null) {
            return _CalendarEditOutline!!
        }
        _CalendarEditOutline = ImageVector.Builder(
            name = "CalendarEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.7f, 13.35f)
                lineTo(20.7f, 14.35f)
                lineTo(18.65f, 12.35f)
                lineTo(19.65f, 11.35f)
                curveTo(19.85f, 11.14f, 20.19f, 11.13f, 20.42f, 11.35f)
                lineTo(21.7f, 12.63f)
                curveTo(21.89f, 12.83f, 21.89f, 13.15f, 21.7f, 13.35f)
                moveTo(12f, 18.94f)
                verticalLineTo(21f)
                horizontalLineTo(14.06f)
                lineTo(20.12f, 14.88f)
                lineTo(18.07f, 12.88f)
                lineTo(12f, 18.94f)
                moveTo(5f, 19f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
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
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                moveTo(5f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _CalendarEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarEditOutline: ImageVector? = null
