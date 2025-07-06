package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ToyBrickSearchOutline: ImageVector
    get() {
        if (_ToyBrickSearchOutline != null) {
            return _ToyBrickSearchOutline!!
        }
        _ToyBrickSearchOutline = ImageVector.Builder(
            name = "ToyBrickSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 6f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 3f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(11.81f)
                arcTo(6.59f, 6.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(9.5f)
                arcTo(6.59f, 6.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10.81f)
                verticalLineTo(6f)
                moveTo(20.31f, 17.9f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 18.88f, 19.32f)
                lineTo(22f, 22.39f)
                lineTo(23.39f, 21f)
                moveTo(16.5f, 18f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19f, 15.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 18f)
                close()
            }
        }.build()

        return _ToyBrickSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ToyBrickSearchOutline: ImageVector? = null
