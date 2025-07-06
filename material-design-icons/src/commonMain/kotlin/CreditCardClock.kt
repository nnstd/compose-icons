package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardClock: ImageVector
    get() {
        if (_CreditCardClock != null) {
            return _CreditCardClock!!
        }
        _CreditCardClock = ImageVector.Builder(
            name = "CreditCardClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 14f)
                horizontalLineTo(17.5f)
                verticalLineTo(16.82f)
                lineTo(19.94f, 18.23f)
                lineTo(19.19f, 19.53f)
                lineTo(16f, 17.69f)
                verticalLineTo(14f)
                moveTo(24f, 17f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 24f)
                curveTo(14.21f, 24f, 11.8f, 22.36f, 10.67f, 20f)
                horizontalLineTo(4f)
                curveTo(2.89f, 20f, 2f, 19.1f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.89f, 4f, 4f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(12.1f)
                curveTo(23.24f, 13.36f, 24f, 15.09f, 24f, 17f)
                moveTo(17f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 22f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 12f)
                moveTo(20f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _CreditCardClock!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardClock: ImageVector? = null
