package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SeatLegroomExtra: ImageVector
    get() {
        if (_SeatLegroomExtra != null) {
            return _SeatLegroomExtra!!
        }
        _SeatLegroomExtra = ImageVector.Builder(
            name = "SeatLegroomExtra",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 12f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                moveTo(22.83f, 17.24f)
                curveTo(22.45f, 16.5f, 21.54f, 16.27f, 20.8f, 16.61f)
                lineTo(19.71f, 17.11f)
                lineTo(16.3f, 10.13f)
                curveTo(15.96f, 9.45f, 15.27f, 9f, 14.5f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 14f)
                horizontalLineTo(15f)
                lineTo(18.41f, 21f)
                lineTo(22.13f, 19.3f)
                curveTo(22.9f, 18.94f, 23.23f, 18f, 22.83f, 17.24f)
                close()
            }
        }.build()

        return _SeatLegroomExtra!!
    }

@Suppress("ObjectPropertyName")
private var _SeatLegroomExtra: ImageVector? = null
