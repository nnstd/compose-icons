package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Stocking: ImageVector
    get() {
        if (_Stocking != null) {
            return _Stocking!!
        }
        _Stocking = ImageVector.Builder(
            name = "Stocking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 4f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 9f)
                verticalLineTo(17f)
                curveTo(17f, 17.85f, 16.5f, 18.57f, 15.74f, 18.86f)
                lineTo(9.5f, 21.77f)
                curveTo(8.5f, 22.24f, 7.29f, 21.81f, 6.83f, 20.81f)
                lineTo(6f, 19f)
                curveTo(5.5f, 18f, 5.95f, 16.8f, 6.95f, 16.34f)
                lineTo(10f, 14.91f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 7f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2f)
                horizontalLineTo(17f)
                moveTo(10f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _Stocking!!
    }

@Suppress("ObjectPropertyName")
private var _Stocking: ImageVector? = null
