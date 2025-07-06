package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneNfc: ImageVector
    get() {
        if (_CellphoneNfc != null) {
            return _CellphoneNfc!!
        }
        _CellphoneNfc = ImageVector.Builder(
            name = "CellphoneNfc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 16f)
                verticalLineTo(18f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 23f)
                horizontalLineTo(9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 16f)
                moveTo(2f, 20f)
                verticalLineTo(23f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 20f)
                moveTo(2f, 12f)
                verticalLineTo(14f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 23f)
                horizontalLineTo(13f)
                curveTo(13f, 16.92f, 8.08f, 12f, 2f, 12f)
                moveTo(17f, 1f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 3f)
                verticalLineTo(10.37f)
                curveTo(5.69f, 10.53f, 6.36f, 10.74f, 7f, 11f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(13.97f)
                curveTo(14.5f, 19.25f, 14.81f, 20.59f, 14.92f, 22f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 20f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 1f)
                close()
            }
        }.build()

        return _CellphoneNfc!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneNfc: ImageVector? = null
