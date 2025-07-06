package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyEth: ImageVector
    get() {
        if (_CurrencyEth != null) {
            return _CurrencyEth!!
        }
        _CurrencyEth = ImageVector.Builder(
            name = "CurrencyEth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 5f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                moveTo(7f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                moveTo(5.5f, 17f)
                horizontalLineTo(18.5f)
                verticalLineTo(19f)
                horizontalLineTo(5.5f)
            }
        }.build()

        return _CurrencyEth!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyEth: ImageVector? = null
