package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockEnd: ImageVector
    get() {
        if (_ClockEnd != null) {
            return _ClockEnd!!
        }
        _ClockEnd = ImageVector.Builder(
            name = "ClockEnd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(8.14f, 1f, 5f, 4.14f, 5f, 8f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                curveTo(15.86f, 15f, 19f, 11.87f, 19f, 8f)
                curveTo(19f, 4.14f, 15.86f, 1f, 12f, 1f)
                moveTo(12f, 3.15f)
                curveTo(14.67f, 3.15f, 16.85f, 5.32f, 16.85f, 8f)
                curveTo(16.85f, 10.68f, 14.67f, 12.85f, 12f, 12.85f)
                arcTo(4.85f, 4.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.15f, 8f)
                arcTo(4.85f, 4.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3.15f)
                moveTo(11f, 5f)
                verticalLineTo(8.69f)
                lineTo(14.19f, 10.53f)
                lineTo(14.94f, 9.23f)
                lineTo(12.5f, 7.82f)
                verticalLineTo(5f)
                moveTo(15f, 16f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(24f)
                lineTo(19f, 20f)
                moveTo(19f, 20f)
                verticalLineTo(24f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
            }
        }.build()

        return _ClockEnd!!
    }

@Suppress("ObjectPropertyName")
private var _ClockEnd: ImageVector? = null
