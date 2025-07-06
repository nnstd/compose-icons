package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarMultiselect: ImageVector
    get() {
        if (_CalendarMultiselect != null) {
            return _CalendarMultiselect!!
        }
        _CalendarMultiselect = ImageVector.Builder(
            name = "CalendarMultiselect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                moveTo(16f, 1f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(1f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(1f)
                moveTo(7f, 10f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                moveTo(15f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                moveTo(11f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                moveTo(15f, 14f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _CalendarMultiselect!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarMultiselect: ImageVector? = null
