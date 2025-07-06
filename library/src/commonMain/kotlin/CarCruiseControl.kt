package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarCruiseControl: ImageVector
    get() {
        if (_CarCruiseControl != null) {
            return _CarCruiseControl!!
        }
        _CarCruiseControl = ImageVector.Builder(
            name = "CarCruiseControl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15f)
                curveTo(22f, 17.6f, 20.8f, 19.9f, 18.9f, 21.3f)
                lineTo(18.4f, 20.8f)
                lineTo(16.3f, 18.7f)
                lineTo(17.7f, 17.3f)
                lineTo(18.9f, 18.5f)
                curveTo(19.4f, 17.8f, 19.8f, 16.9f, 19.9f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(19.9f)
                curveTo(19.7f, 13.1f, 19.4f, 12.3f, 18.9f, 11.5f)
                lineTo(17.7f, 12.7f)
                lineTo(16.3f, 11.3f)
                lineTo(17.5f, 10.1f)
                curveTo(16.8f, 9.6f, 15.9f, 9.2f, 15f, 9.1f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(9.1f)
                curveTo(12.1f, 9.3f, 11.3f, 9.6f, 10.5f, 10.1f)
                lineTo(13.5f, 13.1f)
                curveTo(13.7f, 13.1f, 13.8f, 13f, 14f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                curveTo(12f, 14.8f, 12f, 14.7f, 12.1f, 14.5f)
                lineTo(9.1f, 11.5f)
                curveTo(8.6f, 12.2f, 8.2f, 13.1f, 8.1f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(8.1f)
                curveTo(8.3f, 16.9f, 8.6f, 17.7f, 9.1f, 18.5f)
                lineTo(10.3f, 17.3f)
                lineTo(11.7f, 18.7f)
                lineTo(9.1f, 21.3f)
                curveTo(7.2f, 19.9f, 6f, 17.6f, 6f, 15f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 7f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 15f)
                moveTo(6.7f, 5.3f)
                lineTo(3.4f, 2f)
                lineTo(2f, 3.4f)
                lineTo(5.3f, 6.7f)
                lineTo(4f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                lineTo(6.7f, 5.3f)
                close()
            }
        }.build()

        return _CarCruiseControl!!
    }

@Suppress("ObjectPropertyName")
private var _CarCruiseControl: ImageVector? = null
