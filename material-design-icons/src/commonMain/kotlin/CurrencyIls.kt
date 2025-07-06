package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyIls: ImageVector
    get() {
        if (_CurrencyIls != null) {
            return _CurrencyIls!!
        }
        _CurrencyIls = ImageVector.Builder(
            name = "CurrencyIls",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 21f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 16f)
                verticalLineTo(3f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                moveTo(16f, 8f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 5f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 8f)
                close()
            }
        }.build()

        return _CurrencyIls!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyIls: ImageVector? = null
