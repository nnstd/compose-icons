package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Flower: ImageVector
    get() {
        if (_Flower != null) {
            return _Flower!!
        }
        _Flower = ImageVector.Builder(
            name = "Flower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                curveTo(12f, 17f, 7.97f, 13f, 3f, 13f)
                moveTo(12f, 5.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 8f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 8f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5.5f)
                moveTo(5.6f, 10.25f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.1f, 12.75f)
                curveTo(8.63f, 12.75f, 9.12f, 12.58f, 9.5f, 12.31f)
                curveTo(9.5f, 12.37f, 9.5f, 12.43f, 9.5f, 12.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 12.5f)
                curveTo(14.5f, 12.43f, 14.5f, 12.37f, 14.5f, 12.31f)
                curveTo(14.88f, 12.58f, 15.37f, 12.75f, 15.9f, 12.75f)
                curveTo(17.28f, 12.75f, 18.4f, 11.63f, 18.4f, 10.25f)
                curveTo(18.4f, 9.25f, 17.81f, 8.4f, 16.97f, 8f)
                curveTo(17.81f, 7.6f, 18.4f, 6.74f, 18.4f, 5.75f)
                curveTo(18.4f, 4.37f, 17.28f, 3.25f, 15.9f, 3.25f)
                curveTo(15.37f, 3.25f, 14.88f, 3.41f, 14.5f, 3.69f)
                curveTo(14.5f, 3.63f, 14.5f, 3.56f, 14.5f, 3.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 3.5f)
                curveTo(9.5f, 3.56f, 9.5f, 3.63f, 9.5f, 3.69f)
                curveTo(9.12f, 3.41f, 8.63f, 3.25f, 8.1f, 3.25f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.6f, 5.75f)
                curveTo(5.6f, 6.74f, 6.19f, 7.6f, 7.03f, 8f)
                curveTo(6.19f, 8.4f, 5.6f, 9.25f, 5.6f, 10.25f)
                moveTo(12f, 22f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 13f)
                curveTo(16f, 13f, 12f, 17f, 12f, 22f)
                close()
            }
        }.build()

        return _Flower!!
    }

@Suppress("ObjectPropertyName")
private var _Flower: ImageVector? = null
