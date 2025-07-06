package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardMultiple: ImageVector
    get() {
        if (_CreditCardMultiple != null) {
            return _CreditCardMultiple!!
        }
        _CreditCardMultiple = ImageVector.Builder(
            name = "CreditCardMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                moveTo(21f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 17f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 15f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 3f)
                horizontalLineTo(21f)
                moveTo(3f, 19f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 19f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _CreditCardMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardMultiple: ImageVector? = null
