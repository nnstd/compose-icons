package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BusStopCovered: ImageVector
    get() {
        if (_BusStopCovered != null) {
            return _BusStopCovered!!
        }
        _BusStopCovered = ImageVector.Builder(
            name = "BusStopCovered",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 3f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                arcTo(1.78f, 1.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.59f, 3f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(3.73f)
                curveTo(2f, 10.58f, 2f, 22f, 2f, 22f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                moveTo(22f, 8.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 19f, 11f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 8.5f)
                moveTo(15f, 11.5f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineTo(12.5f)
                verticalLineTo(17f)
                horizontalLineTo(11.5f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 10f)
                horizontalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 11.5f)
                moveTo(12f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6.5f)
                close()
            }
        }.build()

        return _BusStopCovered!!
    }

@Suppress("ObjectPropertyName")
private var _BusStopCovered: ImageVector? = null
