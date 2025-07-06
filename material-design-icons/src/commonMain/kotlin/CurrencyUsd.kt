package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyUsd: ImageVector
    get() {
        if (_CurrencyUsd != null) {
            return _CurrencyUsd!!
        }
        _CurrencyUsd = ImageVector.Builder(
            name = "CurrencyUsd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 15f)
                horizontalLineTo(9f)
                curveTo(9f, 16.08f, 10.37f, 17f, 12f, 17f)
                curveTo(13.63f, 17f, 15f, 16.08f, 15f, 15f)
                curveTo(15f, 13.9f, 13.96f, 13.5f, 11.76f, 12.97f)
                curveTo(9.64f, 12.44f, 7f, 11.78f, 7f, 9f)
                curveTo(7f, 7.21f, 8.47f, 5.69f, 10.5f, 5.18f)
                verticalLineTo(3f)
                horizontalLineTo(13.5f)
                verticalLineTo(5.18f)
                curveTo(15.53f, 5.69f, 17f, 7.21f, 17f, 9f)
                horizontalLineTo(15f)
                curveTo(15f, 7.92f, 13.63f, 7f, 12f, 7f)
                curveTo(10.37f, 7f, 9f, 7.92f, 9f, 9f)
                curveTo(9f, 10.1f, 10.04f, 10.5f, 12.24f, 11.03f)
                curveTo(14.36f, 11.56f, 17f, 12.22f, 17f, 15f)
                curveTo(17f, 16.79f, 15.53f, 18.31f, 13.5f, 18.82f)
                verticalLineTo(21f)
                horizontalLineTo(10.5f)
                verticalLineTo(18.82f)
                curveTo(8.47f, 18.31f, 7f, 16.79f, 7f, 15f)
                close()
            }
        }.build()

        return _CurrencyUsd!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyUsd: ImageVector? = null
