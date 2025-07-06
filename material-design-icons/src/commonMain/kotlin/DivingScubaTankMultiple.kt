package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DivingScubaTankMultiple: ImageVector
    get() {
        if (_DivingScubaTankMultiple != null) {
            return _DivingScubaTankMultiple!!
        }
        _DivingScubaTankMultiple = ImageVector.Builder(
            name = "DivingScubaTankMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 21f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 18.5f)
                curveTo(17f, 17.47f, 17.62f, 16.59f, 18.5f, 16.21f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(7.35f)
                curveTo(15.22f, 7.93f, 16f, 9.15f, 16f, 10.5f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(10.5f)
                curveTo(2f, 9.15f, 2.78f, 7.93f, 4f, 7.35f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 3.5f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 3.5f)
                verticalLineTo(4f)
                horizontalLineTo(18.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 6f)
                verticalLineTo(16.21f)
                curveTo(21.38f, 16.59f, 22f, 17.47f, 22f, 18.5f)
                moveTo(11f, 7.35f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(7.35f)
                curveTo(8.22f, 7.93f, 9f, 9.15f, 9f, 10.5f)
                curveTo(9f, 9.15f, 9.78f, 7.93f, 11f, 7.35f)
                close()
            }
        }.build()

        return _DivingScubaTankMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _DivingScubaTankMultiple: ImageVector? = null
