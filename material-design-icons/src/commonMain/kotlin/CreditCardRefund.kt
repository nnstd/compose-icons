package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardRefund: ImageVector
    get() {
        if (_CreditCardRefund != null) {
            return _CreditCardRefund!!
        }
        _CreditCardRefund = ImageVector.Builder(
            name = "CreditCardRefund",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 11f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 13f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 23f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 21f)
                verticalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 11f)
                moveTo(18f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                moveTo(17f, 5f)
                verticalLineTo(10f)
                horizontalLineTo(15.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(9.88f)
                lineTo(12.3f, 8.93f)
                lineTo(11.24f, 10f)
                lineTo(7f, 5.75f)
                lineTo(11.24f, 1.5f)
                lineTo(12.3f, 2.57f)
                lineTo(9.88f, 5f)
                close()
            }
        }.build()

        return _CreditCardRefund!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardRefund: ImageVector? = null
