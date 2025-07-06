package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BedKingOutline: ImageVector
    get() {
        if (_BedKingOutline != null) {
            return _BedKingOutline!!
        }
        _BedKingOutline = ImageVector.Builder(
            name = "BedKingOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 5f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 7f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                verticalLineTo(17f)
                horizontalLineTo(3.33f)
                lineTo(4f, 19f)
                horizontalLineTo(5f)
                lineTo(5.67f, 17f)
                horizontalLineTo(18.33f)
                lineTo(19f, 19f)
                horizontalLineTo(20f)
                lineTo(20.67f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 10f)
                moveTo(13f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                moveTo(6f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                moveTo(20f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _BedKingOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BedKingOutline: ImageVector? = null
