package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HookOff: ImageVector
    get() {
        if (_HookOff != null) {
            return _HookOff!!
        }
        _HookOff = ImageVector.Builder(
            name = "HookOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9.86f)
                verticalLineTo(11.18f)
                lineTo(15f, 13.18f)
                verticalLineTo(9.86f)
                curveTo(17.14f, 9.31f, 18.43f, 7.13f, 17.87f, 5f)
                curveTo(17.32f, 2.85f, 15.14f, 1.56f, 13f, 2.11f)
                curveTo(10.86f, 2.67f, 9.57f, 4.85f, 10.13f, 7f)
                curveTo(10.5f, 8.4f, 11.59f, 9.5f, 13f, 9.86f)
                moveTo(14f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 4f)
                moveTo(18.73f, 22f)
                lineTo(14.86f, 18.13f)
                curveTo(14.21f, 20.81f, 11.5f, 22.46f, 8.83f, 21.82f)
                curveTo(6.6f, 21.28f, 5f, 19.29f, 5f, 17f)
                verticalLineTo(12f)
                lineTo(10f, 17f)
                horizontalLineTo(7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 17f)
                verticalLineTo(16.27f)
                lineTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(13f, 13.72f)
                lineTo(15f, 15.72f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                close()
            }
        }.build()

        return _HookOff!!
    }

@Suppress("ObjectPropertyName")
private var _HookOff: ImageVector? = null
