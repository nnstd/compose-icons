package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Jeepney: ImageVector
    get() {
        if (_Jeepney != null) {
            return _Jeepney!!
        }
        _Jeepney = ImageVector.Builder(
            name = "Jeepney",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                curveTo(2f, 13.93f, 2.5f, 14.71f, 3.5f, 14.93f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 21f)
                horizontalLineTo(5.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(17.5f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 21f)
                horizontalLineTo(19.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 20f)
                verticalLineTo(14.93f)
                curveTo(21.5f, 14.7f, 22f, 13.93f, 22f, 13f)
                horizontalLineTo(19f)
                moveTo(8f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 15f)
                moveTo(16f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 15f)
                moveTo(17.5f, 10.5f)
                curveTo(15.92f, 10.18f, 14.03f, 10f, 12f, 10f)
                curveTo(9.97f, 10f, 8f, 10.18f, 6.5f, 10.5f)
                verticalLineTo(7f)
                horizontalLineTo(17.5f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()

        return _Jeepney!!
    }

@Suppress("ObjectPropertyName")
private var _Jeepney: ImageVector? = null
