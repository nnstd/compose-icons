package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MultiplicationBox: ImageVector
    get() {
        if (_MultiplicationBox != null) {
            return _MultiplicationBox!!
        }
        _MultiplicationBox = ImageVector.Builder(
            name = "MultiplicationBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                moveTo(11f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(13.73f)
                lineTo(15.83f, 15.36f)
                lineTo(16.83f, 13.63f)
                lineTo(14f, 12f)
                lineTo(16.83f, 10.36f)
                lineTo(15.83f, 8.63f)
                lineTo(13f, 10.27f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(10.27f)
                lineTo(8.17f, 8.63f)
                lineTo(7.17f, 10.36f)
                lineTo(10f, 12f)
                lineTo(7.17f, 13.63f)
                lineTo(8.17f, 15.36f)
                lineTo(11f, 13.73f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _MultiplicationBox!!
    }

@Suppress("ObjectPropertyName")
private var _MultiplicationBox: ImageVector? = null
