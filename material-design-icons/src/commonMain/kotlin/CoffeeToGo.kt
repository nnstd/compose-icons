package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CoffeeToGo: ImageVector
    get() {
        if (_CoffeeToGo != null) {
            return _CoffeeToGo!!
        }
        _CoffeeToGo = ImageVector.Builder(
            name = "CoffeeToGo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                lineTo(15.26f, 15.24f)
                lineTo(16.67f, 13.83f)
                lineTo(20.84f, 18f)
                lineTo(16.67f, 22.17f)
                lineTo(15.26f, 20.76f)
                lineTo(17f, 19f)
                horizontalLineTo(3f)
                moveTo(17f, 8f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                moveTo(17f, 3f)
                curveTo(18.11f, 3f, 19f, 3.9f, 19f, 5f)
                verticalLineTo(8f)
                curveTo(19f, 9.11f, 18.11f, 10f, 17f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 15f)
                horizontalLineTo(7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 11f)
                verticalLineTo(3f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _CoffeeToGo!!
    }

@Suppress("ObjectPropertyName")
private var _CoffeeToGo: ImageVector? = null
