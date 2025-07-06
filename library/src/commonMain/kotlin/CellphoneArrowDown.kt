package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneArrowDown: ImageVector
    get() {
        if (_CellphoneArrowDown != null) {
            return _CellphoneArrowDown!!
        }
        _CellphoneArrowDown = ImageVector.Builder(
            name = "CellphoneArrowDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 1f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 3f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 23f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 21f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 1f)
                moveTo(17f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                moveTo(16f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                lineTo(12f, 17f)
                lineTo(16f, 13f)
                close()
            }
        }.build()

        return _CellphoneArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneArrowDown: ImageVector? = null
