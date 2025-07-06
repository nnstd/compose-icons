package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarMonth: ImageVector
    get() {
        if (_CalendarMonth != null) {
            return _CalendarMonth!!
        }
        _CalendarMonth = ImageVector.Builder(
            name = "CalendarMonth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                moveTo(13f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                moveTo(17f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                moveTo(19f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(1f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(1f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                moveTo(19f, 19f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                moveTo(9f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                moveTo(13f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                moveTo(17f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _CalendarMonth!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarMonth: ImageVector? = null
