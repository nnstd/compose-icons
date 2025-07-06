package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyRupee: ImageVector
    get() {
        if (_CurrencyRupee != null) {
            return _CurrencyRupee!!
        }
        _CurrencyRupee = ImageVector.Builder(
            name = "CurrencyRupee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.66f, 7f)
                curveTo(13.1f, 5.82f, 11.9f, 5f, 10.5f, 5f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                horizontalLineTo(14.74f)
                curveTo(15.22f, 5.58f, 15.58f, 6.26f, 15.79f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                curveTo(15.73f, 11.8f, 13.37f, 14f, 10.5f, 14f)
                horizontalLineTo(9.77f)
                lineTo(16.5f, 21f)
                horizontalLineTo(13.73f)
                lineTo(7f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(10.5f)
                curveTo(12.26f, 12f, 13.72f, 10.7f, 13.96f, 9f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(13.66f)
                close()
            }
        }.build()

        return _CurrencyRupee!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyRupee: ImageVector? = null
