package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarEdit: ImageVector
    get() {
        if (_CalendarEdit != null) {
            return _CalendarEdit!!
        }
        _CalendarEdit = ImageVector.Builder(
            name = "CalendarEdit",
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
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(21.7f, 13.35f)
                lineTo(20.7f, 14.35f)
                lineTo(18.65f, 12.35f)
                lineTo(19.65f, 11.35f)
                curveTo(19.85f, 11.14f, 20.19f, 11.13f, 20.42f, 11.35f)
                lineTo(21.7f, 12.63f)
                curveTo(21.89f, 12.83f, 21.89f, 13.15f, 21.7f, 13.35f)
                moveTo(12f, 18.94f)
                lineTo(18.07f, 12.88f)
                lineTo(20.12f, 14.88f)
                lineTo(14.06f, 21f)
                horizontalLineTo(12f)
                verticalLineTo(18.94f)
                close()
            }
        }.build()

        return _CalendarEdit!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarEdit: ImageVector? = null
