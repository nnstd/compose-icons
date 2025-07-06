package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GesturePinch: ImageVector
    get() {
        if (_GesturePinch != null) {
            return _GesturePinch!!
        }
        _GesturePinch = ImageVector.Builder(
            name = "GesturePinch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 9f)
                verticalLineTo(13.47f)
                lineTo(16.21f, 13.6f)
                lineTo(21.15f, 15.8f)
                curveTo(21.67f, 16.04f, 22f, 16.56f, 22f, 17.14f)
                verticalLineTo(21.5f)
                curveTo(21.97f, 22.32f, 21.32f, 22.97f, 20.5f, 23f)
                horizontalLineTo(14f)
                curveTo(13.62f, 23f, 13.26f, 22.85f, 13f, 22.57f)
                lineTo(8.1f, 18.37f)
                lineTo(8.84f, 17.6f)
                curveTo(9.03f, 17.39f, 9.3f, 17.28f, 9.58f, 17.28f)
                horizontalLineTo(9.8f)
                lineTo(13f, 19f)
                verticalLineTo(9f)
                moveTo(14f, 5f)
                curveTo(15.42f, 5f, 16.74f, 5.76f, 17.45f, 7f)
                curveTo(18.56f, 8.9f, 17.91f, 11.35f, 16f, 12.46f)
                verticalLineTo(11.23f)
                curveTo(16.64f, 10.67f, 17f, 9.85f, 17f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 9f)
                curveTo(11f, 9.85f, 11.36f, 10.67f, 12f, 11.23f)
                verticalLineTo(12.46f)
                curveTo(10.77f, 11.75f, 10f, 10.43f, 10f, 9f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 5f)
                moveTo(4f, 9f)
                lineTo(7f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(1f)
                lineTo(4f, 9f)
                moveTo(4f, 7f)
                lineTo(1f, 4f)
                horizontalLineTo(3f)
                verticalLineTo(1f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                lineTo(4f, 7f)
                moveTo(9f, 14f)
                curveTo(9.73f, 14f, 10.41f, 14.19f, 11f, 14.54f)
                verticalLineTo(15.76f)
                curveTo(10.47f, 15.29f, 9.77f, 15f, 9f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 18f)
                curveTo(6f, 19f, 6.5f, 19.87f, 7.22f, 20.42f)
                lineTo(9.31f, 22f)
                horizontalLineTo(9f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 14f)
                close()
            }
        }.build()

        return _GesturePinch!!
    }

@Suppress("ObjectPropertyName")
private var _GesturePinch: ImageVector? = null
