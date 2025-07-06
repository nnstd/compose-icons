package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SeatFlat: ImageVector
    get() {
        if (_SeatFlat != null) {
            return _SeatFlat!!
        }
        _SeatFlat = ImageVector.Builder(
            name = "SeatFlat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 11f)
                moveTo(2f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                moveTo(7.14f, 12.1f)
                curveTo(8.3f, 10.91f, 8.28f, 9f, 7.1f, 7.86f)
                curveTo(5.91f, 6.7f, 4f, 6.72f, 2.86f, 7.9f)
                curveTo(1.7f, 9.09f, 1.72f, 11f, 2.9f, 12.14f)
                curveTo(4.09f, 13.3f, 6f, 13.28f, 7.14f, 12.1f)
                close()
            }
        }.build()

        return _SeatFlat!!
    }

@Suppress("ObjectPropertyName")
private var _SeatFlat: ImageVector? = null
