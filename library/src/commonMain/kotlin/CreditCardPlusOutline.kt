package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardPlusOutline: ImageVector
    get() {
        if (_CreditCardPlusOutline != null) {
            return _CreditCardPlusOutline!!
        }
        _CreditCardPlusOutline = ImageVector.Builder(
            name = "CreditCardPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 18f)
                horizontalLineTo(24f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(23f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                moveTo(19f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                moveTo(19f, 12f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                curveTo(1.89f, 20f, 1f, 19.1f, 1f, 18f)
                verticalLineTo(6f)
                curveTo(1f, 4.89f, 1.89f, 4f, 3f, 4f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _CreditCardPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardPlusOutline: ImageVector? = null
