package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GestureSwipeVertical: ImageVector
    get() {
        if (_GestureSwipeVertical != null) {
            return _GestureSwipeVertical!!
        }
        _GestureSwipeVertical = ImageVector.Builder(
            name = "GestureSwipeVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                lineTo(1f, 6f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(1f)
                lineTo(4f, 12f)
                lineTo(7f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                lineTo(4f, 3f)
                moveTo(11f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 9f)
                verticalLineTo(19f)
                lineTo(6.8f, 17.28f)
                horizontalLineTo(6.58f)
                curveTo(6.3f, 17.28f, 6.03f, 17.39f, 5.84f, 17.6f)
                lineTo(5.1f, 18.37f)
                lineTo(10f, 22.57f)
                curveTo(10.26f, 22.85f, 10.62f, 23f, 11f, 23f)
                horizontalLineTo(17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 21.5f)
                verticalLineTo(17.14f)
                curveTo(19f, 16.56f, 18.68f, 16.03f, 18.15f, 15.79f)
                lineTo(13.21f, 13.6f)
                lineTo(12f, 13.47f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8f)
                close()
            }
        }.build()

        return _GestureSwipeVertical!!
    }

@Suppress("ObjectPropertyName")
private var _GestureSwipeVertical: ImageVector? = null
