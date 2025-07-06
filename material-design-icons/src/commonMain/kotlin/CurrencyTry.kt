package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyTry: ImageVector
    get() {
        if (_CurrencyTry != null) {
            return _CurrencyTry!!
        }
        _CurrencyTry = ImageVector.Builder(
            name = "CurrencyTry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 8.76f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                verticalLineTo(7.5f)
                lineTo(15f, 5f)
                verticalLineTo(7.36f)
                lineTo(11f, 9.87f)
                lineTo(11f, 12.22f)
                lineTo(15f, 9.72f)
                verticalLineTo(12.08f)
                lineTo(11f, 14.59f)
                verticalLineTo(19f)
                curveTo(13.76f, 19f, 16f, 16.76f, 16f, 14f)
                horizontalLineTo(18f)
                curveTo(18f, 17.87f, 14.87f, 21f, 11f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(15.84f)
                lineTo(6f, 17.72f)
                verticalLineTo(15.36f)
                lineTo(9f, 13.5f)
                verticalLineTo(11.12f)
                lineTo(6f, 13f)
                verticalLineTo(10.64f)
                lineTo(9f, 8.76f)
                close()
            }
        }.build()

        return _CurrencyTry!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyTry: ImageVector? = null
