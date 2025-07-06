package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LaptopOff: ImageVector
    get() {
        if (_LaptopOff != null) {
            return _LaptopOff!!
        }
        _LaptopOff = ImageVector.Builder(
            name = "LaptopOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 4.27f)
                lineTo(2.28f, 3f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(16.73f, 20f)
                horizontalLineTo(0f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                curveTo(2.89f, 18f, 2f, 17.1f, 2f, 16f)
                verticalLineTo(6f)
                curveTo(2f, 5.78f, 2.04f, 5.57f, 2.1f, 5.37f)
                lineTo(1f, 4.27f)
                moveTo(4f, 16f)
                horizontalLineTo(12.73f)
                lineTo(4f, 7.27f)
                verticalLineTo(16f)
                moveTo(20f, 16f)
                verticalLineTo(6f)
                horizontalLineTo(7.82f)
                lineTo(5.82f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 18f)
                horizontalLineTo(24f)
                verticalLineTo(20f)
                horizontalLineTo(21.82f)
                lineTo(17.82f, 16f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _LaptopOff!!
    }

@Suppress("ObjectPropertyName")
private var _LaptopOff: ImageVector? = null
