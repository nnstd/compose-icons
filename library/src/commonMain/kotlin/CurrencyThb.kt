package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyThb: ImageVector
    get() {
        if (_CurrencyThb != null) {
            return _CurrencyThb!!
        }
        _CurrencyThb = ImageVector.Builder(
            name = "CurrencyThb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.1f, 11.6f)
                curveTo(16.7f, 10.9f, 17f, 10f, 17f, 9f)
                curveTo(17f, 7.1f, 15.7f, 5.6f, 14f, 5.1f)
                lineTo(13f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                curveTo(16.2f, 19f, 18f, 17.2f, 18f, 15f)
                curveTo(18f, 13.5f, 17.2f, 12.3f, 16.1f, 11.6f)
                moveTo(15f, 9f)
                curveTo(15f, 10.1f, 14.1f, 11f, 13f, 11f)
                verticalLineTo(7f)
                curveTo(14.1f, 7f, 15f, 7.9f, 15f, 9f)
                moveTo(9f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                moveTo(9f, 17f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                moveTo(14f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                curveTo(15.1f, 13f, 16f, 13.9f, 16f, 15f)
                reflectiveCurveTo(15.1f, 17f, 14f, 17f)
                close()
            }
        }.build()

        return _CurrencyThb!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyThb: ImageVector? = null
