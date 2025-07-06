package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockIn: ImageVector
    get() {
        if (_ClockIn != null) {
            return _ClockIn!!
        }
        _ClockIn = ImageVector.Builder(
            name = "ClockIn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.21f, 0.79f)
                lineTo(0.79f, 2.21f)
                lineTo(4.8f, 6.21f)
                lineTo(3f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                lineTo(6.21f, 4.8f)
                moveTo(12f, 8f)
                curveTo(8.14f, 8f, 5f, 11.13f, 5f, 15f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                curveTo(15.86f, 22f, 19f, 18.87f, 19f, 15f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                moveTo(12f, 10.15f)
                curveTo(14.67f, 10.15f, 16.85f, 12.32f, 16.85f, 15f)
                arcTo(4.85f, 4.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19.85f)
                curveTo(9.32f, 19.85f, 7.15f, 17.68f, 7.15f, 15f)
                arcTo(4.85f, 4.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10.15f)
                moveTo(11f, 12f)
                verticalLineTo(15.69f)
                lineTo(14.19f, 17.53f)
                lineTo(14.94f, 16.23f)
                lineTo(12.5f, 14.82f)
                verticalLineTo(12f)
            }
        }.build()

        return _ClockIn!!
    }

@Suppress("ObjectPropertyName")
private var _ClockIn: ImageVector? = null
