package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyGbp: ImageVector
    get() {
        if (_CurrencyGbp != null) {
            return _CurrencyGbp!!
        }
        _CurrencyGbp = ImageVector.Builder(
            name = "CurrencyGbp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 21f)
                curveTo(15.93f, 21f, 17.62f, 19.83f, 18f, 18f)
                lineTo(16.25f, 17.12f)
                curveTo(16f, 18.21f, 15.33f, 19f, 14f, 19f)
                horizontalLineTo(9.1f)
                curveTo(9.93f, 18f, 10.6f, 16.66f, 10.6f, 15f)
                curveTo(10.6f, 14.65f, 10.57f, 14.31f, 10.5f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(9.82f)
                curveTo(9f, 10.42f, 8f, 9.6f, 8f, 8f)
                curveTo(8f, 6.07f, 9.57f, 4.5f, 11.5f, 4.5f)
                curveTo(13f, 4.5f, 14.29f, 5.45f, 14.78f, 6.78f)
                lineTo(16.63f, 6f)
                curveTo(15.83f, 3.95f, 13.84f, 2.5f, 11.5f, 2.5f)
                curveTo(8.46f, 2.5f, 6f, 4.96f, 6f, 8f)
                curveTo(6f, 9.78f, 6.79f, 10.9f, 7.5f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(8.47f)
                curveTo(8.55f, 14.31f, 8.6f, 14.64f, 8.6f, 15f)
                curveTo(8.6f, 17.7f, 6f, 19f, 6f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _CurrencyGbp!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyGbp: ImageVector? = null
