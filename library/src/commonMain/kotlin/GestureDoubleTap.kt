package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GestureDoubleTap: ImageVector
    get() {
        if (_GestureDoubleTap != null) {
            return _GestureDoubleTap!!
        }
        _GestureDoubleTap = ImageVector.Builder(
            name = "GestureDoubleTap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                verticalLineTo(13.47f)
                lineTo(13.21f, 13.6f)
                lineTo(18.15f, 15.79f)
                curveTo(18.68f, 16.03f, 19f, 16.56f, 19f, 17.14f)
                verticalLineTo(21.5f)
                curveTo(18.97f, 22.32f, 18.32f, 22.97f, 17.5f, 23f)
                horizontalLineTo(11f)
                curveTo(10.62f, 23f, 10.26f, 22.85f, 10f, 22.57f)
                lineTo(5.1f, 18.37f)
                lineTo(5.84f, 17.6f)
                curveTo(6.03f, 17.39f, 6.3f, 17.28f, 6.58f, 17.28f)
                horizontalLineTo(6.8f)
                lineTo(10f, 19f)
                verticalLineTo(9f)
                moveTo(11f, 5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 9f)
                curveTo(15f, 10.5f, 14.2f, 11.77f, 13f, 12.46f)
                verticalLineTo(11.24f)
                curveTo(13.61f, 10.69f, 14f, 9.89f, 14f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 9f)
                curveTo(8f, 9.89f, 8.39f, 10.69f, 9f, 11.24f)
                verticalLineTo(12.46f)
                curveTo(7.8f, 11.77f, 7f, 10.5f, 7f, 9f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 5f)
                moveTo(11f, 3f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 9f)
                curveTo(17f, 10.7f, 16.29f, 12.23f, 15.16f, 13.33f)
                lineTo(14.16f, 12.88f)
                curveTo(15.28f, 11.96f, 16f, 10.56f, 16f, 9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 4f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9f)
                curveTo(6f, 11.05f, 7.23f, 12.81f, 9f, 13.58f)
                verticalLineTo(14.66f)
                curveTo(6.67f, 13.83f, 5f, 11.61f, 5f, 9f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 3f)
                close()
            }
        }.build()

        return _GestureDoubleTap!!
    }

@Suppress("ObjectPropertyName")
private var _GestureDoubleTap: ImageVector? = null
