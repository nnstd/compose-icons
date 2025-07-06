package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardPlus: ImageVector
    get() {
        if (_CreditCardPlus != null) {
            return _CreditCardPlus!!
        }
        _CreditCardPlus = ImageVector.Builder(
            name = "CreditCardPlus",
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
                moveTo(20f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _CreditCardPlus!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardPlus: ImageVector? = null
