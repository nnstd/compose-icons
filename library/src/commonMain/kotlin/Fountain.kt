package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Fountain: ImageVector
    get() {
        if (_Fountain != null) {
            return _Fountain!!
        }
        _Fountain = ImageVector.Builder(
            name = "Fountain",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 2f)
                curveTo(4.47f, 2f, 2f, 4.46f, 2f, 7.5f)
                verticalLineTo(7.5f)
                lineTo(2f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(7.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 4f)
                curveTo(9f, 4f, 10.26f, 4.93f, 10.76f, 6.24f)
                curveTo(10.37f, 6.08f, 9.95f, 6f, 9.5f, 6f)
                curveTo(8.11f, 6f, 6.9f, 6.82f, 6.34f, 8f)
                lineTo(8.08f, 9f)
                curveTo(8.29f, 8.42f, 8.85f, 8f, 9.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 9.5f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 8f)
                curveTo(15.16f, 8f, 15.71f, 8.42f, 15.92f, 9f)
                lineTo(17.66f, 8f)
                curveTo(17.1f, 6.82f, 15.9f, 6f, 14.5f, 6f)
                curveTo(14.05f, 6f, 13.63f, 6.08f, 13.24f, 6.24f)
                curveTo(13.74f, 4.93f, 15f, 4f, 16.5f, 4f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 7.5f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                verticalLineTo(7.5f)
                horizontalLineTo(22f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 2f)
                curveTo(14.64f, 2f, 13f, 2.93f, 12f, 4.34f)
                curveTo(11f, 2.93f, 9.36f, 2f, 7.5f, 2f)
                moveTo(6f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(7.42f)
                curveTo(7.92f, 15.15f, 8.85f, 16.07f, 10f, 16.57f)
                curveTo(10f, 17.38f, 10f, 18.19f, 10f, 19f)
                horizontalLineTo(2f)
                curveTo(2f, 19f, 2.82f, 20.23f, 3.41f, 21.11f)
                curveTo(3.78f, 21.67f, 4.4f, 22f, 5.07f, 22f)
                horizontalLineTo(18.93f)
                curveTo(19.6f, 22f, 20.22f, 21.67f, 20.59f, 21.11f)
                lineTo(22f, 19f)
                horizontalLineTo(14f)
                curveTo(14f, 18.19f, 14f, 17.38f, 14f, 16.57f)
                curveTo(15.15f, 16.07f, 16.08f, 15.15f, 16.58f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _Fountain!!
    }

@Suppress("ObjectPropertyName")
private var _Fountain: ImageVector? = null
