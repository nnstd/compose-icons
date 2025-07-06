package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneMessage: ImageVector
    get() {
        if (_CellphoneMessage != null) {
            return _CellphoneMessage!!
        }
        _CellphoneMessage = ImageVector.Builder(
            name = "CellphoneMessage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 17f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                moveTo(11f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 21f)
                horizontalLineTo(4f)
                curveTo(2.89f, 21f, 2f, 20.1f, 2f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 3f)
                horizontalLineTo(11f)
                moveTo(16.5f, 3f)
                horizontalLineTo(21.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 4.5f)
                verticalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.5f, 9f)
                horizontalLineTo(18f)
                lineTo(15f, 12f)
                verticalLineTo(9f)
                lineTo(15f, 4.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 3f)
                close()
            }
        }.build()

        return _CellphoneMessage!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneMessage: ImageVector? = null
