package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarRemove: ImageVector
    get() {
        if (_CalendarRemove != null) {
            return _CalendarRemove!!
        }
        _CalendarRemove = ImageVector.Builder(
            name = "CalendarRemove",
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
                curveTo(3.89f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(9.31f, 17f)
                lineTo(11.75f, 14.56f)
                lineTo(14.19f, 17f)
                lineTo(15.25f, 15.94f)
                lineTo(12.81f, 13.5f)
                lineTo(15.25f, 11.06f)
                lineTo(14.19f, 10f)
                lineTo(11.75f, 12.44f)
                lineTo(9.31f, 10f)
                lineTo(8.25f, 11.06f)
                lineTo(10.69f, 13.5f)
                lineTo(8.25f, 15.94f)
                lineTo(9.31f, 17f)
                close()
            }
        }.build()

        return _CalendarRemove!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarRemove: ImageVector? = null
