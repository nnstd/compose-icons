package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarBlankMultiple: ImageVector
    get() {
        if (_CalendarBlankMultiple != null) {
            return _CalendarBlankMultiple!!
        }
        _CalendarBlankMultiple = ImageVector.Builder(
            name = "CalendarBlankMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 17f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                moveTo(21f, 3f)
                curveTo(22.1f, 3f, 23f, 3.9f, 23f, 5f)
                verticalLineTo(17f)
                curveTo(23f, 18.1f, 22.1f, 19f, 21f, 19f)
                horizontalLineTo(7f)
                curveTo(5.89f, 19f, 5f, 18.1f, 5f, 17f)
                verticalLineTo(5f)
                curveTo(5f, 3.9f, 5.9f, 3f, 7f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                verticalLineTo(1f)
                horizontalLineTo(20f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                moveTo(3f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(23f)
                horizontalLineTo(3f)
                curveTo(1.89f, 23f, 1f, 22.1f, 1f, 21f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _CalendarBlankMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarBlankMultiple: ImageVector? = null
