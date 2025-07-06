package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SeatOutline: ImageVector
    get() {
        if (_SeatOutline != null) {
            return _SeatOutline!!
        }
        _SeatOutline = ImageVector.Builder(
            name = "SeatOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 5f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                moveTo(15f, 3f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 5f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 3f)
                moveTo(22f, 10f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                moveTo(5f, 10f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                moveTo(20f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _SeatOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SeatOutline: ImageVector? = null
