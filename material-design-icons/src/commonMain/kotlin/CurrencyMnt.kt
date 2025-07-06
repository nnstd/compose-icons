package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyMnt: ImageVector
    get() {
        if (_CurrencyMnt != null) {
            return _CurrencyMnt!!
        }
        _CurrencyMnt = ImageVector.Builder(
            name = "CurrencyMnt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 5f)
                verticalLineTo(8.62f)
                lineTo(17f, 7.17f)
                verticalLineTo(9.29f)
                lineTo(13f, 10.74f)
                verticalLineTo(12.5f)
                lineTo(17f, 11.07f)
                verticalLineTo(13.2f)
                lineTo(13f, 14.65f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(15.38f)
                lineTo(7f, 16.84f)
                verticalLineTo(14.71f)
                lineTo(11f, 13.24f)
                verticalLineTo(11.47f)
                lineTo(7f, 12.92f)
                verticalLineTo(10.8f)
                lineTo(11f, 9.35f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _CurrencyMnt!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyMnt: ImageVector? = null
