package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BedQueenOutline: ImageVector
    get() {
        if (_BedQueenOutline != null) {
            return _BedQueenOutline!!
        }
        _BedQueenOutline = ImageVector.Builder(
            name = "BedQueenOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 5f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 7f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                verticalLineTo(17f)
                horizontalLineTo(4.33f)
                lineTo(5f, 19f)
                horizontalLineTo(6f)
                lineTo(6.67f, 17f)
                horizontalLineTo(17.33f)
                lineTo(18f, 19f)
                horizontalLineTo(19f)
                lineTo(19.67f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10f)
                moveTo(7f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                moveTo(19f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _BedQueenOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BedQueenOutline: ImageVector? = null
