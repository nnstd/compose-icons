package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SeatReclineNormal: ImageVector
    get() {
        if (_SeatReclineNormal != null) {
            return _SeatReclineNormal!!
        }
        _SeatReclineNormal = ImageVector.Builder(
            name = "SeatReclineNormal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.59f, 5.41f)
                curveTo(6.81f, 4.63f, 6.81f, 3.36f, 7.59f, 2.58f)
                curveTo(8.37f, 1.8f, 9.64f, 1.8f, 10.42f, 2.58f)
                curveTo(11.2f, 3.36f, 11.2f, 4.63f, 10.42f, 5.41f)
                curveTo(9.63f, 6.2f, 8.37f, 6.2f, 7.59f, 5.41f)
                moveTo(6f, 16f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 21f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 16f)
                moveTo(20f, 20.07f)
                lineTo(14.93f, 15f)
                horizontalLineTo(11.5f)
                verticalLineTo(11.32f)
                curveTo(12.9f, 12.47f, 15.1f, 13.5f, 17f, 13.5f)
                verticalLineTo(11.32f)
                curveTo(15.34f, 11.34f, 13.39f, 10.45f, 12.33f, 9.28f)
                lineTo(10.93f, 7.73f)
                curveTo(10.74f, 7.5f, 10.5f, 7.35f, 10.24f, 7.23f)
                curveTo(9.95f, 7.09f, 9.62f, 7f, 9.28f, 7f)
                horizontalLineTo(9.25f)
                curveTo(8f, 7f, 7f, 8f, 7f, 9.25f)
                verticalLineTo(15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 18f)
                horizontalLineTo(15.07f)
                lineTo(18.57f, 21.5f)
            }
        }.build()

        return _SeatReclineNormal!!
    }

@Suppress("ObjectPropertyName")
private var _SeatReclineNormal: ImageVector? = null
