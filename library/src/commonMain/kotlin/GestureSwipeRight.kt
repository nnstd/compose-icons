package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GestureSwipeRight: ImageVector
    get() {
        if (_GestureSwipeRight != null) {
            return _GestureSwipeRight!!
        }
        _GestureSwipeRight = ImageVector.Builder(
            name = "GestureSwipeRight",
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
                moveTo(12f, 4f)
                lineTo(9f, 1f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                lineTo(12f, 4f)
                close()
            }
        }.build()

        return _GestureSwipeRight!!
    }

@Suppress("ObjectPropertyName")
private var _GestureSwipeRight: ImageVector? = null
