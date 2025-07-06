package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Controller: ImageVector
    get() {
        if (_Controller != null) {
            return _Controller!!
        }
        _Controller = ImageVector.Builder(
            name = "Controller",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.97f, 16f)
                lineTo(5f, 19f)
                curveTo(4.67f, 19.3f, 4.23f, 19.5f, 3.75f, 19.5f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 17.75f)
                verticalLineTo(17.5f)
                lineTo(3f, 10.12f)
                curveTo(3.21f, 7.81f, 5.14f, 6f, 7.5f, 6f)
                horizontalLineTo(16.5f)
                curveTo(18.86f, 6f, 20.79f, 7.81f, 21f, 10.12f)
                lineTo(22f, 17.5f)
                verticalLineTo(17.75f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.25f, 19.5f)
                curveTo(19.77f, 19.5f, 19.33f, 19.3f, 19f, 19f)
                lineTo(16.03f, 16f)
                horizontalLineTo(7.97f)
                moveTo(7f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                moveTo(16.5f, 8f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.75f, 8.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 9.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.25f, 8.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 8f)
                moveTo(14.75f, 9.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 10.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.75f, 11.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 10.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.75f, 9.75f)
                moveTo(18.25f, 9.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 10.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.25f, 11.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.25f, 9.75f)
                moveTo(16.5f, 11.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.75f, 12.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 13f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.25f, 12.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 11.5f)
                close()
            }
        }.build()

        return _Controller!!
    }

@Suppress("ObjectPropertyName")
private var _Controller: ImageVector? = null
