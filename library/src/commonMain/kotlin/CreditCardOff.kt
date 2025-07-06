package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardOff: ImageVector
    get() {
        if (_CreditCardOff != null) {
            return _CreditCardOff!!
        }
        _CreditCardOff = ImageVector.Builder(
            name = "CreditCardOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.2f, 8f)
                lineTo(7.2f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(18f)
                arcTo(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.88f, 18.68f)
                lineTo(14.2f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                moveTo(20.84f, 22.73f)
                lineTo(18.11f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.65f, 4.54f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(9.11f, 11f)
                lineTo(6.11f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _CreditCardOff!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardOff: ImageVector? = null
