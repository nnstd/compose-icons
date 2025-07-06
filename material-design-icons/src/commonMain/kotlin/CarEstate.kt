package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarEstate: ImageVector
    get() {
        if (_CarEstate != null) {
            return _CarEstate!!
        }
        _CarEstate = ImageVector.Builder(
            name = "CarEstate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 6f)
                horizontalLineTo(16f)
                lineTo(19f, 10f)
                horizontalLineTo(21f)
                curveTo(22.11f, 10f, 23f, 10.89f, 23f, 12f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 15f)
                horizontalLineTo(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 15f)
                horizontalLineTo(1f)
                verticalLineTo(8f)
                curveTo(1f, 6.89f, 1.89f, 6f, 3f, 6f)
                moveTo(2.5f, 7.5f)
                verticalLineTo(10f)
                horizontalLineTo(10.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(2.5f)
                moveTo(12f, 7.5f)
                verticalLineTo(10f)
                horizontalLineTo(17.14f)
                lineTo(15.25f, 7.5f)
                horizontalLineTo(12f)
                moveTo(6f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 13.5f)
                moveTo(18f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 13.5f)
                close()
            }
        }.build()

        return _CarEstate!!
    }

@Suppress("ObjectPropertyName")
private var _CarEstate: ImageVector? = null
