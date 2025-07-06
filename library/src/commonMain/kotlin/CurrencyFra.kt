package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyFra: ImageVector
    get() {
        if (_CurrencyFra != null) {
            return _CurrencyFra!!
        }
        _CurrencyFra = ImageVector.Builder(
            name = "CurrencyFra",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _CurrencyFra!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyFra: ImageVector? = null
