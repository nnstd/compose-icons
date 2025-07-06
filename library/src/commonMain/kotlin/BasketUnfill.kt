package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BasketUnfill: ImageVector
    get() {
        if (_BasketUnfill != null) {
            return _BasketUnfill!!
        }
        _BasketUnfill = ImageVector.Builder(
            name = "BasketUnfill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 10f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                moveTo(5f, 5f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                moveTo(8f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                moveTo(17f, 1f)
                lineTo(12f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                verticalLineTo(6f)
                horizontalLineTo(22f)
                lineTo(17f, 1f)
                moveTo(7.5f, 22f)
                curveTo(6.72f, 22f, 6.04f, 21.55f, 5.71f, 20.9f)
                verticalLineTo(20.9f)
                lineTo(3.1f, 13.44f)
                lineTo(3f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 13f)
                lineTo(20.96f, 13.29f)
                lineTo(18.29f, 20.9f)
                curveTo(17.96f, 21.55f, 17.28f, 22f, 16.5f, 22f)
                horizontalLineTo(7.5f)
                moveTo(7.61f, 20f)
                horizontalLineTo(16.39f)
                lineTo(18.57f, 14f)
                horizontalLineTo(5.42f)
                lineTo(7.61f, 20f)
                close()
            }
        }.build()

        return _BasketUnfill!!
    }

@Suppress("ObjectPropertyName")
private var _BasketUnfill: ImageVector? = null
