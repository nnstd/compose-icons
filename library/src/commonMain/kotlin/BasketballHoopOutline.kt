package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BasketballHoopOutline: ImageVector
    get() {
        if (_BasketballHoopOutline != null) {
            return _BasketballHoopOutline!!
        }
        _BasketballHoopOutline = ImageVector.Builder(
            name = "BasketballHoopOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 18f)
                horizontalLineTo(6.57f)
                lineTo(8f, 23f)
                lineTo(10f, 21f)
                lineTo(12f, 23f)
                lineTo(14f, 21f)
                lineTo(16f, 23f)
                lineTo(17.43f, 18f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 16f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 2f)
                moveTo(21f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 7f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 9f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                moveTo(9f, 14f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _BasketballHoopOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BasketballHoopOutline: ImageVector? = null
