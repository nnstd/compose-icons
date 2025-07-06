package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarOff: ImageVector
    get() {
        if (_CarOff != null) {
            return _CarOff!!
        }
        _CarOff = ImageVector.Builder(
            name = "CarOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 19.85f)
                lineTo(6.41f, 5.76f)
                lineTo(2.41f, 1.76f)
                lineTo(1.11f, 3f)
                lineTo(4.57f, 6.46f)
                lineTo(3f, 11f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(16.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.5f, 19.85f)
                moveTo(6.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 15f)
                moveTo(5f, 10f)
                lineTo(5.78f, 7.67f)
                lineTo(8.11f, 10f)
                horizontalLineTo(5f)
                moveTo(17.5f, 5.5f)
                lineTo(19f, 10f)
                horizontalLineTo(13.2f)
                lineTo(16.12f, 12.92f)
                curveTo(16.5f, 12.17f, 17.37f, 11.86f, 18.12f, 12.21f)
                curveTo(18.87f, 12.57f, 19.18f, 13.47f, 18.83f, 14.21f)
                curveTo(18.68f, 14.5f, 18.43f, 14.77f, 18.12f, 14.92f)
                lineTo(21f, 17.8f)
                verticalLineTo(11f)
                lineTo(18.92f, 5f)
                curveTo(18.71f, 4.4f, 18.14f, 4f, 17.5f, 4f)
                horizontalLineTo(7.2f)
                lineTo(8.7f, 5.5f)
                horizontalLineTo(17.5f)
                close()
            }
        }.build()

        return _CarOff!!
    }

@Suppress("ObjectPropertyName")
private var _CarOff: ImageVector? = null
