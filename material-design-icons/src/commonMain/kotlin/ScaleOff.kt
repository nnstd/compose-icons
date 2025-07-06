package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScaleOff: ImageVector
    get() {
        if (_ScaleOff != null) {
            return _ScaleOff!!
        }
        _ScaleOff = ImageVector.Builder(
            name = "ScaleOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.11f, 21f)
                horizontalLineTo(18f)
                verticalLineTo(19.89f)
                lineTo(12.11f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(12.89f)
                lineTo(10.31f, 12.2f)
                arcTo(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.09f, 13.68f)
                lineTo(8.46f, 15.06f)
                lineTo(7.05f, 16.47f)
                lineTo(5.68f, 15.1f)
                arcTo(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.06f, 19f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.68f, 10.57f)
                lineTo(3.85f, 5.74f)
                lineTo(2f, 5f)
                verticalLineTo(3.89f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                moveTo(21.91f, 18.71f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 10.2f)
                verticalLineTo(8.2f)
                lineTo(22f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(6.2f)
                moveTo(12f, 18f)
                arcTo(1.84f, 1.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.12f, 18.21f)
                lineTo(7.27f, 20f)
                lineTo(11.12f, 21.79f)
                arcTo(1.84f, 1.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                close()
            }
        }.build()

        return _ScaleOff!!
    }

@Suppress("ObjectPropertyName")
private var _ScaleOff: ImageVector? = null
