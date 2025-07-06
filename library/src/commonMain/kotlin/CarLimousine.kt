package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarLimousine: ImageVector
    get() {
        if (_CarLimousine != null) {
            return _CarLimousine!!
        }
        _CarLimousine = ImageVector.Builder(
            name = "CarLimousine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 6f)
                lineTo(2.5f, 7.5f)
                lineTo(1f, 9f)
                lineTo(2.5f, 10.5f)
                lineTo(1f, 12f)
                lineTo(2.5f, 13.5f)
                lineTo(1f, 15f)
                horizontalLineTo(15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 15f)
                horizontalLineTo(23f)
                verticalLineTo(12f)
                curveTo(23f, 10.89f, 22.11f, 10f, 21f, 10f)
                horizontalLineTo(19f)
                lineTo(16f, 6f)
                horizontalLineTo(1f)
                moveTo(4.62f, 7.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(10f)
                horizontalLineTo(4.12f)
                lineTo(3.12f, 9f)
                lineTo(4.62f, 7.5f)
                moveTo(12f, 7.5f)
                horizontalLineTo(15.5f)
                lineTo(17.46f, 10f)
                horizontalLineTo(12f)
                verticalLineTo(7.5f)
                moveTo(18f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 13.5f)
                close()
            }
        }.build()

        return _CarLimousine!!
    }

@Suppress("ObjectPropertyName")
private var _CarLimousine: ImageVector? = null
