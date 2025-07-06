package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarBack: ImageVector
    get() {
        if (_CarBack != null) {
            return _CarBack!!
        }
        _CarBack = ImageVector.Builder(
            name = "CarBack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 11f)
                lineTo(7f, 7f)
                horizontalLineTo(17f)
                lineTo(18f, 11f)
                moveTo(18.92f, 6f)
                curveTo(18.71f, 5.4f, 18.14f, 5f, 17.5f, 5f)
                horizontalLineTo(6.5f)
                curveTo(5.86f, 5f, 5.29f, 5.4f, 5.08f, 6f)
                lineTo(3f, 12f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 21f)
                horizontalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 21f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 20f)
                verticalLineTo(12f)
                lineTo(18.92f, 6f)
                moveTo(7f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                moveTo(19f, 16f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                moveTo(14f, 16f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _CarBack!!
    }

@Suppress("ObjectPropertyName")
private var _CarBack: ImageVector? = null
