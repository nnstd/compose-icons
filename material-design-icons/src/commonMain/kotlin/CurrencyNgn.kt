package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyNgn: ImageVector
    get() {
        if (_CurrencyNgn != null) {
            return _CurrencyNgn!!
        }
        _CurrencyNgn = ImageVector.Builder(
            name = "CurrencyNgn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 9f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                lineTo(11.42f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                lineTo(12.57f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                moveTo(8f, 9f)
                horizontalLineTo(9.13f)
                lineTo(8f, 7.03f)
                verticalLineTo(9f)
                moveTo(8f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(11.42f)
                lineTo(10.28f, 11f)
                horizontalLineTo(8f)
                moveTo(16f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(14.85f)
                lineTo(16f, 17f)
                moveTo(12.56f, 11f)
                lineTo(13.71f, 13f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(12.56f)
                close()
            }
        }.build()

        return _CurrencyNgn!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyNgn: ImageVector? = null
