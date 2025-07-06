package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarEnd: ImageVector
    get() {
        if (_CalendarEnd != null) {
            return _CalendarEnd!!
        }
        _CalendarEnd = ImageVector.Builder(
            name = "CalendarEnd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 14f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                lineTo(16f, 22f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                lineTo(20f, 18f)
                verticalLineTo(14f)
                horizontalLineTo(22f)
                moveTo(5f, 19f)
                lineTo(9f, 19f)
                verticalLineTo(21f)
                lineTo(5f, 21f)
                curveTo(3.9f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(0.998f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(0.998f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.89f, 21f, 5f)
                lineTo(21f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _CalendarEnd!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarEnd: ImageVector? = null
