package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyKzt: ImageVector
    get() {
        if (_CurrencyKzt != null) {
            return _CurrencyKzt!!
        }
        _CurrencyKzt = ImageVector.Builder(
            name = "CurrencyKzt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                moveTo(5f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _CurrencyKzt!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyKzt: ImageVector? = null
