package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BedQueen: ImageVector
    get() {
        if (_BedQueen != null) {
            return _BedQueen!!
        }
        _BedQueen = ImageVector.Builder(
            name = "BedQueen",
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
                moveTo(17f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _BedQueen!!
    }

@Suppress("ObjectPropertyName")
private var _BedQueen: ImageVector? = null
