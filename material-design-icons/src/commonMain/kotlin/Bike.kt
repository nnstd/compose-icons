package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bike: ImageVector
    get() {
        if (_Bike != null) {
            return _Bike!!
        }
        _Bike = ImageVector.Builder(
            name = "Bike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 13.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 20.5f)
                moveTo(5f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 22f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 12f)
                moveTo(14.8f, 10f)
                horizontalLineTo(19f)
                verticalLineTo(8.2f)
                horizontalLineTo(15.8f)
                lineTo(13.86f, 4.93f)
                curveTo(13.57f, 4.43f, 13f, 4.1f, 12.4f, 4.1f)
                curveTo(11.93f, 4.1f, 11.5f, 4.29f, 11.2f, 4.6f)
                lineTo(7.5f, 8.29f)
                curveTo(7.19f, 8.6f, 7f, 9f, 7f, 9.5f)
                curveTo(7f, 10.13f, 7.33f, 10.66f, 7.85f, 10.97f)
                lineTo(11.2f, 13f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(11.5f)
                lineTo(10.75f, 9.85f)
                lineTo(13.07f, 7.5f)
                moveTo(19f, 20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 13.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.5f, 17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 20.5f)
                moveTo(19f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 22f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 12f)
                moveTo(16f, 4.8f)
                curveTo(17f, 4.8f, 17.8f, 4f, 17.8f, 3f)
                curveTo(17.8f, 2f, 17f, 1.2f, 16f, 1.2f)
                curveTo(15f, 1.2f, 14.2f, 2f, 14.2f, 3f)
                curveTo(14.2f, 4f, 15f, 4.8f, 16f, 4.8f)
                close()
            }
        }.build()

        return _Bike!!
    }

@Suppress("ObjectPropertyName")
private var _Bike: ImageVector? = null
