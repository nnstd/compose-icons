package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardRemove: ImageVector
    get() {
        if (_CreditCardRemove != null) {
            return _CreditCardRemove!!
        }
        _CreditCardRemove = ImageVector.Builder(
            name = "CreditCardRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(13.09f)
                arcTo(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 19f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 13f)
                arcTo(5.88f, 5.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 13.81f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4f)
                moveTo(20f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(22.54f, 16.88f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 21.12f)
                lineTo(21.12f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(16.88f, 22.54f)
                lineTo(15.46f, 21.12f)
                lineTo(17.59f, 19f)
                lineTo(15.46f, 16.88f)
                lineTo(16.88f, 15.46f)
                lineTo(19f, 17.59f)
                lineTo(21.12f, 15.46f)
                close()
            }
        }.build()

        return _CreditCardRemove!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardRemove: ImageVector? = null
