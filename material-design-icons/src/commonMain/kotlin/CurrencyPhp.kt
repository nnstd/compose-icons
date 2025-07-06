package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyPhp: ImageVector
    get() {
        if (_CurrencyPhp != null) {
            return _CurrencyPhp!!
        }
        _CurrencyPhp = ImageVector.Builder(
            name = "CurrencyPhp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                curveTo(15.7f, 16f, 18.16f, 14.44f, 19.32f, 12f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                horizontalLineTo(19.92f)
                curveTo(20.03f, 9.34f, 20.03f, 8.66f, 19.92f, 8f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(19.32f)
                curveTo(18.16f, 3.56f, 15.7f, 2f, 13f, 2f)
                moveTo(7f, 4f)
                horizontalLineTo(13f)
                curveTo(14.57f, 4f, 16.06f, 4.74f, 17f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                moveTo(13f, 14f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                curveTo(16.06f, 13.26f, 14.57f, 14f, 13f, 14f)
                moveTo(18f, 9f)
                curveTo(18f, 9.34f, 17.96f, 9.67f, 17.9f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(17.9f)
                curveTo(17.96f, 8.33f, 18f, 8.66f, 18f, 9f)
                close()
            }
        }.build()

        return _CurrencyPhp!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyPhp: ImageVector? = null
