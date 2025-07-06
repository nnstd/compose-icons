package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Subway: ImageVector
    get() {
        if (_Subway != null) {
            return _Subway!!
        }
        _Subway = ImageVector.Builder(
            name = "Subway",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 15f)
                moveTo(7f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                moveTo(15.5f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 15f)
                moveTo(18f, 15.88f)
                verticalLineTo(9f)
                curveTo(18f, 6.38f, 15.32f, 6f, 12f, 6f)
                curveTo(9f, 6f, 6f, 6.37f, 6f, 9f)
                verticalLineTo(15.88f)
                arcTo(2.62f, 2.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.62f, 18.5f)
                lineTo(7.5f, 19.62f)
                verticalLineTo(20f)
                horizontalLineTo(9.17f)
                lineTo(10.67f, 18.5f)
                horizontalLineTo(13.5f)
                lineTo(15f, 20f)
                horizontalLineTo(16.5f)
                verticalLineTo(19.62f)
                lineTo(15.37f, 18.5f)
                curveTo(16.82f, 18.5f, 18f, 17.33f, 18f, 15.88f)
                moveTo(17.8f, 2.8f)
                curveTo(20.47f, 3.84f, 22f, 6.05f, 22f, 8.86f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(8.86f)
                curveTo(2f, 6.05f, 3.53f, 3.84f, 6.2f, 2.8f)
                curveTo(8f, 2.09f, 10.14f, 2f, 12f, 2f)
                curveTo(13.86f, 2f, 16f, 2.09f, 17.8f, 2.8f)
                close()
            }
        }.build()

        return _Subway!!
    }

@Suppress("ObjectPropertyName")
private var _Subway: ImageVector? = null
