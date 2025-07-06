package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyBrl: ImageVector
    get() {
        if (_CurrencyBrl != null) {
            return _CurrencyBrl!!
        }
        _CurrencyBrl = ImageVector.Builder(
            name = "CurrencyBrl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15f)
                horizontalLineTo(14f)
                curveTo(14f, 16.08f, 15.37f, 17f, 17f, 17f)
                curveTo(18.63f, 17f, 20f, 16.08f, 20f, 15f)
                curveTo(20f, 13.9f, 18.96f, 13.5f, 16.76f, 12.97f)
                curveTo(14.64f, 12.44f, 12f, 11.78f, 12f, 9f)
                curveTo(12f, 7.21f, 13.47f, 5.69f, 15.5f, 5.18f)
                verticalLineTo(3f)
                horizontalLineTo(18.5f)
                verticalLineTo(5.18f)
                curveTo(20.53f, 5.69f, 22f, 7.21f, 22f, 9f)
                horizontalLineTo(20f)
                curveTo(20f, 7.92f, 18.63f, 7f, 17f, 7f)
                curveTo(15.37f, 7f, 14f, 7.92f, 14f, 9f)
                curveTo(14f, 10.1f, 15.04f, 10.5f, 17.24f, 11.03f)
                curveTo(19.36f, 11.56f, 22f, 12.22f, 22f, 15f)
                curveTo(22f, 16.79f, 20.53f, 18.31f, 18.5f, 18.82f)
                verticalLineTo(21f)
                horizontalLineTo(15.5f)
                verticalLineTo(18.82f)
                curveTo(13.47f, 18.31f, 12f, 16.79f, 12f, 15f)
                moveTo(2f, 3f)
                horizontalLineTo(5.5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 8.5f)
                curveTo(11f, 10.69f, 9.71f, 12.59f, 7.86f, 13.47f)
                lineTo(11.64f, 21f)
                horizontalLineTo(9.4f)
                lineTo(5.88f, 14f)
                horizontalLineTo(5.5f)
                lineTo(4f, 14f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                moveTo(5.5f, 12f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 8.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 5f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(5.5f)
                close()
            }
        }.build()

        return _CurrencyBrl!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyBrl: ImageVector? = null
