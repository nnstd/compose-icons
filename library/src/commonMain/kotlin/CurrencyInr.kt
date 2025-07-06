package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyInr: ImageVector
    get() {
        if (_CurrencyInr != null) {
            return _CurrencyInr!!
        }
        _CurrencyInr = ImageVector.Builder(
            name = "CurrencyInr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 3f)
                horizontalLineTo(18f)
                lineTo(17f, 5f)
                horizontalLineTo(13.74f)
                curveTo(14.22f, 5.58f, 14.58f, 6.26f, 14.79f, 7f)
                horizontalLineTo(18f)
                lineTo(17f, 9f)
                horizontalLineTo(15f)
                curveTo(14.75f, 11.57f, 12.74f, 13.63f, 10.2f, 13.96f)
                verticalLineTo(14f)
                horizontalLineTo(9.5f)
                lineTo(15.5f, 21f)
                horizontalLineTo(13f)
                lineTo(7f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(9.5f)
                verticalLineTo(12f)
                curveTo(11.26f, 12f, 12.72f, 10.7f, 12.96f, 9f)
                horizontalLineTo(7f)
                lineTo(8f, 7f)
                horizontalLineTo(12.66f)
                curveTo(12.1f, 5.82f, 10.9f, 5f, 9.5f, 5f)
                horizontalLineTo(7f)
                lineTo(8f, 3f)
                close()
            }
        }.build()

        return _CurrencyInr!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyInr: ImageVector? = null
