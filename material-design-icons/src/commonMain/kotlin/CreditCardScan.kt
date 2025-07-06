package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardScan: ImageVector
    get() {
        if (_CreditCardScan != null) {
            return _CreditCardScan!!
        }
        _CreditCardScan = ImageVector.Builder(
            name = "CreditCardScan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 8f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 18f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 16f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 6f)
                moveTo(18f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                moveTo(2f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                moveTo(22f, 2f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                horizontalLineTo(24f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 2f)
                moveTo(2f, 16f)
                horizontalLineTo(0f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 22f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                moveTo(22f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
            }
        }.build()

        return _CreditCardScan!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardScan: ImageVector? = null
