package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarWash: ImageVector
    get() {
        if (_CarWash != null) {
            return _CarWash!!
        }
        _CarWash = ImageVector.Builder(
            name = "CarWash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 13f)
                lineTo(6.5f, 8.5f)
                horizontalLineTo(17.5f)
                lineTo(19f, 13f)
                moveTo(17.5f, 18f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 18f)
                moveTo(6.5f, 18f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 18f)
                moveTo(18.92f, 8f)
                curveTo(18.72f, 7.42f, 18.16f, 7f, 17.5f, 7f)
                horizontalLineTo(6.5f)
                curveTo(5.84f, 7f, 5.28f, 7.42f, 5.08f, 8f)
                lineTo(3f, 14f)
                verticalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 23f)
                horizontalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 23f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 22f)
                verticalLineTo(14f)
                moveTo(7f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 3.5f)
                curveTo(8.5f, 2.5f, 7f, 0.8f, 7f, 0.8f)
                curveTo(7f, 0.8f, 5.5f, 2.5f, 5.5f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 5f)
                moveTo(12f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 3.5f)
                curveTo(13.5f, 2.5f, 12f, 0.8f, 12f, 0.8f)
                curveTo(12f, 0.8f, 10.5f, 2.5f, 10.5f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                moveTo(17f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 3.5f)
                curveTo(18.5f, 2.5f, 17f, 0.8f, 17f, 0.8f)
                curveTo(17f, 0.8f, 15.5f, 2.5f, 15.5f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 5f)
                close()
            }
        }.build()

        return _CarWash!!
    }

@Suppress("ObjectPropertyName")
private var _CarWash: ImageVector? = null
