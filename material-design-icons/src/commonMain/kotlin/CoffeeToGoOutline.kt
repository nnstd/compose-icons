package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CoffeeToGoOutline: ImageVector
    get() {
        if (_CoffeeToGoOutline != null) {
            return _CoffeeToGoOutline!!
        }
        _CoffeeToGoOutline = ImageVector.Builder(
            name = "CoffeeToGoOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                verticalLineTo(11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 15f)
                horizontalLineTo(11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 11f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                curveTo(18.11f, 10f, 19f, 9.11f, 19f, 8f)
                verticalLineTo(5f)
                curveTo(19f, 3.9f, 18.11f, 3f, 17f, 3f)
                horizontalLineTo(3f)
                moveTo(5f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 13f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 11f)
                verticalLineTo(5f)
                moveTo(15f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                moveTo(16.67f, 13.83f)
                lineTo(15.26f, 15.24f)
                lineTo(17f, 17f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                lineTo(15.26f, 20.76f)
                lineTo(16.67f, 22.17f)
                lineTo(20.84f, 18f)
                lineTo(16.67f, 13.83f)
                close()
            }
        }.build()

        return _CoffeeToGoOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CoffeeToGoOutline: ImageVector? = null
