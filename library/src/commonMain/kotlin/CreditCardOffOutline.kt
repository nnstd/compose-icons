package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardOffOutline: ImageVector
    get() {
        if (_CreditCardOffOutline != null) {
            return _CreditCardOffOutline!!
        }
        _CreditCardOffOutline = ImageVector.Builder(
            name = "CreditCardOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.93f, 4.2f)
                lineTo(2.21f, 2.93f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(16.73f, 20f)
                horizontalLineTo(4f)
                curveTo(2.89f, 20f, 2f, 19.1f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 5.78f, 2.04f, 5.57f, 2.11f, 5.38f)
                lineTo(0.93f, 4.2f)
                moveTo(20f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(7.82f)
                lineTo(5.82f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(18f)
                curveTo(22f, 18.6f, 21.74f, 19.13f, 21.32f, 19.5f)
                lineTo(19.82f, 18f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(13.82f)
                lineTo(9.82f, 8f)
                horizontalLineTo(20f)
                moveTo(4f, 8f)
                horizontalLineTo(4.73f)
                lineTo(4f, 7.27f)
                verticalLineTo(8f)
                moveTo(4f, 12f)
                verticalLineTo(18f)
                horizontalLineTo(14.73f)
                lineTo(8.73f, 12f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _CreditCardOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardOffOutline: ImageVector? = null
