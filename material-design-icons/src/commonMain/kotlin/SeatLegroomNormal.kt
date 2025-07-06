package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SeatLegroomNormal: ImageVector
    get() {
        if (_SeatLegroomNormal != null) {
            return _SeatLegroomNormal!!
        }
        _SeatLegroomNormal = ImageVector.Builder(
            name = "SeatLegroomNormal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 12f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 17f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 12f)
                moveTo(20.5f, 18f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 9f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 14f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineTo(20.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 19.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 18f)
                close()
            }
        }.build()

        return _SeatLegroomNormal!!
    }

@Suppress("ObjectPropertyName")
private var _SeatLegroomNormal: ImageVector? = null
