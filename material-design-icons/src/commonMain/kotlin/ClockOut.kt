package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockOut: ImageVector
    get() {
        if (_ClockOut != null) {
            return _ClockOut!!
        }
        _ClockOut = ImageVector.Builder(
            name = "ClockOut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 1f)
                lineTo(19.8f, 2.79f)
                lineTo(15.79f, 6.79f)
                lineTo(17.21f, 8.21f)
                lineTo(21.21f, 4.21f)
                lineTo(23f, 6f)
                verticalLineTo(1f)
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

        return _ClockOut!!
    }

@Suppress("ObjectPropertyName")
private var _ClockOut: ImageVector? = null
