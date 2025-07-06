package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EarthBox: ImageVector
    get() {
        if (_EarthBox != null) {
            return _EarthBox!!
        }
        _EarthBox = ImageVector.Builder(
            name = "EarthBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                moveTo(15.78f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(17.18f)
                curveTo(18.74f, 16.38f, 17.69f, 15.79f, 16.8f, 15.79f)
                horizontalLineTo(15.8f)
                verticalLineTo(12.79f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.8f, 11.79f)
                horizontalLineTo(8.8f)
                verticalLineTo(9.79f)
                horizontalLineTo(10.8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.8f, 8.79f)
                verticalLineTo(6.79f)
                horizontalLineTo(13.8f)
                curveTo(14.83f, 6.79f, 15.67f, 6f, 15.78f, 5f)
                moveTo(5f, 10.29f)
                lineTo(9.8f, 14.79f)
                verticalLineTo(15.79f)
                curveTo(9.8f, 16.9f, 10.7f, 17.79f, 11.8f, 17.79f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(10.29f)
                close()
            }
        }.build()

        return _EarthBox!!
    }

@Suppress("ObjectPropertyName")
private var _EarthBox: ImageVector? = null
