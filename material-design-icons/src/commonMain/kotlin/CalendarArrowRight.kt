package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarArrowRight: ImageVector
    get() {
        if (_CalendarArrowRight != null) {
            return _CalendarArrowRight!!
        }
        _CalendarArrowRight = ImageVector.Builder(
            name = "CalendarArrowRight",
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
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(12f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                lineTo(16f, 13.5f)
                lineTo(12f, 17f)
                close()
            }
        }.build()

        return _CalendarArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarArrowRight: ImageVector? = null
