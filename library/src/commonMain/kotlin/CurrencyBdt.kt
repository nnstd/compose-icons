package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyBdt: ImageVector
    get() {
        if (_CurrencyBdt != null) {
            return _CurrencyBdt!!
        }
        _CurrencyBdt = ImageVector.Builder(
            name = "CurrencyBdt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.09f, 10.5f)
                verticalLineTo(9f)
                horizontalLineTo(9.59f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.09f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.59f, 4.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.09f, 6f)
                verticalLineTo(9f)
                horizontalLineTo(5.09f)
                verticalLineTo(10.5f)
                horizontalLineTo(8.09f)
                verticalLineTo(16.7f)
                curveTo(8.09f, 19.06f, 10f, 20.97f, 12.34f, 21f)
                curveTo(14.68f, 20.96f, 16.54f, 19.04f, 16.5f, 16.7f)
                curveTo(16.5f, 15.11f, 15.75f, 13.61f, 14.5f, 12.62f)
                curveTo(14.28f, 12.44f, 14.05f, 12.28f, 13.8f, 12.15f)
                curveTo(13.58f, 12.05f, 13.34f, 12f, 13.1f, 12f)
                curveTo(12.39f, 12f, 11.74f, 12.39f, 11.39f, 13f)
                curveTo(11.2f, 13.3f, 11.1f, 13.65f, 11.1f, 14f)
                curveTo(11.11f, 15.1f, 12f, 16f, 13.11f, 16f)
                curveTo(13.73f, 16f, 14.31f, 15.69f, 14.69f, 15.2f)
                curveTo(14.9f, 15.67f, 15f, 16.18f, 15f, 16.7f)
                curveTo(15.04f, 18.2f, 13.86f, 19.45f, 12.34f, 19.5f)
                curveTo(10.81f, 19.5f, 9.58f, 18.23f, 9.59f, 16.7f)
                verticalLineTo(10.5f)
                horizontalLineTo(18.09f)
                close()
            }
        }.build()

        return _CurrencyBdt!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyBdt: ImageVector? = null
