package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyUah: ImageVector
    get() {
        if (_CurrencyUah != null) {
            return _CurrencyUah!!
        }
        _CurrencyUah = ImageVector.Builder(
            name = "CurrencyUah",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.59f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(16.32f)
                curveTo(16.74f, 8.34f, 17f, 7.68f, 17f, 7f)
                curveTo(17f, 4.37f, 14.5f, 3f, 12f, 3f)
                curveTo(9.65f, 3f, 7.53f, 5.06f, 7.29f, 5.29f)
                lineTo(8.71f, 6.71f)
                curveTo(9.19f, 6.23f, 10.71f, 5f, 12f, 5f)
                curveTo(13.04f, 5f, 15f, 5.42f, 15f, 7f)
                curveTo(15f, 7.5f, 14.5f, 8.24f, 13.76f, 9f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(11.63f)
                curveTo(11.21f, 11.36f, 9.75f, 12.67f, 9.41f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(7.68f)
                curveTo(7.26f, 15.66f, 7f, 16.32f, 7f, 17f)
                curveTo(7f, 19.63f, 9.5f, 21f, 12f, 21f)
                curveTo(14.35f, 21f, 16.47f, 18.94f, 16.71f, 18.71f)
                lineTo(15.29f, 17.29f)
                curveTo(14.82f, 17.77f, 13.29f, 19f, 12f, 19f)
                curveTo(10.96f, 19f, 9f, 18.58f, 9f, 17f)
                curveTo(9f, 16.5f, 9.5f, 15.76f, 10.24f, 15f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(12.38f)
                lineTo(14.59f, 11f)
                close()
            }
        }.build()

        return _CurrencyUah!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyUah: ImageVector? = null
