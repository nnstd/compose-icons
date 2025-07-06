package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cart: ImageVector
    get() {
        if (_Cart != null) {
            return _Cart!!
        }
        _Cart = ImageVector.Builder(
            name = "Cart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 18f)
                curveTo(15.89f, 18f, 15f, 18.89f, 15f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 20f)
                curveTo(19f, 18.89f, 18.1f, 18f, 17f, 18f)
                moveTo(1f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                lineTo(6.6f, 11.59f)
                lineTo(5.24f, 14.04f)
                curveTo(5.09f, 14.32f, 5f, 14.65f, 5f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 17f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(7.42f)
                arcTo(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.17f, 14.75f)
                curveTo(7.17f, 14.7f, 7.18f, 14.66f, 7.2f, 14.63f)
                lineTo(8.1f, 13f)
                horizontalLineTo(15.55f)
                curveTo(16.3f, 13f, 16.96f, 12.58f, 17.3f, 11.97f)
                lineTo(20.88f, 5.5f)
                curveTo(20.95f, 5.34f, 21f, 5.17f, 21f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4f)
                horizontalLineTo(5.21f)
                lineTo(4.27f, 2f)
                moveTo(7f, 18f)
                curveTo(5.89f, 18f, 5f, 18.89f, 5f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                curveTo(9f, 18.89f, 8.1f, 18f, 7f, 18f)
                close()
            }
        }.build()

        return _Cart!!
    }

@Suppress("ObjectPropertyName")
private var _Cart: ImageVector? = null
