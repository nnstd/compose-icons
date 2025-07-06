package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyRub: ImageVector
    get() {
        if (_CurrencyRub != null) {
            return _CurrencyRub!!
        }
        _CurrencyRub = ImageVector.Builder(
            name = "CurrencyRub",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 3f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
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
                verticalLineTo(14f)
                horizontalLineTo(13.5f)
                curveTo(16.54f, 14f, 19f, 11.54f, 19f, 8.5f)
                reflectiveCurveTo(16.54f, 3f, 13.5f, 3f)
                moveTo(13.5f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(13.5f)
                curveTo(15.43f, 5f, 17f, 6.57f, 17f, 8.5f)
                reflectiveCurveTo(15.43f, 12f, 13.5f, 12f)
                close()
            }
        }.build()

        return _CurrencyRub!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyRub: ImageVector? = null
