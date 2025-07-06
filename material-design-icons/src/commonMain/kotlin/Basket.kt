package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Basket: ImageVector
    get() {
        if (_Basket != null) {
            return _Basket!!
        }
        _Basket = ImageVector.Builder(
            name = "Basket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 21f)
                curveTo(4.72f, 21f, 4.04f, 20.55f, 3.71f, 19.9f)
                verticalLineTo(19.9f)
                lineTo(1.1f, 10.44f)
                lineTo(1f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 9f)
                horizontalLineTo(6.58f)
                lineTo(11.18f, 2.43f)
                curveTo(11.36f, 2.17f, 11.66f, 2f, 12f, 2f)
                curveTo(12.34f, 2f, 12.65f, 2.17f, 12.83f, 2.44f)
                lineTo(17.42f, 9f)
                horizontalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 10f)
                lineTo(22.96f, 10.29f)
                lineTo(20.29f, 19.9f)
                curveTo(19.96f, 20.55f, 19.28f, 21f, 18.5f, 21f)
                horizontalLineTo(5.5f)
                moveTo(12f, 4.74f)
                lineTo(9f, 9f)
                horizontalLineTo(15f)
                lineTo(12f, 4.74f)
                moveTo(12f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
                close()
            }
        }.build()

        return _Basket!!
    }

@Suppress("ObjectPropertyName")
private var _Basket: ImageVector? = null
