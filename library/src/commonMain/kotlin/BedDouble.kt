package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BedDouble: ImageVector
    get() {
        if (_BedDouble != null) {
            return _BedDouble!!
        }
        _BedDouble = ImageVector.Builder(
            name = "BedDouble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 5f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 7f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                verticalLineTo(17f)
                horizontalLineTo(5.33f)
                lineTo(6f, 19f)
                horizontalLineTo(7f)
                lineTo(7.67f, 17f)
                horizontalLineTo(16.33f)
                lineTo(17f, 19f)
                horizontalLineTo(18f)
                lineTo(18.67f, 17f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 10f)
                moveTo(11f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                moveTo(16f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _BedDouble!!
    }

@Suppress("ObjectPropertyName")
private var _BedDouble: ImageVector? = null
