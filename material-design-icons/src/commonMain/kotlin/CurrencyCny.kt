package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyCny: ImageVector
    get() {
        if (_CurrencyCny != null) {
            return _CurrencyCny!!
        }
        _CurrencyCny = ImageVector.Builder(
            name = "CurrencyCny",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.28f, 12f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(10.72f)
                lineTo(5f, 3f)
                horizontalLineTo(7.37f)
                lineTo(12f, 10.29f)
                lineTo(16.63f, 3f)
                horizontalLineTo(19f)
                lineTo(13.28f, 12f)
                close()
            }
        }.build()

        return _CurrencyCny!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyCny: ImageVector? = null
