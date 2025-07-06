package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Seat: ImageVector
    get() {
        if (_Seat != null) {
            return _Seat!!
        }
        _Seat = ImageVector.Builder(
            name = "Seat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                moveTo(19f, 10f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                moveTo(2f, 10f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                moveTo(17f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 3f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 5f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Seat!!
    }

@Suppress("ObjectPropertyName")
private var _Seat: ImageVector? = null
