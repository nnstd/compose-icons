package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarSports: ImageVector
    get() {
        if (_CarSports != null) {
            return _CarSports!!
        }
        _CarSports = ImageVector.Builder(
            name = "CarSports",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8.5f)
                horizontalLineTo(7f)
                lineTo(4f, 11f)
                horizontalLineTo(3f)
                curveTo(1.89f, 11f, 1f, 11.89f, 1f, 13f)
                verticalLineTo(16f)
                horizontalLineTo(3.17f)
                curveTo(3.6f, 17.2f, 4.73f, 18f, 6f, 18f)
                curveTo(7.27f, 18f, 8.4f, 17.2f, 8.82f, 16f)
                horizontalLineTo(15.17f)
                curveTo(15.6f, 17.2f, 16.73f, 18f, 18f, 18f)
                curveTo(19.27f, 18f, 20.4f, 17.2f, 20.82f, 16f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                curveTo(23f, 13.89f, 21.97f, 13.53f, 21f, 13f)
                lineTo(12f, 8.5f)
                moveTo(5.25f, 12f)
                lineTo(7.5f, 10f)
                horizontalLineTo(11.5f)
                lineTo(15.5f, 12f)
                horizontalLineTo(5.25f)
                moveTo(6f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 13.5f)
                moveTo(18f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 13.5f)
                close()
            }
        }.build()

        return _CarSports!!
    }

@Suppress("ObjectPropertyName")
private var _CarSports: ImageVector? = null
