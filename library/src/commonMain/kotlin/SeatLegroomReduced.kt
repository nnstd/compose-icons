package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SeatLegroomReduced: ImageVector
    get() {
        if (_SeatLegroomReduced != null) {
            return _SeatLegroomReduced!!
        }
        _SeatLegroomReduced = ImageVector.Builder(
            name = "SeatLegroomReduced",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.97f, 19.2f)
                curveTo(20.15f, 20.16f, 19.42f, 21f, 18.5f, 21f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                lineTo(15f, 14f)
                horizontalLineTo(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 11f)
                verticalLineTo(3f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 11f)
                lineTo(17f, 18f)
                horizontalLineTo(18.44f)
                curveTo(19.17f, 18f, 19.83f, 18.5f, 19.97f, 19.2f)
                moveTo(5f, 12f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 17f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 12f)
                close()
            }
        }.build()

        return _SeatLegroomReduced!!
    }

@Suppress("ObjectPropertyName")
private var _SeatLegroomReduced: ImageVector? = null
