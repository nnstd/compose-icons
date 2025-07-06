package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardMultipleOutline: ImageVector
    get() {
        if (_CreditCardMultipleOutline != null) {
            return _CreditCardMultipleOutline!!
        }
        _CreditCardMultipleOutline = ImageVector.Builder(
            name = "CreditCardMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                moveTo(21f, 16f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                moveTo(21f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 6f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 18f)
                horizontalLineTo(7f)
                curveTo(5.89f, 18f, 5f, 17.1f, 5f, 16f)
                verticalLineTo(6f)
                curveTo(5f, 4.89f, 5.89f, 4f, 7f, 4f)
                horizontalLineTo(21f)
                moveTo(3f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 20f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _CreditCardMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardMultipleOutline: ImageVector? = null
