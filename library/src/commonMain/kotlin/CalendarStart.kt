package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarStart: ImageVector
    get() {
        if (_CalendarStart != null) {
            return _CalendarStart!!
        }
        _CalendarStart = ImageVector.Builder(
            name = "CalendarStart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                lineTo(13f, 18f)
                lineTo(9f, 22f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(14f)
                moveTo(19f, 19f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                lineTo(3f, 5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(0.998f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(0.998f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.89f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.1f, 20.1f, 21f, 19f, 21f)
                lineTo(12.83f, 21f)
                lineTo(14.83f, 19f)
                lineTo(19f, 19f)
                close()
            }
        }.build()

        return _CalendarStart!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarStart: ImageVector? = null
