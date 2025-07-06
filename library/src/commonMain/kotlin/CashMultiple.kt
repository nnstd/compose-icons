package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CashMultiple: ImageVector
    get() {
        if (_CashMultiple != null) {
            return _CashMultiple!!
        }
        _CashMultiple = ImageVector.Builder(
            name = "CashMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 6f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                moveTo(14f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 9f)
                moveTo(9f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 10f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 16f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 14f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 8f)
                horizontalLineTo(9f)
                moveTo(1f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(1f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _CashMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CashMultiple: ImageVector? = null
