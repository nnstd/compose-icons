package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GestureTwoDoubleTap: ImageVector
    get() {
        if (_GestureTwoDoubleTap != null) {
            return _GestureTwoDoubleTap!!
        }
        _GestureTwoDoubleTap = ImageVector.Builder(
            name = "GestureTwoDoubleTap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15.14f)
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
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 7f)
                verticalLineTo(12f)
                lineTo(18.15f, 13.84f)
                curveTo(18.66f, 14.07f, 19f, 14.58f, 19f, 15.14f)
                moveTo(13f, 3f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7f)
                curveTo(17f, 8.5f, 16.2f, 9.77f, 15f, 10.46f)
                verticalLineTo(9.24f)
                curveTo(15.61f, 8.69f, 16f, 7.89f, 16f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 4f)
                curveTo(11.65f, 4f, 10.5f, 4.9f, 10.13f, 6.13f)
                curveTo(8.9f, 6.5f, 8f, 7.65f, 8f, 9f)
                curveTo(8f, 9.89f, 8.39f, 10.69f, 9f, 11.24f)
                verticalLineTo(12.46f)
                curveTo(7.8f, 11.77f, 7f, 10.5f, 7f, 9f)
                curveTo(7f, 7.38f, 7.97f, 6f, 9.35f, 5.35f)
                curveTo(10f, 3.97f, 11.38f, 3f, 13f, 3f)
                moveTo(13f, 1f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 7f)
                curveTo(19f, 9.06f, 17.96f, 10.88f, 16.38f, 11.96f)
                lineTo(15.26f, 11.46f)
                curveTo(16.89f, 10.64f, 18f, 8.95f, 18f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 2f)
                curveTo(11.11f, 2f, 9.46f, 3.05f, 8.61f, 4.61f)
                curveTo(7.05f, 5.46f, 6f, 7.11f, 6f, 9f)
                curveTo(6f, 11.05f, 7.23f, 12.81f, 9f, 13.58f)
                verticalLineTo(14.66f)
                curveTo(6.67f, 13.83f, 5f, 11.61f, 5f, 9f)
                curveTo(5f, 6.83f, 6.15f, 4.93f, 7.88f, 3.88f)
                curveTo(8.93f, 2.15f, 10.83f, 1f, 13f, 1f)
                close()
            }
        }.build()

        return _GestureTwoDoubleTap!!
    }

@Suppress("ObjectPropertyName")
private var _GestureTwoDoubleTap: ImageVector? = null
