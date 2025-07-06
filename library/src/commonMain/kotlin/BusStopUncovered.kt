package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BusStopUncovered: ImageVector
    get() {
        if (_BusStopUncovered != null) {
            return _BusStopUncovered!!
        }
        _BusStopUncovered = ImageVector.Builder(
            name = "BusStopUncovered",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 22f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 14f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 18f)
                verticalLineTo(22f)
                moveTo(20f, 11f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 11f)
                moveTo(15f, 11.55f)
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
                moveTo(12f, 6.55f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6.5f)
                close()
            }
        }.build()

        return _BusStopUncovered!!
    }

@Suppress("ObjectPropertyName")
private var _BusStopUncovered: ImageVector? = null
