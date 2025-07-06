package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CashRefund: ImageVector
    get() {
        if (_CashRefund != null) {
            return _CashRefund!!
        }
        _CashRefund = ImageVector.Builder(
            name = "CashRefund",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.3f, 8.93f)
                lineTo(9.88f, 6.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(9.88f)
                lineTo(12.3f, 2.57f)
                lineTo(11.24f, 1.5f)
                lineTo(7f, 5.75f)
                lineTo(11.24f, 10f)
                lineTo(12.3f, 8.93f)
                moveTo(12f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15f, 17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                moveTo(3f, 11f)
                verticalLineTo(23f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                moveTo(19f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 21f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 19f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 13f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15f)
                close()
            }
        }.build()

        return _CashRefund!!
    }

@Suppress("ObjectPropertyName")
private var _CashRefund: ImageVector? = null
