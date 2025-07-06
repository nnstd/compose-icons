package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardOutline: ImageVector
    get() {
        if (_CreditCardOutline != null) {
            return _CreditCardOutline!!
        }
        _CreditCardOutline = ImageVector.Builder(
            name = "CreditCardOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                moveTo(20f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.1f, 4f, 20f, 4f)
                close()
            }
        }.build()

        return _CreditCardOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardOutline: ImageVector? = null
