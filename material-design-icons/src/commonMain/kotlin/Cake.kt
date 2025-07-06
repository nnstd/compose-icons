package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cake: ImageVector
    get() {
        if (_Cake != null) {
            return _Cake!!
        }
        _Cake = ImageVector.Builder(
            name = "Cake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 0.5f)
                curveTo(12f, 0.75f, 13f, 2.4f, 13f, 3.5f)
                curveTo(13f, 4.6f, 12.33f, 5f, 11.5f, 5f)
                curveTo(10.67f, 5f, 10f, 4.85f, 10f, 3.75f)
                curveTo(10f, 2.65f, 11f, 2f, 11.5f, 0.5f)
                moveTo(18.5f, 9f)
                curveTo(21f, 9f, 23f, 11f, 23f, 13.5f)
                curveTo(23f, 15.06f, 22.21f, 16.43f, 21f, 17.24f)
                verticalLineTo(23f)
                horizontalLineTo(12f)
                lineTo(3f, 23f)
                verticalLineTo(17.24f)
                curveTo(1.79f, 16.43f, 1f, 15.06f, 1f, 13.5f)
                curveTo(1f, 11f, 3f, 9f, 5.5f, 9f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18.5f)
                moveTo(12f, 16f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 13.5f)
                horizontalLineTo(16f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 16f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 13.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 11f)
                horizontalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 13.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 16f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 13.5f)
                horizontalLineTo(9.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                close()
            }
        }.build()

        return _Cake!!
    }

@Suppress("ObjectPropertyName")
private var _Cake: ImageVector? = null
