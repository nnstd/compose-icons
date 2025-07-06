package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BusArticulatedEnd: ImageVector
    get() {
        if (_BusArticulatedEnd != null) {
            return _BusArticulatedEnd!!
        }
        _BusArticulatedEnd = ImageVector.Builder(
            name = "BusArticulatedEnd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 6f)
                lineTo(20f, 7.5f)
                lineTo(21.5f, 9f)
                lineTo(20f, 10.5f)
                lineTo(21.5f, 12f)
                lineTo(20f, 13.5f)
                lineTo(21.5f, 15f)
                horizontalLineTo(12.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 15f)
                horizontalLineTo(2.5f)
                verticalLineTo(8f)
                curveTo(2.5f, 6.89f, 3.39f, 6f, 4.5f, 6f)
                horizontalLineTo(21.5f)
                moveTo(18.5f, 7.5f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(18.5f)
                verticalLineTo(7.5f)
                moveTo(13.5f, 7.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(10f)
                horizontalLineTo(13.5f)
                verticalLineTo(7.5f)
                moveTo(8f, 7.5f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(7.5f)
                moveTo(9.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 13.5f)
                close()
            }
        }.build()

        return _BusArticulatedEnd!!
    }

@Suppress("ObjectPropertyName")
private var _BusArticulatedEnd: ImageVector? = null
