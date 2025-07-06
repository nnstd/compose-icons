package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DivingScubaTank: ImageVector
    get() {
        if (_DivingScubaTank != null) {
            return _DivingScubaTank!!
        }
        _DivingScubaTank = ImageVector.Builder(
            name = "DivingScubaTank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 18.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 21f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 18.5f)
                curveTo(14f, 17.47f, 14.62f, 16.59f, 15.5f, 16.21f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(7.35f)
                curveTo(12.22f, 7.93f, 13f, 9.15f, 13f, 10.5f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(10.5f)
                curveTo(6f, 9.15f, 6.78f, 7.93f, 8f, 7.35f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 3.5f)
                verticalLineTo(4f)
                horizontalLineTo(15.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 6f)
                verticalLineTo(16.21f)
                curveTo(18.38f, 16.59f, 19f, 17.47f, 19f, 18.5f)
                close()
            }
        }.build()

        return _DivingScubaTank!!
    }

@Suppress("ObjectPropertyName")
private var _DivingScubaTank: ImageVector? = null
