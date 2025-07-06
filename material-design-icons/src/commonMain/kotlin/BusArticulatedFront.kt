package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BusArticulatedFront: ImageVector
    get() {
        if (_BusArticulatedFront != null) {
            return _BusArticulatedFront!!
        }
        _BusArticulatedFront = ImageVector.Builder(
            name = "BusArticulatedFront",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 6f)
                lineTo(2.5f, 7.5f)
                lineTo(1f, 9f)
                lineTo(2.5f, 10.5f)
                lineTo(1f, 12f)
                lineTo(2.5f, 13.5f)
                lineTo(1f, 15f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 15f)
                horizontalLineTo(15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 15f)
                horizontalLineTo(23f)
                verticalLineTo(8f)
                curveTo(23f, 6.89f, 22.11f, 6f, 21f, 6f)
                horizontalLineTo(1f)
                moveTo(4f, 7.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(7.5f)
                moveTo(8f, 7.5f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(7.5f)
                moveTo(13.5f, 7.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(10f)
                horizontalLineTo(13.5f)
                verticalLineTo(7.5f)
                moveTo(19f, 7.5f)
                horizontalLineTo(21.5f)
                verticalLineTo(13f)
                lineTo(19f, 11f)
                verticalLineTo(7.5f)
                moveTo(6f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 13.5f)
                moveTo(18f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 13.5f)
                close()
            }
        }.build()

        return _BusArticulatedFront!!
    }

@Suppress("ObjectPropertyName")
private var _BusArticulatedFront: ImageVector? = null
