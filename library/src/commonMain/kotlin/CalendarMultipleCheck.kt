package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarMultipleCheck: ImageVector
    get() {
        if (_CalendarMultipleCheck != null) {
            return _CalendarMultipleCheck!!
        }
        _CalendarMultipleCheck = ImageVector.Builder(
            name = "CalendarMultipleCheck",
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
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 5f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 19f)
                horizontalLineTo(7f)
                curveTo(5.89f, 19f, 5f, 18.1f, 5f, 17f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                verticalLineTo(1f)
                horizontalLineTo(20f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                moveTo(17.53f, 11.06f)
                lineTo(13.09f, 15.5f)
                lineTo(10.41f, 12.82f)
                lineTo(11.47f, 11.76f)
                lineTo(13.09f, 13.38f)
                lineTo(16.47f, 10f)
                lineTo(17.53f, 11.06f)
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

        return _CalendarMultipleCheck!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarMultipleCheck: ImageVector? = null
