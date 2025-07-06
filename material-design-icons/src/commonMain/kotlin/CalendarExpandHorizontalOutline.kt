package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarExpandHorizontalOutline: ImageVector
    get() {
        if (_CalendarExpandHorizontalOutline != null) {
            return _CalendarExpandHorizontalOutline!!
        }
        _CalendarExpandHorizontalOutline = ImageVector.Builder(
            name = "CalendarExpandHorizontalOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                lineTo(6f, 14f)
                lineTo(9f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                lineTo(18f, 14f)
                lineTo(15f, 11f)
                verticalLineTo(13f)
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
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(19f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(5f, 19f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _CalendarExpandHorizontalOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarExpandHorizontalOutline: ImageVector? = null
