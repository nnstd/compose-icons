package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SeatPassenger: ImageVector
    get() {
        if (_SeatPassenger != null) {
            return _SeatPassenger!!
        }
        _SeatPassenger = ImageVector.Builder(
            name = "SeatPassenger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                curveTo(6.24f, 21f, 4f, 18.76f, 4f, 16f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                curveTo(6f, 17.66f, 7.34f, 19f, 9f, 19f)
                moveTo(10.42f, 5.41f)
                curveTo(11.2f, 4.63f, 11.2f, 3.36f, 10.42f, 2.58f)
                curveTo(9.64f, 1.8f, 8.37f, 1.8f, 7.59f, 2.58f)
                curveTo(6.81f, 3.36f, 6.81f, 4.63f, 7.59f, 5.41f)
                curveTo(8.37f, 6.2f, 9.63f, 6.2f, 10.42f, 5.41f)
                moveTo(11.5f, 9f)
                curveTo(11.5f, 7.9f, 10.6f, 7f, 9.5f, 7f)
                horizontalLineTo(9f)
                curveTo(7.9f, 7f, 7f, 7.9f, 7f, 9f)
                verticalLineTo(15f)
                curveTo(7f, 16.66f, 8.34f, 18f, 10f, 18f)
                horizontalLineTo(15.07f)
                lineTo(18.57f, 21.5f)
                lineTo(20f, 20.07f)
                lineTo(14.93f, 15f)
                horizontalLineTo(11.5f)
                lineTo(11.5f, 9f)
                close()
            }
        }.build()

        return _SeatPassenger!!
    }

@Suppress("ObjectPropertyName")
private var _SeatPassenger: ImageVector? = null
