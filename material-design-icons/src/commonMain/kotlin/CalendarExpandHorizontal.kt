package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarExpandHorizontal: ImageVector
    get() {
        if (_CalendarExpandHorizontal != null) {
            return _CalendarExpandHorizontal!!
        }
        _CalendarExpandHorizontal = ImageVector.Builder(
            name = "CalendarExpandHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                moveTo(16f, 1f)
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
                horizontalLineTo(18f)
                verticalLineTo(1f)
                moveTo(18f, 14f)
                lineTo(15f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                lineTo(6f, 14f)
                lineTo(9f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                lineTo(18f, 14f)
                close()
            }
        }.build()

        return _CalendarExpandHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarExpandHorizontal: ImageVector? = null
