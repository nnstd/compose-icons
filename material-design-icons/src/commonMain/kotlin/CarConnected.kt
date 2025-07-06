package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarConnected: ImageVector
    get() {
        if (_CarConnected != null) {
            return _CarConnected!!
        }
        _CarConnected = ImageVector.Builder(
            name = "CarConnected",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 14f)
                horizontalLineTo(19f)
                lineTo(17.5f, 9.5f)
                horizontalLineTo(6.5f)
                lineTo(5f, 14f)
                moveTo(17.5f, 19f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 19f)
                moveTo(6.5f, 19f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 19f)
                moveTo(18.92f, 9f)
                lineTo(21f, 15f)
                verticalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 24f)
                horizontalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 23f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 24f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 23f)
                verticalLineTo(15f)
                lineTo(5.08f, 9f)
                curveTo(5.28f, 8.42f, 5.85f, 8f, 6.5f, 8f)
                horizontalLineTo(17.5f)
                curveTo(18.15f, 8f, 18.72f, 8.42f, 18.92f, 9f)
                moveTo(12f, 0f)
                curveTo(14.12f, 0f, 16.15f, 0.86f, 17.65f, 2.35f)
                lineTo(16.23f, 3.77f)
                curveTo(15.11f, 2.65f, 13.58f, 2f, 12f, 2f)
                curveTo(10.42f, 2f, 8.89f, 2.65f, 7.77f, 3.77f)
                lineTo(6.36f, 2.35f)
                curveTo(7.85f, 0.86f, 9.88f, 0f, 12f, 0f)
                moveTo(12f, 4f)
                curveTo(13.06f, 4f, 14.07f, 4.44f, 14.82f, 5.18f)
                lineTo(13.4f, 6.6f)
                curveTo(13.03f, 6.23f, 12.53f, 6f, 12f, 6f)
                curveTo(11.5f, 6f, 10.97f, 6.23f, 10.6f, 6.6f)
                lineTo(9.18f, 5.18f)
                curveTo(9.93f, 4.44f, 10.94f, 4f, 12f, 4f)
                close()
            }
        }.build()

        return _CarConnected!!
    }

@Suppress("ObjectPropertyName")
private var _CarConnected: ImageVector? = null
