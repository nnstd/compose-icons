package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneText: ImageVector
    get() {
        if (_CellphoneText != null) {
            return _CellphoneText!!
        }
        _CellphoneText = ImageVector.Builder(
            name = "CellphoneText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 19f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                moveTo(17f, 1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 3f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 23f)
                horizontalLineTo(7f)
                curveTo(5.89f, 23f, 5f, 22.1f, 5f, 21f)
                verticalLineTo(3f)
                curveTo(5f, 1.89f, 5.89f, 1f, 7f, 1f)
                horizontalLineTo(17f)
                moveTo(9f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                moveTo(9f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _CellphoneText!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneText: ImageVector? = null
