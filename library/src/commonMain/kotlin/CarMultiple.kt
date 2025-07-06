package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarMultiple: ImageVector
    get() {
        if (_CarMultiple != null) {
            return _CarMultiple!!
        }
        _CarMultiple = ImageVector.Builder(
            name = "CarMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 11f)
                lineTo(9.5f, 6.5f)
                horizontalLineTo(18.5f)
                lineTo(20f, 11f)
                moveTo(18.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 16f)
                moveTo(9.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 16f)
                moveTo(19.92f, 6f)
                curveTo(19.71f, 5.4f, 19.14f, 5f, 18.5f, 5f)
                horizontalLineTo(9.5f)
                curveTo(8.86f, 5f, 8.29f, 5.4f, 8.08f, 6f)
                lineTo(6f, 12f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 21f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 21f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 20f)
                verticalLineTo(12f)
                lineTo(19.92f, 6f)
                moveTo(14.92f, 3f)
                curveTo(14.71f, 2.4f, 14.14f, 2f, 13.5f, 2f)
                horizontalLineTo(4.5f)
                curveTo(3.86f, 2f, 3.29f, 2.4f, 3.08f, 3f)
                lineTo(1f, 9f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 18f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 17f)
                verticalLineTo(12.91f)
                curveTo(3.22f, 12.63f, 2.82f, 11.77f, 3.1f, 11f)
                curveTo(3.32f, 10.4f, 3.87f, 10f, 4.5f, 10f)
                horizontalLineTo(4.57f)
                lineTo(5.27f, 8f)
                horizontalLineTo(3f)
                lineTo(4.5f, 3.5f)
                horizontalLineTo(15.09f)
                lineTo(14.92f, 3f)
                close()
            }
        }.build()

        return _CarMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CarMultiple: ImageVector? = null
