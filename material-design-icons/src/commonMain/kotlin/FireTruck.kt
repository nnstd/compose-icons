package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FireTruck: ImageVector
    get() {
        if (_FireTruck != null) {
            return _FireTruck!!
        }
        _FireTruck = ImageVector.Builder(
            name = "FireTruck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.04f, 2f)
                curveTo(16.85f, 2f, 16.66f, 2.04f, 16.5f, 2.14f)
                lineTo(5.59f, 8.5f)
                horizontalLineTo(9.55f)
                lineTo(17.5f, 3.86f)
                curveTo(18f, 3.58f, 18.13f, 2.97f, 17.85f, 2.5f)
                curveTo(17.68f, 2.2f, 17.38f, 2f, 17.04f, 2f)
                moveTo(16f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 12f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                horizontalLineTo(1f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 19f)
                horizontalLineTo(15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 22f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                horizontalLineTo(23f)
                verticalLineTo(12.5f)
                lineTo(19.5f, 8f)
                horizontalLineTo(16f)
                moveTo(18f, 9.5f)
                horizontalLineTo(19f)
                lineTo(21.5f, 12.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(18f)
                verticalLineTo(9.5f)
                moveTo(4f, 12f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                moveTo(9f, 12f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                moveTo(14f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                moveTo(6f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 19f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 20.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 19f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 17.5f)
                moveTo(18f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 19f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 20.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 19f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 17.5f)
                close()
            }
        }.build()

        return _FireTruck!!
    }

@Suppress("ObjectPropertyName")
private var _FireTruck: ImageVector? = null
